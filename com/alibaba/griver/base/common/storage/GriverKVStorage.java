package com.alibaba.griver.base.common.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.api.common.storage.GriverKVStorageProxy;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class GriverKVStorage {

    /* renamed from: a  reason: collision with root package name */
    private static GriverKVStorageProxy f10223a = new GriverKVSpStorage(GriverEnv.getApplicationContext());

    public static void putString(@Nullable String str, @NonNull String str2, String str3) {
        f10223a.putString(GriverAccount.getUserId(), str, str2, str3);
    }

    public static String getString(@Nullable String str, @NonNull String str2) {
        return f10223a.getString(GriverAccount.getUserId(), str, str2);
    }

    public static void remove(@Nullable String str, @NonNull String str2) {
        f10223a.remove(GriverAccount.getUserId(), str, str2);
    }

    public static void clear(String str) {
        f10223a.clear(GriverAccount.getUserId(), str);
    }

    public static void setStorageProxy(GriverKVStorageProxy griverKVStorageProxy) {
        if (griverKVStorageProxy != null) {
            f10223a = griverKVStorageProxy;
        } else {
            GriverLogger.e("GriverKVStorage", "should not set null proxy to GriverKVStorage");
        }
    }
}
