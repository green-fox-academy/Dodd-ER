package com.zmesza.p2p_project.service;

import com.zmesza.p2p_project.model.Message;
import com.zmesza.p2p_project.model.ReceivedMessage;
import com.zmesza.p2p_project.model.status_message.StatusMessage;

import java.util.List;

public interface MessageService {

  void saveNewMessage(Message message);
  List<Message> getAllMessage();
  StatusMessage getStatusMessage(ReceivedMessage receivedMessage);
}
