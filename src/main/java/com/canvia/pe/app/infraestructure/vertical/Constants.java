package com.canvia.pe.app.infraestructure.vertical;

import java.io.Serializable;

public class Constants implements Serializable {

    public static class Response implements Serializable {
        public static final String SUCCESS = "01";
        public static final String VALIDATION_ERROR = "02";
    }

    public static class Message implements Serializable {
        public static final String MSG_SUCCESS = "Procesado con éxito";

        public static final String MSG_STUDENT_CODE_EXIST = "Ya existe un alumno con código ingresado";
        public static final String MSG_STUDENT_NOT_FOUND = "El alumno no fue encontrado";
    }

    public static class Gender implements Serializable {
        public static final int UNDEFINED = 0;
        public static final int MALE = 1;
        public static final int FEMALE = 2;
    }
}
