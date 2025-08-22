//Superclase, clase padre o clase base

public class Animal {
    //Protected significa que las clases hijas pueden acceder a estos atributos
    protected String nombre;
    protected int edad;

    //Este constructor sera llamda cuando creemos un animal o cuando una clase hija use super()
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Se ha creado un animal: " + nombre);
    }

    //metodo que puede ser heredado
    public void dormir(){
        System.out.println("Se ha dormido un animal: " + nombre);
    }

    //Las clases hijas pueden cambiar este comportamiento
    public void hacerSonido(){
        System.out.println(nombre + " hace un sonido generico");
    }

    //mostrar informacion basica del animal
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + " anios");
    }
}
