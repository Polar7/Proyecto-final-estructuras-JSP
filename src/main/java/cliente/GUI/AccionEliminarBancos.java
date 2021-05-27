package cliente.GUI;

import cliente.controlador.Control_paso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionEliminarBancos {
    public JPanel AccionEliminarBanco;
    private JTextField txtnombre;
    private JButton cancelarButton;
    private JButton eliminarButton;

    public AccionEliminarBancos() {
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Control_paso.conversioneliminarBancos(txtnombre.getText());
                txtnombre.setText("");
            }

        });
    }
}
