package com.monglife.core.dto.event;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class SendNotificationDto {

    private Long accountId;

    private String appPackageName;

    private String title;

    private String body;

    private Boolean isAppForegroundMessage;

    @Builder
    public SendNotificationDto(Long accountId, String appPackageName, String title, String body, Boolean isAppForegroundMessage) {
        this.accountId = accountId;
        this.appPackageName = appPackageName;
        this.title = title;
        this.body = body;
        this.isAppForegroundMessage = isAppForegroundMessage;
    }
}
