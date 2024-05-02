package com.canvia.pe.app.presentation.entity.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class NoteRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String description;
    private Double note;
}
