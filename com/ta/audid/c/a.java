package com.ta.audid.c;

import android.content.Context;
import android.text.TextUtils;
import com.ta.audid.e.d;
import com.ta.audid.g.f;
import com.ta.audid.g.j;
import com.ta.audid.g.m;
import com.ta.utdid2.device.c;
import java.util.ArrayList;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final a f9835a = new a();
    private String d = "";
    private String e = "";

    private a() {
    }

    public static a a() {
        return f9835a;
    }

    public synchronized String getUtdid() {
        if (!TextUtils.isEmpty(this.e)) {
            return this.e;
        } else if (TextUtils.isEmpty(C())) {
            return "ffffffffffffffffffffffff";
        } else {
            a();
            return this.e;
        }
    }

    public String C() {
        try {
            f.g();
            String D = D();
            if (!TextUtils.isEmpty(D)) {
                m.d("", "read from NewFile:".concat(String.valueOf(D)));
                this.e = D;
                this.d = D;
                f.h();
                return D;
            }
            String ad = c.a(com.ta.audid.a.a().getContext()).ad();
            if (!TextUtils.isEmpty(ad)) {
                m.d("", "read from OldFile:".concat(String.valueOf(ad)));
                this.e = ad;
                this.d = ad;
                f.h();
                return ad;
            }
            f.h();
            return "";
        } catch (Throwable th) {
            f.h();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String D() {
        /*
            r11 = this;
            com.ta.audid.a r0 = com.ta.audid.a.a()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            java.lang.Boolean r2 = com.ta.audid.g.a.a()
            boolean r2 = r2.booleanValue()
            r3 = 5
            if (r2 == 0) goto L_0x0039
            java.lang.String r2 = com.ta.audid.f.e.r(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x0039
            com.ta.audid.c.c r4 = com.ta.audid.c.b.a(r2)
            boolean r5 = r4.isValid()
            if (r5 == 0) goto L_0x0039
            int r4 = r4.getVersion()
            if (r4 != r3) goto L_0x0039
            com.ta.audid.f.e.g(r2)
            com.ta.audid.f.e.e(r2)
            return r2
        L_0x0039:
            java.lang.String r2 = com.ta.audid.f.e.L()
            java.lang.String r4 = com.ta.audid.f.e.S()
            r5 = 0
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            r7 = 0
            if (r6 != 0) goto L_0x0060
            com.ta.audid.c.c r5 = com.ta.audid.c.b.a(r2)
            if (r5 == 0) goto L_0x0060
            int r6 = r5.getVersion()
            if (r6 == r3) goto L_0x005b
            com.ta.audid.f.e.e(r1)
            r2 = r1
            goto L_0x0060
        L_0x005b:
            long r9 = r5.getTimestamp()
            goto L_0x0061
        L_0x0060:
            r9 = r7
        L_0x0061:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x0082
            boolean r6 = r4.equals(r2)
            if (r6 != 0) goto L_0x0071
            com.ta.audid.c.c r5 = com.ta.audid.c.b.a(r4)
        L_0x0071:
            if (r5 == 0) goto L_0x0082
            int r6 = r5.getVersion()
            if (r6 == r3) goto L_0x007e
            com.ta.audid.f.e.g(r1)
            r4 = r1
            goto L_0x0082
        L_0x007e:
            long r7 = r5.getTimestamp()
        L_0x0082:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00a7
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x00a7
            boolean r1 = r2.equals(r4)
            if (r1 == 0) goto L_0x0095
            return r2
        L_0x0095:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x00a0
            com.ta.audid.f.e.g(r2)
            com.ta.audid.f.e.a(r0, r2)
            return r2
        L_0x00a0:
            com.ta.audid.f.e.e(r4)
            com.ta.audid.f.e.a(r0, r4)
            return r4
        L_0x00a7:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00ba
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 == 0) goto L_0x00ba
            com.ta.audid.f.e.g(r2)
            com.ta.audid.f.e.a(r0, r2)
            return r2
        L_0x00ba:
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00cd
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x00cd
            com.ta.audid.f.e.e(r4)
            com.ta.audid.f.e.a(r0, r4)
            return r4
        L_0x00cd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.c.a.D():java.lang.String");
    }

    /* renamed from: a  reason: collision with other method in class */
    private void m1319a() {
        m.d();
        if (!TextUtils.isEmpty(this.d)) {
            try {
                j.a().submit(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(30000);
                            com.ta.audid.filesync.a.a().c(a.a(a.this));
                            a.a(a.this);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(com.ta.audid.e.c.c(a.a(a.this)));
                            d.a().a(arrayList);
                        } catch (Throwable th) {
                            m.d("", th);
                        }
                    }
                });
            } catch (Throwable th) {
                m.d("", th);
            }
        }
    }

    private void b() {
        Context context = com.ta.audid.a.a().getContext();
        if (context != null) {
            com.ta.audid.e.a.a(com.ta.audid.a.c.a(context), com.ta.audid.a.c.b(context));
        }
    }

    public synchronized void b(String str) {
        this.d = str;
    }

    public synchronized String E() {
        return this.d;
    }
}
