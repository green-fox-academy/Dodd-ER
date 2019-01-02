package com.zmesza.toread.service;

import com.zmesza.toread.model.User;

import java.util.List;

public interface UserService {

  User getUserById(long id);
  List<User> getAllUser();
  void saveNewUser(User user);
}
