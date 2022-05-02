package com.iap.ac.android.instance.a;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;

public class b {
    @Nullable
    public static String a(@NonNull Context context) {
        try {
            String string = context.getSharedPreferences("acInstanceInfo", 0).getString("iapInstanceId", "");
            ACLog.d("com.iap.ac.android.instance.a.b", "Get instance id from sharedPreferences, instance id: ".concat(String.valueOf(string)));
            return string;
        } catch (Throwable unused) {
            return null;
        }
    }
}
