public class Piano extends Instrumento{
    public Piano(String nombre){
        super(nombre);
    }

    @Override
    public void sonar(){
        System.out.println(nombre + " hace plin plin plin");
    }
}
