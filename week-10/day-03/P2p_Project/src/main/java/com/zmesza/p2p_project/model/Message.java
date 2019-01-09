package com.zmesza.p2p_project.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Message {

  @Id
  private long id;
  private String usename;
  private String text;
  @UpdateTimestamp
  private Date date;

  public Message() {
  }

  public Message(String usename, String text) {
    this.id = (long)(Math.random() * 8999999) + 1000000;
    this.usename = usename;
    this.text = text;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsename() {
    return usename;
  }

  public void setUsename(String usename) {
    this.usename = usename;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
