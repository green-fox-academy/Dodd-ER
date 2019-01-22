package com.zmesza.todo_jwt.user;

import com.zmesza.todo_jwt.user.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
  ApplicationUser findByUsername(String username);
}
