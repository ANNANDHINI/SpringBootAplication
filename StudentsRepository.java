package com.jetblueapp6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jetblueapp6.entity.Students;

public interface StudentsRepository extends JpaRepository<Students, Long> {

}
