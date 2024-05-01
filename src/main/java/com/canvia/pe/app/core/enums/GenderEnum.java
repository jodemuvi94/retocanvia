package com.canvia.pe.app.core.enums;

import com.canvia.pe.app.infraestructure.vertical.Constants;
import lombok.Getter;

@Getter
public enum GenderEnum {
    UNDEFINED(Constants.Gender.UNDEFINED),
    MALE(Constants.Gender.MALE),
    FEMALE(Constants.Gender.FEMALE);

    private int value;

    GenderEnum(int value) {
        this.value = value;
    }

    void setValue(int value) {
        this.value = value;
    }
}
