package Servidor.persistencia.reguladores;


import Contenedor.Lista;


public class Controladorordenesejecucion
{

    /**
     * Devuelve una lista con el objeto booleano
     * @param sql
     * @param dataSource
     * @return
     */
    public static Lista<Object> resultExecuteUpdate(String sql, DataSource dataSource)
    {
        Lista<Object> toListResult =new Lista<>();
        toListResult.agregarAlFinal(dataSource.runExecuteUpdate(sql));
        return toListResult;
    }
}
