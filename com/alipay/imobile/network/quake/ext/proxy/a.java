package com.alipay.imobile.network.quake.ext.proxy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.Quake;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.ut.device.UTDevice;
import id.dana.data.constant.BranchLinkConstant;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class a {
    private static a b;

    /* renamed from: a  reason: collision with root package name */
    public String[] f9360a = {"0", "1", "2", "3", "4", "5", "6", "7", PrepareException.ERROR_AUTH_FAIL, "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", BranchLinkConstant.PayloadKey.REFERRAL, "s", SecurityConstants.KEY_TEXT, "u", SecurityConstants.KEY_VALUE, "w", "x", "y", "z", "A", DiskFormatter.B, "C", "D", "E", "F", DiskFormatter.GB, "H", "I", "J", DiskFormatter.KB, "L", DiskFormatter.MB, "N", "O", "P", "Q", "R", "S", DiskFormatter.TB, "U", "V", "W", "X", "Y", "Z"};
    /* access modifiers changed from: private */
    public final Context c;
    /* access modifiers changed from: private */
    public final Object d = new Object();
    /* access modifiers changed from: private */
    public String e;
    private String f;
    /* access modifiers changed from: private */
    public final AtomicBoolean g = new AtomicBoolean(false);
    private String h;
    @SuppressLint({"SimpleDateFormat"})
    private final SimpleDateFormat i = new SimpleDateFormat("yyMMddHHmmssSSS");

    private a(Context context) {
        this.c = context.getApplicationContext();
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (b == null) {
                a aVar2 = new a(context);
                b = aVar2;
                aVar2.d();
            }
            aVar = b;
        }
        return aVar;
    }

    private String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(e(str));
        sb.append("|");
        sb.append(e(str2));
        return sb.toString();
    }

    private boolean a(byte b2) {
        if (b2 >= 48 && b2 <= 57) {
            return true;
        }
        if (b2 < 97 || b2 > 122) {
            return b2 >= 65 && b2 <= 90;
        }
        return true;
    }

    private boolean a(String str) {
        if (b(str)) {
            return false;
        }
        String trim = str.trim();
        return !trim.equalsIgnoreCase("unknown") && !trim.equalsIgnoreCase("null") && !trim.matches("[0]+") && trim.length() > 5;
    }

    private boolean b(String str) {
        return str == null || str.trim().length() == 0;
    }

    private String c(String str) {
        if (b(str)) {
            return str;
        }
        byte[] bytes = str.getBytes();
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (!a(bytes[i2])) {
                bytes[i2] = 48;
            }
        }
        return new String(bytes);
    }

    private void d() {
        this.h = h();
        this.f = f();
        e();
    }

    private boolean d(String str) {
        return !b(str) && str.matches("[[a-z][A-Z][0-9]]{15}\\|[[a-z][A-Z][0-9]]{15}");
    }

    private String e(String str) {
        if (!a(str)) {
            str = c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("123456789012345");
        return c(sb.toString().substring(0, 15));
    }

    private void e() {
        try {
            if (Class.forName("com.ut.device.UTDevice") != null) {
                new Thread(new Runnable() {
                    public void run() {
                        a.this.g.set(true);
                        LoggerWrapper.v(Quake.TAG, "generateUtDid...");
                        a aVar = a.this;
                        String unused = aVar.e = UTDevice.getUtdid(aVar.c);
                        LoggerWrapper.v(Quake.TAG, "generateUtDid finish");
                        a.this.g.set(false);
                        synchronized (a.this.d) {
                            a.this.d.notifyAll();
                        }
                    }
                }, "generateUtDid").start();
            }
        } catch (ClassNotFoundException e2) {
            LoggerWrapper.d(Quake.TAG, e2.getMessage());
        }
    }

    private String f() {
        Context context = this.c;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getPackageName());
        sb.append(".quake.config");
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        String string = sharedPreferences.getString("clientKey", "");
        if (!"".equals(string)) {
            return string;
        }
        String g2 = g();
        sharedPreferences.edit().putString("clientKey", g2).apply();
        return g2;
    }

    private String g() {
        Random random = new Random(System.currentTimeMillis());
        int length = this.f9360a.length;
        String str = "";
        for (int i2 = 0; i2 < 10; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f9360a[random.nextInt(length)]);
            str = sb.toString();
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String h() {
        /*
            r15 = this;
            android.content.Context r0 = r15.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = r15.c
            java.lang.String r2 = r2.getPackageName()
            r1.append(r2)
            java.lang.String r2 = ".quake.config"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            r3 = 1
            r4 = 2
            r5 = 0
            java.lang.String r6 = "androidx.core.content.PermissionChecker"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ Exception -> 0x004f }
            if (r6 == 0) goto L_0x0050
            java.lang.String r7 = "checkSelfPermission"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x004f }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r2] = r9     // Catch:{ Exception -> 0x004f }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r3] = r9     // Catch:{ Exception -> 0x004f }
            java.lang.reflect.Method r7 = r6.getMethod(r7, r8)     // Catch:{ Exception -> 0x004f }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x004f }
            android.content.Context r9 = r15.c     // Catch:{ Exception -> 0x004f }
            r8[r2] = r9     // Catch:{ Exception -> 0x004f }
            java.lang.String r9 = "android.permission.READ_PHONE_STATE"
            r8[r3] = r9     // Catch:{ Exception -> 0x004f }
            java.lang.Object r6 = r7.invoke(r6, r8)     // Catch:{ Exception -> 0x004f }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x004f }
            r5 = r6
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x0065
            int r5 = r5.intValue()
            r7 = -1
            if (r5 != r7) goto L_0x0065
            java.lang.String r5 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.String r7 = "PERMISSION_DENIED, can not read phone state"
            com.alipay.iap.android.common.log.LoggerWrapper.i(r5, r7)
            r5 = r6
            r7 = r5
            goto L_0x0082
        L_0x0065:
            android.content.Context r5 = r15.c
            java.lang.String r7 = "phone"
            java.lang.Object r5 = r5.getSystemService(r7)
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5
            java.lang.String r7 = r5.getDeviceId()     // Catch:{ Exception -> 0x007a }
            java.lang.String r5 = r5.getSubscriberId()     // Catch:{ Exception -> 0x0078 }
            goto L_0x0082
        L_0x0078:
            r5 = move-exception
            goto L_0x007c
        L_0x007a:
            r5 = move-exception
            r7 = r6
        L_0x007c:
            java.lang.String r8 = com.alipay.imobile.network.quake.Quake.TAG
            com.alipay.iap.android.common.log.LoggerWrapper.d(r8, r6, r5)
            r5 = r6
        L_0x0082:
            java.lang.String r8 = "clientId"
            java.lang.String r0 = r0.getString(r8, r6)
            java.lang.String r6 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.String r9 = java.lang.String.valueOf(r0)
            java.lang.String r10 = "saved clientid:"
            java.lang.String r9 = r10.concat(r9)
            com.alipay.iap.android.common.log.LoggerWrapper.d(r6, r9)
            boolean r6 = r15.d(r0)
            r9 = 3
            java.lang.String r10 = "normalize, imei:%s, imsi:%s, newClientId:%s"
            if (r6 == 0) goto L_0x0125
            java.lang.String r6 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.String r11 = java.lang.String.valueOf(r0)
            java.lang.String r12 = "client id is valid:"
            java.lang.String r11 = r12.concat(r11)
            com.alipay.iap.android.common.log.LoggerWrapper.d(r6, r11)
            r6 = 15
            java.lang.String r11 = r0.substring(r2, r6)
            boolean r13 = r15.a((java.lang.String) r5)
            if (r13 == 0) goto L_0x00d0
            java.lang.String r13 = r15.c((java.lang.String) r5)
            int r14 = r13.length()
            if (r14 <= r6) goto L_0x00c9
            java.lang.String r13 = r13.substring(r2, r6)
        L_0x00c9:
            boolean r13 = r11.startsWith(r13)
            if (r13 != 0) goto L_0x00d0
            r11 = r5
        L_0x00d0:
            int r13 = r0.length()
            int r13 = r13 - r6
            int r14 = r0.length()
            java.lang.String r0 = r0.substring(r13, r14)
            boolean r13 = r15.a((java.lang.String) r7)
            if (r13 == 0) goto L_0x00f8
            java.lang.String r13 = r15.c((java.lang.String) r7)
            int r14 = r13.length()
            if (r14 <= r6) goto L_0x00f1
            java.lang.String r13 = r13.substring(r2, r6)
        L_0x00f1:
            boolean r6 = r0.startsWith(r13)
            if (r6 != 0) goto L_0x00f8
            r0 = r7
        L_0x00f8:
            java.lang.String r6 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r12)
            r13.append(r11)
            java.lang.String r12 = "|"
            r13.append(r12)
            r13.append(r0)
            java.lang.String r12 = r13.toString()
            com.alipay.iap.android.common.log.LoggerWrapper.d(r6, r12)
            java.lang.String r0 = r15.a((java.lang.String) r11, (java.lang.String) r0)
            java.lang.String r6 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r2] = r7
            r9[r3] = r5
            r9[r4] = r0
            java.lang.String r2 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r10, r9)
            goto L_0x015c
        L_0x0125:
            java.lang.String r0 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r2] = r7
            r6[r3] = r5
            java.lang.String r11 = "client is is not valid, imei:%s, imsi:%s"
            java.lang.String r6 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r11, r6)
            com.alipay.iap.android.common.log.LoggerWrapper.d(r0, r6)
            boolean r0 = r15.a((java.lang.String) r7)
            if (r0 != 0) goto L_0x0140
            java.lang.String r7 = r15.c()
        L_0x0140:
            boolean r0 = r15.a((java.lang.String) r5)
            if (r0 != 0) goto L_0x014a
            java.lang.String r5 = r15.c()
        L_0x014a:
            java.lang.String r0 = r15.a((java.lang.String) r5, (java.lang.String) r7)
            java.lang.String r6 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r2] = r7
            r9[r3] = r5
            r9[r4] = r0
            java.lang.String r2 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r10, r9)
        L_0x015c:
            com.alipay.iap.android.common.log.LoggerWrapper.d(r6, r2)
            r1.putString(r8, r0)
            r1.apply()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.ext.proxy.a.h():java.lang.String");
    }

    public String a() {
        return this.h;
    }

    public String b() {
        if (this.g.get()) {
            synchronized (this.d) {
                try {
                    this.d.wait();
                } catch (InterruptedException e2) {
                    LoggerWrapper.e(Quake.TAG, "", e2);
                }
            }
        }
        String str = this.e;
        if (str != null && !"".equals(str)) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append("|");
        sb.append(this.f);
        return sb.toString();
    }

    public String c() {
        return this.i.format(Long.valueOf(System.currentTimeMillis()));
    }
}
