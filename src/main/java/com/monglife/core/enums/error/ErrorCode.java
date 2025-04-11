package com.monglife.core.enums.error;

import com.monglife.core.dto.response.ResponseDto;

import java.util.Map;

public interface ErrorCode {

    String getCode();

    String getMessage();

    ResponseDto<Map<String, Object>> toResponseDto(Integer httpStatus);

    <T> ResponseDto<T> toResponseDto(Integer httpStatus, T result);
}
