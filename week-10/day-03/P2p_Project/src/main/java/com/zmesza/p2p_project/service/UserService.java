package com.zmesza.p2p_project.service;
import com.zmesza.p2p_project.model.User;


public interface UserService {

  void saveUser(User user);
  boolean isThereAtLeastOneUser();
  User getUser();
}
