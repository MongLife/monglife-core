package com.monglife.core.exception;

import com.monglife.core.enums.response.Response;

import java.util.Map;

public interface ErrorException {

    Response getResponse();

    Map<String, Object> getResult();
}