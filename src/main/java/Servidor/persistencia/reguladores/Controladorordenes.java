package Servidor.persistencia.reguladores;


import Contenedor.Lista;
import Servidor.persistencia.dto.BancosDto;
import Servidor.persistencia.dto.Dto;
import Servidor.persistencia.dto.TipoProductoDto;
import Servidor.persistencia.dto.UsuarioDto;


import java.sql.ResultSet;

public  class Controladorordenes
{

    /**
     *
     * @param sql
     * @param dataSource
     * @return
     */
    public static Lista<? extends Dto> objMultipleResult(String sql, DataSource dataSource )
    {
        ResultSet resultSet;
        Lista<? extends Dto> obj =  new Lista<>();
        resultSet = dataSource.runQuery(sql);
        obj = resultMultipleRaw(sql, resultSet);
        return obj;
    }

    /**
     *
     * @param sql
     * @param dataSource
     * @return
     */
    public static Dto objSimpleResult(String sql, DataSource dataSource )
    {
        ResultSet resultSet;
        resultSet = dataSource.runQuery(sql);
        Dto obj;
        obj = resultSimpleRaw(sql, resultSet);
        return obj;
    }

    /**
     *
     * @param sql
     * @param resultSet
     * @return
     */
    private static Lista<? extends Dto> resultMultipleRaw(String sql, ResultSet resultSet)
    {
        Lista<? extends Dto> raws = null;

        if(sql.contains("bancos"))
        {
            Entity<BancosDto> entity = new Entity<BancosDto>(BancosDto.class);
            raws = entity.getMultipleRows(resultSet);
        }else
        if(sql.contains("tipos_productos"))
        {
            Entity<TipoProductoDto> entity = new Entity<TipoProductoDto>(TipoProductoDto.class);
            raws = entity.getMultipleRows(resultSet);
        }
        else if(sql.contains("usuarios"))
        {
            Entity<UsuarioDto> entity = new Entity<UsuarioDto>(UsuarioDto.class);
            raws = entity.getMultipleRows(resultSet);
        }

        return raws;
    }

    /**
     *
     * @param sql
     * @param resultSet
     * @return
     */
    private static Dto resultSimpleRaw(String sql, ResultSet resultSet)
    {
        Dto raw = null;

        if(sql.contains("bancos"))
        {
            Entity<BancosDto> entity = new Entity<BancosDto>(BancosDto.class);
            raw =  entity.getSingleRow(resultSet);
        }
        else if(sql.contains("tipos_productos"))
        {
            Entity<TipoProductoDto> entity = new Entity<TipoProductoDto>(TipoProductoDto.class);
            raw = entity.getSingleRow(resultSet);
        }
        else if(sql.contains("usuarios"))
        {
            Entity<UsuarioDto> entity = new Entity<UsuarioDto>(UsuarioDto.class);
            raw = entity.getSingleRow(resultSet);
        }
        return raw;
    }




}
