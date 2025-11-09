public class Auto extends Vehiculo {
    //Atributos especificos de Auto
    private int numeroPuertas;

    //Constructor
    public Auto(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }
    @Override
    public void arrancar(){
        IO.println("El auto " + marca + " - " + modelo + " esta arrancando con la llave");
    }
    public void abrirPuertas(){
        IO.println("Abriendo las puertas " + numeroPuertas);
    }

}
