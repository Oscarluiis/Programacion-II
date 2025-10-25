/**
 * Clase estudiante - Demuestra encapsulacion y control de acceso
 */
public class Estudiante {
    //Atributos privados de encapculacion
    private String nombre;
    private int edad;
    private double promedio;

    //Constructor
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    //Getters (Lectura de datos)
    public String getNombre() {
        return this.nombre;
    }
    public int getEdad() {
        return this.edad;
    }
    public double getPromedio() {
        return this.promedio;
    }

    //Setters (Modificacion con validacion de datos)
    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty()){
            IO.println("Error: Nombre invalido");
            return;
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if(edad < 16 || edad > 100){
            IO.println("Error: Edad debe estar entre 1 y 100");
            return;
        }
        this.edad = edad;
    }
    public void setPromedio(double promedio) {
        if(promedio < 0.0 || promedio > 100.0){
            IO.println("Error: Promedio invalido, debe estar entre 0 y 100");
            return;
        }
        this.promedio = promedio;
    }
    //Metodo publico para mostrar informacion del estudiante
    public void mostrarInformacion(){
        IO.println("\n==== INFORMACION DEL ESTUDIANTE ====");
        IO.println("Nombre: " + this.nombre);
        IO.println("Edad: " + this.edad);
        IO.println("Promedio: " + this.promedio);
        IO.println("Estado: " + (this.promedio >= 60 ? "APROBADO" :  "REPROBADO"));
        IO.println("====================================\n");
    }












}
