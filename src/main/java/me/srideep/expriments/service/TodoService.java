package me.srideep.expriments.service;

import me.srideep.expriments.api.model.Todo;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Optional;

@Service
public class TodoService {

    LinkedHashMap<Integer, Todo> todoMap;

    public TodoService() {
        todoMap = new LinkedHashMap<>();
        todoMap.put(0, new Todo(0,"Random title", true));
        todoMap.put(1, new Todo(1,"Random title2", false));
    }

    public Optional<Todo> getTodo(Integer id) {
        Todo todo = todoMap.get(id);
        if (todo != null) return Optional.of(todo);
        else return Optional.empty();
    }
}
