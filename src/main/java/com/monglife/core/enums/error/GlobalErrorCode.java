package com.monglife.core.enums.error;

public enum GlobalErrorCode implements ErrorCode {
    INTERNAL_SERVER_ERROR(500, "ERROR-000", "internal server error"),
    INVALID_PARAMETER(400, "ERROR-001", "invalid parameter"),
    ;

    private final Integer httpStatus;
    private final String code;
    private final String message;

    GlobalErrorCode(Integer httpStatus, String code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
