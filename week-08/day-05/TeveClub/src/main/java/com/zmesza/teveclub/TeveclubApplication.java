package com.zmesza.teveclub;

import com.zmesza.teveclub.repository.CamelRepository;
import com.zmesza.teveclub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeveclubApplication implements CommandLineRunner {

  private CamelRepository camelRepository;
  private UserRepository userRepository;

  @Autowired
  public TeveclubApplication(CamelRepository camelRepository, UserRepository userRepository) {
    this.camelRepository = camelRepository;
    this.userRepository = userRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TeveclubApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }
}

