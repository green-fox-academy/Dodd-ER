package com.zmesza.toread.service;

import com.zmesza.toread.model.User;
import com.zmesza.toread.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User getUserById(long id) {
    return this.userRepository.findById(id).orElse(null);
  }

  @Override
  public List<User> getAllUser() {
    List<User> userList = new ArrayList<>();
    this.userRepository.findAll().forEach(userList::add);
    return userList;
  }

  @Override
  public void saveNewUser(User user) {
    this.userRepository.save(user);
  }
}
