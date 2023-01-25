package com.cleanArchexercise.cleanArchexercise.infraestructure.adapters.jpa.estudiante;

import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.Estudiante;
import com.cleanArchexercise.cleanArchexercise.domain.model.course.Course;
import com.cleanArchexercise.cleanArchexercise.domain.model.gateway.IEstudianteRepository;
import com.cleanArchexercise.cleanArchexercise.infraestructure.adapters.jpa.course.dbo.CourseDBO;
import com.cleanArchexercise.cleanArchexercise.infraestructure.adapters.jpa.estudiante.entity.EstudianteDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;



@AllArgsConstructor
@Repository

public class EstudianteAdapterRepository implements IEstudianteRepository {

    private final IEstudianteAdapterRepository iEstudianteAdapterRepository;
    @Override
    public Estudiante saveEstudiante(Estudiante estudiante, Course course){
        EstudianteDBO estudianteDBO = new EstudianteDBO().fromDomain(estudiante);
        CourseDBO courseDBO = new CourseDBO().fromDomain(course);
        estudianteDBO.setCourseDBO(courseDBO);
        return estudianteDBO.toDomain(iEstudianteAdapterRepository.save(estudianteDBO));
    }

}
