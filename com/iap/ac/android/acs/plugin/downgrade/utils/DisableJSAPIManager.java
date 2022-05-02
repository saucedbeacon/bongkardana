package com.iap.ac.android.acs.plugin.downgrade.utils;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class DisableJSAPIManager {
    private static DisableJSAPIManager instance;
    private Map<String, Set<String>> disabledJSAPIMap = new ConcurrentHashMap();
    private final Object lock = new Object();

    public static DisableJSAPIManager getInstance() {
        if (instance == null) {
            synchronized (DisableJSAPIManager.class) {
                if (instance == null) {
                    instance = new DisableJSAPIManager();
                }
            }
        }
        return instance;
    }

    public void putDisableJSAPI(@NonNull String str, @NonNull Set<String> set) {
        synchronized (this.lock) {
            this.disabledJSAPIMap.put(str, new HashSet(set));
        }
    }

    public Set<String> getDisableJSAPI(@NonNull String str) {
        HashSet hashSet;
        synchronized (this.lock) {
            hashSet = new HashSet(this.disabledJSAPIMap.get(str));
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isDisabled(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
            java.lang.String r1 = "apDisableJSAPI"
            boolean r1 = r1.equals(r6)     // Catch:{ all -> 0x002f }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            com.iap.ac.android.acs.plugin.downgrade.router.amcs.APDisableJSAPIConfigManager r5 = com.iap.ac.android.acs.plugin.downgrade.router.amcs.APDisableJSAPIConfigManager.getInstance()     // Catch:{ all -> 0x002f }
            boolean r5 = r5.toggleAPIDisableJSAPI()     // Catch:{ all -> 0x002f }
            if (r5 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r2
        L_0x001b:
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r1 = r4.disabledJSAPIMap     // Catch:{ all -> 0x002f }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ all -> 0x002f }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x002c
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r2
        L_0x002f:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.acs.plugin.downgrade.utils.DisableJSAPIManager.isDisabled(java.lang.String, java.lang.String):boolean");
    }
}
