package org.example.javatests.util;

public class StringUtil {

    public static String repeat(String str, int items) {
        String result = "";

        for (int i = 0; i < items; i++) {
            result += str;
        }

        return result;
    }

}
