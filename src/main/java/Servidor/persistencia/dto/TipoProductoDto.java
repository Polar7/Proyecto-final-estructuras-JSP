package Servidor.persistencia.dto;

import java.io.Serializable;

public class TipoProductoDto implements Dto, Serializable
{

    private static final long       serialVersionUID = 654965498L;
    private int id;
    private String nombre;

    public TipoProductoDto(int id, String nombre)
    {
        this.id = id;
        this.nombre = nombre;
    }

    public TipoProductoDto(int id)
    {
        this.id = id;
    }

    public TipoProductoDto()
    {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String insert() {
        String sql = "INSERT INTO public.tipos_productos(id, nombre) VALUES ("
                + id +", '"
                + nombre.trim()
                + "');";
        System.out.println(sql);
        return sql;
    }

    @Override
    public String read()
    {
        return "SELECT * FROM tipos_productos";
    }

    @Override
    public String update()
    {
        String sql = "UPDATE public.tipos_productos SET nombre= '" + nombre.trim() + "' WHERE id = " + id ;

        return sql;
    }

    @Override
    public String delete()
    {
        return "delete from tipos_productos WHERE id = " + id;
    }

    @Override
    public String findById() {
        return "SELECT * FROM tipos_productos WHERE id = " + id;
    }

    @Override
    public String toString() {
        return "TipoProductoDto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
