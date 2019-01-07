package com.zmesza.teveclub.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Camel {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "userId")
  private User user;
  private String name;

  @Temporal(TemporalType.TIMESTAMP)
  private Date creationDate;
  private String trick;
  private String food;
  private String drink;

  public Camel() {
  }

  public Camel(User user, String name) {
    this.user = user;
    this.name = name;
    this.trick = "Szobatiszta";
    this.food = "Kenyér";
    this.drink = "Víz";
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public String getTrick() {
    return trick;
  }

  public void setTrick(String trick) {
    this.trick = trick;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
