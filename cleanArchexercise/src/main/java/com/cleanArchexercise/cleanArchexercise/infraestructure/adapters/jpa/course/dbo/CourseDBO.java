package com.cleanArchexercise.cleanArchexercise.infraestructure.adapters.jpa.course.dbo;

import com.cleanArchexercise.cleanArchexercise.domain.model.course.Course;
import com.cleanArchexercise.cleanArchexercise.domain.model.course.attributes.CourseId;
import com.cleanArchexercise.cleanArchexercise.domain.model.course.attributes.CourseName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "course")
public class CourseDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;

    public CourseDBO fromDomain(Course course){
        return new CourseDBO(
                course.getId().getValue(),
                course.getName().getValue()
        );
    }

    public Course toDomain(CourseDBO courseDBO){
        return new Course(
                new CourseId(courseDBO.getId()),
                new CourseName(courseDBO.getName())
        );
    }
}
