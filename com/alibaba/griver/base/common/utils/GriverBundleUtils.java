package com.alibaba.griver.base.common.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import id.dana.sendmoney.summary.SummaryActivity;

public class GriverBundleUtils {
    public static boolean getBoolean(Bundle bundle, String str, boolean z, boolean z2) {
        if (!z2) {
            return BundleUtils.getBoolean(bundle, str, z);
        }
        if (bundle != null) {
            try {
                if (!TextUtils.isEmpty(str) && bundle.containsKey(str)) {
                    Object obj = bundle.get(str);
                    if (obj == null) {
                        return false;
                    }
                    if (obj instanceof String) {
                        String trim = ((String) obj).trim();
                        if ("YES".equalsIgnoreCase(trim)) {
                            return true;
                        }
                        if ("NO".equalsIgnoreCase(trim) || "false".equalsIgnoreCase(trim)) {
                            return false;
                        }
                        if (SummaryActivity.CHECKED.equalsIgnoreCase(trim)) {
                            return true;
                        }
                    } else if (obj instanceof Boolean) {
                        return ((Boolean) obj).booleanValue();
                    }
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }
}
