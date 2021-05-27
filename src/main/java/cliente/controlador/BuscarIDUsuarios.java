package cliente.controlador;

import Contenedor.Lista;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BuscarIDUsuarios extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String cedula = request.getParameter("txtBuscarPorIDCedula");


        Control_paso.conversionMostrarPorIDUsuario(Integer.parseInt(cedula));

        Lista<Object> objeto = Control_PantallaComprobante.darObjeto();

        if(objeto.getTamanio() == 1)
        {
            if(objeto.getValor(0) instanceof Boolean)
            {
            }
            else
            {
                request.setAttribute("confirmacionBuscarPorID", objeto.getValor(0).toString());
            }
        }
        request.getRequestDispatcher("WEB-INF/views/tipoProducto.jsp").forward(request, response);
    }
}
