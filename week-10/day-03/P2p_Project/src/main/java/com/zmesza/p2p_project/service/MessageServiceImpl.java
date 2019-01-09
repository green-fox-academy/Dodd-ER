package com.zmesza.p2p_project.service;

import com.zmesza.p2p_project.model.Log;
import com.zmesza.p2p_project.model.Message;
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
  public boolean isThereAtLeastOneUser() {
    if (this.messageRepository.findAll().size() != 0) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public List<Message> getAllMessage() {
    List<Message> resultList = new ArrayList<>();
    this.messageRepository.findAll().forEach(resultList::add);
    return resultList;
  }
}
