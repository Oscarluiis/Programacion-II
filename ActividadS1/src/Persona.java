public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " anios" );
    }
}
