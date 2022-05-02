package com.iap.ac.android.loglite.utils;

public class PageUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f11059a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};

    public static String a(Object obj) {
        if (obj instanceof String) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj.toString());
            sb.append(obj.hashCode());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj.getClass().getName());
        sb2.append(obj.hashCode());
        return sb2.toString();
    }
}
