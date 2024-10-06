package com.monglife.core.enums.role;

public enum RoleCode {
    NORMAL("NORMAL", "일반회원"),
    ADMIN("ADMIN", "관리자"),
    ;

    private final String role;
    private final String name;

    RoleCode(String role, String name) {
        this.role = role;
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }
}
