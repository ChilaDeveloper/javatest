package org.example.javatests.util;

public class StringUtil {

    public static String repeat(String str, int items) {
        String result = "";

        if (items < 0) {
            throw new IllegalArgumentException("negative times not allowed");
        }

        for (int i = 0; i < items; i++) {
            result += str;
        }

        return result;
    }

}
