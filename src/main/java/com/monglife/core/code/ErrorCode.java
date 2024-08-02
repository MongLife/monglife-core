package com.monglife.core.code;

public interface ErrorCode {
    Integer getHttpStatus();
    String getCode();
    String getMessage();
}
