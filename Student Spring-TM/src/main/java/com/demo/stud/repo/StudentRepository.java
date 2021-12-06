package com.demo.stud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.stud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
