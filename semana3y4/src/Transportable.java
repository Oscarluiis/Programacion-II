/**
 * Interface Transportable
 * Define el contrato para objetos que pueden transportar carga
 *
 * CONCEPTO: MÚLTIPLES INTERFACES
 * Una clase puede implementar múltiples interfaces
 */
public interface Transportable {
    /**
     * Carga peso en el vehículo
     * @param peso cantidad de peso a cargar en kg
     */
    void cargar(int peso);

    /**
     * Descarga todo el peso del vehículo
     */
    void descargar();

    /**
     * Obtiene la capacidad máxima de carga
     * @return capacidad máxima en kg
     */
    int getCapacidadCarga();
}