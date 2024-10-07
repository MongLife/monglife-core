package com.monglife.core.enums.common;

public enum FoodCode {

    STAR_CANDY("FD000","FD", "별사탕"),
    APPLE     ("FD010","FD", "사과"),
    KIM_BAB   ("FD011","FD", "삼각김밥"),
    SANDWICH  ("FD012","FD", "샌드위치"),
    PIZZA     ("FD020","FD", "피자"),
    CHICKEN   ("FD021","FD", "치킨"),
    STAKE     ("FD022","FD", "스테이크"),
    IN_SAM    ("FD030","FD", "인삼"),
    CHOCOLATE ("SN000","SN", "초콜릿"),
    CANDY     ("SN001","SN", "사탕"),
    COLA      ("SN002","SN", "콜라"),
    COOKIE    ("SN010","SN", "쿠키"),
    CAKE      ("SN011","SN", "케이크"),
    FRY       ("SN012","SN", "감자튀김"),
    ICE_CREAM ("SN013","SN", "아이스크림")
    ;

    public final String code;
    public final String groupCode;
    public final String name;

    FoodCode(String code, String groupCode, String name) {
        this.code = code;
        this.groupCode = groupCode;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public String getName() {
        return name;
    }
}
