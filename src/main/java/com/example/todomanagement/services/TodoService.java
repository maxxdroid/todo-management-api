package com.example.todomanagement.services;

import com.example.todomanagement.dto.TodoDto;

import java.util.List;

public interface TodoService {

    TodoDto addTodo(TodoDto todo);

    TodoDto getTodo(Long id);

    List<TodoDto> getAllTodos();

    TodoDto updateTodo(TodoDto todoDto, Long id);

    void deleteTodo(TodoDto todoDto, Long id);

    TodoDto completeTodo(Long id);

    TodoDto inCompleteTodoDto(Long id);
}
