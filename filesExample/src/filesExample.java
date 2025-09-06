import java.io.*;

public class filesExample  {

    public static void main(String[] args) {
        System.out.println("PROGRAMA DE GESTIÓN DE ESTUDIANTES");
        System.out.println("=====================================\n");

        // 1. Verificar si ya existe el archivo
        if (archivoExiste()) {
            System.out.println("Leyendo estudiantes existentes:\n");
            leerNombres();
        } else {
            System.out.println("Creando archivo nuevo con estudiantes:\n");
            escribirNombres();
            System.out.println("\nAhora leyendo lo que escribimos:\n");
            leerNombres();
        }

        System.out.println("\n¡Programa terminado!");
    }
    // Método para ESCRIBIR nombres en el archivo
    public static void escribirNombres() {
        System.out.println("Escribiendo nombres en el archivo...");

        try {
            // 1. Crear la "pluma" para escribir en el archivo
            FileWriter escritor = new FileWriter("estudiantes.txt");

            // 2. Escribir los nombres (como escribir en papel)
            escritor.write("Juan Pérez\n");        // \n = nueva línea
            escritor.write("María García\n");
            escritor.write("Carlos López\n");
            escritor.write("Ana Rodríguez\n");

            // 3. Cerrar la "pluma" (MUY IMPORTANTE)
            escritor.close();

            System.out.println("¡Nombres guardados correctamente!");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    // Método para LEER nombres del archivo
    public static void leerNombres() {
        System.out.println("Leyendo nombres del archivo...");

        try {
            // 1. Crear el "lector" para leer el archivo
            FileReader lectorArchivo = new FileReader("estudiantes.txt");
            BufferedReader lector = new BufferedReader(lectorArchivo);

            // 2. Leer línea por línea
            String linea;
            int numero = 1;

            System.out.println("Estudiantes encontrados:");

            while ((linea = lector.readLine()) != null) {
                // Mientras haya líneas para leer
                System.out.println(numero + ". " + linea);
                numero++;
            }

            // 3. Cerrar el lector
            lector.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Método para VERIFICAR si el archivo existe
    public static boolean archivoExiste() {
        File archivo = new File("estudiantes.txt");

        if (archivo.exists()) {
            System.out.println("El archivo SÍ existe");
            System.out.println("   Tamaño: " + archivo.length() + " bytes");
            return true;
        } else {
            System.out.println("El archivo NO existe");
            return false;
        }
    }

}