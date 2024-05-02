package com.canvia.pe.app.presentation.controller;

import com.canvia.pe.app.application.service.StudentService;
import com.canvia.pe.app.presentation.entity.request.StudentRequest;
import com.canvia.pe.app.presentation.entity.response.GenericResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/students")
@Validated
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("")
    public ResponseEntity<GenericResponse> save(@RequestBody @Validated StudentRequest student) {
        return ResponseEntity.ok(studentService.save(student));
    }
}
