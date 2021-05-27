package cliente.GUI;

import cliente.controlador.Control_paso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionMostrarIDUsuario {
    public JPanel panelMostrarIDUsuario;
    private JTextField txtIDTipoProducto;
    private JButton btnCancelar;
    private JButton btnMostrar;


    public AccionMostrarIDUsuario() {
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Control_paso.conversionMostrarPorIDUsuario(Integer.parseInt(txtIDTipoProducto.getText()));
                txtIDTipoProducto.setText("");
            }
        });
    }
}
