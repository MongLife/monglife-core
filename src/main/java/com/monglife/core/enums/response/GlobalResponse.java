package com.monglife.core.enums.response;

import com.monglife.core.dto.response.ResponseDto;

import java.util.Collections;
import java.util.Map;

public enum GlobalResponse implements Response {

    INVALID_PARAMETER(400, "GLOBAL-ERROR-000", "유효하지 않은 파라미터 입니다."),
    INTERNAL_SERVER_ERROR(500, "GLOBAL-ERROR-001", "내부 서버 에러입니다."),
    ;

    private final Integer httpStatus;

    private final String code;

    private final String message;

    GlobalResponse(Integer httpStatus, String code, String message) {
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

    @Override
    public ResponseDto<Map<String, Object>> toResponseDto() {
        return new ResponseDto<>(code, message, httpStatus, Collections.emptyMap());
    }

    @Override
    public <T> ResponseDto<T> toResponseDto(T result) {
        return new ResponseDto<>(code, message, httpStatus, result);
    }
}
