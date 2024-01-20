package com.brenosouza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brenosouza.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
