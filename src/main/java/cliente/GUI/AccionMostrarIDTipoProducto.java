package cliente.GUI;

import cliente.controlador.Control_paso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionMostrarIDTipoProducto {
    public JPanel panelMostrarIDTIpoProducto;
    private JTextField txtIDUsuario;
    private JButton btnCancelar;
    private JButton btnMostrar;

    public AccionMostrarIDTipoProducto() {
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Control_paso.conversionMostarPorIDTipoProducto(Integer.parseInt(txtIDUsuario.getText()));
                txtIDUsuario.setText("");
            }
        });
    }
}
