package com.zmesza.p2p_project.model.status_message;

public class OkMessage extends StatusMessage{

  private String status;

  public OkMessage() {
    this.status = "ok";
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
