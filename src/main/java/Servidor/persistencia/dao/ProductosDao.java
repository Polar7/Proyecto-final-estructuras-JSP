package Servidor.persistencia.dao;


import Servidor.persistencia.dto.ProductosDto;


public class ProductosDao extends Dao<ProductosDto> {

    public ProductosDao()
    {
        super();
    }
/*
    @Override
    public Lista<ProductosDto> read()
    {
        DataSource         dataSource = DataSource.getInstance();
        ProductosDto data       = new ProductosDto();
        ResultSet resultSet  = dataSource.runQuery(data.read());
        Lista<ProductosDto> ProductosList = new Lista<>();
        try
        {
            while (resultSet.next())
            {
                ProductosList.adicionarAlFinal(getData(resultSet));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        return ProductosList;

    }

    @Override
    public ProductosDto findById(Dto data)
    {
        DataSource dataSource = DataSource.getInstance();
        ResultSet  resultSet  = dataSource.runQuery(data.findById());
        ProductosDto usuario     = null;
        try {
            while (resultSet.next()) {
                usuario = getData(resultSet);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return usuario;
    }

    private ProductosDto getData(ResultSet resultSet) throws SQLException
    {
        return new ProductosDto(resultSet.getInt("numero_referencia"),   // resultSet.getLong(1)
                resultSet.getInt("cupos_disponibles"),                //resultSet.getString(2)
                resultSet.getInt("tasa_mv"),            //resultSet.getString(3)
                resultSet.getInt("cuota_de_manejo"),     //resultSet.getString(4)
                resultSet.getInt("seguro"),               //resultSet.getString(5)
                resultSet.getInt("plazo_meses"),
                resultSet.getInt("tipos_productos"));              //resultSet.getString(6)
    }
    */

}
