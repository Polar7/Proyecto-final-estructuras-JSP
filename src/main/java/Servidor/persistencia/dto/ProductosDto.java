package Servidor.persistencia.dto;

import java.io.Serializable;

public class ProductosDto implements Dto, Serializable {

    private static final long       serialVersionUID = 654988L;
    private int numero_Referencia;
    private int cupos_disponibles;
    private int tasaMV;
    private int cuotaDeManejo;
    private int seguro;
    private int plazoMeses;
    private int Tipos_Productosid;

    public ProductosDto(int numero_Referencia, int cupos_disponibles, int tasaMV, int cuotaDeManejo, int seguro, int plazoMeses, int tipos_Productosid) {
        this.numero_Referencia = numero_Referencia;
        this.cupos_disponibles = cupos_disponibles;
        this.tasaMV = tasaMV;
        this.cuotaDeManejo = cuotaDeManejo;
        this.seguro = seguro;
        this.plazoMeses = plazoMeses;
        Tipos_Productosid = tipos_Productosid;
    }

    public ProductosDto(int numero_Referencia)
    {
        this.numero_Referencia = numero_Referencia;
    }

    public ProductosDto()
    {
    }

    @Override
    public String insert() {

        String sql = "INSERT INTO public.productos(numero_referencia, cupo_disponible, tasa_mv, cuota_de_manejo, seguro, plazo_meses, tipos_productos) VALUES ("
                + numero_Referencia +", '"
                + cupos_disponibles + "','"
                + tasaMV + "','"
                + cuotaDeManejo + "','"
                + seguro + "','"
                + plazoMeses + "','"
                + Tipos_Productosid + "','"
                + "');";
        System.out.println(sql);
        return sql;
    }

    @Override
    public String update()
    {
        String sql = " UPDATE public.productos SET " +
                "numero_referencia= '" + numero_Referencia +
                "', cupos_disponibles = '" +  cupos_disponibles +
                "', tasa_mv = " + tasaMV +
                "', cuota_de_manejo = '" + cuotaDeManejo +
                "', seguro = '" + seguro +
                "', plazo_meses = " + plazoMeses +
                "', tipos_productos = '" + Tipos_Productosid +
                "WHERE numero_referencia = " + numero_Referencia;
        return sql;
    }

    @Override
    public String delete() {
        return "DELETE FROM productos WHERE numero_referencia = " + numero_Referencia;
    }

    @Override
    public String findById() {
        return "SELECT * FROM productos WHERE numero_referencia = " + numero_Referencia;
    }

    @Override
    public String read()
    {
        return "SELECT * FROM productos";
    }

    public int getNumero_Referencia() {
        return numero_Referencia;
    }

    public void setNumero_Referencia(int numero_Referencia) {
        this.numero_Referencia = numero_Referencia;
    }

    public int getCupos_disponibles() {
        return cupos_disponibles;
    }

    public void setCupos_disponibles(int cupos_disponibles) {
        this.cupos_disponibles = cupos_disponibles;
    }

    public int getTasaMV() {
        return tasaMV;
    }

    public void setTasaMV(int tasaMV) {
        this.tasaMV = tasaMV;
    }

    public int getCuotaDeManejo() {
        return cuotaDeManejo;
    }

    public void setCuotaDeManejo(int cuotaDeManejo) {
        this.cuotaDeManejo = cuotaDeManejo;
    }

    public int getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public int getTipos_Productosid() {
        return Tipos_Productosid;
    }

    public void setTipos_Productosid(int tipos_Productosid) {
        Tipos_Productosid = tipos_Productosid;
    }

    @Override
    public String toString() {
        return "ProductosDto{" +
                "numero_Referencia=" + numero_Referencia +
                ", cupos_disponibles=" + cupos_disponibles +
                ", tasaMV=" + tasaMV +
                ", cuotaDeManejo=" + cuotaDeManejo +
                ", plazoMeses=" + plazoMeses +
                ", Tipos_Productosid=" + Tipos_Productosid +
                '}';
    }
}
