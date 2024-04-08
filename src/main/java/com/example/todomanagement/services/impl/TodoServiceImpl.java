package com.example.todomanagement.services.impl;

import com.example.todomanagement.dto.TodoDto;
import com.example.todomanagement.entity.Todo;
import com.example.todomanagement.repository.TodoRepository;
import com.example.todomanagement.services.TodoService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    private ModelMapper modelMapper;
    @Override
    public TodoDto addTodo(TodoDto todoDto) {

        //convert TodoDto into jpa entity todo
        Todo todo = modelMapper.map(todoDto, Todo.class);

        //Todo jpa entity
        Todo savedTodo = todoRepository.save(todo);

        //convert saved Todo Jpa entity object into todo Object

        TodoDto savedTodoDto =  modelMapper.map(savedTodo, TodoDto.class);

        return savedTodoDto;
    }

    @Override
    public TodoDto getTodo(Long id) {
        Todo todo = todoRepository.findById(id).get();
        return modelMapper.map(todo, TodoDto.class);
    }
}
