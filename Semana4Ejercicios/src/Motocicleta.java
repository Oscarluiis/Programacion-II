public class Motocicleta extends Vehiculo {
    //Atributos Especificicos de la moto
    private String tipoMoto;
    //Constructor
    public Motocicleta(String marca, String modelo, int anio, String tipoMoto) {
        super(marca, modelo, anio);
        this.tipoMoto = tipoMoto;
    }
    //Sobreescritura del metodo arrancar
    @Override
    public void arrancar(){
        IO.println("La motocicleta " + marca + " arranca con boton de encendido");
    }
    public void hacerCaballito(){
        IO.println("La moto esta haciendo un caballito, es una " + tipoMoto);
    }
}

