package com.canvia.pe.app.infraestructure.vertical.helpers;

import com.canvia.pe.app.application.entity.StudentDto;
import com.canvia.pe.app.domain.entity.Student;
import com.canvia.pe.app.presentation.entity.request.StudentRequest;

import java.io.Serializable;

public class StudentHelper implements Serializable {
    private StudentHelper() {
        throw new IllegalStateException("StudentHelper class");
    }

    public static Student buildStudent(StudentRequest student) {
        return Student.builder()
                .code(student.getCode())
                .name(student.getName())
                .paternalSurname(student.getPaternalSurname())
                .maternalSurname(student.getMaternalSurname())
                .gender(student.getGender().getValue())
                .build();
    }

    public static StudentDto castStudent(Student student) {
        return StudentDto.builder()
                .id(student.getId())
                .code(student.getCode())
                .name(student.getName())
                .paternalSurname(student.getPaternalSurname())
                .maternalSurname(student.getMaternalSurname())
                .gender(student.getGender())
                .build();
    }
}
