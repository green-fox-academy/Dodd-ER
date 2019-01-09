package com.zmesza.p2p_project.service;

import com.zmesza.p2p_project.model.Message;

import java.util.List;

public interface MessageService {

  void saveNewMessage(Message message);
  List<Message> getAllMessage();
}
