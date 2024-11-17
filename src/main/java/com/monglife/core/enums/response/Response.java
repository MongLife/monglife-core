package com.monglife.core.enums.response;

import com.monglife.core.dto.response.ResponseDto;

import java.util.Map;

public interface Response {

    ResponseDto<Map<String, Object>> toResponse();

    <T> ResponseDto<T> toResponseDto(T result);
}
