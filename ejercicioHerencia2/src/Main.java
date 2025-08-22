public class Main {
    public static void main(String[] args) {
        System.out.println("Sin polimorfismo");
        Piano piano = new Piano("Piano Yamaha");
        Guitarra guitarra = new Guitarra("Guitarra Fender");
        Bateria bateria = new Bateria("Bateria Pearl");

        piano.sonar();
        guitarra.sonar();
        bateria.sonar();

        System.out.println("\nCon polimorfismo");
        Instrumento inst1 = new Piano("Piano Steinway");
        Instrumento inst2 = new Guitarra("Guitarra Gibson");
        Instrumento inst3 = new Bateria("Bateria DW");

        inst1.sonar();
        inst2.sonar();
        inst3.sonar();
    }
}