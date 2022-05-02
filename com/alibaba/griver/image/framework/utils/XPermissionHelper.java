package com.alibaba.griver.image.framework.utils;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import o.IntRange;

public class XPermissionHelper {
    public static final int PERMISSION_ACQUIRE_AUDIO = 1;
    public static final int PERMISSION_ACQUIRE_CAMERA = 2;
    public static final int PERMISSION_REQUEST_CODE_RECORD_AUDIO = 1;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f10488a = false;

    public static void acquirePermissions(final int... iArr) {
        if (c()) {
            GriverExecutors.getExecutor(ExecutorType.IO).execute(new Runnable() {
                public final void run() {
                    for (int i : iArr) {
                        if (i == 1) {
                            XPermissionHelper.a();
                        } else if (i == 2) {
                            try {
                                XPermissionHelper.b();
                            } catch (Exception unused) {
                                StringBuilder sb = new StringBuilder("take it easy, acquire permission for ");
                                sb.append(i);
                                sb.append(" error");
                                RVLogger.e("XPermissionHelper", sb.toString());
                            }
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063 A[SYNTHETIC, Splitter:B:27:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e A[SYNTHETIC, Splitter:B:32:0x006e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a() {
        /*
            java.lang.String r0 = "acquireAudioPermission exp "
            java.lang.String r1 = "XPermissionHelper"
            java.lang.String r2 = "acquireAudioPermission enter"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r2)
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            boolean r2 = hasPermission(r2)
            if (r2 != 0) goto L_0x0012
            return
        L_0x0012:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L_0x0019
            return
        L_0x0019:
            java.lang.String r2 = "acquireAudioPermission hasRecordAudio permission"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r2)
            r2 = 16000(0x3e80, float:2.2421E-41)
            r3 = 16
            r4 = 2
            int r10 = android.media.AudioRecord.getMinBufferSize(r2, r3, r4)
            r2 = 0
            android.media.AudioRecord r3 = new android.media.AudioRecord     // Catch:{ Exception -> 0x0050, all -> 0x004b }
            r6 = 1
            r7 = 16000(0x3e80, float:2.2421E-41)
            r8 = 16
            r9 = 2
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0050, all -> 0x004b }
            int r2 = r3.getState()     // Catch:{ Exception -> 0x0049 }
            r4 = 1
            if (r2 != r4) goto L_0x003e
            r3.startRecording()     // Catch:{ Exception -> 0x0049 }
        L_0x003e:
            r3.release()     // Catch:{ Exception -> 0x0042 }
            goto L_0x0066
        L_0x0042:
            r2 = move-exception
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r1, r0, r2)
            goto L_0x0066
        L_0x0047:
            r2 = move-exception
            goto L_0x006c
        L_0x0049:
            r2 = move-exception
            goto L_0x0054
        L_0x004b:
            r3 = move-exception
            r11 = r3
            r3 = r2
            r2 = r11
            goto L_0x006c
        L_0x0050:
            r3 = move-exception
            r11 = r3
            r3 = r2
            r2 = r11
        L_0x0054:
            java.lang.String r4 = "take it easy, acquireAudioPermission error, "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = r4.concat(r2)     // Catch:{ all -> 0x0047 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r1, r2)     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0066
            r3.release()     // Catch:{ Exception -> 0x0042 }
        L_0x0066:
            java.lang.String r0 = "acquireAudioPermission finish"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r0)
            return
        L_0x006c:
            if (r3 == 0) goto L_0x0076
            r3.release()     // Catch:{ Exception -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            r3 = move-exception
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r1, r0, r3)
        L_0x0076:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.framework.utils.XPermissionHelper.a():void");
    }

    /* access modifiers changed from: private */
    @TargetApi(9)
    public static void b() {
        RVLogger.d("XPermissionHelper", "acquireCameraPermission enter");
        if (hasPermission("android.permission.CAMERA")) {
            RVLogger.d("XPermissionHelper", "acquireCameraPermission hasCamera permission");
            int numberOfCameras = Camera.getNumberOfCameras();
            RVLogger.d("XPermissionHelper", "acquireCameraPermission cameraCount: ".concat(String.valueOf(numberOfCameras)));
            if (numberOfCameras > 0) {
                try {
                    Camera open = Camera.open();
                    if (open != null) {
                        open.release();
                    }
                } catch (Exception e) {
                    RVLogger.e("XPermissionHelper", "take it easy, acquireCameraPermission error, ".concat(String.valueOf(e)));
                }
            }
            RVLogger.d("XPermissionHelper", "acquireCameraPermission finish");
            return;
        }
        return;
    }

    public static boolean hasPermission(String str) {
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                StringBuilder sb = new StringBuilder("> 23, hasPermission permission: ");
                sb.append(str);
                sb.append(", enter");
                RVLogger.d("XPermissionHelper", sb.toString());
                int length = IntRange.length((Context) applicationContext, str);
                StringBuilder sb2 = new StringBuilder("> 23, hasPermission permission: ");
                sb2.append(str);
                sb2.append(", ret: ");
                sb2.append(length);
                RVLogger.d("XPermissionHelper", sb2.toString());
                if (length != 0) {
                    return false;
                }
            } else if (applicationContext.getPackageManager().checkPermission(str, applicationContext.getPackageName()) != 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            RVLogger.e("XPermissionHelper", "take it easy, os rejected this operation", th);
            return false;
        }
    }

    private static boolean c() {
        return Build.VERSION.SDK_INT < 23;
    }
}
