package cliente.controlador;

import Contenedor.Lista;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/añadir-banco.do")
public class AgregarBancoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("txtAgregarNombreBanco");
        String nit = request.getParameter("txtAgregarNITBancos");
        String direccion = request.getParameter("txtAgregarDireccion");
        String nClientes = request.getParameter("txtAgregarNClientesBanco");

        Control_paso.conversionAgregarBancos(nombre,Integer.parseInt(nit),direccion,Integer.parseInt(nClientes));

        Lista<Object> objeto = Control_PantallaComprobante.darObjeto();

        if(objeto.getTamanio() == 1)
        {
            if(objeto.getValor(0) instanceof Boolean)
            {
                if((Boolean)objeto.getValor(0) == true)
                {
                    request.setAttribute("confirmacionAgregarbancos", "Se ha ejecutado correctamente la instruccion");
                }
                else if((Boolean)objeto.getValor(0) == false)
                {
                    request.setAttribute("confirmacionAgregarbancos", "NO se ha ejecutado correctamente la instruccion");
                }
            }
        }
        request.getRequestDispatcher("WEB-INF/views/bancos.jsp").forward(request, response);
    }
}
