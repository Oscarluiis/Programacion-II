package calculadora.vista;

import javax.swing.*;

public class CalculadoraVista {
    private JPanel panelPrincipal;
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JTextField txtResultado;
    private JLabel lblTitulo;

    // Getters para acceder a los componentes desde el controlador
    public JPanel getPanelPrincipal() { return panelPrincipal; }
    public JTextField getTxtNumero1() { return txtNumero1; }
    public JTextField getTxtNumero2() { return txtNumero2; }
    public JButton getBtnSumar() { return btnSumar; }
    public JButton getBtnRestar() { return btnRestar; }
    public JButton getBtnMultiplicar() { return btnMultiplicar; }
    public JButton getBtnDividir() { return btnDividir; }
    public JTextField getTxtResultado() { return txtResultado; }

    // Métodos de utilidad para la vista
    public String getNumero1() {
        return txtNumero1.getText().trim();
    }

    public String getNumero2() {
        return txtNumero2.getText().trim();
    }

    public void setResultado(String resultado) {
        txtResultado.setText(resultado);
    }

    public void limpiarCampos() {
        txtNumero1.setText("");
        txtNumero2.setText("");
        txtResultado.setText("");
        txtNumero1.requestFocus();
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(panelPrincipal, mensaje,
                "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void mostrarInfo(String mensaje) {
        JOptionPane.showMessageDialog(panelPrincipal, mensaje,
                "Información", JOptionPane.INFORMATION_MESSAGE);
    }
}