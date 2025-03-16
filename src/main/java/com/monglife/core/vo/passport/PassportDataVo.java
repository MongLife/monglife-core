package com.monglife.core.vo.passport;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PassportDataVo {

    private PassportDataAccountVo account;
    private  PassportDataAppVersionVo appVersion;

    @Builder
    public PassportDataVo(PassportDataAccountVo account, PassportDataAppVersionVo appVersion) {
        this.account = account;
        this.appVersion = appVersion;
    }
}