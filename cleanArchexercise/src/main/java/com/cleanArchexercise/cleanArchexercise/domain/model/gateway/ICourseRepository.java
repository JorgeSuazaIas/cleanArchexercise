package com.cleanArchexercise.cleanArchexercise.domain.model.gateway;

import com.cleanArchexercise.cleanArchexercise.domain.model.course.Course;

public interface ICourseRepository {

    Course saveCourse(Course course);

    Course findById(Long id);
}
