package com.zmesza.p2p_project.model.status_message;

public abstract class StatusMessage {

  private String status;

  public StatusMessage() {
    this.status = "";
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
