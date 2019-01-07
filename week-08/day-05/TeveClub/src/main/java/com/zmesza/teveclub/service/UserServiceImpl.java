package com.zmesza.teveclub.service;

import com.zmesza.teveclub.model.Camel;
import com.zmesza.teveclub.model.User;
import com.zmesza.teveclub.repository.UserRepository;
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
  public void saveUser(User user) {
    this.userRepository.save(user);
  }

  @Override
  public User getUserById(long id) {
    return this.userRepository.findById(id).orElse(null);
  }

  @Override
  public List<User> getAllUser() {
    List<User> listOfUsers = new ArrayList<>();
    this.userRepository.findAll().forEach(listOfUsers::add);
    return listOfUsers;
  }

  @Override
  public String login(String name, String password) {
    User currentUser = this.userRepository.findByNameAndPassword(name,password);
    return "redirect:/camel/{" + currentUser.getId() + "}/mycamels\"";
  }

  @Override
  public String errorMessage() {
    return "Name or password is incorrect";
  }

}
