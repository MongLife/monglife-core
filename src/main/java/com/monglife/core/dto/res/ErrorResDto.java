package com.monglife.core.dto.res;

import com.monglife.core.code.ErrorCode;

public class ErrorResDto {
    private String code;
    private String message;

    public static ErrorResDto of(ErrorCode errorCode) {
        return ErrorResDto.builder()
                .code(errorCode.getCode())
                .message(errorCode.getMessage())
                .build();
    }

    private ErrorResDto(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ErrorResDtoBuilder builder() {
        return new ErrorResDtoBuilder();
    }

    public static class ErrorResDtoBuilder {
        private String code;
        private String message;

        public ErrorResDtoBuilder code(String code) {
            this.code = code;
            return this;
        }

        public ErrorResDtoBuilder message(String message) {
            this.message = message;
            return this;
        }

        public ErrorResDto build() {
            return new ErrorResDto(this.code, this.message);
        }
    }
}

