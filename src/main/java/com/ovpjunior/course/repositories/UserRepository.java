package com.ovpjunior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ovpjunior.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
