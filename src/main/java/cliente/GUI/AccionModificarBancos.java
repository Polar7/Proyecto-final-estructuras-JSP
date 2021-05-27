package cliente.GUI;

import cliente.controlador.Control_paso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionModificarBancos {
    public JPanel AccionModificarBancos;
    private JButton cancelarButton;
    private JTextField txtnombre;
    private JTextField txtnit;
    private JTextField txtdireccion;
    private JTextField txtclientes;
    private JButton modificarButton;

    public AccionModificarBancos() {
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Control_paso.conversionModificarBancos(txtnombre.getText(),Integer.parseInt(txtnit.getText()),txtdireccion.getText(),Integer.parseInt(txtclientes.getText()));
            }
        });
    }
}
