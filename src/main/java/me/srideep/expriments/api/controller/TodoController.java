package me.srideep.expriments.api.controller;

import me.srideep.expriments.api.model.Todo;
import me.srideep.expriments.api.model.TodoRepository;
import me.srideep.expriments.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path = "/api")
public class TodoController {
    private final TodoService todoService;
    private final TodoRepository todoRepository;

    @Autowired
    TodoController(TodoService todoService, TodoRepository todoRepository) {
        this.todoService = todoService;
        this.todoRepository = todoRepository;
    }

    @GetMapping("/todo")
    public Todo getTodo(@RequestParam Integer id) {
        return todoRepository
                .findById(id)
                .orElseThrow(()-> new NoSuchElementException("No Todo with id: " + id));
    }

    @GetMapping("/todo/all")
    public List<Todo> getAllTodos() {
        List<Todo> todos = new ArrayList<>();
        todoRepository.findAll().forEach(todos::add);
        return todos;
    }

    @PostMapping("/todo")
    public Todo addTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @PutMapping("/todo/check")
    public Todo toggleCheck(@RequestParam Integer id) {
        Todo todo = todoRepository
                .findById(id)
                .orElseThrow(()-> new NoSuchElementException("No Todo with id: " + id));
        todo.setChecked(!todo.getChecked());
        todoRepository.save(todo);
        return todo;
    }

    @DeleteMapping("/todo")
    public Todo deleteTodo(@RequestParam Integer id) {
        Todo todo = todoRepository
                .findById(id)
                .orElseThrow(()-> new NoSuchElementException("No Todo with id: " + id));
        todoRepository.deleteById(id);
        return todo;
    }
}
