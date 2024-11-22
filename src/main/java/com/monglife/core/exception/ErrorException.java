package com.monglife.core.exception;

import com.monglife.core.enums.response.Response;

import java.util.Map;

public class ErrorException extends RuntimeException {

    private final Response response;

    private final Map<String, Object> result;

    public ErrorException(Response response, Map<String, Object> result) {
        this.response = response;
        this.result = result;
    }

    public Response getResponse() {
        return this.response;
    }

    public Map<String, Object> getResult() {
        return this.result;
    }
}