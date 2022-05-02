package com.alipay.iap.android.f2fpay.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class ConvertUtils {
    public static String getIdentity(String str, String str2) {
        StringBuilder sb = new StringBuilder("");
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static List<Integer> parseQueryIntervals(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            arrayList.add(Integer.valueOf(i));
            return arrayList;
        }
        String[] split = str.split("\\|");
        if (split.length > 0) {
            for (String str2 : split) {
                arrayList.add((TextUtils.isEmpty(str2) || !TextUtils.isDigitsOnly(str2)) ? Integer.valueOf(i) : Integer.valueOf(Integer.parseInt(str2)));
            }
        }
        return arrayList;
    }
}
