package com.alibaba.griver.ui.ant.theme;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class AUThemeManager {
    public static final String THEMEKEY_DEFAULT = "defalue";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, AUAbsTheme> f10570a;
    private static String b = THEMEKEY_DEFAULT;

    static {
        HashMap hashMap = new HashMap();
        f10570a = hashMap;
        hashMap.put(THEMEKEY_DEFAULT, AUDefaultTheme.getInstence());
    }

    public static AUAbsTheme getTheme(String str) {
        if (TextUtils.isEmpty(str) || f10570a.containsKey(str)) {
            str = b;
        }
        return f10570a.get(str);
    }

    public static AUAbsTheme getCurrentTheme() {
        return getTheme(b);
    }
}
