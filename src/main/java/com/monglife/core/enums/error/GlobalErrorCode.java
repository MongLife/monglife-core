package com.monglife.core.enums.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GlobalErrorCode implements ErrorCode {

    GLOBAL_UNKNOWN("GLOBAL-UNKNOWN-000", "알 수 없는 에러"),
    ;

    private final String code;

    private final String reason;
}
