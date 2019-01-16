package com.zmesza.p2p_project.service;

import com.zmesza.p2p_project.model.Message;
import com.zmesza.p2p_project.model.ReceivedMessage;
import com.zmesza.p2p_project.model.status_message.ErrorMessage;
import com.zmesza.p2p_project.model.status_message.OkMessage;
import com.zmesza.p2p_project.model.status_message.StatusMessage;
import com.zmesza.p2p_project.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

  private MessageRepository messageRepository;

  @Autowired
  public MessageServiceImpl(MessageRepository messageRepository) {
    this.messageRepository = messageRepository;
  }

  @Override
  public void saveNewMessage(Message message) {
    this.messageRepository.save(message);
  }

  @Override
  public List<Message> getAllMessage() {
    List<Message> resultList = new ArrayList<>();
    this.messageRepository.findAll().forEach(resultList::add);
    return resultList;
  }

  @Override
  public StatusMessage getStatusMessage(ReceivedMessage receivedMessage) {
    String errorMessageString = "";
    if (receivedMessage.getMessage().getDate() == null) {
      errorMessageString += "message.timestamp, ";
    } else if ((Long) receivedMessage.getMessage().getId() == null) {
      errorMessageString += "message.id, ";
    } else if (receivedMessage.getMessage().getText() == null) {
      errorMessageString += "message.text, ";
    } else if (receivedMessage.getMessage().getUserName() == null) {
      errorMessageString += "message.username, ";
    } else if (receivedMessage.getClient().getId() == null) {
      errorMessageString += "client.id";
      return new ErrorMessage(errorMessageString);
    }
    return new OkMessage();
  }
}
