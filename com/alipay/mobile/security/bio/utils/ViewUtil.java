package com.alipay.mobile.security.bio.utils;

import android.view.View;

public class ViewUtil {
    public static <T> T findView(View view, int i, Class<T> cls) {
        try {
            return view.findViewById(i);
        } catch (Exception unused) {
            return null;
        }
    }
}
