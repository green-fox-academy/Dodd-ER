package com.zmesza.p2p_project.model;

public class ReceivedMessage {

  private Message message;
  private Client client;

  public ReceivedMessage() {
  }

  public ReceivedMessage(Message message, Client client) {
    this.message = message;
    this.client= client;
  }

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
