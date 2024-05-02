package com.canvia.pe.app.presentation.entity.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class GenericResponse<T> {
    private String code;
    private T data;
    private String message;
}
