package com.iap.ac.android.container.activity;

import android.app.Activity;
import android.content.Context;
import com.google.common.base.Ascii;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class H5NetworkCheckActivity extends Activity {
    public static final byte[] length = {Byte.MAX_VALUE, -110, 36, -49, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMin = 175;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(short r5, byte r6, int r7) {
        /*
            int r5 = r5 * 165
            int r5 = r5 + 11
            int r7 = r7 * 45
            int r7 = 101 - r7
            int r6 = r6 * 175
            int r6 = r6 + 4
            byte[] r0 = length
            byte[] r1 = new byte[r5]
            int r5 = r5 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r4 = r6
            r3 = 0
            goto L_0x0028
        L_0x0018:
            r3 = 0
        L_0x0019:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L_0x0024
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L_0x0024:
            byte r4 = r0[r6]
            int r3 = r3 + 1
        L_0x0028:
            int r6 = r6 + 1
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + -2
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.container.activity.H5NetworkCheckActivity.length(short, byte, int):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0255  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            byte[] r0 = length
            r1 = 96
            byte r2 = r0[r1]
            byte r2 = (byte) r2
            r3 = 8
            byte r0 = r0[r3]
            byte r0 = (byte) r0
            byte r4 = (byte) r0
            java.lang.String r0 = length(r2, r0, r4)
            byte[] r2 = length
            byte r4 = r2[r3]
            byte r4 = (byte) r4
            byte r1 = r2[r1]
            byte r1 = (byte) r1
            byte r2 = (byte) r1
            java.lang.String r1 = length(r4, r1, r2)
            android.content.Context r2 = r8.getBaseContext()
            r4 = 0
            if (r2 == 0) goto L_0x0030
            android.content.Context r5 = r2.getApplicationContext()
            if (r5 == 0) goto L_0x0030
            android.content.Context r2 = r2.getApplicationContext()
            goto L_0x0031
        L_0x0030:
            r2 = r4
        L_0x0031:
            if (r2 == 0) goto L_0x003a
            o.isReset r5 = o.registerOnLoadCanceledListener.setMin()
            r5.getMax(r2, r0, r1)
        L_0x003a:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r0.nextInt(r1)
            int r1 = o.dispatchOnCancelled.length(r0)
            r2 = 1
            r5 = -865175243(0xffffffffcc6e7935, float:-6.2514388E7)
            if (r0 == r1) goto L_0x005b
            o.onCanceled r6 = new o.onCanceled
            r6.<init>(r0, r1, r2)
            o.onCancelLoad.setMax(r5, r6)
            o.onCancelLoad.getMin(r5, r6)
        L_0x005b:
            android.content.Context r0 = r8.getBaseContext()
            if (r0 == 0) goto L_0x0066
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x0067
        L_0x0066:
            r0 = r4
        L_0x0067:
            r1 = 4
            if (r0 == 0) goto L_0x007c
            r6 = 0
            int r0 = o.dispatchOnCancelled.length(r0, r6)
            if (r0 == 0) goto L_0x007c
            o.onCanceled r7 = new o.onCanceled
            r7.<init>(r6, r0, r1)
            o.onCancelLoad.setMax(r5, r7)
            o.onCancelLoad.getMin(r5, r7)
        L_0x007c:
            android.content.Context r0 = r8.getBaseContext()
            if (r0 == 0) goto L_0x0087
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x0088
        L_0x0087:
            r0 = r4
        L_0x0088:
            if (r0 == 0) goto L_0x009d
            int r0 = o.dispatchOnCancelled.getMax(r0, r5)
            if (r5 == r0) goto L_0x009d
            o.onCanceled r6 = new o.onCanceled
            r7 = 512(0x200, float:7.175E-43)
            r6.<init>(r5, r0, r7)
            o.onCancelLoad.setMax(r5, r6)
            o.onCancelLoad.getMin(r5, r6)
        L_0x009d:
            android.content.Context r0 = r8.getBaseContext()
            if (r0 == 0) goto L_0x00a8
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x00a9
        L_0x00a8:
            r0 = r4
        L_0x00a9:
            if (r0 == 0) goto L_0x00c1
            java.lang.String[] r6 = r0.fileList()
            int r6 = r6.length
            int r0 = o.dispatchOnCancelled.setMin(r0, r6)
            if (r6 == r0) goto L_0x00c1
            o.onCanceled r7 = new o.onCanceled
            r7.<init>(r6, r0, r3)
            o.onCancelLoad.setMax(r5, r7)
            o.onCancelLoad.getMin(r5, r7)
        L_0x00c1:
            super.onCreate(r9)
            int r9 = com.iap.ac.android.container.R.layout.h5_network_check_activity
            r8.setContentView(r9)
            android.content.Intent r9 = r8.getIntent()
            int r0 = com.iap.ac.android.container.R.id.h5_error_check_layout
            r8.findViewById(r0)
            int r0 = com.iap.ac.android.container.R.id.h5_lv_nav_back
            android.view.View r0 = r8.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            com.iap.ac.android.container.activity.H5NetworkCheckActivity$1 r3 = new com.iap.ac.android.container.activity.H5NetworkCheckActivity$1
            r3.<init>()
            r0.setOnClickListener(r3)
            int r0 = com.iap.ac.android.container.R.id.error_code
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r3 = "error_code"
            java.lang.String r5 = r9.getStringExtra(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00fe
            java.lang.String r3 = r9.getStringExtra(r3)
            r0.append(r3)
            goto L_0x0107
        L_0x00fe:
            int r3 = com.iap.ac.android.container.R.string.h5_network_check_unknow
            java.lang.String r3 = r8.getString(r3)
            r0.append(r3)
        L_0x0107:
            int r0 = com.iap.ac.android.container.R.id.url
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r3 = "url"
            java.lang.String r5 = r9.getStringExtra(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0123
            java.lang.String r3 = r9.getStringExtra(r3)
            r0.append(r3)
            goto L_0x012c
        L_0x0123:
            int r3 = com.iap.ac.android.container.R.string.h5_network_check_unknow
            java.lang.String r3 = r8.getString(r3)
            r0.append(r3)
        L_0x012c:
            android.content.Context r0 = r8.getApplicationContext()
            java.lang.String r3 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            if (r0 == 0) goto L_0x0142
            int r1 = r0.getWifiState()
            android.net.DhcpInfo r4 = r0.getDhcpInfo()
        L_0x0142:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x015a
            java.lang.String r0 = r0.getExtraInfo()
            if (r0 != 0) goto L_0x0159
            goto L_0x015a
        L_0x0159:
            r3 = r0
        L_0x015a:
            int r0 = com.iap.ac.android.container.R.id.state
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.Resources r5 = r8.getResources()
            if (r5 == 0) goto L_0x0258
            int r6 = com.iap.ac.android.container.R.string.h5_network_check_wifi
            java.lang.String r6 = r5.getString(r6)
            r0.append(r6)
            if (r1 == 0) goto L_0x01a3
            if (r1 == r2) goto L_0x0199
            r2 = 2
            if (r1 == r2) goto L_0x018f
            r2 = 3
            if (r1 == r2) goto L_0x0185
            int r1 = com.iap.ac.android.container.R.string.h5_network_check_unknow
            java.lang.String r1 = r5.getString(r1)
            r0.append(r1)
            goto L_0x01ac
        L_0x0185:
            int r1 = com.iap.ac.android.container.R.string.h5_network_check_enabled
            java.lang.String r1 = r5.getString(r1)
            r0.append(r1)
            goto L_0x01ac
        L_0x018f:
            int r1 = com.iap.ac.android.container.R.string.h5_network_check_enabling
            java.lang.String r1 = r5.getString(r1)
            r0.append(r1)
            goto L_0x01ac
        L_0x0199:
            int r1 = com.iap.ac.android.container.R.string.h5_network_check_disabled
            java.lang.String r1 = r5.getString(r1)
            r0.append(r1)
            goto L_0x01ac
        L_0x01a3:
            int r1 = com.iap.ac.android.container.R.string.h5_network_check_disabling
            java.lang.String r1 = r5.getString(r1)
            r0.append(r1)
        L_0x01ac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\n"
            r1.<init>(r2)
            int r6 = com.iap.ac.android.container.R.string.h5_network_check_gate
            java.lang.String r6 = r5.getString(r6)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            if (r4 == 0) goto L_0x01d5
            int r1 = r4.gateway
            java.lang.String r1 = r8.intToIp(r1)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 != 0) goto L_0x01d5
            r0.append(r1)
            goto L_0x01de
        L_0x01d5:
            int r1 = com.iap.ac.android.container.R.string.h5_network_check_unknow
            java.lang.String r1 = r5.getString(r1)
            r0.append(r1)
        L_0x01de:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            int r2 = com.iap.ac.android.container.R.string.h5_network_check_apn
            java.lang.String r2 = r5.getString(r2)
            r1.append(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L_0x01f8
            int r2 = com.iap.ac.android.container.R.string.h5_network_check_unknow
            java.lang.String r3 = r5.getString(r2)
        L_0x01f8:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            int r0 = com.iap.ac.android.container.R.id.dns
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = com.iap.ac.android.container.R.string.h5_network_check_ip
            java.lang.String r1 = r5.getString(r1)
            r0.append(r1)
            if (r4 == 0) goto L_0x0225
            int r1 = r4.ipAddress
            java.lang.String r1 = r8.intToIp(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0225
            r0.append(r1)
            goto L_0x022e
        L_0x0225:
            int r1 = com.iap.ac.android.container.R.string.h5_network_check_unknow
            java.lang.String r1 = r5.getString(r1)
            r0.append(r1)
        L_0x022e:
            int r0 = com.iap.ac.android.container.R.id.reason
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "reason"
            java.lang.String r9 = r9.getStringExtra(r1)
            int r1 = com.iap.ac.android.container.R.string.h5_network_check_reason
            java.lang.String r1 = r5.getString(r1)
            r0.append(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 == 0) goto L_0x0255
            int r9 = com.iap.ac.android.container.R.string.h5_network_check_unknow
            java.lang.String r9 = r5.getString(r9)
            r0.append(r9)
            return
        L_0x0255:
            r0.append(r9)
        L_0x0258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.container.activity.H5NetworkCheckActivity.onCreate(android.os.Bundle):void");
    }

    private String intToIp(int i) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.getMax(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, max, 512);
            onCancelLoad.setMax(2057223930, oncanceled);
            onCancelLoad.getMin(2057223930, oncanceled);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i & 255);
        sb.append(".");
        sb.append((i >> 8) & 255);
        sb.append(".");
        sb.append((i >> 16) & 255);
        sb.append(".");
        sb.append((i >> 24) & 255);
        return sb.toString();
    }
}
