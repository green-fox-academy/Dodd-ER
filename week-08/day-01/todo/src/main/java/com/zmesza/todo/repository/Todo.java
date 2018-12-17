package com.zmesza.todo.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public Todo(long id, String title) {
    this.id = id;
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public boolean isDone() {
    return isDone;
  }
}
