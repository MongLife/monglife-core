package com.monglife.core.vo.passport;

public class PassportDataVo {

    private PassportDataAccountVo account;

    public PassportDataVo() {}

    private PassportDataVo(PassportDataAccountVo account) {
        this.account = account;
    }

    public PassportDataAccountVo account() {
        return this.getAccount();
    }

    public PassportDataAccountVo getAccount() {
        return account;
    }

    public static PassportDataVoBuilder builder() {
        return new PassportDataVoBuilder();
    }

    public static class PassportDataVoBuilder {
        private PassportDataAccountVo account;

        public PassportDataVoBuilder account(PassportDataAccountVo account) {
            this.account = account;
            return this;
        }

        public PassportDataVo build() {
            return new PassportDataVo(this.account);
        }
    }
}