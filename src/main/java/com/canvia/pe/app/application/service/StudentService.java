package com.canvia.pe.app.application.service;

import com.canvia.pe.app.application.entity.StudentDto;
import com.canvia.pe.app.presentation.entity.request.StudentRequest;
import com.canvia.pe.app.presentation.entity.response.GenericResponse;

public interface StudentService {
    GenericResponse<Boolean> save(StudentRequest studentRequest);

    GenericResponse<StudentDto> getByCode(String code);
}
