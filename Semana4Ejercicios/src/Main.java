//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Crear objetos
    Auto miAuto = new Auto("Toyota", "Corolla", 2005, 4);
    Motocicleta miMoto = new Motocicleta("Yamaha", "R1", 2003, "Deportiva");

    IO.println("=== Auto ===");
    miAuto.mostrarInfo();
    miAuto.arrancar();
    miAuto.abrirPuertas();

    IO.println("=== Motocicleta ===");
    miMoto.mostrarInfo();
    miMoto.arrancar();
    miMoto.hacerCaballito();
}









