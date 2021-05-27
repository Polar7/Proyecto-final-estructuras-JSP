package cliente.controlador;

import cliente.socketCliente.TCPEchoClient;

public class Control_conexion
{

    private static TCPEchoClient conexion;
    private static Control_conexion paso = null;

    /**
     * Inicializa el socket del cliente
     * @param inst Codigo sql
     */
    private Control_conexion (String inst)
    {
        conexion = new TCPEchoClient();
        conexion.setScriptSQL(inst);
    }

    /**
     * Crea un controlador (incluido el socket), si ya está creado, retorna el ya creado
     * @param inst Codigo sql
     * @return Retorna el controlador
     */
    public static Control_conexion manejarConexion(String inst)
    {
        if (paso != null)
        {
            conexion.setScriptSQL(inst);
            return paso;
        }
        else
        {
            return new Control_conexion(inst);
        }
    }

    /**
     * Envia la informacion a traves del socket
     */
    public static  void iniciarconexion()
    {
        conexion.enviar();
    }
}
