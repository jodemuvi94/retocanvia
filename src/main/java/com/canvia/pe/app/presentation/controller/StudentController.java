package com.canvia.pe.app.presentation.controller;

import com.canvia.pe.app.application.entity.StudentDto;
import com.canvia.pe.app.application.service.StudentService;
import com.canvia.pe.app.infraestructure.vertical.Constants;
import com.canvia.pe.app.presentation.entity.request.StudentRequest;
import com.canvia.pe.app.presentation.entity.response.GenericResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1/students")
@Validated
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("")
    public ResponseEntity<GenericResponse<Boolean>> save(@RequestBody @Validated StudentRequest student) {
        return ResponseEntity.ok(studentService.save(student));
    }

    @GetMapping("/{code}")
    public ResponseEntity<GenericResponse<StudentDto>> getByCode(@PathVariable String code) {
        GenericResponse<StudentDto> response = studentService.getByCode(code);
        if (response.getCode().equals(Constants.Response.VALIDATION_ERROR))
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

        return ResponseEntity.ok(response);
    }
}
