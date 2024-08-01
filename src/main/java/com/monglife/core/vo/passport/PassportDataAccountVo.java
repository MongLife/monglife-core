package com.monglife.core.vo.passport;

public class PassportDataAccountVo {
    private final Long id;
    private final String deviceId;
    private final String email;
    private final String name;
    private final String role;

    private PassportDataAccountVo(Long id, String deviceId, String email, String name, String role) {
        this.id = id;
        this.deviceId = deviceId;
        this.email = email;
        this.name = name;
        this.role = role;
    }

    public Long id() {
        return id;
    }

    public String deviceId() {
        return deviceId;
    }

    public String email() {
        return email;
    }

    public String name() {
        return name;
    }

    public String role() {
        return role;
    }

    public static PassportDataAccountVoBuilder builder() {
        return new PassportDataAccountVoBuilder();
    }

    public static class PassportDataAccountVoBuilder {
        private Long id;
        private String deviceId;
        private String email;
        private String name;
        private String role;

        public PassportDataAccountVoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public PassportDataAccountVoBuilder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public PassportDataAccountVoBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PassportDataAccountVoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PassportDataAccountVoBuilder role(String role) {
            this.role = role;
            return this;
        }

        public PassportDataAccountVo build() {
            return new PassportDataAccountVo(this.id, this.deviceId, this.email, this.name, this.role);
        }
    }
}