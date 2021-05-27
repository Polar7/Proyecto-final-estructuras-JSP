package cliente.GUI;

import cliente.controlador.Control_paso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionAgregarBancos {
    public JPanel AccionAgregarBancos;
    private JButton cancelarButton;
    private JTextField txtnombre;
    private JButton btnagregar;
    private JTextField txtnit;
    private JTextField txtdireccion;
    private JTextField txtclientes;

    public AccionAgregarBancos() {
        btnagregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Control_paso.conversionAgregarBancos(txtnombre.getText(),Integer.parseInt(txtnit.getText()),txtdireccion.getText(),Integer.parseInt(txtclientes.getText()));
                txtnombre.setText("");
                txtnit.setText("");
                txtdireccion.setText("");
                txtclientes.setText("");
            }
        });

    }
}
