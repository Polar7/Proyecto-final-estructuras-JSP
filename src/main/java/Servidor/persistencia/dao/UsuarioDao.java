package Servidor.persistencia.dao;

import Servidor.persistencia.dto.UsuarioDto;


/**
 * @author Saul Osbaldo Aponte Lopez
 */
public class UsuarioDao extends Dao<UsuarioDto> {

    public UsuarioDao()
    {
        super();
    }
/*
    @Override
    public Lista<UsuarioDto> read()
    {
        DataSource         dataSource = DataSource.getInstance();
        UsuarioDto data       = new UsuarioDto();
        ResultSet          resultSet  = dataSource.runQuery(data.read());
        Lista<UsuarioDto> usuariosList = new Lista<>();
        try
        {
            while (resultSet.next())
            {
                usuariosList.adicionarAlFinal(getData(resultSet));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        return usuariosList;

    }

    @Override
    public UsuarioDto findById(Dto data)
    {
        DataSource dataSource = DataSource.getInstance();
        ResultSet  resultSet  = dataSource.runQuery(data.findById());
        UsuarioDto usuario     = null;
        try {
            while (resultSet.next()) {
                usuario = getData(resultSet);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return usuario;
    }

    private UsuarioDto getData(ResultSet resultSet) throws SQLException
    {
        return new UsuarioDto(resultSet.getInt("cedula"),   // resultSet.getLong(1)
                resultSet.getString("nombre"),                //resultSet.getString(2)
                resultSet.getString("apellido"),            //resultSet.getString(3)
                resultSet.getInt("telefono"),     //resultSet.getString(4)
                resultSet.getDate("fecha_nacimiento"),               //resultSet.getString(5)
                resultSet.getString("direccion"),
                resultSet.getInt("score"));              //resultSet.getString(6)
    }
    */

}
