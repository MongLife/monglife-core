package com.monglife.core.exception;

import com.monglife.core.enums.response.Response;
import lombok.Getter;

import java.util.Map;

@Getter
public class ErrorException extends RuntimeException {

    protected Response response;

    protected Map<String, Object> result;
}