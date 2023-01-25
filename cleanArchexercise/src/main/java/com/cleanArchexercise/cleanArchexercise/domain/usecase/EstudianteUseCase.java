package com.cleanArchexercise.cleanArchexercise.domain.usecase;

import com.cleanArchexercise.cleanArchexercise.domain.model.gateway.IEstudianteRepository;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.dto.EstudianteDTO;
import com.cleanArchexercise.cleanArchexercise.domain.model.course.Course;
import com.cleanArchexercise.cleanArchexercise.domain.model.course.dto.CourseDTO;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.Estudiante;

import java.util.Optional;

public class EstudianteUseCase {
    private final IEstudianteRepository iEstudianteRepository;
    private final CourseUseCase courseUseCase;

    public EstudianteUseCase(IEstudianteRepository iEstudianteRepository, CourseUseCase courseUseCase){
        this.iEstudianteRepository = iEstudianteRepository;
        this.courseUseCase = courseUseCase;
    }
    public EstudianteDTO saveEstudiante(EstudianteDTO estudianteDTO){
        Optional<CourseDTO> courseDTO = Optional.ofNullable(courseUseCase.findById(estudianteDTO.getCourseId()));
        if (courseDTO.isPresent()){
            Estudiante estudiante = estudianteDTO.toDomain(estudianteDTO);
            Course course = courseDTO.get().toDomain(courseDTO.get());
            return estudianteDTO.fromDomain(iEstudianteRepository.saveEstudiante(estudiante, course));
        }
        return null;
    }
}
