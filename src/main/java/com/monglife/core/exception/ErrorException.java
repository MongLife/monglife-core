package com.monglife.core.exception;

import com.monglife.core.enums.error.ErrorCode;
import com.monglife.core.enums.response.Response;
import lombok.Getter;

import java.util.Map;

@Getter
public class ErrorException extends RuntimeException {

    protected ErrorCode errorCode;

    protected Map<String, Object> result;
}