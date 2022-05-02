package com.iap.ac.android.q;

import android.content.Context;
import com.iap.ac.android.d.c;
import java.nio.charset.Charset;
import o.onActivityPreCreated;

public class a implements c {
    public static final Charset b = Charset.forName(setMax(new char[]{35951, 35898, 1298, 7610, 3275, 3814, 34551, 39549, 43619}).intern());
    private static int getMax = 1;
    private static int setMax;
    private static long setMin;

    /* renamed from: a  reason: collision with root package name */
    public Context f11062a;

    static {
        setMin();
        int i = getMax + 41;
        setMax = i % 128;
        if ((i % 2 != 0 ? 'C' : 'Z') == 'C') {
            Object obj = null;
            super.hashCode();
        }
    }

    public a(Context context) {
        this.f11062a = context;
    }

    static void setMin() {
        setMin = 1615870276582443405L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if ((r4.lastModified() ^ com.iap.ac.android.biz.common.configcenter.ConfigCenter.INSTANCE.getMultiLanguageCacheExpirationTime()) > java.lang.System.currentTimeMillis()) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        if ((com.iap.ac.android.biz.common.configcenter.ConfigCenter.INSTANCE.getMultiLanguageCacheExpirationTime() + r4.lastModified() > java.lang.System.currentTimeMillis()) != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0039, code lost:
        if (r4.exists() == false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.iap.ac.android.biz.common.model.http.HttpResponse a(com.iap.ac.android.d.c.a r14) throws java.lang.Exception {
        /*
            r13 = this;
            com.iap.ac.android.d.d r14 = (com.iap.ac.android.d.d) r14
            com.iap.ac.android.biz.common.model.http.HttpRequest r0 = r14.c
            java.lang.String r1 = r0.url
            java.lang.String r2 = r0.data
            android.content.Context r3 = r13.f11062a
            com.iap.ac.android.p.a.a((android.content.Context) r3)
            java.lang.String r4 = com.iap.ac.android.p.a.a((java.lang.String) r1, (java.lang.String) r2)
            java.io.File r3 = com.iap.ac.android.p.a.b(r3)
            r5 = 0
            if (r3 == 0) goto L_0x003e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x003c }
            r6.append(r3)     // Catch:{ Exception -> 0x003c }
            java.lang.String r3 = java.io.File.separator     // Catch:{ Exception -> 0x003c }
            r6.append(r3)     // Catch:{ Exception -> 0x003c }
            r6.append(r4)     // Catch:{ Exception -> 0x003c }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x003c }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x003c }
            r4.<init>(r3)     // Catch:{ Exception -> 0x003c }
            boolean r3 = r4.exists()     // Catch:{ Exception -> 0x003c }
            if (r3 != 0) goto L_0x003f
            goto L_0x003e
        L_0x003c:
            r14 = move-exception
            throw r14
        L_0x003e:
            r4 = r5
        L_0x003f:
            r3 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0045
            r7 = 0
            goto L_0x0046
        L_0x0045:
            r7 = 1
        L_0x0046:
            r8 = 2
            if (r7 == 0) goto L_0x004b
            goto L_0x00e3
        L_0x004b:
            int r7 = getMax
            int r7 = r7 + 51
            int r9 = r7 % 128
            setMax = r9
            int r7 = r7 % r8
            r9 = 62
            if (r7 == 0) goto L_0x005a
            r7 = 4
            goto L_0x005c
        L_0x005a:
            r7 = 62
        L_0x005c:
            if (r7 == r9) goto L_0x0072
            long r9 = r4.lastModified()
            com.iap.ac.android.biz.common.configcenter.ConfigCenter r7 = com.iap.ac.android.biz.common.configcenter.ConfigCenter.INSTANCE
            long r11 = r7.getMultiLanguageCacheExpirationTime()
            long r9 = r9 ^ r11
            long r11 = java.lang.System.currentTimeMillis()
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x00e3
            goto L_0x008a
        L_0x0072:
            long r9 = r4.lastModified()
            com.iap.ac.android.biz.common.configcenter.ConfigCenter r7 = com.iap.ac.android.biz.common.configcenter.ConfigCenter.INSTANCE
            long r11 = r7.getMultiLanguageCacheExpirationTime()
            long r11 = r11 + r9
            long r9 = java.lang.System.currentTimeMillis()
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0087
            r7 = 1
            goto L_0x0088
        L_0x0087:
            r7 = 0
        L_0x0088:
            if (r7 == 0) goto L_0x00e3
        L_0x008a:
            boolean r7 = r4.exists()
            if (r7 == 0) goto L_0x00e3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.io.FileReader r9 = new java.io.FileReader     // Catch:{ all -> 0x00c0 }
            r9.<init>(r4)     // Catch:{ all -> 0x00c0 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x00c0 }
            r4.<init>(r9)     // Catch:{ all -> 0x00c0 }
        L_0x009f:
            java.lang.String r9 = r4.readLine()     // Catch:{ all -> 0x00be }
            r10 = 93
            if (r9 == 0) goto L_0x00aa
            r11 = 46
            goto L_0x00ac
        L_0x00aa:
            r11 = 93
        L_0x00ac:
            if (r11 == r10) goto L_0x00ba
            r7.append(r9)     // Catch:{ all -> 0x00be }
            int r9 = setMax
            int r9 = r9 + r6
            int r10 = r9 % 128
            getMax = r10
            int r9 = r9 % r8
            goto L_0x009f
        L_0x00ba:
            com.iap.ac.android.p.a.a((java.io.Closeable) r4)
            goto L_0x00d9
        L_0x00be:
            r9 = move-exception
            goto L_0x00c3
        L_0x00c0:
            r4 = move-exception
            r9 = r4
            r4 = r5
        L_0x00c3:
            java.lang.String r10 = "HttpCache"
            java.lang.String r11 = "Read str error, error=%s"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00de }
            java.lang.String r9 = com.iap.ac.android.biz.common.utils.Utils.e(r9)     // Catch:{ all -> 0x00de }
            r6[r3] = r9     // Catch:{ all -> 0x00de }
            java.lang.String r3 = java.lang.String.format(r11, r6)     // Catch:{ all -> 0x00de }
            com.iap.ac.android.common.log.ACLog.e(r10, r3)     // Catch:{ all -> 0x00de }
            com.iap.ac.android.p.a.a((java.io.Closeable) r4)
        L_0x00d9:
            java.lang.String r3 = r7.toString()
            goto L_0x00e5
        L_0x00de:
            r14 = move-exception
            com.iap.ac.android.p.a.a((java.io.Closeable) r4)
            throw r14
        L_0x00e3:
            java.lang.String r3 = ""
        L_0x00e5:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00f9
            com.iap.ac.android.biz.common.model.http.HttpResponse r14 = new com.iap.ac.android.biz.common.model.http.HttpResponse
            java.nio.charset.Charset r0 = b
            byte[] r0 = r3.getBytes(r0)
            r1 = 304(0x130, float:4.26E-43)
            r14.<init>(r1, r5, r0, r5)
            return r14
        L_0x00f9:
            com.iap.ac.android.biz.common.model.http.HttpResponse r14 = r14.a(r0)
            int r0 = r14.statusCode
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 != r3) goto L_0x0105
            r0 = 2
            goto L_0x0107
        L_0x0105:
            r0 = 72
        L_0x0107:
            if (r0 == r8) goto L_0x010a
            goto L_0x011e
        L_0x010a:
            byte[] r0 = r14.data
            if (r0 == 0) goto L_0x011e
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            com.iap.ac.android.biz.common.ACManager r0 = com.iap.ac.android.biz.common.ACManager.getInstance()
            android.content.Context r0 = r0.getContext()
            com.iap.ac.android.p.a.a(r0, r1, r2, r3)
        L_0x011e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.q.a.a(com.iap.ac.android.d.c$a):com.iap.ac.android.biz.common.model.http.HttpResponse");
    }

    private static String setMax(char[] cArr) {
        int i = setMax + 41;
        getMax = i % 128;
        if (i % 2 == 0) {
        }
        char[] length = onActivityPreCreated.length(setMin, cArr);
        int i2 = 4;
        while (true) {
            if (i2 >= length.length) {
                return new String(length, 4, length.length - 4);
            }
            int i3 = setMax + 13;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            length[i2] = (char) ((int) (((long) (length[i2] ^ length[i2 % 4])) ^ (((long) (i2 - 4)) * setMin)));
            i2++;
        }
    }
}
