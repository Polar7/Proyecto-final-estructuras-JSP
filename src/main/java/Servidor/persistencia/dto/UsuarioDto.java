package Servidor.persistencia.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Saul Osbaldo Aponte Lopez
 *
 */
public class UsuarioDto implements Dto, Serializable {

    private static final long       serialVersionUID = 916479397570182364L;
    private int cedula;
    private String nombre;
    private String apellido;
    private int telefono;
    private Date fechaNacimiento;
    private String direccion;
    private int score;


    public UsuarioDto(int cedula, String nombre, String apellido, int telefono, Date fechaNacimiento, String direccion, int score)
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.score = score;
    }

    public UsuarioDto(int cedula)
    {
        this.cedula = cedula;
    }

    public UsuarioDto()
    {
    }

    @Override
    public String insert() {

        String sql = "INSERT INTO public.usuarios(cedula, nombre, apellido, telefono, fecha_nacimiento, direccion, score) VALUES ("
                + cedula +", '"
                + nombre.trim() + "','"
                + apellido.trim() + "','"
                + telefono + "','"
                + fechaNacimiento + "','"
                + direccion.trim() + "','"
                + score
                + "');";
        System.out.println(sql);
        return sql;
    }

    @Override
    public String update()
    {
        String sql = " UPDATE public.usuarios SET nombre= '" + nombre.trim() +
            "', apellido = '" +  apellido.trim() +
            "', telefono = '" + telefono +
            "', fecha_nacimiento = '" + fechaNacimiento +
            "', direccion = '" + direccion +
            "', score = " + score +
            " WHERE cedula = " + cedula;
        return sql;
    }

    @Override
    public String delete() {
        return "DELETE FROM usuarios WHERE cedula = " + cedula;
    }

    @Override
    public String findById() {
        return "SELECT * FROM usuarios WHERE cedula = " + cedula;
    }

    @Override
    public String read()
    {
        return "SELECT * FROM usuarios";
    }

    public static long getSerialVersionUID()
    {
        return serialVersionUID;
    }

    public int getCedula()
    {
        return cedula;
    }

    public void setCedula(int cedula)
    {
        this.cedula = cedula;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public int getTelefono()
    {
        return telefono;
    }

    public void setTelefono(int telefono)
    {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    @Override
    public String toString() {
        return "UsuarioDto{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion='" + direccion + '\'' +
                ", score=" + score +
                '}';
    }
}
