package com.monglife.core.vo.passport;

public class PassportDataVo {
    private final PassportDataVo account;

    private PassportDataVo(PassportDataVo account) {
        this.account = account;
    }

    public PassportDataVo account() {
        return account;
    }

    public static PassportDataVoBuilder builder() {
        return new PassportDataVoBuilder();
    }

    public static class PassportDataVoBuilder {
        private PassportDataVo account;

        public PassportDataVoBuilder account(PassportDataVo account) {
            this.account = account;
            return this;
        }

        public PassportDataVo build() {
            return new PassportDataVo(this.account);
        }
    }
}