package com.monglife.core.enums.response;

import com.monglife.core.dto.response.PageResponseDto;
import com.monglife.core.dto.response.ResponseDto;

import java.util.Collections;
import java.util.Map;

public interface Response {

    Integer getHttpStatus();

    String getCode();

    String getMessage();

    default ResponseDto<Map<String, Object>> toResponseDto() {
        return new ResponseDto<>(getCode(), getMessage(), getHttpStatus(), Collections.emptyMap());
    }

    default <T> ResponseDto<T> toResponseDto(T result) {
        return new ResponseDto<>(getCode(), getMessage(), getHttpStatus(), result);
    }

    default <T> PageResponseDto<T> toPageResponseDto(T result, int page, int size, int totalPage, boolean isLastPage) {
        return new PageResponseDto<>(getCode(), getMessage(), getHttpStatus(), result, page, size, totalPage, isLastPage);
    }
}
