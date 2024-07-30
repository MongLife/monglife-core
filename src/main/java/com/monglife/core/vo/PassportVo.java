package com.monglife.core.vo;

public class PassportVo {
    private Long id;
    private String deviceId;
    private String email;
    private String name;
    private String role;
    private String integrity;

    private PassportVo(Long id, String deviceId, String email, String name, String role, String integrity) {
        this.id = id;
        this.deviceId = deviceId;
        this.email = email;
        this.name = name;
        this.role = role;
        this.integrity = integrity;
    }

    public static PassportVoBuilder builder() {
        return new PassportVoBuilder();
    }

    public static class PassportVoBuilder {
        private Long id;
        private String deviceId;
        private String email;
        private String name;
        private String role;
        private String integrity;

        public PassportVoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public PassportVoBuilder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public PassportVoBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PassportVoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PassportVoBuilder role(String role) {
            this.role = role;
            return this;
        }

        public PassportVoBuilder integrity(String integrity) {
            this.integrity = integrity;
            return this;
        }

        public PassportVo build() {
            return new PassportVo(this.id, this.deviceId, this.email, this.name, this.role, this.integrity);
        }
    }
}