package com.zmesza.toread.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

  @Id
  @GeneratedValue
  private int id;
  private String title;
  private boolean finished;
  private boolean important;

  public Book() {}

  public Book(int id, String title) {
    this.title = title;
    this.finished = false;
    this.important = false;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isFinished() {
    return finished;
  }

  public void setFinished(boolean finished) {
    this.finished = finished;
  }

  public boolean isImportant() {
    return important;
  }

  public void setImportant(boolean important) {
    this.important = important;
  }
}
