package com.cleanArchexercise.cleanArchexercise.infraestructure.entrypoint.estudiante;

import com.cleanArchexercise.cleanArchexercise.domain.model.estudiante.dto.EstudianteDTO;
import com.cleanArchexercise.cleanArchexercise.domain.usecase.EstudianteUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/estudiante")
@AllArgsConstructor

public class EstudianteEntryPoint {
    private final EstudianteUseCase estudianteUseCase;

    @PostMapping
    public ResponseEntity<?> saveEstudiante(@RequestBody EstudianteDTO estudianteDTO){
        return ResponseEntity.ok().body(estudianteUseCase.saveEstudiante(estudianteDTO));
    }
}
