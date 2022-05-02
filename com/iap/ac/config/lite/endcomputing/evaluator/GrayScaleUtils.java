package com.iap.ac.config.lite.endcomputing.evaluator;

import android.text.TextUtils;
import com.iap.ac.config.lite.endcomputing.audience.BaseAudience;
import com.iap.ac.config.lite.endcomputing.audience.BaseAudienceSets;
import com.iap.ac.config.lite.endcomputing.audience.TimeBaseAudience;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GrayScaleUtils {
    private static final String BASE64_ASCII = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ+/";
    private static final int PERCENT_MAX = 100;

    private static boolean a(BaseAudience baseAudience, Set<BaseAudience> set) {
        if (baseAudience == null || set.contains(baseAudience)) {
            return false;
        }
        set.add(baseAudience);
        if (!(baseAudience instanceof BaseAudienceSets)) {
            return baseAudience instanceof TimeBaseAudience;
        }
        List<BaseAudience> subAudiences = ((BaseAudienceSets) baseAudience).getSubAudiences();
        if (subAudiences != null) {
            for (BaseAudience a2 : subAudiences) {
                if (a(a2, set)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long compareVersion(String str, String str2) {
        String[] spitString = spitString(str);
        String[] spitString2 = spitString(str2);
        if (spitString == null || spitString2 == null) {
            throw new IllegalArgumentException("v1 or v2 should not be null");
        } else if (spitString.length >= spitString2.length) {
            for (int i = 0; i < spitString.length; i++) {
                long parseLong = Long.parseLong(spitString[i]);
                long parseLong2 = Long.parseLong(spitString2[i]);
                if (parseLong != parseLong2) {
                    return parseLong - parseLong2;
                }
            }
            return 0;
        } else {
            throw new IllegalArgumentException("v1 or v2 should not be the same length");
        }
    }

    public static long compareVersionIgnoreLength(String str, String str2) {
        String[] spitString = spitString(str);
        String[] spitString2 = spitString(str2);
        if (spitString.length != spitString2.length) {
            boolean z = spitString.length > spitString2.length;
            StringBuilder sb = new StringBuilder(z ? str2 : str);
            int abs = Math.abs(spitString.length - spitString2.length);
            for (int i = 0; i < abs; i++) {
                sb.append(".0");
            }
            if (z) {
                str2 = sb.toString();
            } else {
                str = sb.toString();
            }
        }
        return compareVersion(str, str2);
    }

    public static int getBase64Percent(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 2) {
            return 100;
        }
        int i = 0;
        char charAt = str.subSequence(str.length() - 2, str.length() - 1).charAt(0);
        char charAt2 = str.subSequence(str.length() - 1, str.length()).charAt(0);
        int indexOf = BASE64_ASCII.indexOf(charAt) >= 0 ? BASE64_ASCII.indexOf(charAt) : 0;
        if (BASE64_ASCII.indexOf(charAt2) >= 0) {
            i = BASE64_ASCII.indexOf(charAt2);
        }
        return ((indexOf * 64) + i) % 100;
    }

    public static boolean isDeviceHitted(Integer num, String str) {
        return num != null && getBase64Percent(str) < num.intValue();
    }

    public static boolean isTimeRelatedAudience(BaseAudience baseAudience) {
        return a(baseAudience, new HashSet());
    }

    public static boolean limitIn(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return false;
        }
        String trim = str3.trim();
        if (!TextUtils.isEmpty(str) && compareVersionIgnoreLength(trim, str) < 0) {
            return false;
        }
        if (TextUtils.isEmpty(str2) || compareVersionIgnoreLength(trim, str2) <= 0) {
            return true;
        }
        return false;
    }

    public static String[] spitString(String str) {
        if (str == null) {
            return null;
        }
        return str.split("\\.");
    }
}
