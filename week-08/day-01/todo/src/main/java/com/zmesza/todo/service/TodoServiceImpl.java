package com.zmesza.todo.service;

import com.zmesza.todo.model.Todo;
import com.zmesza.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService{

  TodoRepository repository;

  @Autowired
  public TodoServiceImpl(TodoRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Todo> getActiveTodo() {
    List<Todo> originalTaskList = new ArrayList<>();
    this.repository.findAll().forEach(originalTaskList :: add);
    List<Todo> filteredTaskList = originalTaskList.stream()
        .filter(Todo -> !Todo.isDone())
        .collect(Collectors.toList());
    return filteredTaskList;
  }

  @Override
  public List<Todo> getAllTodo() {
    List<Todo> taskList = new ArrayList<>();
    this.repository.findAll().forEach(taskList :: add);
    return taskList;
  }

  @Override
  public void saveNewTodo(Todo todo) {
    this.repository.save(todo);
  }

  @Override
  public void deleteTodoById(long id) {
    this.repository.deleteById(id);
  }

  @Override
  public Todo getTodoById(long id) {
    return this.repository.findById(id).orElse(null);
  }
}
