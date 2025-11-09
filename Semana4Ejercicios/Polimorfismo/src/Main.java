//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    /**Polimorfismo:
     * Una variable del tipo padre puede referenciar
     * objetos hijos
      */
    Vehiculo vehiculo1 = new Auto("Honda", "Civic", 2020, 4);
    Vehiculo vehiculo2 = new Motocicleta("Kawasaki", "Ninja", 2021, "Deportiva");
    Vehiculo vehiculo3 = new Camion("Volvo","FH16",2022,25.5);

    //Crear un arreglo de vehiculos (polimorfismo en accion)
    Vehiculo[] flota = {vehiculo1,vehiculo2,vehiculo3};

    IO.println("==== Arrancando la Flota ====");
    //Recorrer los elementos de la flota (Por cada vehiculo en la flota)
    for (Vehiculo v : flota){
        v.mostrarInfo();
        v.arrancar();
        IO.println("==== ==== ====");
    }

    //Verlo en una funcion
    IO.println("==== Usando un metodo polimorfico ====");
    iniciarVehiculo(vehiculo1);
    iniciarVehiculo(vehiculo2);
    iniciarVehiculo(vehiculo3);

}
//Este metodo acepta cualquier tipo de vehiculo
private void iniciarVehiculo(Vehiculo v) {
    IO.println("=== Iniciando Vehiculo ===");
    v.arrancar();
}










