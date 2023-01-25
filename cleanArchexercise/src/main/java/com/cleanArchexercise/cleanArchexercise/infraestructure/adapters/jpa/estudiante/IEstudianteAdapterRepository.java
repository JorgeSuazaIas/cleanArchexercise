package com.cleanArchexercise.cleanArchexercise.infraestructure.adapters.jpa.estudiante;
import com.cleanArchexercise.cleanArchexercise.infraestructure.adapters.jpa.estudiante.entity.EstudianteDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteAdapterRepository extends JpaRepository<EstudianteDBO, Long> {

}
