package cliente.GUI;

import cliente.controlador.Control_paso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionElimarUsuario {
    public JPanel AccionEliminarUsuario;
    private JTextField txtcedulaUsuarioAEliminar;
    private JButton btncancelar;
    private JButton btneliminar;

    public AccionElimarUsuario() {
        btneliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Control_paso.conversioneliminarUsuario(Integer.parseInt(txtcedulaUsuarioAEliminar.getText()));
                txtcedulaUsuarioAEliminar.setText("");
            }
        });
    }
}
