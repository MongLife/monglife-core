package com.monglife.core.enums.error;

import com.monglife.core.dto.response.ResponseDto;

import java.util.Collections;
import java.util.Map;

public interface ErrorCode {

    String getCode();

    String getMessage();

    default ResponseDto<Map<String, Object>> toResponseDto(Integer httpStatus) {
        return new ResponseDto<>(getCode(), getMessage(), httpStatus, Collections.emptyMap());
    }

    default <T> ResponseDto<T> toResponseDto(Integer httpStatus, T result) {
        return new ResponseDto<>(getCode(), getMessage(), httpStatus, result);
    }
}
