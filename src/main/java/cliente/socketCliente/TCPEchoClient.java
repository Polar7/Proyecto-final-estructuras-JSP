package cliente.socketCliente;


import Contenedor.Lista;
import cliente.controlador.Control_PantallaComprobante;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPEchoClient {

    private InetAddress host;
    private static final int PORT = 1234;
    private String scriptSQL;


    /**
     * Inicializa un host
     */
    public TCPEchoClient() {

        System.out.println("Empezando El Host");
        try
        {
            host = InetAddress.getLocalHost();
        } catch (UnknownHostException e)
        {
            System.out.println("Host not found!");
            System.exit(1);
        }

    }

    /**
     * Cambia la instruccion sql
     * @param pInst Instruccion sql nueva
     */
    public void setScriptSQL(String pInst)
    {
        this.scriptSQL = pInst;
    }

    /**
     * Envia el SQL y recibe un objeto resultado de la operacion con el socket del server
     */
    public void enviar() {

        Socket sock = null;

        try {
            sock = new Socket(host, PORT);

            InputStream inputStream = sock.getInputStream();
            ObjectInputStream in = new ObjectInputStream(inputStream);

            PrintWriter out = new PrintWriter(sock.getOutputStream(),true);
            //muestro en consola el script
            out.println(scriptSQL);

            //recibe el objeto mandado por el socket del server
            Lista<Object> objectLista  = (Lista<Object>) in.readObject();

            //se lo envia al controlador para graficar el resultado
            Control_PantallaComprobante.recibirParaMostrarConfirmacion(objectLista);


        }
        catch (IOException | ClassNotFoundException error){
            error.printStackTrace();
            System.out.println(error);
        }
        finally {
            try{
                sock.close();
            }catch (IOException error){
                error.printStackTrace();
            }
        }


    }
}
