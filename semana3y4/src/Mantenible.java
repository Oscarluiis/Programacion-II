/**
 * Interface Mantenible
 * Define el contrato para objetos que requieren mantenimiento
 *
 * CONCEPTO: INTERFACES COMO CONTRATOS
 * Define QUÉ debe hacer un vehículo mantenible, no CÓMO hacerlo
 */
public interface Mantenible {
    /**
     * Realiza las tareas de mantenimiento del objeto
     */
    void realizarMantenimiento();

    /**
     * Calcula el costo del mantenimiento
     * @return costo en unidades monetarias
     */
    double calcularCostoMantenimiento();

    /**
     * Determina si el objeto necesita mantenimiento
     * @return true si necesita mantenimiento, false en caso contrario
     */
    boolean necesitaMantenimiento();
}