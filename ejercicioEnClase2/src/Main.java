public class Main {
    public static void main(String[] args) {
        EstudiantePublic est1 = new EstudiantePublic("Carlos",23,5.5);
        est1.edad = -50;
        est1.promedio = 10;
        System.out.println("Estudiante publico - edad " + est1.edad);

        EstudiantePrivate est2 = new EstudiantePrivate("Mario",25,7.0);
        est2.edad = -50;
        System.out.println("Estudiante privado - edad " + est2.getEdad());
    }
}