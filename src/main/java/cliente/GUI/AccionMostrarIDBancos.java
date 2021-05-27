package cliente.GUI;

import cliente.controlador.Control_paso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionMostrarIDBancos {
    public JPanel panelAccionMostrarIDBancos;
    private JTextField txtIDBanco;
    private JButton btnCancelar;
    private JButton btnMostrar;

    public AccionMostrarIDBancos() {
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Control_paso.conversionMostrarPorIDBancos(txtIDBanco.getText());
                txtIDBanco.setText("");
            }
        });
    }
}
