package com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.dto;

import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.*;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.attributes.EstudianteId;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.attributes.EstudianteEmail;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.attributes.EstudianteName;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.attributes.EstudiantePhone;

public class EstudianteDTO {
    private Long id;
    private String name;
    private Integer phone;
    private String email;

    private Long courseId;

    public EstudianteDTO(Long id, String name, Integer phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setPhone(Integer phone) {
        this.phone = phone;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Estudiante toDomain(EstudianteDTO estudianteDTO){
        return new Estudiante(
                new EstudianteId(estudianteDTO.getId()),
                new EstudianteName(estudianteDTO.getName()),
                new EstudiantePhone(estudianteDTO.getPhone()),
                new EstudianteEmail(estudianteDTO.getEmail())
        );
    }

    public EstudianteDTO fromDomain(Estudiante estudiante){
        return new EstudianteDTO(
                estudiante.getId().getValue(),
                estudiante.getName().getValue(),
                estudiante.getPhone().getValue(),
                estudiante.getEmail().getValue()

        );
    }
}
