public class Guitarra extends Instrumento{
    public Guitarra(String nombre){
        super(nombre);
    }

    @Override
    public void sonar(){
        System.out.println(nombre + " hace tan tan tan");
    }
}
