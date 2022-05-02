package com.iap.ac.android.instance;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.utils.MiscUtils;
import com.iap.ac.android.instance.a.a;
import com.iap.ac.android.instance.a.b;
import java.nio.ByteBuffer;
import java.util.UUID;

public class IAPInstanceInfo {
    @NonNull
    public static String instanceId(@NonNull Context context) {
        String str;
        if (TextUtils.isEmpty(a.f9718a)) {
            String a2 = b.a(context);
            a.f9718a = a2;
            if (TextUtils.isEmpty(a2)) {
                UUID randomUUID = UUID.randomUUID();
                UUID randomUUID2 = UUID.randomUUID();
                ByteBuffer wrap = ByteBuffer.wrap(new byte[32]);
                wrap.putLong(randomUUID.getMostSignificantBits());
                wrap.putLong(randomUUID.getLeastSignificantBits());
                wrap.putLong(randomUUID2.getMostSignificantBits());
                wrap.putLong(randomUUID2.getLeastSignificantBits());
                byte[] array = wrap.array();
                try {
                    str = a.a(array);
                } catch (Throwable th) {
                    ACLog.w("InstanceIdImpl", "generateInstanceIdFromSeed error: ".concat(String.valueOf(th)));
                    str = MiscUtils.md5(array);
                }
                a.f9718a = str;
                try {
                    context.getSharedPreferences("acInstanceInfo", 0).edit().putString("iapInstanceId", str).apply();
                } catch (Throwable th2) {
                    ACLog.w("com.iap.ac.android.instance.a.b", "saveInstanceIdToSp error: ".concat(String.valueOf(th2)));
                }
            }
        }
        return a.f9718a;
    }

    public static void setInstanceId(@Nullable String str) {
        ACLog.i("InstanceIdImpl", "setInstanceId: ".concat(String.valueOf(str)));
        a.f9718a = str;
    }

    @NonNull
    public static String tid(@NonNull Context context) {
        try {
            return String.format("%s_%s", new Object[]{instanceId(context), MiscUtils.md5(context.getPackageName()).substring(0, 16).toUpperCase()});
        } catch (Throwable th) {
            ACLog.e("IAPInstanceInfo", "generate tid error: ".concat(String.valueOf(th)));
            return "";
        }
    }
}
