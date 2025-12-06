import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class AgendaContactos {
    private JLabel lblTitulo;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblTelefono;
    private JTextField txtTelefono;
    private JButton btnGuardar;
    private JButton btnMostrar;
    private JTextArea txtAreaContactos;
    public JPanel panelPrincipal;

    //Nombre del archivo donde guardaremos los contactos
    private String nombreArchivo = "contactos.txt";

    //Boton Guardar
    public AgendaContactos() {
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarContacto();
            }
        });

        //Boton Mostrar

        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarContactos();
            }
        });
    }

    private void guardarContacto() {
        //Obtener los datos
        String nombre = txtNombre.getText();
        String telefono = txtTelefono.getText();

        //Validar que no esten vacios
        if (nombre.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Por favor complete todos los campos");
            return;
        }

        try{

            /**
             * Crear objeto para escribir en el archivo
             * FileWriter - para escribir en archivos
             * true - para agregar al final del archivo (que no borre lo ya existente)
             * Escribir en el archivo
             * Cerrar el archivo
             * Mensaje de exito
             * Limpiar los campos
             */

            FileWriter escritor = new FileWriter(nombreArchivo, true);

            escritor.write(nombre + " - " + telefono + "\n");

            escritor.close();

            JOptionPane.showMessageDialog(null,"Contacto Guardado Exitosamente!");

            txtNombre.setText("");
            txtTelefono.setText("");

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al guardar contacto!");
        }
    }

    private void mostrarContactos() {
        // Limpiar el area de texto (Contactos)
        txtAreaContactos.setText("");

        /**
         * Crear objeto para leer el archivo
         * Variable para guardar cada linea
         * Leer linea por linea hasta el final
         * Cerrar el archivo
         */

        try{
           FileReader lector = new FileReader(nombreArchivo);
           BufferedReader buffer = new BufferedReader(lector);

           String linea;

           while((linea = buffer.readLine()) != null){
               txtAreaContactos.append(linea + "\n");
           }

           buffer.close();

        } catch (FileNotFoundException e) {
            //El archivo no existe (no hay ningun contacto)
            txtAreaContactos.setText("No se encontro el archivo");
        } catch (IOException e){
            JOptionPane.showMessageDialog(null,"Error al leer los contactos");
        }
    }

    public void main(){
        JFrame frame = new JFrame("Agenda de contactos");
        frame.setContentPane(new AgendaContactos().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}