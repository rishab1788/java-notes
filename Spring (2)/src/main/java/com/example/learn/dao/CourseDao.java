package com.example.learn.dao;

import com.example.learn.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CourseDao extends JpaRepository<Courses, Long> {

}
