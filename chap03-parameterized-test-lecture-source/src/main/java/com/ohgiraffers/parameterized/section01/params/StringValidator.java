package com.ohgiraffers.parameterized.section01.params;

public class StringValidator {
    public static boolean isNull(String str) {
        return str == null;
    }

    public static boolean isEmpty(String str) {
        return "".equals(str);
    }

    public static boolean isBlank(String str) {
        return str == null || "".equals(str) || " ".equals(str);
    }
}
