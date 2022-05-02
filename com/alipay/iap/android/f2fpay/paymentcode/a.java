package com.alipay.iap.android.f2fpay.paymentcode;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f9325a = new Object();
    private int b = 2;
    private Queue<C0013a> c = new LinkedList();

    /* renamed from: com.alipay.iap.android.f2fpay.paymentcode.a$a  reason: collision with other inner class name */
    static class C0013a extends F2FPaymentCodeInfo {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f9326a = System.currentTimeMillis();

        C0013a(String str, String str2) {
            super(str, str2);
        }
    }

    private boolean c() {
        return this.c.size() >= this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0030 A[EDGE_INSN: B:25:0x0030->B:15:0x0030 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = -1
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r7.f9325a
            monitor-enter(r0)
            r3 = 0
            java.util.Queue<com.alipay.iap.android.f2fpay.paymentcode.a$a> r4 = r7.c     // Catch:{ all -> 0x003a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x003a }
        L_0x0013:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0030
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x003a }
            com.alipay.iap.android.f2fpay.paymentcode.a$a r5 = (com.alipay.iap.android.f2fpay.paymentcode.a.C0013a) r5     // Catch:{ all -> 0x003a }
            java.lang.String r6 = r5.paymentCode     // Catch:{ all -> 0x003a }
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x003a }
            if (r6 != 0) goto L_0x002f
            java.lang.String r6 = r5.totp     // Catch:{ all -> 0x003a }
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x003a }
            if (r6 == 0) goto L_0x0013
        L_0x002f:
            r3 = r5
        L_0x0030:
            if (r3 == 0) goto L_0x0038
            long r1 = r3.f9326a     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return r1
        L_0x0038:
            monitor-exit(r0)
            return r1
        L_0x003a:
            r8 = move-exception
            monitor-exit(r0)
            goto L_0x003e
        L_0x003d:
            throw r8
        L_0x003e:
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.f2fpay.paymentcode.a.a(java.lang.String):long");
    }

    @NonNull
    public List<String> a() {
        ArrayList arrayList;
        synchronized (this.f9325a) {
            arrayList = new ArrayList();
            for (C0013a aVar : this.c) {
                if (!TextUtils.isEmpty(aVar.paymentCode)) {
                    arrayList.add(aVar.paymentCode);
                }
                if (!TextUtils.isEmpty(aVar.totp)) {
                    arrayList.add(aVar.totp);
                }
            }
        }
        return arrayList;
    }

    public void a(int i) {
        synchronized (this.f9325a) {
            this.b = i;
            while (c()) {
                this.c.poll();
            }
        }
    }

    public void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            synchronized (this.f9325a) {
                for (C0013a aVar : this.c) {
                    if (TextUtils.equals(str, aVar.paymentCode) && TextUtils.equals(str2, aVar.totp)) {
                        return;
                    }
                }
                while (c()) {
                    this.c.poll();
                }
                this.c.offer(new C0013a(str, str2));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r6 != (r2 - 1)) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r4.remove();
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = -1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.Object r0 = r10.f9325a
            monitor-enter(r0)
            java.util.Queue<com.alipay.iap.android.f2fpay.paymentcode.a$a> r2 = r10.c     // Catch:{ all -> 0x0050 }
            int r2 = r2.size()     // Catch:{ all -> 0x0050 }
            r3 = 0
            java.util.Queue<com.alipay.iap.android.f2fpay.paymentcode.a$a> r4 = r10.c     // Catch:{ all -> 0x0050 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0050 }
            r5 = 0
            r6 = 0
        L_0x001a:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x0050 }
            r8 = 1
            if (r7 == 0) goto L_0x0046
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x0050 }
            com.alipay.iap.android.f2fpay.paymentcode.a$a r7 = (com.alipay.iap.android.f2fpay.paymentcode.a.C0013a) r7     // Catch:{ all -> 0x0050 }
            java.lang.String r9 = r7.paymentCode     // Catch:{ all -> 0x0050 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0050 }
            if (r9 != 0) goto L_0x003b
            java.lang.String r9 = r7.totp     // Catch:{ all -> 0x0050 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0050 }
            if (r9 == 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x003b:
            int r2 = r2 - r8
            if (r6 != r2) goto L_0x0040
            r11 = 1
            goto L_0x0041
        L_0x0040:
            r11 = 0
        L_0x0041:
            r4.remove()     // Catch:{ all -> 0x0050 }
            r3 = r7
            goto L_0x0047
        L_0x0046:
            r11 = 0
        L_0x0047:
            if (r3 == 0) goto L_0x004e
            if (r11 == 0) goto L_0x004c
            r5 = 1
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r5
        L_0x004e:
            monitor-exit(r0)
            return r1
        L_0x0050:
            r11 = move-exception
            monitor-exit(r0)
            goto L_0x0054
        L_0x0053:
            throw r11
        L_0x0054:
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.f2fpay.paymentcode.a.b(java.lang.String):int");
    }

    public void b() {
        synchronized (this.f9325a) {
            this.c.clear();
        }
    }
}
