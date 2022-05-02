package com.google.android.play.core.splitinstall;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.play.core.internal.af;
import java.io.File;

public class SplitInstallHelper {

    /* renamed from: a  reason: collision with root package name */
    private static final af f10958a = new af("SplitInstallHelper");

    private SplitInstallHelper() {
    }

    public static void loadLibrary(@NonNull Context context, @NonNull String str) throws UnsatisfiedLinkError {
        synchronized (k.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e) {
                String str2 = context.getApplicationInfo().nativeLibraryDir;
                String mapLibraryName = System.mapLibraryName(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(mapLibraryName).length());
                sb.append(str2);
                sb.append("/");
                sb.append(mapLibraryName);
                String obj = sb.toString();
                if (new File(obj).exists()) {
                    System.load(obj);
                } else {
                    throw e;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void updateAppInfo(@androidx.annotation.NonNull android.content.Context r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 <= r1) goto L_0x007c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000d
            goto L_0x007c
        L_0x000d:
            com.google.android.play.core.internal.af r0 = f10958a
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Calling dispatchPackageBroadcast"
            r0.c(r3, r2)
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = "currentActivityThread"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0072 }
            java.lang.reflect.Method r2 = r0.getMethod(r2, r3)     // Catch:{ Exception -> 0x0072 }
            r3 = 1
            r2.setAccessible(r3)     // Catch:{ Exception -> 0x0072 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0072 }
            r5 = 0
            java.lang.Object r2 = r2.invoke(r5, r4)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r4 = "mAppThread"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch:{ Exception -> 0x0072 }
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x0072 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0072 }
            java.lang.Class r2 = r0.getClass()     // Catch:{ Exception -> 0x0072 }
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0072 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0072 }
            r5[r1] = r6     // Catch:{ Exception -> 0x0072 }
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r5[r3] = r6     // Catch:{ Exception -> 0x0072 }
            java.lang.String r6 = "dispatchPackageBroadcast"
            java.lang.reflect.Method r2 = r2.getMethod(r6, r5)     // Catch:{ Exception -> 0x0072 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0072 }
            r5 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0072 }
            r4[r1] = r5     // Catch:{ Exception -> 0x0072 }
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0072 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ Exception -> 0x0072 }
            r5[r1] = r7     // Catch:{ Exception -> 0x0072 }
            r4[r3] = r5     // Catch:{ Exception -> 0x0072 }
            r2.invoke(r0, r4)     // Catch:{ Exception -> 0x0072 }
            com.google.android.play.core.internal.af r7 = f10958a     // Catch:{ Exception -> 0x0072 }
            java.lang.String r0 = "Called dispatchPackageBroadcast"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0072 }
            r7.c(r0, r2)     // Catch:{ Exception -> 0x0072 }
            return
        L_0x0072:
            r7 = move-exception
            com.google.android.play.core.internal.af r0 = f10958a
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Update app info with dispatchPackageBroadcast failed!"
            r0.a((java.lang.Throwable) r7, (java.lang.String) r2, (java.lang.Object[]) r1)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.SplitInstallHelper.updateAppInfo(android.content.Context):void");
    }
}
