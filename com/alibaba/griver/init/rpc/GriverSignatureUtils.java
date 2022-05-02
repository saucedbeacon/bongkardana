package com.alibaba.griver.init.rpc;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.iap.ac.android.common.utils.MiscUtils;

public class GriverSignatureUtils {
    private GriverSignatureUtils() {
    }

    public static String getAuthCodeForSecurityGuard(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if ("PROD".equals(str2) && !TextUtils.isEmpty(str3) && TextUtils.equals(str3, a(context))) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(str2.toLowerCase());
            sb.append("_gp");
            return sb.toString();
        } else if (!"PROD".equals(str2) && !"PRE".equals(str2)) {
            return "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("_");
            sb2.append(str2.toLowerCase());
            return sb2.toString();
        }
    }

    @Nullable
    private static String a(@NonNull Context context) {
        try {
            return MiscUtils.md5(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
        } catch (Exception e) {
            GriverLogger.e("GriverSignatureUtils", "getSignMd5Str exception: ".concat(String.valueOf(e)));
            return null;
        }
    }
}
