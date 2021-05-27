package cliente.controlador;

import Contenedor.Lista;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/eliminar-tipoProducto.do")
public class EliminarTipoProductoServlet extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        String idTipo = request.getParameter("txtEliminarTipoProducto");
        Control_paso.conversionEliminarTipoProducto(Integer.parseInt(idTipo));

        Lista<Object> objeto = Control_PantallaComprobante.darObjeto();

        if(objeto.getTamanio() == 1)
        {
            if(objeto.getValor(0) instanceof Boolean)
            {
                if((Boolean)objeto.getValor(0) == true)
                {
                    request.setAttribute("confirmacionEliminar", "Se ha ejecutado correctamente la instruccion");
                }
                else if((Boolean)objeto.getValor(0) == false)
                {
                    request.setAttribute("confirmacionEliminar", "NO se ha ejecutado correctamente la instruccion");
                }
            }
        }

        request.getRequestDispatcher("WEB-INF/views/todo.jsp").forward(request, response);

    }
}
