package calculadora.controlador;

import calculadora.modelo.Calculadora;
import calculadora.vista.CalculadoraVista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controlador que maneja la lógica de eventos entre la vista y el modelo
 */
public class CalculadoraControlador {
    private CalculadoraVista vista;
    private Calculadora modelo;

    /**
     * Constructor que inicializa el controlador
     * @param vista referencia a la vista
     * @param modelo referencia al modelo
     */
    public CalculadoraControlador(CalculadoraVista vista, Calculadora modelo) {
        this.vista = vista;
        this.modelo = modelo;

        // Configurar los listeners de los botones
        configurarEventos();
    }

    /**
     * Configura los event listeners para todos los botones
     */
    private void configurarEventos() {
        vista.getBtnSumar().addActionListener(new SumarListener());
        vista.getBtnRestar().addActionListener(new RestarListener());
        vista.getBtnMultiplicar().addActionListener(new MultiplicarListener());
        vista.getBtnDividir().addActionListener(new DividirListener());
    }

    /**
     * Valida las entradas y extrae los números
     * @return array con los dos números, o null si hay error
     */
    private double[] validarYExtraerNumeros() {
        String texto1 = vista.getNumero1();
        String texto2 = vista.getNumero2();

        // Validar que no estén vacíos
        if (texto1.isEmpty() || texto2.isEmpty()) {
            vista.mostrarError("Por favor ingrese ambos números");
            return null;
        }

        // Validar que sean números válidos
        if (!modelo.esNumeroValido(texto1) || !modelo.esNumeroValido(texto2)) {
            vista.mostrarError("Por favor ingrese números válidos");
            return null;
        }

        try {
            double num1 = Double.parseDouble(texto1);
            double num2 = Double.parseDouble(texto2);
            return new double[]{num1, num2};
        } catch (NumberFormatException e) {
            vista.mostrarError("Error al convertir los números");
            return null;
        }
    }

    // CLASES INTERNAS PARA MANEJAR EVENTOS

    /**
     * Listener para el botón de suma
     */
    private class SumarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double[] numeros = validarYExtraerNumeros();
            if (numeros != null) {
                double resultado = modelo.sumar(numeros[0], numeros[1]);
                vista.setResultado(String.valueOf(resultado));
            }
        }
    }

    /**
     * Listener para el botón de resta
     */
    private class RestarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double[] numeros = validarYExtraerNumeros();
            if (numeros != null) {
                double resultado = modelo.restar(numeros[0], numeros[1]);
                vista.setResultado(String.valueOf(resultado));
            }
        }
    }

    /**
     * Listener para el botón de multiplicación
     */
    private class MultiplicarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double[] numeros = validarYExtraerNumeros();
            if (numeros != null) {
                double resultado = modelo.multiplicar(numeros[0], numeros[1]);
                vista.setResultado(String.valueOf(resultado));
            }
        }
    }

    /**
     * Listener para el botón de división
     */
    private class DividirListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double[] numeros = validarYExtraerNumeros();
            if (numeros != null) {
                try {
                    double resultado = modelo.dividir(numeros[0], numeros[1]);
                    vista.setResultado(String.valueOf(resultado));
                } catch (ArithmeticException ex) {
                    vista.mostrarError(ex.getMessage());
                }
            }
        }
    }
}