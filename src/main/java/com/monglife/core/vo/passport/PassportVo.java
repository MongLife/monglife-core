package com.monglife.core.vo.passport;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PassportVo {

    private final PassportDataVo data;

    private final LocalDateTime createdAt;

    @Builder
    public PassportVo(PassportDataVo data, LocalDateTime createdAt) {
        this.data = data;
        this.createdAt = createdAt;
    }
}