package calculadora.modelo;

/**
 * Clase que maneja las operaciones matemáticas básicas
 */
public class Calculadora {

    /**
     * Suma dos números
     * @param numero1 primer operando
     * @param numero2 segundo operando
     * @return resultado de la suma
     */
    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    /**
     * Resta dos números
     * @param numero1 primer operando (minuendo)
     * @param numero2 segundo operando (sustraendo)
     * @return resultado de la resta
     */
    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    /**
     * Multiplica dos números
     * @param numero1 primer operando
     * @param numero2 segundo operando
     * @return resultado de la multiplicación
     */
    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    /**
     * Divide dos números
     * @param numero1 dividendo
     * @param numero2 divisor
     * @return resultado de la división
     * @throws ArithmeticException si el divisor es cero
     */
    public double dividir(double numero1, double numero2) throws ArithmeticException {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numero1 / numero2;
    }

    /**
     * Valida si una cadena es un número válido
     * @param texto cadena a validar
     * @return true si es un número válido, false en caso contrario
     */
    public boolean esNumeroValido(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}