package com.cleanArchexercise.cleanArchexercise.infraestructure.adapters.jpa.estudiante.entity;

import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.*;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.attributes.EstudianteId;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.attributes.EstudianteName;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.attributes.EstudiantePhone;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.attributes.EstudianteEmail;
import com.cleanArchexercise.cleanArchexercise.infraestructure.adapters.jpa.course.dbo.CourseDBO;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table (name= "estudiante")
public class EstudianteDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  Integer phone;
    private String email;


    @ManyToOne
    @JoinColumn(name = "course", referencedColumnName = "id")
    private CourseDBO courseDBO;

    public EstudianteDBO(Long id, String name, Integer phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;

    }

    public EstudianteDBO fromDomain(Estudiante estudiante){
        return new EstudianteDBO(
                 estudiante.getId().getValue(),
                 estudiante.getName().getValue(),
                estudiante.getPhone().getValue(),
                estudiante.getEmail().getValue()



        );
    }

    public Estudiante toDomain (EstudianteDBO estudianteDBO){
        return new Estudiante(
                new EstudianteId(estudianteDBO.getId()),
                new EstudianteName(estudianteDBO.getName()),
                new EstudiantePhone(estudianteDBO.getPhone()),
                new EstudianteEmail(estudianteDBO.getEmail())


        );
    }
}