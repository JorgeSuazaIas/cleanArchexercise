package com.cleanArchexercise.cleanArchexercise.infraestructure.adapters.jpa.course;
import com.cleanArchexercise.cleanArchexercise.infraestructure.adapters.jpa.course.dbo.CourseDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseAdapterRepository extends JpaRepository<CourseDBO, Long> {

}
