package com.zmesza.todo_jwt.task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {

  @Id
  @GeneratedValue
  private long id;
  private String title;
}
