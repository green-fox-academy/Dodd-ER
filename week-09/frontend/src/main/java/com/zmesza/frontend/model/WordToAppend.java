package com.zmesza.frontend.model;

public class WordToAppend {

  private String appended;

  public WordToAppend() {
  }

  public WordToAppend(String appendable) {
    this.appended = appendable + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
