package com.canvia.pe.app.presentation.controller;

import com.canvia.pe.app.application.entity.StudentDto;
import com.canvia.pe.app.application.service.NoteService;
import com.canvia.pe.app.infraestructure.vertical.Constants;
import com.canvia.pe.app.presentation.entity.request.NoteRequest;
import com.canvia.pe.app.presentation.entity.response.GenericResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/notes")
@Validated
@RequiredArgsConstructor
public class NoteController {
    private final NoteService noteService;

    @PostMapping("/{studentCode}")
    public ResponseEntity<GenericResponse<Boolean>> saveAll(@PathVariable String studentCode,
                                                            @RequestBody @Validated List<NoteRequest> notes) {
        GenericResponse<Boolean> response = noteService.saveAll(studentCode, notes);

        if (response.getCode().equals(Constants.Response.VALIDATION_ERROR))
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{studentCode}/avg")
    public ResponseEntity<GenericResponse<Double>> getAvg(@PathVariable String studentCode) {
        GenericResponse<Double> response = noteService.getAvg(studentCode);

        if (response.getCode().equals(Constants.Response.VALIDATION_ERROR))
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

        return ResponseEntity.ok(response);
    }
}
