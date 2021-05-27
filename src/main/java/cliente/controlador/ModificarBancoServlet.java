package cliente.controlador;

import Contenedor.Lista;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/modificar-banco.do")
public class ModificarBancoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nombre = request.getParameter("txtModificarNombreBanco");
        String nit = request.getParameter("txtModificarNITBancos");
        String direccion = request.getParameter("txtModificarDireccion");
        String nclientes = request.getParameter("txtModificarNClientesBanco");


        Control_paso.conversionModificarBancos(nombre,Integer.parseInt(nit),direccion,Integer.parseInt(nclientes));

        Lista<Object> objeto = Control_PantallaComprobante.darObjeto();

        if(objeto.getTamanio() == 1)
        {
            if(objeto.getValor(0) instanceof Boolean)
            {
                if((Boolean)objeto.getValor(0) == true)
                {
                    request.setAttribute("confirmacionModificarbancos", "Se ha ejecutado correctamente la instruccion");
                }
                else if((Boolean)objeto.getValor(0) == false)
                {
                    request.setAttribute("confirmacionModificarbancos", "NO se ha ejecutado correctamente la instruccion");
                }
            }
        }
        request.getRequestDispatcher("WEB-INF/views/bancos.jsp").forward(request, response);
    }
}
