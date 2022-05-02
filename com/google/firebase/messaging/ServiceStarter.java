package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alibaba.wireless.security.SecExceptionCode;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public class ServiceStarter {
    @KeepForSdk
    public static final int ERROR_UNKNOWN = 500;
    public static final int SUCCESS = -1;
    private static ServiceStarter instance;
    @GuardedBy("this")
    @Nullable
    private String firebaseMessagingServiceClassName = null;
    private Boolean hasAccessNetworkStatePermission = null;
    private Boolean hasWakeLockPermission = null;
    private final Queue<Intent> messagingEvents = new ArrayDeque();

    private ServiceStarter() {
    }

    private int doStartService(Context context, Intent intent) {
        ComponentName componentName;
        String resolveServiceClassName = resolveServiceClassName(context, intent);
        if (resolveServiceClassName != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                int length = resolveServiceClassName.length();
            }
            intent.setClassName(context.getPackageName(), resolveServiceClassName);
        }
        try {
            if (hasWakeLockPermission(context)) {
                componentName = WakeLockHolder.startWakefulService(context, intent);
            } else {
                componentName = context.startService(intent);
            }
            return componentName == null ? 404 : -1;
        } catch (SecurityException unused) {
            return 401;
        } catch (IllegalStateException unused2) {
            return SecExceptionCode.SEC_ERROR_DYN_ENC_NO_MEMORY;
        }
    }

    static synchronized ServiceStarter getInstance() {
        ServiceStarter serviceStarter;
        synchronized (ServiceStarter.class) {
            if (instance == null) {
                instance = new ServiceStarter();
            }
            serviceStarter = instance;
        }
        return serviceStarter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.String resolveServiceClassName(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.firebaseMessagingServiceClassName     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return r0
        L_0x0007:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ all -> 0x0067 }
            r1 = 0
            android.content.pm.ResolveInfo r5 = r0.resolveService(r5, r1)     // Catch:{ all -> 0x0067 }
            r0 = 0
            if (r5 == 0) goto L_0x0065
            android.content.pm.ServiceInfo r1 = r5.serviceInfo     // Catch:{ all -> 0x0067 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0065
        L_0x0018:
            android.content.pm.ServiceInfo r5 = r5.serviceInfo     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = r4.getPackageName()     // Catch:{ all -> 0x0067 }
            java.lang.String r2 = r5.packageName     // Catch:{ all -> 0x0067 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r5.name     // Catch:{ all -> 0x0067 }
            if (r1 != 0) goto L_0x002b
            goto L_0x005f
        L_0x002b:
            java.lang.String r0 = r5.name     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = "."
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0057
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0067 }
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x0067 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0067 }
            int r0 = r5.length()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0067 }
            goto L_0x0054
        L_0x004e:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0067 }
            r5.<init>(r4)     // Catch:{ all -> 0x0067 }
            r4 = r5
        L_0x0054:
            r3.firebaseMessagingServiceClassName = r4     // Catch:{ all -> 0x0067 }
            goto L_0x005b
        L_0x0057:
            java.lang.String r4 = r5.name     // Catch:{ all -> 0x0067 }
            r3.firebaseMessagingServiceClassName = r4     // Catch:{ all -> 0x0067 }
        L_0x005b:
            java.lang.String r4 = r3.firebaseMessagingServiceClassName     // Catch:{ all -> 0x0067 }
            monitor-exit(r3)
            return r4
        L_0x005f:
            java.lang.String r4 = r5.packageName     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = r5.name     // Catch:{ all -> 0x0067 }
            monitor-exit(r3)
            return r0
        L_0x0065:
            monitor-exit(r3)
            return r0
        L_0x0067:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.ServiceStarter.resolveServiceClassName(android.content.Context, android.content.Intent):java.lang.String");
    }

    @VisibleForTesting
    public static void setForTesting(@NonNull ServiceStarter serviceStarter) {
        instance = serviceStarter;
    }

    /* access modifiers changed from: package-private */
    @MainThread
    public Intent getMessagingEvent() {
        return this.messagingEvents.poll();
    }

    /* access modifiers changed from: package-private */
    public boolean hasAccessNetworkStatePermission(Context context) {
        if (this.hasAccessNetworkStatePermission == null) {
            this.hasAccessNetworkStatePermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        return this.hasAccessNetworkStatePermission.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean hasWakeLockPermission(Context context) {
        if (this.hasWakeLockPermission == null) {
            this.hasWakeLockPermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        return this.hasWakeLockPermission.booleanValue();
    }

    @MainThread
    public int startMessagingService(@NonNull Context context, @NonNull Intent intent) {
        this.messagingEvents.offer(intent);
        Intent intent2 = new Intent(com.google.firebase.iid.ServiceStarter.ACTION_MESSAGING_EVENT);
        intent2.setPackage(context.getPackageName());
        return doStartService(context, intent2);
    }
}
