package com.canvia.pe.app.application.service;

import com.canvia.pe.app.domain.entity.Student;
import com.canvia.pe.app.infraestructure.persistence.repository.NoteRepository;
import com.canvia.pe.app.infraestructure.persistence.repository.StudentRepository;
import com.canvia.pe.app.infraestructure.vertical.Constants;
import com.canvia.pe.app.infraestructure.vertical.Utils;
import com.canvia.pe.app.infraestructure.vertical.helpers.NoteHelper;
import com.canvia.pe.app.presentation.entity.request.NoteRequest;
import com.canvia.pe.app.presentation.entity.response.GenericResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;
    private final StudentRepository studentRepository;

    @Override
    public GenericResponse<Boolean> saveAll(String studentCode, List<NoteRequest> notes) {
        Student student = studentRepository.findByCode(studentCode);

        if (Objects.isNull(student))
            return Utils.buildResponseError(Constants.Response.VALIDATION_ERROR, Constants.Message.MSG_STUDENT_NOT_FOUND);

        noteRepository.saveAll(NoteHelper.buildNotes(notes, student.getId()));

        return Utils.buildResponseSuccess();
    }

    @Override
    public GenericResponse<Double> getAvg(String studentCode) {
        Student student = studentRepository.findByCode(studentCode);

        if (Objects.isNull(student))
            return Utils.buildResponseError(Constants.Response.VALIDATION_ERROR, Constants.Message.MSG_STUDENT_NOT_FOUND, 0.0);

        Double avg = noteRepository.getAvg(student.getId());

        return Utils.buildResponseSuccess(avg);
    }
}
