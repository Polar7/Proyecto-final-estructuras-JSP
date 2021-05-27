package cliente.controlador;


import Contenedor.Lista;
import cliente.GUI.FramePantallaComprobante;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Control_PantallaComprobante
{
    private static Lista<Object> objetoRecibido;

    /**
     * Recibe y asigna un nuevo objeto pasado por el socket del server
     * @param pObjetoRecibido OBjeto del server
     */
    public static void recibirParaMostrarConfirmacion (Lista<Object> pObjetoRecibido)
    {
        objetoRecibido = pObjetoRecibido;
        mostrarVentana();
    }

    /**
     * Muestra una ventana de confirmacion tras realizar una operacion
     */
    public static void mostrarVentana()
    {

        if(objetoRecibido.getTamanio() == 1)
        {
            if(objetoRecibido.getValor(0) instanceof Boolean)
            {
                if((Boolean)objetoRecibido.getValor(0) == true)
                {
                    JFrame frameConfirmacion = new FramePantallaComprobante();
                    JPanel panelNuevo = new JPanel();
                    panelNuevo.add(new JLabel("SE HA EJECUTADO CORRECTAMENTE LA INSTRUCCION"));
                    frameConfirmacion.setContentPane(panelNuevo);
                }
                else if((Boolean)objetoRecibido.getValor(0) == false)
                {
                    JFrame frameConfirmacion = new FramePantallaComprobante();
                    JPanel panelNuevo = new JPanel();
                    panelNuevo.add(new JLabel("NO SE HA EJECUTADO CORRECTAMENTE LA INSTRUCCION"));
                    frameConfirmacion.setContentPane(panelNuevo);
                }
            }
            else
            {
                JFrame frameConfirmacion = new FramePantallaComprobante();
                JPanel panelNuevo = new JPanel();
                panelNuevo.add(new JLabel(objetoRecibido.getValor(0).toString()));
                frameConfirmacion.setContentPane(panelNuevo);
            }
        }
        else
        {
            /*
            JFrame frameConfirmacion = crearVentana();
            JPanel panelNuevo = new JPanel();
            String cadena = "";
            for (int i = 0; i < objetoRecibido.getTamanio(); i++ )
            {
                cadena += objetoRecibido.getValor(i).toString();
            }
            panelNuevo.add(new JLabel(cadena));
            frameConfirmacion.setContentPane(panelNuevo);*/

            JFrame frameConfirmacion = new FramePantallaComprobante();
            //JPanel panelNuevo = new JPanel();


            DefaultTableModel tablaTodos = new DefaultTableModel();
            tablaTodos.addColumn("N°");
            tablaTodos.addColumn("Data");

            for (int i = 0; i < objetoRecibido.getTamanio(); i++ )
            {
                String[] actual = new String[] {(i+1)+"", objetoRecibido.getValor(i).toString() } ;
                tablaTodos.addRow(actual);
            }

            JTable tabla = new JTable(tablaTodos);

            JScrollPane scroll  = new JScrollPane(tabla);
            tabla.setBounds(30,30,500,500);
            scroll.setBounds(12,22,500,500);

            frameConfirmacion.add(scroll);
            frameConfirmacion.add(tabla);


        }
    }

    /**
     * Crea una ventana de confirmacion
     * @return Una ventana
     */

    /*
    public static JFrame crearVentana()
    {
        JFrame frameConfirmacion = new JFrame("Confirmacion de operacion");
        frameConfirmacion.pack();
        frameConfirmacion.setResizable(true);
        frameConfirmacion.setSize(700, 500);
        frameConfirmacion.setVisible(true);

        return frameConfirmacion;
    }
    */
}
