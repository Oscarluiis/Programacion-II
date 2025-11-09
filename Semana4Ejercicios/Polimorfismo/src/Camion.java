public class Camion extends Vehiculo {
    private double capacidadDeCarga;

    public Camion(String marca, String modelo, int anio, double capacidadDeCarga) {
        super(marca, modelo, anio);
        this.capacidadDeCarga = capacidadDeCarga;
    }
    @Override
    public void arrancar() {
        IO.println("El camion " + marca + " arranca con un rugido");
    }
    public void cargar(){
        IO.println("Cargando hasta " + capacidadDeCarga + " toneladas");
    }
}
