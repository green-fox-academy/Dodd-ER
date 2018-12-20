package com.zmesza.reddit.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

  @Id
  @GeneratedValue
  private int id;

  @OneToMany(mappedBy = "user")
  private List<Post> posts;

  private String name;

  public User() {}

  public User(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;

  }public List<Post> getPosts() {
    return posts;
  }

  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }

}
