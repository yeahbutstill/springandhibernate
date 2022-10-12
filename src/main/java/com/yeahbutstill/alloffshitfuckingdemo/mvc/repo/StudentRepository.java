package com.yeahbutstill.alloffshitfuckingdemo.mvc.repo;

import com.yeahbutstill.alloffshitfuckingdemo.mvc.entity.StudentJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentJPA, Integer> {
}
