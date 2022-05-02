package com.iap.ac.android.rpc.utils;

import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class RpcUtils {
    @NonNull
    public static String logTag(@NonNull String str) {
        return "Rpc-".concat(String.valueOf(str));
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @NonNull
    public static String formatForUrlEncode(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("operationType", str);
        builder.appendQueryParameter("requestData", str2);
        builder.appendQueryParameter("ts", str3);
        if (!TextUtils.isEmpty(str4)) {
            builder.appendQueryParameter("sign", str4);
        }
        String obj = builder.toString();
        return obj.startsWith("?") ? obj.substring(1) : obj;
    }
}
