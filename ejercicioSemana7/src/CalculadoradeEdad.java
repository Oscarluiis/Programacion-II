import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoradeEdad {
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JButton btnCalcular;
    private JLabel lblNombre;
    private JLabel lblEdad;
    private JLabel lblResultado;
    public JPanel panelPrincipal;

    public CalculadoradeEdad(){

        btnCalcular.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e){
               //Vamos a obtener el nombre
               String nombre = txtNombre.getText();

               //Vamos a obtener la edad
               String edadTexto = txtEdad.getText(); //NO es un valor numerico, son caracteres
               int edad = Integer.parseInt(edadTexto); // Esto ya es un valor numerico

               //Calcular el anio de nacimiento
               int anioActual = 2025;
               int anioNacimiento = anioActual - edad;

               // Mostrar el resultado en el label resultado
               lblResultado.setText(nombre + ", naciste aproximadamente en el anio " + anioNacimiento);

           }
        });
    }
}
