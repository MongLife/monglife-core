package com.monglife.core.vo.passport;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PassportVo {

    private PassportDataVo data;

    private LocalDateTime createdAt;

    @Builder
    public PassportVo(PassportDataVo data, LocalDateTime createdAt) {
        this.data = data;
        this.createdAt = createdAt;
    }
}