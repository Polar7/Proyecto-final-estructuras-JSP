package cliente.GUI;


import cliente.controlador.Control_paso;
import cliente.socketCliente.TCPEchoClient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MenuPrincipal {
    public JPanel MenuPrincipal;
    private JButton btninsertarusuario;
    private JButton btneliminarusuario;
    private JButton btnmodificarusuario;
    private JButton btninsertartipoproducto;
    private JButton btneliminartipoproducto;
    private JButton btnmodificartipoproducto;
    private JButton btnagregarproducto;
    private JButton btneliminarproducto;
    private JButton btnmodificarproducto;
    private JButton btnMostrarTodosTiposProductos;
    private JButton btnMostrarTodosUsuarios;
    private JButton btnMostrarTodosBancos;
    private JButton btnMostrarPorIDUsuarios;
    private JButton btnMostrarPorIDTipoProductos;
    private JButton btnMostrarPorIDBancos;
    private JButton btnagregarUsuario;
    private JButton btneliminarUsuario;
    private JButton btnagregarTipoDeProducto;
    private JButton btneliminarTipoDeProducto;
    private static TCPEchoClient clase= new TCPEchoClient();




    public MenuPrincipal() {


        btninsertarusuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAgregarUsuario();
            }
        });
        btneliminarusuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openEliminarUsuario();
            }
        });
        btnmodificarusuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openModificarUsuario();
            }
        });
        btninsertartipoproducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAgregarTipoProducto();
            }
        });
        btneliminartipoproducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openEliminarTipoProducto();
            }
        });
        btnmodificartipoproducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openModificarTipoProducto();
            }
        });
        btnagregarproducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openinsertarBancos();
            }
        });
        btneliminarproducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openEliminarBancos();
            }
        });
        btnmodificarproducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openModificarBancos();
            }
        });


        btnMostrarPorIDBancos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openMostrarIDBancos();
            }
        });
        btnMostrarPorIDUsuarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openMostrarIDUsuario();
            }
        });
        btnMostrarPorIDTipoProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openMostrarIDTipoProducto();
            }
        });
        btnMostrarTodosUsuarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Control_paso.conversionMostrarTodosUsuario();
            }
        });
        btnMostrarTodosTiposProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Control_paso.conversionMostrarTodosTipoProducto();
            }
        });
        btnMostrarTodosBancos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Control_paso.conversionMostrarTodosBancos();
            }
        });
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Menu Principal");
        frame.setContentPane(new MenuPrincipal().MenuPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(true);
        frame.setVisible(true);
    }



    //------------------------------------------------------------------
    void openAgregarUsuario(){
        JFrame frame = new JFrame("Agregar Usuario");
        frame.setContentPane(new AccionAgregarUsuario().MenuAgregarUsuario);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    void openEliminarUsuario(){
        JFrame frame = new JFrame("Eliminar Usuario");
        frame.setContentPane(new AccionElimarUsuario().AccionEliminarUsuario);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    void openModificarUsuario(){
        JFrame frame = new JFrame("Modificar Usuario");
        frame.setContentPane(new AccionModificarUsuario().AccionModificarUsuario);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    void openMostrarIDUsuario(){
        JFrame frame = new JFrame("Mostrar por ID Usuario");
        frame.setContentPane(new AccionMostrarIDUsuario().panelMostrarIDUsuario);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }






    //------------------------------------------------------------------
    void openAgregarTipoProducto(){
        JFrame frame = new JFrame("Agregar Tipo Producto");
        frame.setContentPane(new AccionAgregarTipoProducto().AccionAgregarTipoProducto);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    void openEliminarTipoProducto(){
        JFrame frame = new JFrame("Eliminar TipoProducto");
        frame.setContentPane(new AccionEliminarTipoProducto().AccionEliminarTipoProducto);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    void openModificarTipoProducto(){
        JFrame frame = new JFrame("Modificar TipoProducto");
        frame.setContentPane(new AccionModificarTipoProducto().AccionModificarTipoProducto);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    void openMostrarIDTipoProducto(){
        JFrame frame = new JFrame("Mostrar por ID TipoProducto");
        frame.setContentPane(new AccionMostrarIDTipoProducto().panelMostrarIDTIpoProducto);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }



    //------------------------------------------------------------------
    void openinsertarBancos(){
        JFrame frame = new JFrame("Agregar Bancos");
        frame.setContentPane(new AccionAgregarBancos().AccionAgregarBancos);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    void openEliminarBancos(){
        JFrame frame = new JFrame("Eliminar Bancos");
        frame.setContentPane(new AccionEliminarBancos().AccionEliminarBanco);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    void openModificarBancos(){
        JFrame frame = new JFrame("Modificar Bancos");
        frame.setContentPane(new AccionModificarBancos().AccionModificarBancos);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    void openMostrarIDBancos(){
        JFrame frame = new JFrame("Mostrar por ID Bancos");
        frame.setContentPane(new AccionMostrarIDBancos().panelAccionMostrarIDBancos);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }



}
