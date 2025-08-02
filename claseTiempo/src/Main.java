public class Main {
    public static void main(String[] args) {
        TiempoDocumentado tiempo1 = new TiempoDocumentado();
        System.out.println("Constructor por defecto: " + tiempo1.getTiempoFormatado());

        TiempoDocumentado tiempo2 = new TiempoDocumentado(14,30,45);
        System.out.println("Constructor por parametro: " + tiempo2.getTiempoFormatado());

        TiempoDocumentado tiempo3 = new TiempoDocumentado(25,70,80);
        System.out.println("Constructor valores invalidos: " + tiempo3.getTiempoFormatado());

        System.out.println("Hora de tiempo 2: " + tiempo2.getHora());
        System.out.println("Minuto de tiempo 2: " + tiempo2.getMinuto());
        System.out.println("Segundo de tiempo 2: " + tiempo2.getSegundo());

        System.out.println("Tiempo antes: " + tiempo1.getTiempoFormatado());
        tiempo1.setHora(9);
        System.out.println("Despues de setHora: " + tiempo1.getTiempoFormatado());
    }
}