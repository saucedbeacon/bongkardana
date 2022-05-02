package com.alipay.iap.android.aplog.core.uploader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import o.onActivityPreStopped;

public class UploadConstants {
    private static final String LOG_UPLOAD_ORIGINI = "/loggw/extLog.do";
    private static final String TAG = "UploadConstants";
    private static char[] getMax = null;
    private static int getMin = 0;
    private static char length = '\u0000';
    private static String logGW = null;
    private static int setMin = 1;
    private static boolean shouldGetLogGwFromManifest = true;

    static void setMax() {
        length = 3;
        getMax = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    static {
        setMax();
        int i = getMin + 115;
        setMin = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if ((r0 ? 14 : '\\') != '\\') goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (shouldGetLogGwFromManifest != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getLogGWFromManifest() {
        /*
            int r0 = setMin
            int r0 = r0 + 81
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x0018
            boolean r0 = shouldGetLogGwFromManifest
            if (r0 == 0) goto L_0x0038
            goto L_0x0027
        L_0x0018:
            boolean r0 = shouldGetLogGwFromManifest
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x003b }
            r3 = 92
            if (r0 == 0) goto L_0x0023
            r0 = 14
            goto L_0x0025
        L_0x0023:
            r0 = 92
        L_0x0025:
            if (r0 == r3) goto L_0x0038
        L_0x0027:
            shouldGetLogGwFromManifest = r1
            java.lang.String r0 = com.alipay.iap.android.aplog.util.ManifestUtil.getLoggingGWFromManifest()
            logGW = r0
            int r0 = getMin
            int r0 = r0 + r2
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
        L_0x0038:
            java.lang.String r0 = logGW
            return r0
        L_0x003b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.uploader.UploadConstants.getLogGWFromManifest():java.lang.String");
    }

    static String getUploadFileUrl() {
        int i = setMin + 85;
        getMin = i % 128;
        int i2 = i % 2;
        if (TextUtils.isEmpty(getLogGWFromManifest())) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(logGW);
        sb.append(LOG_UPLOAD_ORIGINI);
        String obj = sb.toString();
        int i3 = setMin + 57;
        getMin = i3 % 128;
        int i4 = i3 % 2;
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r0 != null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String requestUploadFileUrl(com.alipay.iap.android.aplog.core.uploader.UserDiagnostician.DiagnoseTask r7) {
        /*
            int r0 = setMin
            int r0 = r0 + 105
            int r1 = r0 % 128
            getMin = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r4 = 0
            if (r0 == 0) goto L_0x001f
            java.lang.Class<com.alipay.iap.android.aplog.rpc.TaskInstanceRpcFacade> r0 = com.alipay.iap.android.aplog.rpc.TaskInstanceRpcFacade.class
            java.lang.Object r0 = com.alipay.iap.android.common.rpcintegration.RPCProxyHost.getInterfaceProxy(r0)     // Catch:{ Exception -> 0x0091 }
            com.alipay.iap.android.aplog.rpc.TaskInstanceRpcFacade r0 = (com.alipay.iap.android.aplog.rpc.TaskInstanceRpcFacade) r0     // Catch:{ Exception -> 0x0091 }
            if (r0 == 0) goto L_0x009b
            goto L_0x002b
        L_0x001f:
            java.lang.Class<com.alipay.iap.android.aplog.rpc.TaskInstanceRpcFacade> r0 = com.alipay.iap.android.aplog.rpc.TaskInstanceRpcFacade.class
            java.lang.Object r0 = com.alipay.iap.android.common.rpcintegration.RPCProxyHost.getInterfaceProxy(r0)     // Catch:{ Exception -> 0x0091 }
            com.alipay.iap.android.aplog.rpc.TaskInstanceRpcFacade r0 = (com.alipay.iap.android.aplog.rpc.TaskInstanceRpcFacade) r0     // Catch:{ Exception -> 0x0091 }
            r5 = 3
            int r5 = r5 / r3
            if (r0 == 0) goto L_0x009b
        L_0x002b:
            com.alipay.iap.android.aplog.rpc.TaskInstanceRpcRequest r5 = new com.alipay.iap.android.aplog.rpc.TaskInstanceRpcRequest     // Catch:{ Exception -> 0x0091 }
            r5.<init>()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = r7.taskID     // Catch:{ Exception -> 0x0091 }
            r5.taskId = r6     // Catch:{ Exception -> 0x0091 }
            java.lang.String r7 = r7.submitId     // Catch:{ Exception -> 0x0091 }
            r5.submitId = r7     // Catch:{ Exception -> 0x0091 }
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician r7 = com.alipay.iap.android.aplog.core.uploader.UserDiagnostician.getInstance()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r7 = r7.getAppId()     // Catch:{ Exception -> 0x0091 }
            r5.appId = r7     // Catch:{ Exception -> 0x0091 }
            com.alipay.iap.android.aplog.rpc.LinkRpcResult r7 = r0.fetchuploadlink(r5)     // Catch:{ Exception -> 0x0091 }
            boolean r0 = r7.success     // Catch:{ Exception -> 0x0091 }
            if (r0 == 0) goto L_0x004c
            r0 = 0
            goto L_0x004d
        L_0x004c:
            r0 = 1
        L_0x004d:
            if (r0 == r2) goto L_0x009b
            int r0 = getMin
            int r0 = r0 + 15
            int r5 = r0 % 128
            setMin = r5
            int r0 = r0 % r1
            java.lang.String r7 = r7.url     // Catch:{ Exception -> 0x0091 }
            r0 = 5
            char[] r5 = new char[r0]     // Catch:{ Exception -> 0x0091 }
            r5[r3] = r2     // Catch:{ Exception -> 0x0091 }
            r5[r2] = r1     // Catch:{ Exception -> 0x0091 }
            r5[r1] = r3     // Catch:{ Exception -> 0x0091 }
            r2 = 3
            r5[r2] = r0     // Catch:{ Exception -> 0x0091 }
            r2 = 4
            r6 = 119(0x77, float:1.67E-43)
            r5[r2] = r6     // Catch:{ Exception -> 0x0091 }
            int r2 = android.view.View.MeasureSpec.getSize(r3)     // Catch:{ Exception -> 0x0091 }
            int r2 = 63 - r2
            byte r2 = (byte) r2     // Catch:{ Exception -> 0x0091 }
            int r3 = android.view.ViewConfiguration.getScrollBarSize()     // Catch:{ Exception -> 0x0091 }
            int r3 = r3 >> 8
            int r3 = r3 + r0
            java.lang.String r0 = setMax(r5, r2, r3)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r0 = r0.intern()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r4 = java.net.URLDecoder.decode(r7, r0)     // Catch:{ Exception -> 0x0091 }
            int r7 = setMin
            int r7 = r7 + 41
            int r0 = r7 % 128
            getMin = r0
            int r7 = r7 % r1
            goto L_0x009b
        L_0x008f:
            r7 = move-exception
            throw r7
        L_0x0091:
            r7 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r1 = "UploadConstants"
            r0.error((java.lang.String) r1, (java.lang.Throwable) r7)
        L_0x009b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.uploader.UploadConstants.requestUploadFileUrl(com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask):java.lang.String");
    }

    static String getAppId() {
        ApplicationInfo applicationInfo;
        int i = setMin + 103;
        getMin = i % 128;
        if ((i % 2 != 0 ? '4' : 30) != '4') {
            try {
                Context applicationContext = LoggerFactory.getLogContext().getApplicationContext();
                applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            } catch (Throwable unused) {
                applicationInfo = null;
            }
        } else {
            Context applicationContext2 = LoggerFactory.getLogContext().getApplicationContext();
            applicationInfo = applicationContext2.getPackageManager().getApplicationInfo(applicationContext2.getPackageName(), 218);
        }
        if (applicationInfo != null) {
            int i2 = setMin + 65;
            getMin = i2 % 128;
            int i3 = i2 % 2;
            if ((applicationInfo.metaData == null ? (char) 2 : 14) != 2) {
                return applicationInfo.metaData.getString(MonitorItemConstants.KEY_APP_ID);
            }
        }
        return null;
    }

    private static String setMax(char[] cArr, byte b, int i) {
        int i2 = getMin + 19;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr2 = getMax;
        char c = length;
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i4 = setMin + 47;
            getMin = i4 % 128;
            if (i4 % 2 != 0) {
                i += 25;
                cArr3[i] = (char) (cArr[i] >>> b);
            } else {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
        }
        int i5 = 0;
        if (!(i <= 1)) {
            int i6 = getMin + 77;
            setMin = i6 % 128;
            if (i6 % 2 == 0) {
                i5 = 1;
            }
            while (i5 < i) {
                int i7 = getMin + 87;
                setMin = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr[i5];
                int i9 = i5 + 1;
                char c3 = cArr[i9];
                if ((c2 == c3 ? (char) 28 : 18) != 28) {
                    try {
                        int min = onActivityPreStopped.setMin(c2, c);
                        int length2 = onActivityPreStopped.length(c2, c);
                        int min2 = onActivityPreStopped.setMin(c3, c);
                        int length3 = onActivityPreStopped.length(c3, c);
                        if ((length2 == length3 ? '0' : 'J') == '0') {
                            int max = onActivityPreStopped.setMax(min, c);
                            int max2 = onActivityPreStopped.setMax(min2, c);
                            int max3 = onActivityPreStopped.getMax(max, length2, c);
                            int max4 = onActivityPreStopped.getMax(max2, length3, c);
                            cArr3[i5] = cArr2[max3];
                            cArr3[i9] = cArr2[max4];
                        } else if (min == min2) {
                            int i10 = setMin + 25;
                            getMin = i10 % 128;
                            int i11 = i10 % 2;
                            int max5 = onActivityPreStopped.setMax(length2, c);
                            int max6 = onActivityPreStopped.setMax(length3, c);
                            int max7 = onActivityPreStopped.getMax(min, max5, c);
                            int max8 = onActivityPreStopped.getMax(min2, max6, c);
                            cArr3[i5] = cArr2[max7];
                            cArr3[i9] = cArr2[max8];
                        } else {
                            int max9 = onActivityPreStopped.getMax(min, length3, c);
                            int max10 = onActivityPreStopped.getMax(min2, length2, c);
                            cArr3[i5] = cArr2[max9];
                            cArr3[i9] = cArr2[max10];
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    int i12 = setMin + 57;
                    getMin = i12 % 128;
                    int i13 = i12 % 2;
                    cArr3[i5] = (char) (c2 - b);
                    cArr3[i9] = (char) (c3 - b);
                }
                i5 += 2;
            }
        }
        return new String(cArr3);
    }
}
