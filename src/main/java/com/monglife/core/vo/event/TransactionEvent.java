package com.monglife.core.vo.event;

import com.monglife.core.utils.CommonUtil;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class TransactionEvent<T> {

    private final String transactionId;

    private final LocalDateTime createdAt;

    private final String topic;

    private final T data;

    @Builder
    public TransactionEvent(String topic, T data) {
        this.transactionId = CommonUtil.randomId();
        this.createdAt = LocalDateTime.now();
        this.topic = topic;
        this.data = data;
    }
}
