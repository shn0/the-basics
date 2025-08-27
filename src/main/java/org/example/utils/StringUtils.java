package org.example.utils;
public class StringUtils {
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
