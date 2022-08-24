package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentClass;

public interface StudentRepository extends JpaRepository<StudentClass, Integer>{

}
