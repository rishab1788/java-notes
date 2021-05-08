package com.example.learn.service;

import com.example.learn.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {

    public List<Courses> getCourses();

    public Courses getCourse(Long courseId);

    public Courses addCourses(Courses courses);

    Courses deleteCourses(Courses courses);
}
