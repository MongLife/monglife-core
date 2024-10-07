package com.monglife.core.vo.passport;

public class PassportDataVo {

    private PassportDataAccountVo account;
    private PassportDataAppVersionVo appVersion;

    public PassportDataVo() {}

    private PassportDataVo(PassportDataAccountVo account, PassportDataAppVersionVo appVersion) {
        this.account = account;
        this.appVersion = appVersion;
    }

    public PassportDataAccountVo account() {
        return this.getAccount();
    }

    public PassportDataAppVersionVo appVersion() {
        return this.getAppVersion();
    }

    public PassportDataAccountVo getAccount() {
        return this.account;
    }

    public PassportDataAppVersionVo getAppVersion() {
        return this.appVersion;
    }

    public static PassportDataVoBuilder builder() {
        return new PassportDataVoBuilder();
    }

    public static class PassportDataVoBuilder {
        private PassportDataAccountVo account;
        private PassportDataAppVersionVo appVersion;

        public PassportDataVoBuilder account(PassportDataAccountVo account) {
            this.account = account;
            return this;
        }

        public PassportDataVoBuilder appVersion(PassportDataAppVersionVo appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        public PassportDataVo build() {
            return new PassportDataVo(this.account, this.appVersion);
        }
    }
}