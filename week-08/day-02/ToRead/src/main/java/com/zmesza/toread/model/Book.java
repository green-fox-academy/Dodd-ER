package com.zmesza.toread.model;

import javax.persistence.*;

@Entity
public class Book {

  @Id
  @GeneratedValue
  private int id;
  private String title;
  private boolean finished;
  private boolean important;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "userId")
  private User user;

  public Book() {}

  public Book(int id, String title, User user) {
    this.title = title;
    this.user = user;
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

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
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
