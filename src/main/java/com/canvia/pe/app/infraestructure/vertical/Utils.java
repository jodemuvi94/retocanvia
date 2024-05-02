package com.canvia.pe.app.infraestructure.vertical;

import com.canvia.pe.app.presentation.entity.response.GenericResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Utils {

    private Utils() {
        throw new IllegalStateException("Utils class");
    }

    public static GenericResponse<Boolean> buildResponseSuccess() {
        log.error("Code [{}]: {}", Constants.Response.SUCCESS, Constants.Message.MSG_SUCCESS);
        GenericResponse<Boolean> response = new GenericResponse<>();
        response.setCode(Constants.Response.SUCCESS);
        response.setData(Boolean.TRUE);
        response.setMessage(Constants.Message.MSG_SUCCESS);
        return response;
    }

    public static GenericResponse<Boolean> buildResponseError(String code, String message) {
        log.error("Code [{}]: {}", code, message);
        GenericResponse<Boolean> response = new GenericResponse<>();
        response.setCode(code);
        response.setData(Boolean.FALSE);
        response.setMessage(message);
        return response;
    }
}
