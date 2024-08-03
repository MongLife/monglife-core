package com.monglife.core.vo.passport;

import java.time.LocalDateTime;

public class PassportVo {
    private PassportDataVo data;
    private LocalDateTime createdAt;

    public PassportVo() {}

    public PassportVo(PassportDataVo data, LocalDateTime createdAt) {
        this.data = data;
        this.createdAt = createdAt;
    }

    public PassportDataVo data() {
        return this.getData();
    }

    public LocalDateTime createdAt() {
        return this.getCreatedAt();
    }

    public PassportDataVo getData() {
        return this.data;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public static PassportVoBuilder builder() {
        return new PassportVoBuilder();
    }

    public static class PassportVoBuilder {
        private PassportDataVo data;
        private LocalDateTime createdAt;

        public PassportVoBuilder data(PassportDataVo data) {
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