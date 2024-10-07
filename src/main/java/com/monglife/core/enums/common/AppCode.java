package com.monglife.core.enums.common;

public enum AppCode {

    MONGS("몽스"),
    ;

    public final String name;

    AppCode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
