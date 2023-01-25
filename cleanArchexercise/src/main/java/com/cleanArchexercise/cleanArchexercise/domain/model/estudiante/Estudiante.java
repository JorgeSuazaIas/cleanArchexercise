package com.cleanArchexercise.cleanArchexercise.domain.model.estudiante;

import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.attributes.EstudianteEmail;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.attributes.EstudianteId;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.attributes.EstudianteName;
import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.attributes.EstudiantePhone;

public class Estudiante {
    private final EstudianteId id;
    private final EstudianteName name;
    private final EstudiantePhone phone;
    private final EstudianteEmail email;



    public Estudiante(EstudianteId id, EstudianteName name,  EstudiantePhone phone, EstudianteEmail email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


    public EstudianteId getId() {
        return id;
    }

    public EstudianteName getName() {
        return name;
    }

    public EstudiantePhone getPhone() {
        return phone;
    }
    public EstudianteEmail getEmail() {
        return email;
    }

}
