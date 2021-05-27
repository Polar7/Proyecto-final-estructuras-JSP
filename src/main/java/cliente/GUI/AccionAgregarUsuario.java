package cliente.GUI;

import cliente.controlador.Control_paso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AccionAgregarUsuario {
    public JPanel MenuAgregarUsuario;
    private JTextField txtcedula;
    private JTextField txtnombre;
    private JTextField txtapellido;
    private JTextField txttelefono;
    private JTextField txtfecha;
    private JButton btncancelar;
    private JButton btnagregar;
    private JTextField txtdireccion;
    private JTextField txtscore;


    public AccionAgregarUsuario()
    {

        btnagregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fecha=txtfecha.getText().trim();
                SimpleDateFormat formato =new SimpleDateFormat("dd/MM/yyyy");
                try {
                    Date nacimiento = formato.parse(fecha);
                    Control_paso.conversionAgregarUsuario(Integer.parseInt(txtcedula.getText()),txtnombre.getText(),txtapellido.getText(),Integer.parseInt(txttelefono.getText()),nacimiento,txtdireccion.getText(),Integer.parseInt(txtscore.getText()));
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }

                txtcedula.setText("");
                txtnombre.setText("");
                txtapellido.setText("");
                txtdireccion.setText("");
                txtfecha.setText("");
                txttelefono.setText("");
                txtscore.setText("");
            }

        });
    }

}
