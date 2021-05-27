package sos.sisho.myFirstServlet.todo.controller;

import sos.sisho.myFirstServlet.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns =  "/todo.do")
public class ListTodoServlet extends HttpServlet {

    private  final TodoService todoService = new TodoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("todos", todoService.retrievedTodos());
        request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request,response);
    }
}
