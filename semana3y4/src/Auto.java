/**
 * Clase Auto - Subclase de Vehiculo
 *
 * CONCEPTOS APLICADOS:
 * - HERENCIA: extends Vehiculo
 * - IMPLEMENTACIÓN DE MÚLTIPLES INTERFACES: implements Transportable
 * - SOBRESCRITURA DE MÉTODOS: @Override
 * - CONSTRUCTORES CON super()
 * - POLIMORFISMO: Comportamiento específico de Auto
 */
public class Auto extends Vehiculo implements Transportable {

    // CONCEPTO: ATRIBUTOS ESPECÍFICOS DE LA SUBCLASE
    private int numeroPuertas;
    private int capacidadPasajeros;
    private int cargaActual;
    private int capacidadCarga;

    /**
     * Constructor de Auto
     * CONCEPTO: CONSTRUCTOR DE SUBCLASE con super()
     */
    public Auto(String marca, String modelo, int año, String numeroChasis,
                int numeroPuertas, int capacidadPasajeros, int capacidadCarga) {
        // CONCEPTO: LLAMADA OBLIGATORIA A super()
        super(marca, modelo, año, numeroChasis);
        this.numeroPuertas = numeroPuertas;
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = 0;
        System.out.println("Constructor de Auto ejecutado - Puertas: " + numeroPuertas);
    }

    // CONCEPTO: IMPLEMENTACIÓN OBLIGATORIA DE MÉTODOS ABSTRACTOS
    @Override
    public void arrancar() {
        System.out.println("Auto arrancado - Motor encendido");
    }

    @Override
    public void detener() {
        System.out.println("Auto detenido - Motor apagado");
    }

    @Override
    public String getTipoVehiculo() {
        return "Automóvil";
    }

    // CONCEPTO: IMPLEMENTACIÓN DE INTERFACE Mantenible (heredada de Vehiculo)
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del auto:");
        System.out.println("  - Cambio de aceite");
        System.out.println("  - Revisión de frenos");
        System.out.println("  - Inspección de neumáticos");
    }

    @Override
    public double calcularCostoMantenimiento() {
        // Costo base + costo por kilometraje
        return 150.0 + (kilometraje * 0.05);
    }

    @Override
    public boolean necesitaMantenimiento() {
        return kilometraje > 10000; // Cada 10,000 km
    }

    // CONCEPTO: IMPLEMENTACIÓN DE INTERFACE Transportable
    @Override
    public void cargar(int peso) {
        if (cargaActual + peso <= capacidadCarga) {
            cargaActual += peso;
            System.out.println("Cargados " + peso + "kg. Carga total: " + cargaActual + "kg");
        } else {
            System.out.println("Error: No se puede cargar. Excede capacidad máxima");
        }
    }

    @Override
    public void descargar() {
        System.out.println("Descargando " + cargaActual + "kg");
        cargaActual = 0;
    }

    @Override
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    // CONCEPTO: POLIMORFISMO - Sobrescritura para comportamiento específico
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama método de la superclase
        System.out.println("Puertas: " + numeroPuertas);
        System.out.println("Capacidad pasajeros: " + capacidadPasajeros);
        System.out.println("Capacidad carga: " + capacidadCarga + "kg");
        System.out.println("Carga actual: " + cargaActual + "kg");
    }

    // CONCEPTO: MÉTODOS ESPECÍFICOS DE LA SUBCLASE
    public void abrirPuertas() {
        System.out.println("Abriendo " + numeroPuertas + " puertas del auto");
    }

    // Getters adicionales
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getCargaActual() {
        return cargaActual;
    }
}