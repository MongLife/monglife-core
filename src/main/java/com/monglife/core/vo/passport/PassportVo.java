package com.monglife.core.vo.passport;

import java.time.LocalDateTime;

public class PassportVo {
    private final PassportDataAccountVo data;
    private final LocalDateTime createdAt;

    public PassportVo(PassportDataAccountVo data, LocalDateTime createdAt) {
        this.data = data;
        this.createdAt = createdAt;
    }

    public PassportDataAccountVo data() {
        return this.getData();
    }

    public LocalDateTime createdAt() {
        return this.getCreatedAt();
    }

    public PassportDataAccountVo getData() {
        return this.data;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public static PassportVoBuilder builder() {
        return new PassportVoBuilder();
    }

    public static class PassportVoBuilder {
        private PassportDataAccountVo data;
        private LocalDateTime createdAt;

        public PassportVoBuilder data(PassportDataAccountVo data) {
            this.data = data;
            return this;
        }

        public PassportVoBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public PassportVo build() {
            return new PassportVo(this.data, this.createdAt);
        }
    }
}