package com.canvia.pe.app.application.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Builder
public class StudentDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String code;
    private String name;
    private String paternalSurname;
    private String maternalSurname;
    private Integer gender;
}
