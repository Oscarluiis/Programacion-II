public class Main  {
    void main(){
        IO.println("Iniciando programa...");
        IO.println("SISTEMA DE ESTUDIANTES\n");

        //Crear estudiante
        Estudiante estudiante1 = new Estudiante("Maria Garcia", 20, 85.5);
        estudiante1.mostrarInformacion();

        //Usar los getters
        IO.println("---- Leyendo con GETTERS ----");
        IO.println("Nombre: " + estudiante1.getNombre());
        IO.println("Edad: " + estudiante1.getEdad());
        //Usar los setters con validacion
        IO.println("---- Modificando con SETTERS ----");
        estudiante1.setPromedio(92.0);
        estudiante1.setPromedio(150.0);
        estudiante1.setEdad(200);
        //Vuelvan a mostrar la informacion
        estudiante1.mostrarInformacion();
        //Crear otro estudiante pero reprobado
        Estudiante estudiante2 = new Estudiante("Joe Doe", 55, 55.0);
        estudiante2.mostrarInformacion();
    }
}