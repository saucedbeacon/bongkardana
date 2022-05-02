package com.alibaba.griver.base.common.storage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.api.common.storage.GriverKVStorageProxy;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class GriverKVSpStorage implements GriverKVStorageProxy {

    /* renamed from: a  reason: collision with root package name */
    private Context f10222a;

    public GriverKVSpStorage(Context context) {
        this.f10222a = context;
    }

    public void putString(@Nullable String str, @Nullable String str2, @NonNull String str3, String str4) {
        Context context = this.f10222a;
        if (context == null) {
            GriverLogger.w("GriverKVSpStorage", "context is null, can not store data", (Throwable) null);
        } else {
            context.getSharedPreferences("Griver-".concat(String.valueOf(str2)), 4).edit().putString(a(str, str3), str4).commit();
        }
    }

    public String getString(@Nullable String str, @Nullable String str2, @NonNull String str3) {
        Context context = this.f10222a;
        if (context != null) {
            return context.getSharedPreferences("Griver-".concat(String.valueOf(str2)), 4).getString(a(str, str3), "");
        }
        GriverLogger.w("GriverKVSpStorage", "context is null, can not get data", (Throwable) null);
        return null;
    }

    public void remove(@Nullable String str, @Nullable String str2, @NonNull String str3) {
        Context context = this.f10222a;
        if (context == null) {
            GriverLogger.w("GriverKVSpStorage", "context is null, can not remove data", (Throwable) null);
        } else {
            context.getSharedPreferences("Griver-".concat(String.valueOf(str2)), 4).edit().remove(a(str, str3)).commit();
        }
    }

    public void clear(String str, String str2) {
        Context context = this.f10222a;
        if (context == null) {
            GriverLogger.w("GriverKVSpStorage", "context is null, can not clear data", (Throwable) null);
        } else {
            context.getSharedPreferences("Griver-".concat(String.valueOf(str2)), 4).edit().clear().commit();
        }
    }

    private String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        return sb.toString();
    }
}
