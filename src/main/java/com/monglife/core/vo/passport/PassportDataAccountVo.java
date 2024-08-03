package com.monglife.core.vo.passport;

public class PassportDataAccountVo {
    private Long accountId;
    private String deviceId;
    private String email;
    private String name;
    private String role;

    public PassportDataAccountVo() {}

    private PassportDataAccountVo(Long accountId, String deviceId, String email, String name, String role) {
        this.accountId = accountId;
        this.deviceId = deviceId;
        this.email = email;
        this.name = name;
        this.role = role;
    }

    public Long accountId() {
        return this.getAccountId();
    }

    public String deviceId() {
        return this.getDeviceId();
    }

    public String email() {
        return this.getEmail();
    }

    public String name() {
        return this.getName();
    }

    public String role() {
        return this.getRole();
    }

    public Long getAccountId() {
        return accountId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public static PassportDataAccountVoBuilder builder() {
        return new PassportDataAccountVoBuilder();
    }

    public static class PassportDataAccountVoBuilder {
        private Long accountId;
        private String deviceId;
        private String email;
        private String name;
        private String role;

        public PassportDataAccountVoBuilder accountId(Long id) {
            this.accountId = id;
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
            return new PassportDataAccountVo(this.accountId, this.deviceId, this.email, this.name, this.role);
        }
    }
}