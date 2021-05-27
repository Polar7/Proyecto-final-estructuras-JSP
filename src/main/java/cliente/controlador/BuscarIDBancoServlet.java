package cliente.controlador;

import Contenedor.Lista;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/buscarPorID-banco.do")
public class BuscarIDBancoServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String idTipo = request.getParameter("txtIdNombreBanco");

        Control_paso.conversionMostrarPorIDBancos(idTipo);

        Lista<Object> objeto = Control_PantallaComprobante.darObjeto();

        if(objeto.getTamanio() == 1)
        {
            if(objeto.getValor(0) instanceof Boolean)
            {
            }
            else
            {
                request.setAttribute("confirmacionBuscarPorIDbanco", objeto.getValor(0).toString());
            }
        }
        request.getRequestDispatcher("WEB-INF/views/bancos.jsp").forward(request, response);
    }
}
