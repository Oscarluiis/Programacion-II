/**
 * Clase principal SistemaVehiculos
 * Demuestra todos los conceptos de herencia y polimorfismo
 *
 * CONCEPTOS DEMOSTRADOS:
 * - POLIMORFISMO: Array de Vehiculos con diferentes tipos
 * - INSTANCEOF: Verificación de tipos
 * - CASTING: Conversión de tipos
 * - INTERFACES: Verificación de implementación
 * - LIGADURA DINÁMICA: Resolución de métodos en tiempo de ejecución
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("SISTEMA DE GESTIÓN DE VEHÍCULOS");
        System.out.println("====================================");

        // CONCEPTO: POLIMORFISMO - Array de superclase con objetos de subclases
        Vehiculo[] vehiculos = {
                new Auto("Toyota", "Corolla", 2022, "ABC123", 4, 5, 500),
                new Moto("Honda", "CBR600", 2021, "XYZ789", 600, false),
                new Auto("Ford", "F-150", 2023, "DEF456", 4, 5, 1000),
                new Moto("Harley", "Davidson", 2020, "GHI012", 1200, true)
        };

        // Simular algunos kilómetros para testing
        vehiculos[0].acelerar(12000); // Auto Toyota necesitará mantenimiento
        vehiculos[1].acelerar(6000);  // Moto Honda necesitará mantenimiento

        // DEMOSTRACIÓN 1: POLIMORFISMO EN ACCIÓN
        demostrarPolimorfismo(vehiculos);

        // DEMOSTRACIÓN 2: USO DE INTERFACES
        demostrarInterfaces(vehiculos);

        // DEMOSTRACIÓN 3: CASTING Y MÉTODOS ESPECÍFICOS
        demostrarCastingYMetodosEspecificos(vehiculos);
    }

    /**
     * CONCEPTO: POLIMORFISMO
     * El mismo código funciona para diferentes tipos de objetos
     */
    private static void demostrarPolimorfismo(Vehiculo[] vehiculos) {
        System.out.println("\n1. DEMOSTRANDO POLIMORFISMO:");
        System.out.println("----------------------------------------");

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("\nProcesando: " + vehiculo.getMarca() + " " + vehiculo.getModelo());

            // CONCEPTO: LIGADURA DINÁMICA
            // El método que se ejecuta depende del tipo real del objeto, no del tipo de la variable
            vehiculo.arrancar();                // Comportamiento específico de cada subclase
            vehiculo.mostrarInformacion();      // Método sobrescrito en cada subclase
            vehiculo.detener();                 // Comportamiento específico de cada subclase

            System.out.println("Tipo detectado: " + vehiculo.getTipoVehiculo());
        }
    }

    /**
     * CONCEPTO: INTERFACES
     * Verificación e uso de diferentes interfaces implementadas
     */
    private static void demostrarInterfaces(Vehiculo[] vehiculos) {
        System.out.println("\n\n2. DEMOSTRANDO INTERFACES:");
        System.out.println("----------------------------------------");

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("\nMantenimiento de: " + vehiculo.getMarca() + " " + vehiculo.getModelo());

            // CONCEPTO: INTERFACE Mantenible - TODOS los vehículos la implementan
            if (vehiculo.necesitaMantenimiento()) {
                System.out.println("REQUIERE MANTENIMIENTO:");
                vehiculo.realizarMantenimiento();
                double costo = vehiculo.calcularCostoMantenimiento();
                System.out.println("Costo estimado: $" + String.format("%.2f", costo));
            } else {
                System.out.println("No necesita mantenimiento aún");
                System.out.println("Kilometraje actual: " + vehiculo.getKilometraje() + " km");
            }

            // CONCEPTO: VERIFICACIÓN DE INTERFACE específica
            if (vehiculo instanceof Transportable) {
                System.out.println("CAPACIDAD DE TRANSPORTE:");
                Transportable transportador = (Transportable) vehiculo;
                System.out.println("  Capacidad máxima: " + transportador.getCapacidadCarga() + "kg");
                System.out.println("  Puede cargar y descargar mercancía");
            } else {
                System.out.println("TRANSPORTE: No diseñado para carga pesada");
            }
        }
    }

    /**
     * CONCEPTO: INSTANCEOF y CASTING
     * Verificación de tipos y conversión segura para acceder a métodos específicos
     */
    private static void demostrarCastingYMetodosEspecificos(Vehiculo[] vehiculos) {
        System.out.println("\n\n3. DEMOSTRANDO CASTING Y MÉTODOS ESPECÍFICOS:");
        System.out.println("----------------------------------------");

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("\nAnalizando: " + vehiculo.getTipoVehiculo() +
                    " " + vehiculo.getMarca() + " " + vehiculo.getModelo());

            // CONCEPTO: INSTANCEOF - Verificación segura de tipos
            if (vehiculo instanceof Auto) {
                System.out.println("Es un AUTO - Ejecutando operaciones específicas:");

                // CONCEPTO: CASTING - Conversión segura de tipos
                Auto auto = (Auto) vehiculo;

                // Acceso a métodos específicos de Auto
                auto.abrirPuertas();
                System.out.println("  Probando capacidad de carga...");
                auto.cargar(200);
                auto.cargar(400); // Esto debería exceder la capacidad en algunos casos
                auto.descargar();

            } else if (vehiculo instanceof Moto) {
                System.out.println("Es una MOTO - Ejecutando operaciones específicas:");

                // CONCEPTO: CASTING para Moto
                Moto moto = (Moto) vehiculo;

                // Acceso a métodos específicos de Moto
                moto.hacerWhelie();
                System.out.println("  Cilindrada: " + moto.getCilindrada() + "cc");
                System.out.println("  Sidecar: " + (moto.isTieneSidecar() ? "Sí" : "No"));
            }
        }
    }
}