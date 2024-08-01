package com.monglife.core.vo.passport;

import java.time.LocalDateTime;

public class PassportVo {
    private final PassportDataAccountVo data;
    private final String integrity;
    private final LocalDateTime createdAt;

    public PassportVo(PassportDataAccountVo data, String integrity, LocalDateTime createdAt) {
        this.data = data;
        this.integrity = integrity;
        this.createdAt = createdAt;
    }

    public PassportDataAccountVo data() {
        return data;
    }

    public String integrity() {
        return integrity;
    }

    public LocalDateTime createdAt() {
        return createdAt;
    }

    public static PassportVoBuilder builder() {
        return new PassportVoBuilder();
    }

    public static class PassportVoBuilder {
        private PassportDataAccountVo data;
        private String integrity;
        private LocalDateTime createdAt;

        public PassportVoBuilder data(PassportDataAccountVo data) {
            this.data = data;
            return this;
        }

        public PassportVoBuilder integrity(String integrity) {
            this.integrity = integrity;
            return this;
        }

        public PassportVoBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public PassportVo build() {
            return new PassportVo(this.data, this.integrity, this.createdAt);
        }
    }
}