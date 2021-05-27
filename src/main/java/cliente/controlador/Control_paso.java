package cliente.controlador;

import Servidor.persistencia.dao.BancosDao;
import Servidor.persistencia.dao.TipoProductoDao;
import Servidor.persistencia.dao.UsuarioDao;
import Servidor.persistencia.dto.BancosDto;
import Servidor.persistencia.dto.TipoProductoDto;
import Servidor.persistencia.dto.UsuarioDto;


import java.util.Date;


public class Control_paso
{

    private static TipoProductoDto tipoProductoDto;
    private static TipoProductoDao tipoProductoDao;

    private static UsuarioDto usuarioDto;
    private static UsuarioDao usuarioDao;

    private static BancosDto bancosDto;
    private static BancosDao bancosDao;


    //------------------------------------------------------------------------------------------------------------------
    //Controladores de conexion tipo producto
    public static void conversionInsertarTipoProducto(int id, String nombre){

        tipoProductoDto = new TipoProductoDto(id, nombre);
        tipoProductoDao = new TipoProductoDao();

        String inst = tipoProductoDao.insert(tipoProductoDto);
        iniciarEnvio(inst);
    }
    public static void conversionEliminarTipoProducto(int id){
        tipoProductoDto = new TipoProductoDto(id);
        tipoProductoDao = new TipoProductoDao();

        String inst = tipoProductoDao.delete(tipoProductoDto);
        iniciarEnvio(inst);
    }
    public static void conversionModificarTipoProducto(int id, String nombre){

        tipoProductoDto = new TipoProductoDto(id, nombre);
        tipoProductoDao = new TipoProductoDao();

        String inst = tipoProductoDao.update(tipoProductoDto);
        iniciarEnvio(inst);
    }
    public static void conversionMostarPorIDTipoProducto(int id){

        tipoProductoDto = new TipoProductoDto(id);
        tipoProductoDao = new TipoProductoDao();

        String inst = tipoProductoDao.findById(tipoProductoDto);
        iniciarEnvio(inst);
    }
    public static void conversionMostrarTodosTipoProducto(){

        tipoProductoDto = new TipoProductoDto();
        tipoProductoDao = new TipoProductoDao();

        String inst = tipoProductoDao.read(tipoProductoDto);
        iniciarEnvio(inst);
    }




    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    //controladores de conexion de Usuario
    public static void conversionAgregarUsuario(int cedula, String nombre,String apellido,int telefono, Date fecha, String  direccion,int score){
        usuarioDto = new UsuarioDto(cedula,nombre,apellido,telefono,fecha,direccion,score);
        usuarioDao = new UsuarioDao();

        String inst = usuarioDao.insert(usuarioDto);
        iniciarEnvio(inst);
    }
    public static void conversioneliminarUsuario(int cedula){

        usuarioDto = new UsuarioDto(cedula);
        usuarioDao = new UsuarioDao();

        String inst = usuarioDao.delete(usuarioDto);
        iniciarEnvio(inst);
    }
    public static void conversionModificarUsuario(int cedula, String nombre,String apellido,int telefono, Date fecha, String  direccion,int score){
        usuarioDto = new UsuarioDto(cedula,nombre,apellido,telefono,fecha,direccion,score);
        usuarioDao = new UsuarioDao();

        String inst = usuarioDao.update(usuarioDto);
        iniciarEnvio(inst);
    }
    public static void conversionMostrarPorIDUsuario(int cedula){

        usuarioDto = new UsuarioDto(cedula);
        usuarioDao = new UsuarioDao();

        String inst = usuarioDao.findById(usuarioDto);
        iniciarEnvio(inst);
    }
    public static void conversionMostrarTodosUsuario(){

        usuarioDto = new UsuarioDto();
        usuarioDao = new UsuarioDao();

        String inst = usuarioDao.read(usuarioDto);
        iniciarEnvio(inst);
    }

    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    //Controles de conexion  para bancos
    public static void conversionAgregarBancos(String nombre,int nit,String  direccion,int cantidadclientes){
        bancosDto = new BancosDto(nombre,nit,direccion,cantidadclientes);
        bancosDao = new BancosDao();

        String inst = bancosDao.insert(bancosDto);
        iniciarEnvio(inst);
    }
    public static void conversioneliminarBancos(String nombre){

        bancosDto = new BancosDto(nombre);
        bancosDao = new BancosDao();

        String inst = bancosDao.delete(bancosDto);
        iniciarEnvio(inst);
    }
    public static void conversionModificarBancos(String nombre,int nit,String  direccion,int cantidadclientes){
        bancosDto = new BancosDto(nombre,nit,direccion,cantidadclientes);
        bancosDao = new BancosDao();

        String inst = bancosDao.update(bancosDto);
        iniciarEnvio(inst);
    }
    public static void conversionMostrarPorIDBancos(String nombre){

        bancosDto = new BancosDto(nombre);
        bancosDao = new BancosDao();

        String inst = bancosDao.findById(bancosDto);
        iniciarEnvio(inst);
    }
    public static void conversionMostrarTodosBancos(){

        bancosDto = new BancosDto();
        bancosDao = new BancosDao();

        String inst = bancosDao.read(bancosDto);
        iniciarEnvio(inst);
    }



    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    /**
     * Abre el camino para el envio de la informacion
     * @param inst COdigo sql
     */
    static void iniciarEnvio(String inst)
    {
        Control_conexion.manejarConexion(inst);
        Control_conexion.iniciarconexion();
    }

}


