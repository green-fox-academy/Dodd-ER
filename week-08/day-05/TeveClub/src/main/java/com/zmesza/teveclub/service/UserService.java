package com.zmesza.teveclub.service;

import com.zmesza.teveclub.model.Camel;
import com.zmesza.teveclub.model.User;

import java.util.List;

public interface UserService {

  void saveUser(User user);
  User getUserById(long id);
  List<User> getAllUser();
  String login(String name, String password);
  String errorMessage();
}
