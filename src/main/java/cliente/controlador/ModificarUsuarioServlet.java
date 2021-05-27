package cliente.controlador;

import Contenedor.Lista;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(urlPatterns = "/modificar-usuario.do")
public class ModificarUsuarioServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        String cedula = request.getParameter("txtModificarCedulaUsuario");
        String nombre = request.getParameter("txtModificarNombreUsuario");
        String apellido = request.getParameter("txtModificarApellidoUsuario");
        String telefono = request.getParameter("txtModificarTelefonoUsuario");
        String fechaNacimiento = request.getParameter("txtModificarFechaUsuario");
        String direccion = request.getParameter("txtModificarDireccionUsuario");
        String score = request.getParameter("txtModificarScoreUsuario");

        Control_paso.conversionModificarUsuario(Integer.parseInt(cedula), nombre, apellido, Integer.parseInt(telefono), Date.valueOf(fechaNacimiento), direccion, Integer.parseInt(score));

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
