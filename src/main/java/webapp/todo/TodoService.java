package webapp.todo;

import java.util.List;

import java.util.ArrayList;

public class TodoService {
    public static List<Todo> todos = new ArrayList<Todo>();

    static{
        todos.add(new Todo("Secure code review"));
        todos.add(new Todo("xss to RCE"));
        todos.add(new Todo("Java, PHP, .NET deserialization"));
        todos.add(new Todo("MVC pattern"));

    }

    public List<Todo> retrieveTodos(){
        return todos;
    }

    public void addTdo(Todo todo){
           todos.add(todo);
    }

    public void deleteTodo(Todo todo){
        todos.remove(todo);
    }


}
