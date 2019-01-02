package com.zmesza.reddit.service;

import com.zmesza.reddit.model.User;
import com.zmesza.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository repository;

  @Autowired
  public UserServiceImpl(UserRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<User> getAllUser() {
    return null;
  }

  @Override
  public void saveNewUser(User user) {
    this.repository.save(user);
  }

  @Override
  public void deleteUser() {

  }

  @Override
  public User getUserById(int id) {
    return this.repository.findById(id).orElse(null);
  }
}


