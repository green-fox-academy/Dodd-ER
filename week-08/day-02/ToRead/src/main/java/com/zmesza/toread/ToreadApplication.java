package com.zmesza.toread;

import com.zmesza.toread.repository.BookRepository;
import com.zmesza.toread.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToreadApplication implements CommandLineRunner {

  private UserRepository userRepository;
  private BookRepository bookRepository;

  @Autowired
  public ToreadApplication(UserRepository userRepository, BookRepository bookRepository) {
    this.userRepository = userRepository;
    this.bookRepository = bookRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ToreadApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  }
}

