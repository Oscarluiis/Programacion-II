public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio Herencia");

        System.out.println("Creando un animal");
        Animal miAnimal = new Animal("Generico",5);
        miAnimal.mostrarInfo();
        miAnimal.hacerSonido();
        miAnimal.dormir();

        System.out.println("\nCreando un perro");
        Perro miPerro = new Perro("Rex",3,"Pitbull");
        miPerro.mostrarInfo();
        miPerro.hacerSonido();
        miPerro.dormir();
        miPerro.jugar();

        System.out.println("\nPolimorfismo");

        Animal animalPerro = new Perro("Nugget",2,"Golden");
        animalPerro.hacerSonido();
        animalPerro.mostrarInfo();

    }
}