
package Servidor.persistencia.dao;

import Servidor.persistencia.dto.Dto;


public abstract class Dao<T extends Dto>
{

    protected void Dto(){}

    public String insert(Dto data)
    {
        return data.insert();
    }

    public String read(Dto data)
    {
        return data.read();
    }

    public String update(Dto data)
    {
        return data.update();
    }

    public String delete(Dto data)
    {
        return data.delete();
    }

    public String findById(Dto data)
    {
        return data.findById();
    }

}
