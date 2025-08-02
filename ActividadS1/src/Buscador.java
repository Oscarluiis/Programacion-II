public class Buscador {

    public static boolean existe(int[] numeros, int buscar){
        for(int numero : numeros){
            if(numero == buscar){
                return true;
            }
        }
        return false;
    }
    public static int posicion(int[] numeros, int buscar){
        for(int i=0; i<numeros.length; i++){
            if(numeros[i] == buscar){
                return i;
            }
        }
        return -1;
    }
}
