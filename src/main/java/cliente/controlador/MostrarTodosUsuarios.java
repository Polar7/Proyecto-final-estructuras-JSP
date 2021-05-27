package cliente.controlador;

import Contenedor.Lista;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/mostrarTodos-usuarios.do")
public class MostrarTodosUsuarios extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {


        Control_paso.conversionMostrarTodosTipoProducto();

        Lista<Object> objeto = Control_PantallaComprobante.darObjeto();

        if(objeto.getTamanio() == 1)
        {
            if(objeto.getValor(0) instanceof Boolean)
            {
            }
            else
            {
                request.setAttribute("confirmacionMostrarTodos", objeto.getValor(0).toString());


            }
        }
        else
        {
            request.setAttribute("confirmacionMostrarTodos", objeto);
            /*for (int i = 0; i < objeto.getTamanio(); i++ )
            {
                request.setAttribute("datoActual", objeto.getValor(i).toString() );
            }*/

        }

        request.getRequestDispatcher("WEB-INF/views/usuarios.jsp").forward(request, response);
    }
}
