package com.canvia.pe.app.infraestructure.vertical.helpers;

import com.canvia.pe.app.domain.entity.Note;
import com.canvia.pe.app.domain.entity.Student;
import com.canvia.pe.app.presentation.entity.request.NoteRequest;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class NoteHelper implements Serializable {
    private NoteHelper() {
        throw new IllegalStateException("NoteHelper class");
    }

    public static List<Note> buildNotes(List<NoteRequest> notes, Long studentId) {
        return notes.stream().map(note -> Note.builder()
                        .studentId(Student.builder().id(studentId).build())
                        .description(note.getDescription())
                        .note(note.getNote())
                        .build())
                .collect(Collectors.toList());
    }
}
