public class Instrumento {
    protected String nombre;

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }

    public void sonar(){
        System.out.println(nombre + " esta sonando...");
    }
}
