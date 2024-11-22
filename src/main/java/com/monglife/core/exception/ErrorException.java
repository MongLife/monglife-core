package com.monglife.core.exception;

import com.monglife.core.enums.response.Response;

import java.util.Map;

public class ErrorException extends RuntimeException {

    protected Response response;

    protected Map<String, Object> result;

    public Response getResponse() {
        return this.response;
    }

    public Map<String, Object> getResult() {
        return this.result;
    }
}