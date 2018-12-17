package com.zmesza.todo;

import com.zmesza.todo.repository.Todo;
import com.zmesza.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

  @Autowired
  TodoRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }
}

