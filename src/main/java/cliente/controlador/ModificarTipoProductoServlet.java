package cliente.controlador;

import Contenedor.Lista;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/modificar-tipoProducto.do")
public class ModificarTipoProductoServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String idTipo = request.getParameter("txtModificarIdTipoProducto");
        String nombreTipo = request.getParameter("txtModificarNombreTipoProducto");

        Control_paso.conversionModificarTipoProducto(Integer.parseInt(idTipo), nombreTipo);

        Lista<Object> objeto = Control_PantallaComprobante.darObjeto();

        if(objeto.getTamanio() == 1)
        {
            if(objeto.getValor(0) instanceof Boolean)
            {
                if((Boolean)objeto.getValor(0) == true)
                {
                    request.setAttribute("confirmacionModificar", "Se ha ejecutado correctamente la instruccion");
                }
                else if((Boolean)objeto.getValor(0) == false)
                {
                    request.setAttribute("confirmacionModificar", "NO se ha ejecutado correctamente la instruccion");
                }
            }
        }

        request.getRequestDispatcher("WEB-INF/views/tipoProducto.jsp").forward(request, response);
    }
}
