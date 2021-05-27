package Servidor.socketServer;

import Servidor.persistencia.reguladores.Controladorordenes;
import Servidor.persistencia.reguladores.Controladorordenesejecucion;
import Servidor.persistencia.reguladores.DataSource;


import java.io.*;
import java.net.Socket;

public class SingleTCPEchoServer extends Thread {

    //Socket dirigido a un hilo
    public static final int PORT = 1234;
    private Socket socket = null;
    private DataSource dataSource = null;
    private BufferedReader in;
    private ObjectOutputStream out;


    /**
     * Crea un hilo conectado al multihilos
     * @param sock
     * @param datasource
     */
    public SingleTCPEchoServer(Socket sock, DataSource datasource) {

        this.socket = sock;
        this.dataSource = datasource;

        try
        {

            this.in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));

            OutputStream outputStream = sock.getOutputStream();
            out = new ObjectOutputStream(outputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
        this.start();

    }


    /**
     * Recibe la instruccion sql y devuelve el objeto resultado de la operacion
     */
    @Override
    public void run() {

        String scriptSQL = null;

        try
        {
            scriptSQL = this.in.readLine();

            if (!scriptSQL.equals("EXIT"))
            {

                if (scriptSQL.contains("SELECT") && scriptSQL.indexOf("SELECT") == 0 &&
                        scriptSQL.contains("*") && scriptSQL.indexOf("*") <= 7)
                {
                    out.writeObject(Controladorordenes.objMultipleResult(scriptSQL, dataSource));
                } else if (scriptSQL.contains("SELECT") && scriptSQL.indexOf("SELECT") == 0)
                {
                    out.writeObject(Controladorordenes.objSimpleResult(scriptSQL, dataSource));
                } else
                {
                    out.writeObject(Controladorordenesejecucion.resultExecuteUpdate(scriptSQL, dataSource));
                }

            }
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                this.socket.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}


