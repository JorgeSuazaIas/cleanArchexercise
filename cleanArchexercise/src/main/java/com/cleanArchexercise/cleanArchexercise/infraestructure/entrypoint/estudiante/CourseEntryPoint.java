package com.cleanArchexercise.cleanArchexercise.infraestructure.entrypoint.estudiante;

import com.cleanArchexercise.cleanArchexercise.domain.model.course.dto.CourseDTO;
import com.cleanArchexercise.cleanArchexercise.domain.usecase.CourseUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@AllArgsConstructor
@RequestMapping
@RestController

public class CourseEntryPoint {
    private final CourseUseCase courseUseCase;
   @PostMapping
   public ResponseEntity<?> saveCourse(@RequestBody CourseDTO courseDTO){
       return ResponseEntity.ok().body(courseUseCase.saveCourse(courseDTO));
   }
   @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
       return ResponseEntity.ok().body(courseUseCase.findById(id));
   }
}
