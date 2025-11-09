public class Vehiculo {
    //Atributos
    protected String marca;
    protected String modelo;
    protected int anio;
    //Constructor
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    //Mostrar Informacion
    public void mostrarInfo(){
       IO.println("Marca: " + this.marca);
       IO.println("Modelo: " + this.modelo);
       IO.println("Anio: " + this.anio);
    }
    //Funcion arrancar
    public void arrancar(){
        IO.println("El vehiculo esta arrancado");
    }
}












