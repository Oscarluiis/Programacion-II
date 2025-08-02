import java.util.Arrays;

public class Main {
    //Metodo para sumar

    public static int sumar(int[] numeros){
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }
    //Metodo promedio
    public static double promedio(int[] numeros){
        if(numeros.length == 0){
            return 0.0;
        }
        int suma = sumar(numeros);
        return (double) suma/ numeros.length;
    }

    //Metodo mostrar
    public static void mostrar(int[] numeros){
        System.out.print("Arreglo: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if(i < numeros.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numeros = {10,20,30,40,50};
        mostrar(numeros);

        int suma = sumar(numeros);
        System.out.println("Suma: " + suma);
        double promedio = promedio(numeros);
        System.out.println("Promedio: " + promedio);

        Persona persona1 = new Persona("Jose", 22);
        Persona persona2 = new Persona("Jane", 23);

        persona1.saludar();
        persona2.saludar();

        persona1.setEdad(26);
        System.out.println("Despues de cambiar la edad: ");
        persona1.saludar();

        int[] numeros2 = {5,10,15,20,25};

        boolean existe15 = Buscador.existe(numeros2,15);  // ← Sin Buscador.
        System.out.println("¿Existe 15? " + existe15);

        int posicion20 = Buscador.posicion(numeros2, 20);  // ← Sin Buscador.
        System.out.println("Posición de 20: " + posicion20);

        boolean existe100 = Buscador.existe(numeros2, 100);  // ← Sin Buscador.
        System.out.println("¿Existe 100? " + existe100);

        Auto auto1 = new Auto("Toyota", "Corolla", 2018);
        Auto auto2 = new Auto("Honda", "Civic", 2021);
        Auto auto3 = new Auto("Ford", "Focus", 2023);

        auto1.mostrarInfo();
        auto2.mostrarInfo();
        auto3.mostrarInfo();

        System.out.println("Es nuevo? " + auto1.esNuevo());
        System.out.println("Es nuevo? " + auto2.esNuevo());
        System.out.println("Es nuevo? " + auto3.esNuevo());

        int[] numeros3 = {1,2,3,4,5,6,7,8,9,10};

        int pares = Contador.contadorPares(numeros3);
        int impares = Contador.contadorImpares(numeros3);

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

        int mayores = Contador.contarMayores(numeros3,5);
        System.out.println("Mayores a 5: " + mayores);

        Circulo circulo = new Circulo(5);
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Area: " + circulo.area());
        System.out.println("Perimetro: " + circulo.perimetro());

        circulo.setRadio(3);
        System.out.println("Nuevo Radio: " + circulo.getRadio());
        System.out.println("Nueva Area: " + circulo.area());
        System.out.println("Nuevo Perimetro: " + circulo.perimetro());
    }
}

