package cliente.controlador;

import Contenedor.Lista;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = "/añadir-Usuario.do")
public class AgregarUsuarioServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        String cedula = request.getParameter("txtAgregarCedulaUsuario");
        String nombre = request.getParameter("txtAgregarNombreUsuario");
        String apellido = request.getParameter("txtAgregarApellidoUsuario");
        String telefono = request.getParameter("txtAgregarTelefonoUsuario");
        String fechaNacimiento = request.getParameter("txtAgregarFechaUsuario");
        String direccion = request.getParameter("txtAgregarDireccionUsuario");
        String score = request.getParameter("txtAgregarScoreUsuario");

        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
        Date nacimiento= null;
        try {
            nacimiento = formatter1.parse(fechaNacimiento);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        Control_paso.conversionAgregarUsuario(Integer.parseInt(cedula), nombre, apellido, Integer.parseInt(telefono), nacimiento, direccion, Integer.parseInt(score));

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
        request.getRequestDispatcher("WEB-INF/views/usuarios.jsp").forward(request, response);
    }
}
