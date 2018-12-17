package com.zmesza.todo.service;

import com.zmesza.todo.repository.Todo;
import com.zmesza.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  TodoRepository repository;

  @Autowired
  public TodoService(TodoRepository repository) {
    this.repository = repository;
  }

  public void addTodo(Todo todo) {
    if (todo != null) {
      this.repository.save(todo);
    }
  }
}
