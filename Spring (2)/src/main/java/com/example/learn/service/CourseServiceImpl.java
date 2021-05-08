package com.example.learn.service;

import com.example.learn.dao.CourseDao;
import com.example.learn.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service // this is identified by spring that its service
public class CourseServiceImpl implements CourseService {
    List<Courses> list;
    @Autowired
    CourseDao courseDao;


    public CourseServiceImpl(List<Courses> list) {
        this.list = new ArrayList<>();
        this.list.add(new Courses(1, "JavaFirst", "Lovely"));
        this.list.add(new Courses(2, "JavaFirst", "Lovely"));
    }

    @Override
    public List<Courses> getCourses() {
        // return list;
         return courseDao.findAll();
    }

    @Override
    public Courses getCourse(Long courseId) {
        return list.stream().filter(courses -> courses.getId() == courseId)
                .findAny()
                .orElse(null);
    }

    @Override
    public Courses addCourses(Courses courses) {
        list.add(courses);
        courseDao.save(courses);
        return courses;
    }

    @Override
    public Courses deleteCourses(Courses courses) {
        return null;
    }


}
