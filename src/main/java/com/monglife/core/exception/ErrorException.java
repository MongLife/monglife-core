package com.monglife.core.exception;

import com.monglife.core.enums.response.Response;

public interface ErrorException {

    Response getResponse();
}