/**
 * Clase Moto - Subclase de Vehiculo
 *
 * CONCEPTOS APLICADOS:
 * - HERENCIA SIMPLE: Solo hereda de Vehiculo
 * - NO IMPLEMENTA Transportable (las motos no transportan mucha carga)
 * - IMPLEMENTACIÓN ESPECÍFICA de métodos abstractos
 * - POLIMORFISMO: Comportamiento específico de Moto
 */
public class Moto extends Vehiculo {

    // CONCEPTO: ATRIBUTOS ESPECÍFICOS DE LA SUBCLASE
    private int cilindrada;
    private boolean tieneSidecar;

    /**
     * Constructor de Moto
     * CONCEPTO: CONSTRUCTOR con super()
     */
    public Moto(String marca, String modelo, int año, String numeroChasis,
                int cilindrada, boolean tieneSidecar) {
        super(marca, modelo, año, numeroChasis);
        this.cilindrada = cilindrada;
        this.tieneSidecar = tieneSidecar;
        System.out.println("Constructor de Moto ejecutado - Cilindrada: " + cilindrada + "cc");
    }

    // CONCEPTO: IMPLEMENTACIÓN ESPECÍFICA de métodos abstractos
    @Override
    public void arrancar() {
        System.out.println("Moto arrancada - VROOM VROOM!");
    }

    @Override
    public void detener() {
        System.out.println("Moto detenida - Motor silencioso");
    }

    @Override
    public String getTipoVehiculo() {
        return "Motocicleta";
    }

    // CONCEPTO: IMPLEMENTACIÓN DIFERENTE de interface Mantenible
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento de la moto:");
        System.out.println("  - Lubricación de cadena");
        System.out.println("  - Cambio de aceite");
        System.out.println("  - Revisión de neumáticos");
        if (tieneSidecar) {
            System.out.println("  - Inspección del sidecar");
        }
    }

    @Override
    public double calcularCostoMantenimiento() {
        double costoBase = 80.0 + (kilometraje * 0.03);
        return tieneSidecar ? costoBase * 1.3 : costoBase;
    }

    @Override
    public boolean necesitaMantenimiento() {
        return kilometraje > 5000; // Motos necesitan mantenimiento más frecuente
    }

    // CONCEPTO: POLIMORFISMO - Comportamiento específico de Moto
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada + "cc");
        System.out.println("Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }

    // CONCEPTO: MÉTODO ESPECÍFICO DE LA SUBCLASE
    public void hacerWhelie() {
        System.out.println("Moto haciendo wheelie!");
    }

    // Getters adicionales
    public int getCilindrada() {
        return cilindrada;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }
}