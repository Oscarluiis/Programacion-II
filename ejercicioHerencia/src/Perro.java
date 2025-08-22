//Esta sera una clase hija

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
        System.out.println("Es un perro de raza: " + raza);
    }

    @Override
    public void hacerSonido(){
        System.out.println(nombre + " ladra");
    }

    public void jugar(){
        System.out.println(nombre + " Jugando con una pelota");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Raza: " + raza);
    }

}
