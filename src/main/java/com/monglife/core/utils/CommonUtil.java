package com.monglife.core.utils;

import java.util.UUID;

public class CommonUtil {

    /**
     * UUID random ID 발급
     * @return random ID 문자열
     */
    public static String randomId() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
