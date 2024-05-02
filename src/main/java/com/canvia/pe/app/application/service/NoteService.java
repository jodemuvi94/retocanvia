package com.canvia.pe.app.application.service;

import com.canvia.pe.app.presentation.entity.request.NoteRequest;
import com.canvia.pe.app.presentation.entity.response.GenericResponse;

import java.util.List;

public interface NoteService {
    GenericResponse<Boolean> saveAll(String studentCode, List<NoteRequest> notes);

    GenericResponse<Double> getAvg(String studentCode);
}
