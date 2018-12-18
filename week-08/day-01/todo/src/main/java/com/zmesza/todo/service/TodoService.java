package com.zmesza.todo.service;

import com.zmesza.todo.model.Todo;
import java.util.List;

public interface TodoService {

  List<Todo> getActiveTodo();
  List<Todo> getAllTodo();
  void saveNewTodo(Todo todo);
  void deleteTodoById(long id);
  Todo getTodoById(long id);
}
