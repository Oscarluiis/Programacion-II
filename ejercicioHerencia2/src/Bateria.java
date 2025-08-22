public class Bateria extends Instrumento{
    public Bateria(String nombre){
        super(nombre);
    }

    @Override
    public void sonar(){
        System.out.println(nombre + " hace pum pum pum");
    }
}
