package com.monglife.core.vo.passport;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PassportDataAppVersionVo {

    private String appPackageName;

    private String buildVersion;

    @Builder
    public PassportDataAppVersionVo(String appPackageName, String buildVersion) {
        this.appPackageName = appPackageName;
        this.buildVersion = buildVersion;
    }
}