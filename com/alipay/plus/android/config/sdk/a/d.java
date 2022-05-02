package com.alipay.plus.android.config.sdk.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.plus.android.config.sdk.ConfigOverwriteInterceptor;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private List<ConfigOverwriteInterceptor> f9512a = new LinkedList();
    private Map<String, List<ConfigOverwriteInterceptor>> b = new HashMap();

    private boolean b(@Nullable String str) {
        return TextUtils.isEmpty(str) || TextUtils.equals(str, "config");
    }

    public synchronized void a() {
        this.f9512a.clear();
        this.b.clear();
    }

    public synchronized void a(ConfigOverwriteInterceptor configOverwriteInterceptor) {
        this.f9512a.remove(configOverwriteInterceptor);
        for (List<ConfigOverwriteInterceptor> remove : this.b.values()) {
            remove.remove(configOverwriteInterceptor);
        }
    }

    public synchronized void a(@Nullable String str, ConfigOverwriteInterceptor configOverwriteInterceptor) {
        if (configOverwriteInterceptor != null) {
            if (b(str)) {
                this.f9512a.add(configOverwriteInterceptor);
                return;
            }
            List list = this.b.get(str);
            if (list == null) {
                list = new LinkedList();
                this.b.put(str, list);
            }
            list.add(configOverwriteInterceptor);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r3.f9512a.isEmpty() != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(@androidx.annotation.Nullable java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.b(r4)     // Catch:{ all -> 0x0028 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0014
            java.util.List<com.alipay.plus.android.config.sdk.ConfigOverwriteInterceptor> r4 = r3.f9512a     // Catch:{ all -> 0x0028 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)
            if (r4 != 0) goto L_0x0013
            return r1
        L_0x0013:
            return r2
        L_0x0014:
            java.util.Map<java.lang.String, java.util.List<com.alipay.plus.android.config.sdk.ConfigOverwriteInterceptor>> r0 = r3.b     // Catch:{ all -> 0x0028 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x0028 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0028 }
            if (r4 == 0) goto L_0x0026
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0028 }
            if (r4 != 0) goto L_0x0026
            monitor-exit(r3)
            return r1
        L_0x0026:
            monitor-exit(r3)
            return r2
        L_0x0028:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.plus.android.config.sdk.a.d.a(java.lang.String):boolean");
    }

    public synchronized boolean a(@Nullable String str, @NonNull String str2, @NonNull Object obj, @NonNull Object obj2) {
        List<ConfigOverwriteInterceptor> list;
        if (b(str)) {
            str = null;
            list = this.f9512a;
        } else {
            list = this.b.get(str);
        }
        if (list == null) {
            return true;
        }
        for (ConfigOverwriteInterceptor shouldUpdateConfig : list) {
            if (!shouldUpdateConfig.shouldUpdateConfig(str, str2, obj, obj2)) {
                return false;
            }
        }
        return true;
    }
}
