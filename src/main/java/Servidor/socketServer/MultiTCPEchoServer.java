package Servidor.socketServer;

import Servidor.persistencia.reguladores.DataSource;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiTCPEchoServer {

    //servidor principal que asigna un hilo
    public static final int PORT = 1234;
    private ServerSocket serverSocket;
    private Socket sock = null;
    DataSource dataSource;

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        new MultiTCPEchoServer();
    }

    /**
     * Crea el multihilos
     */
    public MultiTCPEchoServer()
    {

        dataSource = DataSource.getInstance();
        System.out.println("Opening Port...");

        try
        {
            serverSocket = new ServerSocket(PORT);
        } catch (IOException e) {
            System.out.println("Port Error!!!");
            System.exit(1);
        }

        try
        {
            do
            {
                sock = serverSocket.accept();
                new SingleTCPEchoServer(sock,dataSource);

            }
            while (true) ;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
