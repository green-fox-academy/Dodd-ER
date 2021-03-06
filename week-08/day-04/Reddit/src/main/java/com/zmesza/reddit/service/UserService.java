package com.zmesza.reddit.service;

import com.zmesza.reddit.model.User;

import java.util.List;

public interface UserService {

  List<User> getAllUser();
  void saveNewUser(User user);
  void deleteUser();
  User getUserById(int id);
}
