package com.zmesza.p2p_project.model;

import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

public class Log {

  private String path;
  private String method;
  @UpdateTimestamp
  private java.util.Date Date;
  private String level;
  private String requestData;
  private String coreMessage;

  public Log(String path, String method, Date date, String level, String requestData) {
    this.coreMessage = date + " " + level + " " + path + " " + method + " " + requestData;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public Date getDate() {
    return Date;
  }

  public void setDate(Date date) {
    Date = date;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public String getRequestData() {
    return requestData;
  }

  public void setRequestData(String requestData) {
    this.requestData = requestData;
  }

  public String getCoreMessage() {
    return coreMessage;
  }

  public void setCoreMessage(String coreMessage) {
    this.coreMessage = coreMessage;
  }
}
