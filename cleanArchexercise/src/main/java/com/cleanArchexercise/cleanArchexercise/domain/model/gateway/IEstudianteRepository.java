package com.cleanArchexercise.cleanArchexercise.domain.model.gateway;

import com.cleanArchexercise.cleanArchexercise.domain.model.course.Course;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.Estudiante;


public interface IEstudianteRepository {
    Estudiante saveEstudiante(Estudiante estudiante, Course course);

}
