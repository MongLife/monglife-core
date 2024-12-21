package com.monglife.core.vo.passport;

public class PassportDataAppVersionVo {

    private String appPackageName;
    private String buildVersion;

    public PassportDataAppVersionVo() {}

    private PassportDataAppVersionVo(String appPackageName, String buildVersion) {
        this.appPackageName = appPackageName;
        this.buildVersion = buildVersion;
    }

    public String appPackageName() {
        return this.getAppPackageName();
    }

    public String buildVersion() {
        return this.getBuildVersion();
    }

    public String getAppPackageName() {
        return this.appPackageName;
    }

    public String getBuildVersion() {
        return this.buildVersion;
    }

    public static PassportDataAppVersionVoBuilder builder() {
        return new PassportDataAppVersionVoBuilder();
    }

    public static class PassportDataAppVersionVoBuilder {
        private String appPackageName;
        private String buildVersion;

        public PassportDataAppVersionVoBuilder appPackageName(String appPackageName) {
            this.appPackageName = appPackageName;
            return this;
        }

        public PassportDataAppVersionVoBuilder buildVersion(String buildVersion) {
            this.buildVersion = buildVersion;
            return this;
        }

        public PassportDataAppVersionVo build() {
            return new PassportDataAppVersionVo(this.appPackageName, this.buildVersion);
        }
    }
}