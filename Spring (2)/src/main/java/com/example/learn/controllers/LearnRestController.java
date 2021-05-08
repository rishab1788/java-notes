package com.example.learn.controllers;

import com.example.learn.entities.Courses;
import com.example.learn.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.io.IOException;

@RestController // Representation state
public class LearnRestController {
    // spring will automaticall creates the object and puts it here
    // with dependency injection loose coupling
    @Autowired
    private CourseService courseService;

    // takes the parameter in which url it is used to
    @GetMapping("/hello")
    public String sayHi() throws IOException {
        return "Hello";
    }

    @GetMapping("/courses")
    public List<Courses> getCourses() {
        return courseService.getCourses();
    }

    @GetMapping("/course/{courseId}")
    public Courses getCourse(@PathVariable String courseId) {
        return courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping(path = "/courses", consumes = "application/json")
    public Courses addCourses(@RequestBody Courses courses) {
        return courseService.addCourses(courses);
    }

}
