package Servidor.persistencia.dto;

import java.io.Serializable;

public class BancosDto implements Dto, Serializable {


    private static final long       serialVersionUID = 568794L;
    private String nombre;
    private int nit;
    private String direccion;
    private int cantidadClientes;

    public BancosDto(String nombre, int nit, String direccion, int cantidadClientes) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.cantidadClientes = cantidadClientes;
    }

    public BancosDto(String nombre)
    {
        this.nombre = nombre;
    }

    public BancosDto()
    {
    }
    @Override
    public String insert() {

        String sql = "INSERT INTO public.bancos(nombre, nit, direccion, cantidad_clientes) VALUES ('"
                + nombre.trim() + "',"
                + nit+ ",'"
                + direccion.trim() + "',"
                + cantidadClientes + ")";
        System.out.println(sql);
        return sql;
    }

    @Override
    public String update()
    {
        String sql = " UPDATE public.bancos SET nombre= '" + nombre.trim() +
                "', nit = " +  nit +
                ", direccion = '" + direccion.trim() +
                "', cantidad_clientes = " + cantidadClientes +
                " WHERE nombre = '" + nombre.trim()+ "'";
        return sql;
    }

    @Override
    public String delete() {
        return "DELETE FROM bancos WHERE nombre = '" + nombre.trim()+"'";
    }

    @Override
    public String findById() {
        return "SELECT * FROM bancos WHERE nombre = '" + nombre.trim()+ "'";
    }

    @Override
    public String read()
    {
        return "SELECT * FROM bancos";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadClientes() {
        return cantidadClientes;
    }

    public void setCantidadClientes(int cantidadClientes) {
        this.cantidadClientes = cantidadClientes;
    }

    @Override
    public String toString() {
        return "BancosDto{" +
                "nombre='" + nombre + '\'' +
                ", nit=" + nit +
                ", direccion='" + direccion + '\'' +
                ", cantidadClientes=" + cantidadClientes +
                '}';
    }
}
