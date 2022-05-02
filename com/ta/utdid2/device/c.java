package com.ta.utdid2.device;

import android.content.Context;
import android.os.Binder;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ta.audid.g.h;
import com.ta.utdid2.a.a.b;
import com.ta.utdid2.a.a.d;
import com.ta.utdid2.a.a.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f9859a = null;
    private static final Object e = new Object();
    private static final String t;

    /* renamed from: a  reason: collision with other field name */
    private com.ta.utdid2.b.a.c f8850a = null;

    /* renamed from: a  reason: collision with other field name */
    private d f8851a = null;
    private com.ta.utdid2.b.a.c b = null;

    /* renamed from: b  reason: collision with other field name */
    private Pattern f8852b = Pattern.compile("[^0-9a-zA-Z=/+]+");

    /* renamed from: e  reason: collision with other field name */
    private String f8853e = null;
    private Context mContext = null;
    private String r = "xx_utdid_key";
    private String s = "xx_utdid_domain";

    static {
        StringBuilder sb = new StringBuilder(".UTSystemConfig");
        sb.append(File.separator);
        sb.append("Global");
        t = sb.toString();
    }

    private c(Context context) {
        this.mContext = context;
        this.b = new com.ta.utdid2.b.a.c(context, t, "Alvin2", false, true);
        this.f8850a = new com.ta.utdid2.b.a.c(context, ".DataStorage", "ContextData", false, true);
        this.f8851a = new d();
        this.r = String.format("K_%d", new Object[]{Integer.valueOf(e.hashCode(this.r))});
        this.s = String.format("D_%d", new Object[]{Integer.valueOf(e.hashCode(this.s))});
    }

    private void l() {
        com.ta.utdid2.b.a.c cVar = this.b;
        if (cVar != null) {
            if (e.isEmpty(cVar.getString("UTDID2"))) {
                String string = this.b.getString("UTDID");
                if (!e.isEmpty(string)) {
                    l(string);
                }
            }
            boolean z = false;
            boolean z2 = true;
            if (!e.isEmpty(this.b.getString("DID"))) {
                this.b.remove("DID");
                z = true;
            }
            if (!e.isEmpty(this.b.getString("EI"))) {
                this.b.remove("EI");
                z = true;
            }
            if (!e.isEmpty(this.b.getString("SI"))) {
                this.b.remove("SI");
            } else {
                z2 = z;
            }
            if (z2) {
                this.b.commit();
            }
        }
    }

    public static c a(Context context) {
        if (context != null && f9859a == null) {
            synchronized (e) {
                if (f9859a == null) {
                    c cVar = new c(context);
                    f9859a = cVar;
                    cVar.l();
                }
            }
        }
        return f9859a;
    }

    private void l(String str) {
        com.ta.utdid2.b.a.c cVar;
        if (b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() == 24 && (cVar = this.b) != null) {
                cVar.putString("UTDID2", str);
                this.b.commit();
            }
        }
    }

    private void m(String str) {
        com.ta.utdid2.b.a.c cVar;
        if (str != null && (cVar = this.f8850a) != null && !str.equals(cVar.getString(this.r))) {
            this.f8850a.putString(this.r, str);
            this.f8850a.commit();
        }
    }

    private void n(String str) {
        if (k() && b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length()) {
                String str2 = null;
                try {
                    str2 = Settings.System.getString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk");
                } catch (Exception unused) {
                }
                if (!b(str2)) {
                    try {
                        Settings.System.putString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk", str);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }

    private void o(String str) {
        String str2;
        try {
            str2 = Settings.System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
        } catch (Exception unused) {
            str2 = null;
        }
        if (!str.equals(str2)) {
            try {
                Settings.System.putString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp", str);
            } catch (Exception unused2) {
            }
        }
    }

    private void p(String str) {
        if (k() && str != null) {
            o(str);
        }
    }

    private String ac() {
        com.ta.utdid2.b.a.c cVar = this.b;
        if (cVar == null) {
            return null;
        }
        String string = cVar.getString("UTDID2");
        if (e.isEmpty(string) || this.f8851a.m(string) == null) {
            return null;
        }
        return string;
    }

    private boolean b(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            return 24 == str.length() && !this.f8852b.matcher(str).find();
        }
    }

    public synchronized String getValue() {
        if (this.f8853e != null) {
            return this.f8853e;
        }
        return ad();
    }

    public synchronized String ad() {
        String ae = ae();
        this.f8853e = ae;
        if (!TextUtils.isEmpty(ae)) {
            return this.f8853e;
        }
        try {
            byte[] b2 = b();
            if (b2 != null) {
                String encodeToString = b.encodeToString(b2, 2);
                this.f8853e = encodeToString;
                l(encodeToString);
                String c = this.f8851a.c(b2);
                if (c != null) {
                    p(c);
                    m(c);
                }
                return this.f8853e;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e4, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0066 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000f */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017 A[SYNTHETIC, Splitter:B:9:0x0017] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String ae() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = ""
            android.content.Context r1 = r6.mContext     // Catch:{ Exception -> 0x000f }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x000f }
            java.lang.String r2 = "mqBRboGZkQPcAkyk"
            java.lang.String r0 = android.provider.Settings.System.getString(r1, r2)     // Catch:{ Exception -> 0x000f }
        L_0x000f:
            boolean r1 = r6.b((java.lang.String) r0)     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r6)
            return r0
        L_0x0017:
            com.ta.utdid2.device.e r0 = new com.ta.utdid2.device.e     // Catch:{ all -> 0x00e5 }
            r0.<init>()     // Catch:{ all -> 0x00e5 }
            r1 = 0
            r2 = 0
            android.content.Context r3 = r6.mContext     // Catch:{ Exception -> 0x002b }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x002b }
            java.lang.String r4 = "dxCRMxhQkdGePGnp"
            java.lang.String r3 = android.provider.Settings.System.getString(r3, r4)     // Catch:{ Exception -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r3 = r2
        L_0x002c:
            boolean r4 = com.ta.utdid2.a.a.e.isEmpty(r3)     // Catch:{ all -> 0x00e5 }
            if (r4 != 0) goto L_0x0083
            java.lang.String r4 = r0.o(r3)     // Catch:{ all -> 0x00e5 }
            boolean r5 = r6.b((java.lang.String) r4)     // Catch:{ all -> 0x00e5 }
            if (r5 == 0) goto L_0x0041
            r6.n(r4)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r6)
            return r4
        L_0x0041:
            java.lang.String r4 = r0.n(r3)     // Catch:{ all -> 0x00e5 }
            boolean r5 = r6.b((java.lang.String) r4)     // Catch:{ all -> 0x00e5 }
            if (r5 == 0) goto L_0x0066
            com.ta.utdid2.device.d r5 = r6.f8851a     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = r5.m(r4)     // Catch:{ all -> 0x00e5 }
            boolean r5 = com.ta.utdid2.a.a.e.isEmpty(r4)     // Catch:{ all -> 0x00e5 }
            if (r5 != 0) goto L_0x0066
            r6.p(r4)     // Catch:{ all -> 0x00e5 }
            android.content.Context r4 = r6.mContext     // Catch:{ Exception -> 0x0066 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r5 = "dxCRMxhQkdGePGnp"
            java.lang.String r3 = android.provider.Settings.System.getString(r4, r5)     // Catch:{ Exception -> 0x0066 }
        L_0x0066:
            com.ta.utdid2.device.d r4 = r6.f8851a     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = r4.n(r3)     // Catch:{ all -> 0x00e5 }
            boolean r5 = r6.b((java.lang.String) r4)     // Catch:{ all -> 0x00e5 }
            if (r5 == 0) goto L_0x0084
            r6.f8853e = r4     // Catch:{ all -> 0x00e5 }
            r6.l(r4)     // Catch:{ all -> 0x00e5 }
            r6.m(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = r6.f8853e     // Catch:{ all -> 0x00e5 }
            r6.n(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = r6.f8853e     // Catch:{ all -> 0x00e5 }
            monitor-exit(r6)
            return r0
        L_0x0083:
            r1 = 1
        L_0x0084:
            java.lang.String r3 = r6.ac()     // Catch:{ all -> 0x00e5 }
            boolean r4 = r6.b((java.lang.String) r3)     // Catch:{ all -> 0x00e5 }
            if (r4 == 0) goto L_0x00a3
            com.ta.utdid2.device.d r0 = r6.f8851a     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = r0.m(r3)     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x0099
            r6.p(r0)     // Catch:{ all -> 0x00e5 }
        L_0x0099:
            r6.n(r3)     // Catch:{ all -> 0x00e5 }
            r6.m(r0)     // Catch:{ all -> 0x00e5 }
            r6.f8853e = r3     // Catch:{ all -> 0x00e5 }
            monitor-exit(r6)
            return r3
        L_0x00a3:
            com.ta.utdid2.b.a.c r3 = r6.f8850a     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = r6.r     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x00e5 }
            boolean r4 = com.ta.utdid2.a.a.e.isEmpty(r3)     // Catch:{ all -> 0x00e5 }
            if (r4 != 0) goto L_0x00e3
            java.lang.String r0 = r0.n(r3)     // Catch:{ all -> 0x00e5 }
            boolean r4 = r6.b((java.lang.String) r0)     // Catch:{ all -> 0x00e5 }
            if (r4 != 0) goto L_0x00c1
            com.ta.utdid2.device.d r0 = r6.f8851a     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = r0.n(r3)     // Catch:{ all -> 0x00e5 }
        L_0x00c1:
            boolean r3 = r6.b((java.lang.String) r0)     // Catch:{ all -> 0x00e5 }
            if (r3 == 0) goto L_0x00e3
            com.ta.utdid2.device.d r3 = r6.f8851a     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = r3.m(r0)     // Catch:{ all -> 0x00e5 }
            boolean r4 = com.ta.utdid2.a.a.e.isEmpty(r0)     // Catch:{ all -> 0x00e5 }
            if (r4 != 0) goto L_0x00e3
            r6.f8853e = r0     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x00da
            r6.p(r3)     // Catch:{ all -> 0x00e5 }
        L_0x00da:
            java.lang.String r0 = r6.f8853e     // Catch:{ all -> 0x00e5 }
            r6.l(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = r6.f8853e     // Catch:{ all -> 0x00e5 }
            monitor-exit(r6)
            return r0
        L_0x00e3:
            monitor-exit(r6)
            return r2
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.device.c.ae():java.lang.String");
    }

    private byte[] b() throws Exception {
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nextInt = new Random().nextInt();
        byte[] bytes = com.ta.utdid2.a.a.c.getBytes(currentTimeMillis);
        byte[] bytes2 = com.ta.utdid2.a.a.c.getBytes(nextInt);
        byteArrayOutputStream.write(bytes, 0, 4);
        byteArrayOutputStream.write(bytes2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = d.getImei(this.mContext);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("");
            sb.append(new Random().nextInt());
            str = sb.toString();
        }
        byteArrayOutputStream.write(com.ta.utdid2.a.a.c.getBytes(e.hashCode(str)), 0, 4);
        byteArrayOutputStream.write(com.ta.utdid2.a.a.c.getBytes(e.hashCode(b(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    public static String b(byte[] bArr) throws Exception {
        byte[] bArr2 = {69, 114, 116, -33, 125, -54, -31, 86, -11, Ascii.VT, -78, -96, -17, -99, SignedBytes.MAX_POWER_OF_TWO, Ascii.ETB, -95, -126, -82, -64, 113, 116, -16, -103, Framer.STDOUT_FRAME_PREFIX, -30, 9, -39, Framer.ENTER_FRAME_PREFIX, -80, -68, -78, -117, 53, Ascii.RS, -122, SignedBytes.MAX_POWER_OF_TWO, -104, 74, -49, 106, 85, -38, -93};
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(new SecretKeySpec(h.b(bArr2), instance.getAlgorithm()));
        return b.encodeToString(instance.doFinal(bArr), 2);
    }

    private boolean k() {
        return this.mContext.checkPermission("android.permission.WRITE_SETTINGS", Binder.getCallingPid(), Binder.getCallingUid()) == 0;
    }
}
