package com.monglife.core.vo.passport;

public class PassportDataAppVersionVo {

    private String packageName;
    private String buildVersion;

    public PassportDataAppVersionVo() {}

    private PassportDataAppVersionVo(String packageName, String buildVersion) {
        this.packageName = packageName;
        this.buildVersion = buildVersion;
    }

    public String packageName() {
        return this.getPackageName();
    }

    public String buildVersion() {
        return this.getBuildVersion();
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getBuildVersion() {
        return this.buildVersion;
    }

    public static PassportDataAppVersionVoBuilder builder() {
        return new PassportDataAppVersionVoBuilder();
    }

    public static class PassportDataAppVersionVoBuilder {
        private String packageName;
        private String buildVersion;

        public PassportDataAppVersionVoBuilder packageName(String packageName) {
            this.packageName = packageName;
            return this;
        }

        public PassportDataAppVersionVoBuilder buildVersion(String buildVersion) {
            this.buildVersion = buildVersion;
            return this;
        }

        public PassportDataAppVersionVo build() {
            return new PassportDataAppVersionVo(this.packageName, this.buildVersion);
        }
    }
}