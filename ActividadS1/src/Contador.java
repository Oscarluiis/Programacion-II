public class Contador {
    public static int contadorPares(int[] numeros) {
        int contador = 0;
        for(int num : numeros){
            if(num % 2 == 0){
                contador++;
            }
        }
        return contador;
    }

    public static int contadorImpares(int[] numeros) {
        int contador = 0;
        for(int num : numeros){
            if(num % 2 != 0){
                contador++;
            }
        }
        return contador;
    }

    public static int contarMayores(int[] numeros, int limite) {
        int contador = 0;
        for(int num : numeros){
            if(num > limite){
                contador++;
            }
        }
        return contador;
    }
}
