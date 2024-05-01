package com.canvia.pe.app.presentation.entity;

import com.canvia.pe.app.core.enums.GenderEnum;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class StudentRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String code;
    private String name;
    private String paternalSurname;
    private String maternalSurname;
    private GenderEnum gender;
}
