package sos.sisho.myFirstServlet.todo.service;

import sos.sisho.myFirstServlet.todo.domain.Todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class TodoService {

    private static List<Todo> todos = new ArrayList<>(
            Arrays.asList(
                    new Todo(UUID.randomUUID().toString(), "Learn more programming in Java"),
                    new Todo(UUID.randomUUID().toString(),"Understand and practice SOLID principle"),
                    new Todo(UUID.randomUUID().toString(),"Understand and practice MVC")
            )
    );

    public  List<Todo> retrievedTodos(){
        return todos;
    }

    public void addTodos(Todo todo){
        todos.add(todo);
    }

    public void deleteTodo(String uuid){
        todos = todos.stream()
               .filter(todo -> !todo.getUuid().equals(uuid))
               .collect(Collectors.toList());
    }

}
