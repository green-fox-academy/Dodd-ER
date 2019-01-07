package com.zmesza.teveclub.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class User {

  @Id
  @GeneratedValue
  private long id;

  @Temporal(TemporalType.TIMESTAMP)
  private Date assignedDate;
  private String name;
  private String password;
  private String email;

  public User() {
  }

  public User(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Date getAssignedDate() {
    return assignedDate;
  }

  public void setAssignedDate(Date assignedDate) {
    this.assignedDate = assignedDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() { return email; }

  public void setEmail(String email) { this.email = email; }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
