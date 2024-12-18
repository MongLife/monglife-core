package com.monglife.core.vo.passport;

public class PassportDataAppVersionVo {

    private String appCode;
    private String buildVersion;

    public PassportDataAppVersionVo() {}

    private PassportDataAppVersionVo(String appCode, String buildVersion) {
        this.appCode = appCode;
        this.buildVersion = buildVersion;
    }

    public String appCode() {
        return this.getAppCode();
    }

    public String buildVersion() {
        return this.getBuildVersion();
    }

    public String getAppCode() {
        return this.appCode;
    }

    public String getBuildVersion() {
        return this.buildVersion;
    }

    public static PassportDataAppVersionVoBuilder builder() {
        return new PassportDataAppVersionVoBuilder();
    }

    public static class PassportDataAppVersionVoBuilder {
        private String appCode;
        private String buildVersion;

        public PassportDataAppVersionVoBuilder appCode(String appCode) {
            this.appCode = appCode;
            return this;
        }

        public PassportDataAppVersionVoBuilder buildVersion(String buildVersion) {
            this.buildVersion = buildVersion;
            return this;
        }

        public PassportDataAppVersionVo build() {
            return new PassportDataAppVersionVo(this.appCode, this.buildVersion);
        }
    }
}