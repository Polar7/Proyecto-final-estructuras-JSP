package cliente.controlador;

import Contenedor.Lista;
import sos.sisho.myFirstServlet.todo.domain.Todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@WebServlet(urlPatterns = "/añadir-tipoProducto.do")
public class AgregarTipoProductoServlet extends HttpServlet
{


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idTipo = request.getParameter("txtAgregarIdTipoProducto");
        String nombreTipo = request.getParameter("txtAgregarNombreTipoProducto");

        Control_paso.conversionInsertarTipoProducto(Integer.parseInt(idTipo), nombreTipo);

        Lista<Object> objeto = Control_PantallaComprobante.darObjeto();

        if(objeto.getTamanio() == 1)
        {
            if(objeto.getValor(0) instanceof Boolean)
            {
                if((Boolean)objeto.getValor(0) == true)
                {
                    request.setAttribute("confirmacionAgregar", "Se ha ejecutado correctamente la instruccion");
                }
                else if((Boolean)objeto.getValor(0) == false)
                {
                    request.setAttribute("confirmacionAgregar", "NO se ha ejecutado correctamente la instruccion");
                }
            }
        }



        request.getRequestDispatcher("WEB-INF/views/tipoProducto.jsp").forward(request, response);


    }


}
