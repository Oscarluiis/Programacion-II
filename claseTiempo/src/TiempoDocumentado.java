/**
 * Clase Tiempo - Representa un momento especifico del dia en formato 24 horas
 *
 * Esta clase encapsula la representacion de tiempo proporcionando metodos
 * seguros para la manipulacion y acceso a los componentes temporales.
 * Garantiza que el objeto siempre tenga estados validos.
 * @author Oscarluiis
 * @version 1.0
 */

public class TiempoDocumentado {
    /**
     * Hora del dia (0-23)
     */
    private int hora;

    /**
     * Minuto de la hora (0-59)
     */
    private int minuto;

    /**
     * Segundo del minuto (0-59)
     */
    private int segundo;

    /**
     * Constructor por defecto
     * Inicializar en 00:00:00
     */
    public TiempoDocumentado() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    /**
     * Constructor Parametrizado con validacion
     * @param hora del dia (0-23)
     * @param minuto de la hora (0-59)
     * @param segundo del minuto (0-59)
     */
    public TiempoDocumentado(int hora, int minuto, int segundo) {
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    /**
     * Obtener la hora actual
     * @return hora (0-23)
     */
    public int getHora() {
        return this.hora;
    }
    public int getMinuto() {
        return this.minuto;
    }
    public int getSegundo() {
        return this.segundo;
    }

    /**
     * Establecela hora con validacion
     * Si el valor es invalido, se establece a 0 y se muestra un mensaje de error
     * @param hora nueva
     */
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        }else {
            System.out.println("Hora Invalida debe estar entre 0 y 23");
            this.hora = 0;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }else {
            System.out.println("Minuto Invalida debe estar entre 0 y 59");
            this.minuto = 0;
        }
    }
    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }else {
            System.out.println("Minuto Invalida debe estar entre 0 y 59");
            this.segundo = 0;
        }
    }

    /**
     * Obtener el formato HH:MM:SS
     * @return cadena de tiempo formateado (15:49:30)
     * %: Indica que se usara un formato
     * 0: Indica que se debe rellenar con ceros a la izquierda en caso que el numero
     * tenga menos digitos que el ancho especificado
     * 2: Indica el ancho minimo del campo, es de dos digitos
     * d: Indica que se trata de un numero entero decimal
     */
    public String getTiempoFormatado() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

    /**
     * Avanza el tiempo en un segundo
     * Maneja automaticamente el desbordamiento de segundos, minutos y horas
     * Cuando llega a 24:00:00, vuelve a 00:00:00
     */
    public void avanzarSegundo(){
        this.segundo++;
        if (this.segundo >= 59) {
            this.segundo = 0;
            this.minuto++;
            if (this.minuto >= 59) {
                this.minuto = 0;
                this.hora++;
                if (this.hora > 23) {
                    this.hora = 0;
                }
            }
        }
    }
}
