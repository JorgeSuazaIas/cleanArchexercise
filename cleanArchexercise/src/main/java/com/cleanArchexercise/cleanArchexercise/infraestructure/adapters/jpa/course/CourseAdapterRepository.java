package com.cleanArchexercise.cleanArchexercise.infraestructure.adapters.jpa.course;

import com.cleanArchexercise.cleanArchexercise.domain.model.course.Course;
import com.cleanArchexercise.cleanArchexercise.domain.model.gateway.ICourseRepository;
import com.cleanArchexercise.cleanArchexercise.infraestructure.adapters.jpa.course.dbo.CourseDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import java.util.Optional;
@AllArgsConstructor
@Controller

public class CourseAdapterRepository implements ICourseRepository{
    private final ICourseAdapterRepository iCourseAdapterRepository;

    @Override
    public Course saveCourse(Course course) {
        CourseDBO courseDBO = new CourseDBO().fromDomain(course);
        return courseDBO.toDomain(iCourseAdapterRepository.save(courseDBO));
    }

    @Override
    public Course findById(Long id) {
        Optional<CourseDBO> courseDBO = iCourseAdapterRepository.findById(id);
        if (courseDBO.isPresent()){
            return courseDBO.get().toDomain(courseDBO.get());
        }else {
            return null;
        }
    }
}
