package com.cleanArchexercise.cleanArchexercise.domain.model.course;

import com.cleanArchexercise.cleanArchexercise.domain.model.course.attributes.CourseId;
import com.cleanArchexercise.cleanArchexercise.domain.model.course.attributes.CourseName;

public class Course {
    private final CourseId id;
    private final CourseName name;
    public Course(CourseId id, CourseName name) {
        this.id = id;
        this.name = name;
    }

    public CourseId getId() {
        return id;
    }

    public CourseName getName() {
        return name;
    }
}
