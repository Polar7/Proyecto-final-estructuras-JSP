package Servidor.persistencia.dao;

import Servidor.persistencia.dto.BancosDto;


public class BancosDao extends Dao<BancosDto>
{
    public BancosDao()
    {
        super();
    }
/*
    @Override
    public Lista<BancosDto> read()
    {
        DataSource dataSource = DataSource.getInstance();
        UsuarioDto data       = new UsuarioDto();
        ResultSet resultSet  = dataSource.runQuery(data.read());
        Lista<BancosDto> bancosList = new Lista<>();
        try
        {
            while (resultSet.next())
            {
                bancosList.adicionarAlFinal(getData(resultSet));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        return bancosList;

    }

    @Override
    public BancosDto findById(Dto data)
    {
        DataSource dataSource = DataSource.getInstance();
        ResultSet  resultSet  = dataSource.runQuery(data.findById());
        BancosDto usuario     = null;
        try {
            while (resultSet.next()) {
                usuario = getData(resultSet);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return usuario;
    }

    private BancosDto getData(ResultSet resultSet) throws SQLException
    {
        return new BancosDto(resultSet.getString("nombre"),   // resultSet.getLong(1)
                resultSet.getInt("nit"),                //resultSet.getString(2)
                resultSet.getString("direccion"),            //resultSet.getString(3)
                resultSet.getInt("cantidad_clientes")    //resultSet.getString(4)
               );              //resultSet.getString(6)
    }
*/
}
