package com.monglife.core.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ResponseDto<T> {

    private String code;

    private String message;

    private Integer httpStatus;

    private T result;

    @Builder
    public ResponseDto(String code, String message, Integer httpStatus ,T result) {
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
        this.result = result;
    }
}
