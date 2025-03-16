package com.monglife.core.vo.passport;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PassportDataAccountVo {

    private Long accountId;

    private String deviceId;

    private String email;

    private String name;

    private String role;

    @Builder
    public PassportDataAccountVo(Long accountId, String deviceId, String email, String name, String role) {
        this.accountId = accountId;
        this.deviceId = deviceId;
        this.email = email;
        this.name = name;
        this.role = role;
    }
}