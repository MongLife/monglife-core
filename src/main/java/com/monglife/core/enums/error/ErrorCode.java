package com.monglife.core.enums.error;

public interface ErrorCode {
    Integer getHttpStatus();
    String getCode();
    String getMessage();
}
