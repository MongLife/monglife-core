package com.monglife.core.vo.passport;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PassportDataAppVersionVo {

    private final String appPackageName;

    private final String buildVersion;

    @Builder
    private PassportDataAppVersionVo(String appPackageName, String buildVersion) {
        this.appPackageName = appPackageName;
        this.buildVersion = buildVersion;
    }
}