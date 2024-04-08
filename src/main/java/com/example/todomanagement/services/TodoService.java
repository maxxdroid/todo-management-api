package com.example.todomanagement.services;

import com.example.todomanagement.dto.TodoDto;

public interface TodoService {

    TodoDto addTodo(TodoDto todo);

    TodoDto getTodo(Long id);
}
