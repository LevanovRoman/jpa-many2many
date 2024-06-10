package com.myapp.jpamany2many.repository;

import com.myapp.jpamany2many.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByNameContaining(String name);
}
