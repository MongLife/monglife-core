package com.monglife.core.code.error;

public interface ErrorCode {
    Integer getHttpStatus();
    String getCode();
    String getMessage();
}
