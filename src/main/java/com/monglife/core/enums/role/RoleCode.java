package com.monglife.core.enums.role;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoleCode {

    ANONYMOUSE("ANONYMOUSE", "비회원"),
    NORMAL("NORMAL", "일반회원"),
    SUBSCRIBER("SUBSCRIBER", "구독회원"),
    ADMIN("ADMIN", "관리자"),
    ;

    private final String role;

    private final String name;
}
