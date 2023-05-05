package com.onerivet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onerivet.model.entities.Employee;

public interface DeskBookRepository extends JpaRepository<Employee, Integer> {

}
