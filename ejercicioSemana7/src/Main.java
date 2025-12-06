//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
void main() {
    JFrame frame = new JFrame("Calculadora de Edad");
    frame.setContentPane(new CalculadoradeEdad().panelPrincipal);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}
