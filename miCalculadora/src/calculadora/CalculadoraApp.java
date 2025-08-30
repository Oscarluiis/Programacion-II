package calculadora;
import calculadora.controlador.CalculadoraControlador;
import calculadora.modelo.Calculadora;
import calculadora.vista.CalculadoraVista;

import javax.swing.*;
public class CalculadoraApp {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e){
            System.err.println("No se puede establecer el look and feel");
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                crearYMostrarGUI();
            }
        });
    }

    /**
     * Crea y muestra la interfaz grafica
     */

    private static void crearYMostrarGUI() {
        //Crear instancias del modelo y la vista
        Calculadora modelo = new Calculadora();
        CalculadoraVista vista = new CalculadoraVista();

        //Crear el controlador
        CalculadoraControlador controlador = new CalculadoraControlador(vista, modelo);

        //Crear y configurar la ventana principal
        JFrame ventana = new JFrame("Calculadora Simple");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setContentPane(vista.getPanelPrincipal());
        ventana.setResizable(true);
        ventana.pack();
        ventana.setLocationRelativeTo(null);

        //Mostrar la ventana
        ventana.setVisible(true);

        //Establecer foco incial
        vista.getTxtNumero1().requestFocus();

        //Mensaje de bienvenida
        vista.mostrarError("Bienvenido a la Calculadora Simple! \n" + "Ingrese dos numeros y seleccione una operacion");
    }
}
