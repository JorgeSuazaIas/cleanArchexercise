package com.cleanArchexercise.cleanArchexercise.domain.usecase;

import com.cleanArchexercise.cleanArchexercise.domain.model.course.dto.CourseDTO;
import com.cleanArchexercise.cleanArchexercise.domain.model.gateway.ICourseRepository;
public class CourseUseCase {
    private final ICourseRepository iCourseRepository;

    public CourseUseCase(ICourseRepository iCourseRepository){
        this.iCourseRepository = iCourseRepository;
    }

    public CourseDTO saveCourse(CourseDTO courseDTO){
        return courseDTO.fromDomain(iCourseRepository.saveCourse(courseDTO.toDomain(courseDTO)));
    }
    public CourseDTO findById(Long id){
        CourseDTO courseDTO = new CourseDTO().fromDomain(iCourseRepository.findById(id));
        return courseDTO;
    }
}
