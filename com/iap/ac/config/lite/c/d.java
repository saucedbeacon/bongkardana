package com.iap.ac.config.lite.c;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.config.lite.ConfigOverwriteInterceptor;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private List<ConfigOverwriteInterceptor> f9798a = new LinkedList();
    private Map<String, List<ConfigOverwriteInterceptor>> b = new HashMap();

    private boolean b(@Nullable String str) {
        return TextUtils.isEmpty(str) || TextUtils.equals(str, "config");
    }

    public synchronized void a(@Nullable String str, ConfigOverwriteInterceptor configOverwriteInterceptor) {
        if (configOverwriteInterceptor != null) {
            if (b(str)) {
                this.f9798a.add(configOverwriteInterceptor);
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

    public synchronized void a(ConfigOverwriteInterceptor configOverwriteInterceptor) {
        this.f9798a.remove(configOverwriteInterceptor);
        for (List<ConfigOverwriteInterceptor> remove : this.b.values()) {
            remove.remove(configOverwriteInterceptor);
        }
    }

    public synchronized void a() {
        this.f9798a.clear();
        this.b.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(@androidx.annotation.Nullable java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r6 == 0) goto L_0x000b
            int r1 = r6.length()     // Catch:{ all -> 0x0009 }
            goto L_0x000c
        L_0x0009:
            r6 = move-exception
            goto L_0x0044
        L_0x000b:
            r1 = 0
        L_0x000c:
            int r2 = o.dispatchOnCancelled.setMax(r1)     // Catch:{ all -> 0x0009 }
            r3 = 1
            if (r1 == r2) goto L_0x0021
            o.onCanceled r4 = new o.onCanceled     // Catch:{ all -> 0x0009 }
            r4.<init>(r1, r2, r3)     // Catch:{ all -> 0x0009 }
            r1 = 461942901(0x1b88b075, float:2.2613345E-22)
            o.onCancelLoad.setMax(r1, r4)     // Catch:{ all -> 0x0009 }
            o.onCancelLoad.getMin(r1, r4)     // Catch:{ all -> 0x0009 }
        L_0x0021:
            boolean r1 = r5.b(r6)     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0030
            java.util.List<com.iap.ac.config.lite.ConfigOverwriteInterceptor> r6 = r5.f9798a     // Catch:{ all -> 0x0009 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0009 }
            r6 = r6 ^ r3
            monitor-exit(r5)
            return r6
        L_0x0030:
            java.util.Map<java.lang.String, java.util.List<com.iap.ac.config.lite.ConfigOverwriteInterceptor>> r1 = r5.b     // Catch:{ all -> 0x0009 }
            java.lang.Object r6 = r1.get(r6)     // Catch:{ all -> 0x0009 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0009 }
            if (r6 == 0) goto L_0x0042
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0009 }
            if (r6 != 0) goto L_0x0042
            monitor-exit(r5)
            return r3
        L_0x0042:
            monitor-exit(r5)
            return r0
        L_0x0044:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.config.lite.c.d.a(java.lang.String):boolean");
    }

    public synchronized boolean a(@Nullable String str, @NonNull String str2, @NonNull Object obj, @NonNull Object obj2) {
        List<ConfigOverwriteInterceptor> list;
        if (b(str)) {
            str = null;
            list = this.f9798a;
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
