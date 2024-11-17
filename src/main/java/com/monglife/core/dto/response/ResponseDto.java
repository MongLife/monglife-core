package com.monglife.core.dto.response;

public class ResponseDto<T> {

    private String code;

    private String message;

    private Integer httpStatus;

    private T result;

    public ResponseDto() {}

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

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setHttpStatus(Integer httpStatus) {
        this.httpStatus = httpStatus;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
