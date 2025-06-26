package com.monglife.core.dto.event;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SendNotificationDto {

    private Long accountId;

    private String title;

    private String body;

    @Builder
    public SendNotificationDto(Long accountId, String title, String body) {
        this.accountId = accountId;
        this.title = title;
        this.body = body;
    }
}
