package com.monglife.core.dto.response;

public class ResponseDto<T> {

    private final String code;

    private final String message;

    private final Integer httpStatus;

    private final T result;

    public ResponseDto(String code, String message, Integer httpStatus ,T result) {
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Integer getHttpStatus() {
        return httpStatus;
    }

    public T getResult() {
        return result;
    }
}
