public class Auto {
    private String marca;
    private String modelo;
    private int anio;

    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    //Getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnio() {
        return anio;
    }

    public void mostrarInfo(){
        System.out.println("Auto: " + "Marca: " + marca + ", Modelo: " + modelo + ", Anio: " + anio);
    }

    public boolean esNuevo(){
        return anio >= 2020;
    }
}
