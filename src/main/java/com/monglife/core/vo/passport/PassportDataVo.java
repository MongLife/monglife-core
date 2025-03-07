package com.monglife.core.vo.passport;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PassportDataVo {

    private final PassportDataAccountVo account;
    private final  PassportDataAppVersionVo appVersion;

    @Builder
    private PassportDataVo(PassportDataAccountVo account, PassportDataAppVersionVo appVersion) {
        this.account = account;
        this.appVersion = appVersion;
    }
}