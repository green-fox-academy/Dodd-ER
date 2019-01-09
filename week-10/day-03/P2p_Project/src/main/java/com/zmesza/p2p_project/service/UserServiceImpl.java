package com.zmesza.p2p_project.service;

import com.zmesza.p2p_project.model.User;
import com.zmesza.p2p_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public void saveUser(User user) {
    this.userRepository.save(user);
  }

  @Override
  public boolean isThereAtLeastOneUser() {
    if (!this.userRepository.findAll().isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public User getUser() {
    return userRepository.findAll().get(0);
  }
}
