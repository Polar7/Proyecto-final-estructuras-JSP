package cliente.GUI;

import cliente.controlador.Control_paso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionModificarTipoProducto {
    public JPanel AccionModificarTipoProducto;
    private JTextField txtidproducto;
    private JTextField txtnombre;
    private JButton btnmodificar;
    private JButton btncancelar;

    public AccionModificarTipoProducto() {
        btnmodificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Control_paso.conversionModificarTipoProducto(Integer.parseInt(txtidproducto.getText()),txtnombre.getText());
            }
        });
    }
}
