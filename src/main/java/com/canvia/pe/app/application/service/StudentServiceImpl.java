package com.canvia.pe.app.application.service;

import com.canvia.pe.app.domain.entity.Student;
import com.canvia.pe.app.infraestructure.persistence.repository.StudentRepository;
import com.canvia.pe.app.infraestructure.vertical.Constants;
import com.canvia.pe.app.infraestructure.vertical.Utils;
import com.canvia.pe.app.infraestructure.vertical.helpers.StudentHelper;
import com.canvia.pe.app.presentation.entity.request.StudentRequest;
import com.canvia.pe.app.presentation.entity.response.GenericResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public GenericResponse<Boolean> save(StudentRequest studentRequest) {
        Student student = studentRepository.findByCode(studentRequest.getCode());
        if (Objects.nonNull(student))
            return Utils.buildResponseError(Constants.Response.VALIDATION_ERROR, Constants.Message.MSG_STUDENT_CODE_EXIST);

        studentRepository.save(StudentHelper.buildStudent(studentRequest));
        return Utils.buildResponseSuccess();
    }
}
