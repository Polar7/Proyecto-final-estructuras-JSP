package sos.sisho.myFirstServlet.todo.controller;

import sos.sisho.myFirstServlet.todo.domain.Todo;
import sos.sisho.myFirstServlet.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;


@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet {

    private static TodoService todoService = new TodoService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newTodo = request.getParameter("newTodo");
        todoService.addTodos(new Todo(UUID.randomUUID().toString(), newTodo));
        request.setAttribute("todos", todoService.retrievedTodos());
        response.sendRedirect("todo.do");
    }
}
