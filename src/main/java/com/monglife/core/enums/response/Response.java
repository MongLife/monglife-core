package com.monglife.core.enums.response;

import com.monglife.core.dto.response.ResponseDto;

import java.util.Map;

public interface Response {

    Integer getHttpStatus();

    String getCode();

    String getMessage();

    ResponseDto<Map<String, Object>> toResponseDto();

    <T> ResponseDto<T> toResponseDto(T result);
}
