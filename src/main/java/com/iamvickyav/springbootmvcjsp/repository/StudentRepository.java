package com.iamvickyav.springbootmvcjsp.repository;

import com.iamvickyav.springbootmvcjsp.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByName(String name);
}
