package com.jetblueapp6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jetblueapp6.entity.Bills;

public interface BillsRepository extends JpaRepository<Bills, Long> {

}
