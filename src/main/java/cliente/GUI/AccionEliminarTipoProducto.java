package cliente.GUI;

import cliente.controlador.Control_paso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionEliminarTipoProducto {
    public JPanel AccionEliminarTipoProducto;
    private JTextField txtidProductoAEliminar;
    private JButton btncancelar;
    private JButton btneliminar;

    public AccionEliminarTipoProducto() {
        btneliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Control_paso.conversionEliminarTipoProducto(Integer.parseInt(txtidProductoAEliminar.getText()));
            }
        });
    }
}
