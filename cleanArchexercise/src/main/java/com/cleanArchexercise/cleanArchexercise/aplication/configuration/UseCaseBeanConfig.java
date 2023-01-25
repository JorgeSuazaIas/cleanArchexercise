package com.cleanArchexercise.cleanArchexercise.aplication.configuration;


import com.cleanArchexercise.cleanArchexercise.domain.model.gateway.IEstudianteRepository;
import com.cleanArchexercise.cleanArchexercise.domain.model.gateway.ICourseRepository;
import com.cleanArchexercise.cleanArchexercise.domain.usecase.EstudianteUseCase;
import com.cleanArchexercise.cleanArchexercise.domain.usecase.CourseUseCase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public EstudianteUseCase estudianteUseCase(IEstudianteRepository iEstudianteRepository, CourseUseCase courseUseCase){
    return new EstudianteUseCase(iEstudianteRepository, courseUseCase);
    }
    @Bean
    public CourseUseCase courseUseCase(ICourseRepository iCourseRepository){
        return new CourseUseCase(iCourseRepository);
    }
}


