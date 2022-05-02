package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

@TargetApi(24)
public final class zzbt {
    @Nullable
    private static final Method zza;
    @Nullable
    private static final Method zzb;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            r2 = 0
            r3 = 24
            java.lang.String r4 = "JobSchedulerCompat"
            r5 = 0
            if (r0 < r3) goto L_0x0036
            r0 = 4
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x002a }
            java.lang.Class<android.app.job.JobInfo> r6 = android.app.job.JobInfo.class
            r0[r2] = r6     // Catch:{ NoSuchMethodException -> 0x002a }
            r6 = 1
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r0[r6] = r7     // Catch:{ NoSuchMethodException -> 0x002a }
            r6 = 2
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x002a }
            r0[r6] = r7     // Catch:{ NoSuchMethodException -> 0x002a }
            r6 = 3
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r0[r6] = r7     // Catch:{ NoSuchMethodException -> 0x002a }
            java.lang.Class<android.app.job.JobScheduler> r6 = android.app.job.JobScheduler.class
            java.lang.String r7 = "scheduleAsPackage"
            java.lang.reflect.Method r0 = r6.getDeclaredMethod(r7, r0)     // Catch:{ NoSuchMethodException -> 0x002a }
            goto L_0x0037
        L_0x002a:
            boolean r0 = android.util.Log.isLoggable(r4, r1)
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r4, r0)
        L_0x0036:
            r0 = r5
        L_0x0037:
            zza = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x0054
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r3 = "myUserId"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0048 }
            java.lang.reflect.Method r5 = r0.getDeclaredMethod(r3, r2)     // Catch:{ NoSuchMethodException -> 0x0048 }
            goto L_0x0054
        L_0x0048:
            boolean r0 = android.util.Log.isLoggable(r4, r1)
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r4, r0)
        L_0x0054:
            zzb = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbt.<clinit>():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zza(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r5.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            if (r7 == 0) goto L_0x0078
            java.lang.reflect.Method r8 = zza
            if (r8 == 0) goto L_0x0073
            java.lang.String r8 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r8)
            if (r5 == 0) goto L_0x0017
            goto L_0x0073
        L_0x0017:
            java.lang.reflect.Method r5 = zzb
            r8 = 0
            if (r5 == 0) goto L_0x003e
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ IllegalAccessException -> 0x002f, InvocationTargetException -> 0x002d }
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch:{ IllegalAccessException -> 0x002f, InvocationTargetException -> 0x002d }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException -> 0x002f, InvocationTargetException -> 0x002d }
            if (r5 == 0) goto L_0x003e
            int r5 = r5.intValue()     // Catch:{ IllegalAccessException -> 0x002f, InvocationTargetException -> 0x002d }
            goto L_0x003f
        L_0x002d:
            r5 = move-exception
            goto L_0x0030
        L_0x002f:
            r5 = move-exception
        L_0x0030:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "myUserId invocation illegal"
            android.util.Log.e(r1, r0, r5)
        L_0x003e:
            r5 = 0
        L_0x003f:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = "UploadAlarm"
            java.lang.reflect.Method r2 = zza
            if (r2 == 0) goto L_0x006e
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0068, InvocationTargetException -> 0x0066 }
            r3[r8] = r6     // Catch:{ IllegalAccessException -> 0x0068, InvocationTargetException -> 0x0066 }
            r4 = 1
            r3[r4] = r0     // Catch:{ IllegalAccessException -> 0x0068, InvocationTargetException -> 0x0066 }
            r0 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException -> 0x0068, InvocationTargetException -> 0x0066 }
            r3[r0] = r5     // Catch:{ IllegalAccessException -> 0x0068, InvocationTargetException -> 0x0066 }
            r5 = 3
            r3[r5] = r1     // Catch:{ IllegalAccessException -> 0x0068, InvocationTargetException -> 0x0066 }
            java.lang.Object r5 = r2.invoke(r7, r3)     // Catch:{ IllegalAccessException -> 0x0068, InvocationTargetException -> 0x0066 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException -> 0x0068, InvocationTargetException -> 0x0066 }
            if (r5 == 0) goto L_0x0072
            int r8 = r5.intValue()     // Catch:{ IllegalAccessException -> 0x0068, InvocationTargetException -> 0x0066 }
            goto L_0x0072
        L_0x0066:
            r5 = move-exception
            goto L_0x0069
        L_0x0068:
            r5 = move-exception
        L_0x0069:
            java.lang.String r8 = "error calling scheduleAsPackage"
            android.util.Log.e(r1, r8, r5)
        L_0x006e:
            int r8 = r7.schedule(r6)
        L_0x0072:
            return r8
        L_0x0073:
            int r5 = r7.schedule(r6)
            return r5
        L_0x0078:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbt.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
