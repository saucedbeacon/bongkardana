package com.google.firebase.messaging;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.firebase.FirebaseApp;
import javax.annotation.concurrent.GuardedBy;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

class Metadata {
    @GuardedBy("this")
    private String appVersionCode;
    @GuardedBy("this")
    private String appVersionName;
    private final Context context;
    @GuardedBy("this")
    private int gmsVersionCode;
    @GuardedBy("this")
    private int iidImplementation = 0;

    Metadata(Context context2) {
        this.context = context2;
    }

    static String getDefaultSenderId(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] split = applicationId.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo getPackageInfo(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1384271211, oncanceled);
            onCancelLoad.getMin(1384271211, oncanceled);
        }
        try {
            return this.context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private synchronized void populateAppVersionInfo() {
        PackageInfo packageInfo = getPackageInfo(this.context.getPackageName());
        if (packageInfo != null) {
            this.appVersionCode = Integer.toString(packageInfo.versionCode);
            this.appVersionName = packageInfo.versionName;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized String getAppVersionCode() {
        if (this.appVersionCode == null) {
            populateAppVersionInfo();
        }
        return this.appVersionCode;
    }

    /* access modifiers changed from: package-private */
    public synchronized String getAppVersionName() {
        if (this.appVersionName == null) {
            populateAppVersionInfo();
        }
        return this.appVersionName;
    }

    /* access modifiers changed from: package-private */
    public synchronized int getGmsVersionCode() {
        PackageInfo packageInfo;
        if (this.gmsVersionCode == 0 && (packageInfo = getPackageInfo("com.google.android.gms")) != null) {
            this.gmsVersionCode = packageInfo.versionCode;
        }
        return this.gmsVersionCode;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006a, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int getIidImplementation() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.iidImplementation     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.context     // Catch:{ all -> 0x006b }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x006b }
            java.lang.String r1 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r2 = "com.google.android.gms"
            int r1 = r0.checkPermission(r1, r2)     // Catch:{ all -> 0x006b }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x001b
            monitor-exit(r5)
            return r3
        L_0x001b:
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch:{ all -> 0x006b }
            r2 = 1
            if (r1 != 0) goto L_0x003f
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x006b }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x003f
            int r1 = r1.size()     // Catch:{ all -> 0x006b }
            if (r1 > 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            r5.iidImplementation = r2     // Catch:{ all -> 0x006b }
            monitor-exit(r5)
            return r2
        L_0x003f:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x006b }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x006b }
            r1 = 2
            if (r0 == 0) goto L_0x005d
            int r0 = r0.size()     // Catch:{ all -> 0x006b }
            if (r0 > 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            r5.iidImplementation = r1     // Catch:{ all -> 0x006b }
            monitor-exit(r5)
            return r1
        L_0x005d:
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0067
            r5.iidImplementation = r1     // Catch:{ all -> 0x006b }
            r2 = 2
            goto L_0x0069
        L_0x0067:
            r5.iidImplementation = r2     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r5)
            return r2
        L_0x006b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.Metadata.getIidImplementation():int");
    }

    /* access modifiers changed from: package-private */
    public boolean isGmscorePresent() {
        return getIidImplementation() != 0;
    }
}
