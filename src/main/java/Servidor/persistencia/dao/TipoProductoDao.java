package Servidor.persistencia.dao;

import Servidor.persistencia.dto.TipoProductoDto;


public class TipoProductoDao extends Dao<TipoProductoDto>{

    public TipoProductoDao()
    {
        super();
    }
/*
    @Override
    public Lista<TipoProductoDto> read()
    {
        DataSource         dataSource = DataSource.getInstance();
        TipoProductoDto data       = new TipoProductoDto();
        ResultSet resultSet  = dataSource.runQuery(data.read());
        Lista<TipoProductoDto> tipoProductoList = new Lista<>();
        try
        {
            while (resultSet.next())
            {
                tipoProductoList.adicionarAlFinal(getData(resultSet));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        return tipoProductoList;

    }

    @Override
    public TipoProductoDto findById(Dto data)
    {
        DataSource dataSource = DataSource.getInstance();
        ResultSet  resultSet  = dataSource.runQuery(data.findById());
        TipoProductoDto tipoproducto     = null;
        try {
            while (resultSet.next()) {
                tipoproducto = getData(resultSet);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return tipoproducto;
    }

    private TipoProductoDto getData(ResultSet resultSet) throws SQLException
    {
        return new TipoProductoDto(resultSet.getInt("id"),   // resultSet.getLong(1)
                resultSet.getString("nombre"));              //resultSet.getString(6)
    }
    */
}

