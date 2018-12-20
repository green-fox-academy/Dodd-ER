package com.zmesza.reddit.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

  @Id
  @GeneratedValue
  private int id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="user_id")
  private User user;

  private Date date;
  private String title;
  private String url;
  private int score;

  public Post() {}

  public Post(User user, Date date, String title, String url) {
    this.user = user;
    this.date = date;
    this.title = title;
    this.url = url;
    this.score = 10;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
