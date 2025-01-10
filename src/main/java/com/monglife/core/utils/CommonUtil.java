package com.monglife.core.utils;

import java.util.UUID;

public class CommonUtil {

    public static String randomId() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
