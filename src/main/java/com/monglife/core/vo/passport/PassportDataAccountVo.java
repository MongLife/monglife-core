package com.monglife.core.vo.passport;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PassportDataAccountVo {

    private final Long accountId;

    private final String deviceId;

    private final String email;

    private final String name;

    private final String role;

    @Builder
    private PassportDataAccountVo(Long accountId, String deviceId, String email, String name, String role) {
        this.accountId = accountId;
        this.deviceId = deviceId;
        this.email = email;
        this.name = name;
        this.role = role;
    }
}