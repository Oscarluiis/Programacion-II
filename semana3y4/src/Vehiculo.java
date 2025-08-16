/**
 * Clase abstracta Vehiculo
 * Superclase que define características comunes de todos los vehículos
 *
 * CONCEPTOS APLICADOS:
 * - CLASE ABSTRACTA: No puede instanciarse directamente
 * - HERENCIA: Sirve como base para Auto y Moto
 * - MODIFICADORES DE ACCESO: protected, private, public
 * - MÉTODOS ABSTRACTOS: deben implementarse en subclases
 * - IMPLEMENTACIÓN DE INTERFACE: implements Mantenible
 */
public abstract class Vehiculo implements Mantenible {

    // CONCEPTO: PROTECTED - Accesible para subclases
    protected String marca;
    protected String modelo;
    protected int año;
    protected double kilometraje;

    // CONCEPTO: PRIVATE - Solo esta clase puede acceder
    private String numeroChasis;

    /**
     * Constructor de la clase Vehiculo
     * CONCEPTO: CONSTRUCTOR EN HERENCIA - Será llamado por subclases
     */
    public Vehiculo(String marca, String modelo, int año, String numeroChasis) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numeroChasis = numeroChasis;
        this.kilometraje = 0.0;
        System.out.println("Constructor de Vehiculo ejecutado: " + marca + " " + modelo);
    }

    /**
     * CONCEPTO: MÉTODO CONCRETO EN CLASE ABSTRACTA
     * Implementación común que heredan todas las subclases
     */
    public void mostrarInformacionBasica() {
        System.out.println("=== INFORMACIÓN DEL VEHÍCULO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Kilometraje: " + kilometraje + " km");
    }

    /**
     * CONCEPTO: MÉTODO PÚBLICO - Interfaz para el mundo exterior
     * Comportamiento común para todos los vehículos
     */
    public void acelerar(double distancia) {
        this.kilometraje += distancia;
        System.out.println("Vehículo aceleró. Kilometraje: " + kilometraje + " km");
    }

    // Métodos getter públicos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    // CONCEPTO: MÉTODOS ABSTRACTOS - Subclases DEBEN implementarlos
    /**
     * Método abstracto para arrancar el vehículo
     * Cada tipo de vehículo arranca de manera diferente
     */
    public abstract void arrancar();

    /**
     * Método abstracto para detener el vehículo
     * Cada tipo de vehículo se detiene de manera diferente
     */
    public abstract void detener();

    /**
     * Método abstracto que retorna el tipo de vehículo
     * @return string que describe el tipo de vehículo
     */
    public abstract String getTipoVehiculo();

    /**
     * CONCEPTO: MÉTODO VIRTUAL - Puede ser sobrescrito por subclases
     * Implementación base que las subclases pueden personalizar
     */
    public void mostrarInformacion() {
        mostrarInformacionBasica();
        System.out.println("Tipo: " + getTipoVehiculo());
    }
}