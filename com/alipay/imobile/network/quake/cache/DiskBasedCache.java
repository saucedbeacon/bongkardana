package com.alipay.imobile.network.quake.cache;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.Quake;
import com.alipay.imobile.network.quake.cache.Cache;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Typography;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class DiskBasedCache implements Cache {
    private static int getMin = 145;
    private static int length = 0;
    private static int setMax = 1;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f9351a;
    private long b;
    private final File c;
    private int d;
    private boolean e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f9352a;
        public String b;
        public String c;
        public long d;
        public long e;
        public long f;
        public Map<String, String> g;

        private a() {
        }

        public a(String str, Cache.Entry entry) {
            this.b = str;
            this.f9352a = (long) entry.data.length;
            this.c = entry.dataVersion;
            this.d = entry.lastModified;
            this.e = entry.finalExpireTime;
            this.f = entry.softExpireTime;
            this.g = entry.extData;
        }

        public static a a(InputStream inputStream) throws IOException {
            a aVar = new a();
            if (DiskBasedCache.readInt(inputStream) == 538247942) {
                aVar.b = DiskBasedCache.readString(inputStream);
                String readString = DiskBasedCache.readString(inputStream);
                aVar.c = readString;
                if ("".equals(readString)) {
                    aVar.c = null;
                }
                aVar.d = DiskBasedCache.readLong(inputStream);
                aVar.e = DiskBasedCache.readLong(inputStream);
                aVar.f = DiskBasedCache.readLong(inputStream);
                aVar.g = DiskBasedCache.readStringStringMap(inputStream);
                return aVar;
            }
            throw new IOException();
        }

        public Cache.Entry a(byte[] bArr) {
            Cache.Entry entry = new Cache.Entry();
            entry.data = bArr;
            entry.dataVersion = this.c;
            entry.lastModified = this.d;
            entry.finalExpireTime = this.e;
            entry.softExpireTime = this.f;
            entry.extData = this.g;
            return entry;
        }

        public boolean a(OutputStream outputStream) {
            try {
                DiskBasedCache.writeInt(outputStream, 538247942);
                DiskBasedCache.writeString(outputStream, this.b);
                DiskBasedCache.writeString(outputStream, this.c == null ? "" : this.c);
                DiskBasedCache.writeLong(outputStream, this.d);
                DiskBasedCache.writeLong(outputStream, this.e);
                DiskBasedCache.writeLong(outputStream, this.f);
                DiskBasedCache.writeStringStringMap(this.g, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e2) {
                LoggerWrapper.e(Quake.TAG, e2.getMessage(), e2);
                return false;
            }
        }
    }

    static class b extends FilterInputStream {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f9353a;

        private b(InputStream inputStream) {
            super(inputStream);
            this.f9353a = 0;
        }

        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f9353a++;
            }
            return read;
        }

        public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f9353a += read;
            }
            return read;
        }
    }

    public DiskBasedCache(File file) {
        this(file, 5242880);
    }

    public DiskBasedCache(File file, int i) {
        try {
            this.f9351a = new LinkedHashMap(16, 0.75f, true);
            this.b = 0;
            this.e = false;
            this.c = file;
            this.d = i;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r3 != -1) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r3 != -1) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.io.InputStream r3) throws java.io.IOException {
        /*
            int r0 = setMax
            int r0 = r0 + 47
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r1 = 62
            if (r0 == 0) goto L_0x0011
            r0 = 62
            goto L_0x0013
        L_0x0011:
            r0 = 85
        L_0x0013:
            r2 = -1
            int r3 = r3.read()
            if (r0 == r1) goto L_0x001d
            if (r3 == r2) goto L_0x0040
            goto L_0x0023
        L_0x001d:
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x0046 }
            if (r3 == r2) goto L_0x0040
        L_0x0023:
            int r0 = length
            int r0 = r0 + 123
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 39
            if (r0 != 0) goto L_0x0034
            r0 = 10
            goto L_0x0036
        L_0x0034:
            r0 = 39
        L_0x0036:
            if (r0 == r1) goto L_0x003f
            r0 = 80
            int r0 = r0 / 0
            return r3
        L_0x003d:
            r3 = move-exception
            throw r3
        L_0x003f:
            return r3
        L_0x0040:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L_0x0046:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.cache.DiskBasedCache.a(java.io.InputStream):int");
    }

    private String a(String str) {
        int length2 = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length2).hashCode());
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf);
        sb.append(String.valueOf(str.substring(length2).hashCode()));
        String obj = sb.toString();
        int i = setMax + 123;
        length = i % 128;
        int i2 = i % 2;
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        if (r0 != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        if (com.alipay.iap.android.common.log.LoggerWrapper.isDebuggable() != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r15) {
        /*
            r14 = this;
            int r0 = setMax     // Catch:{ Exception -> 0x0123 }
            int r0 = r0 + 29
            int r1 = r0 % 128
            length = r1     // Catch:{ Exception -> 0x0123 }
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x001c
            boolean r0 = com.alipay.iap.android.common.log.LoggerWrapper.isDebuggable()     // Catch:{ Exception -> 0x0019 }
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0049
            goto L_0x0022
        L_0x0017:
            r15 = move-exception
            throw r15
        L_0x0019:
            r15 = move-exception
            goto L_0x0122
        L_0x001c:
            boolean r0 = com.alipay.iap.android.common.log.LoggerWrapper.isDebuggable()
            if (r0 == 0) goto L_0x0049
        L_0x0022:
            java.lang.String r0 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Pruning currentSize="
            r2.<init>(r3)
            long r3 = r14.b
            r2.append(r3)
            java.lang.String r3 = ", need="
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = ", maxSize="
            r2.append(r3)
            int r3 = r14.d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.alipay.iap.android.common.log.LoggerWrapper.v(r0, r2)
        L_0x0049:
            long r2 = r14.b
            long r4 = (long) r15
            long r2 = r2 + r4
            int r15 = r14.d
            long r6 = (long) r15
            int r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x0055
            return
        L_0x0055:
            java.lang.String r15 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.String r0 = "Pruning old cache entries"
            com.alipay.iap.android.common.log.LoggerWrapper.v(r15, r0)
            long r2 = r14.b
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.cache.DiskBasedCache$a> r15 = r14.f9351a
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
            r0 = 0
            r8 = 0
        L_0x006e:
            boolean r9 = r15.hasNext()
            r10 = 42
            if (r9 == 0) goto L_0x0079
            r9 = 93
            goto L_0x007b
        L_0x0079:
            r9 = 42
        L_0x007b:
            r11 = 1
            if (r9 == r10) goto L_0x00f9
            int r9 = length
            int r9 = r9 + 95
            int r10 = r9 % 128
            setMax = r10
            int r9 = r9 % r1
            java.lang.Object r9 = r15.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r9 = r9.getValue()
            com.alipay.imobile.network.quake.cache.DiskBasedCache$a r9 = (com.alipay.imobile.network.quake.cache.DiskBasedCache.a) r9
            java.lang.String r10 = r9.b
            java.io.File r10 = r14.getFileForKey(r10)
            boolean r10 = r10.delete()
            if (r10 == 0) goto L_0x00c1
            int r10 = length
            int r10 = r10 + 111
            int r12 = r10 % 128
            setMax = r12
            int r10 = r10 % r1
            r12 = 55
            if (r10 != 0) goto L_0x00af
            r10 = 89
            goto L_0x00b1
        L_0x00af:
            r10 = 55
        L_0x00b1:
            if (r10 == r12) goto L_0x00b9
            long r12 = r14.b
            long r9 = r9.f9352a
            long r12 = r12 + r9
            goto L_0x00be
        L_0x00b9:
            long r12 = r14.b
            long r9 = r9.f9352a
            long r12 = r12 - r9
        L_0x00be:
            r14.b = r12
            goto L_0x00da
        L_0x00c1:
            java.lang.String r10 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.String r13 = r9.b
            r12[r0] = r13
            java.lang.String r9 = r9.b
            java.lang.String r9 = r14.a((java.lang.String) r9)
            r12[r11] = r9
            java.lang.String r9 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.String r9 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r9, r12)
            com.alipay.iap.android.common.log.LoggerWrapper.d(r10, r9)
        L_0x00da:
            r15.remove()
            int r8 = r8 + 1
            long r9 = r14.b
            long r9 = r9 + r4
            float r9 = (float) r9
            int r10 = r14.d
            float r10 = (float) r10
            r12 = 1063675494(0x3f666666, float:0.9)
            float r10 = r10 * r12
            r12 = 43
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L_0x00f4
            r9 = 43
            goto L_0x00f5
        L_0x00f4:
            r9 = 5
        L_0x00f5:
            if (r9 == r12) goto L_0x00f9
            goto L_0x006e
        L_0x00f9:
            java.lang.String r15 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ Exception -> 0x0123 }
            java.lang.String r4 = "pruned %d files, %d bytes, %d ms"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r0] = r8
            long r8 = r14.b
            long r8 = r8 - r2
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r5[r11] = r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r6
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5[r1] = r0
            java.lang.String r0 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r4, r5)
            com.alipay.iap.android.common.log.LoggerWrapper.v(r15, r0)
            return
        L_0x0122:
            throw r15
        L_0x0123:
            r15 = move-exception
            goto L_0x0126
        L_0x0125:
            throw r15
        L_0x0126:
            goto L_0x0125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.cache.DiskBasedCache.a(int):void");
    }

    private void a(String str, a aVar) {
        int i = 0;
        if (!(str == null)) {
            int i2 = setMax + 43;
            length = i2 % 128;
            int i3 = i2 % 2;
            i = str.length();
        } else {
            int i4 = setMax + 41;
            length = i4 % 128;
            int i5 = i4 % 2;
        }
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            try {
                onCancelLoad.setMax(-2107961325, oncanceled);
                onCancelLoad.getMin(-2107961325, oncanceled);
            } catch (Exception e2) {
                throw e2;
            }
        }
        if ((!this.f9351a.containsKey(str) ? 'T' : '7') != 'T') {
            this.b += aVar.f9352a - this.f9351a.get(str).f9352a;
        } else {
            this.b += aVar.f9352a;
        }
        this.f9351a.put(str, aVar);
    }

    private static byte[] a(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            if ((i2 < i ? 3 : '@') != 3) {
                break;
            }
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            int i3 = setMax + 33;
            length = i3 % 128;
            i2 = (i3 % 2 != 0 ? ';' : 8) != 8 ? i2 - read : i2 + read;
        }
        if (i2 == i) {
            int i4 = length + 115;
            setMax = i4 % 128;
            int i5 = i4 % 2;
            return bArr;
        }
        try {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(i);
            sb.append(" bytes, read ");
            sb.append(i2);
            sb.append(" bytes");
            throw new IOException(sb.toString());
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r2 != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r0 != null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = setMax
            int r0 = r0 + 93
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == r2) goto L_0x0025
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.cache.DiskBasedCache$a> r0 = r6.f9351a
            java.lang.Object r0 = r0.get(r7)
            com.alipay.imobile.network.quake.cache.DiskBasedCache$a r0 = (com.alipay.imobile.network.quake.cache.DiskBasedCache.a) r0
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0020
            r2 = 0
        L_0x0020:
            if (r2 == 0) goto L_0x002f
            goto L_0x003e
        L_0x0023:
            r7 = move-exception
            throw r7
        L_0x0025:
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.cache.DiskBasedCache$a> r0 = r6.f9351a
            java.lang.Object r0 = r0.get(r7)
            com.alipay.imobile.network.quake.cache.DiskBasedCache$a r0 = (com.alipay.imobile.network.quake.cache.DiskBasedCache.a) r0
            if (r0 == 0) goto L_0x003e
        L_0x002f:
            long r2 = r6.b     // Catch:{ Exception -> 0x003c }
            long r4 = r0.f9352a     // Catch:{ Exception -> 0x003c }
            long r2 = r2 - r4
            r6.b = r2     // Catch:{ Exception -> 0x003c }
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.cache.DiskBasedCache$a> r0 = r6.f9351a     // Catch:{ Exception -> 0x003c }
            r0.remove(r7)     // Catch:{ Exception -> 0x003c }
            goto L_0x003e
        L_0x003c:
            r7 = move-exception
            throw r7
        L_0x003e:
            int r7 = length
            r0 = 75
            int r7 = r7 + r0
            int r2 = r7 % 128
            setMax = r2
            int r7 = r7 % 2
            r2 = 96
            if (r7 != 0) goto L_0x0050
            r7 = 96
            goto L_0x0052
        L_0x0050:
            r7 = 29
        L_0x0052:
            if (r7 == r2) goto L_0x0055
            return
        L_0x0055:
            int r0 = r0 / r1
            return
        L_0x0057:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.cache.DiskBasedCache.b(java.lang.String):void");
    }

    public static int readInt(InputStream inputStream) throws IOException {
        int i = setMax + 101;
        length = i % 128;
        if (!(i % 2 == 0)) {
            return (a(inputStream) % 92) ^ (((a(inputStream) & 1) | (a(inputStream) / 117)) ^ (a(inputStream) * 9));
        }
        return (a(inputStream) << 24) | a(inputStream) | 0 | (a(inputStream) << 8) | (a(inputStream) << 16);
    }

    public static long readLong(InputStream inputStream) throws IOException {
        int i = setMax + 73;
        length = i % 128;
        int i2 = i % 2;
        long a2 = 0 | (((long) a(inputStream)) & 255) | ((((long) a(inputStream)) & 255) << 8) | ((((long) a(inputStream)) & 255) << 16) | ((((long) a(inputStream)) & 255) << 24) | ((((long) a(inputStream)) & 255) << 32) | ((((long) a(inputStream)) & 255) << 40) | ((((long) a(inputStream)) & 255) << 48) | ((((long) a(inputStream)) & 255) << 56);
        try {
            int i3 = length + 1;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return a2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static String readString(InputStream inputStream) throws IOException {
        boolean z = false;
        String str = new String(a(inputStream, (int) readLong(inputStream)), setMax(213 - TextUtils.indexOf("", "", 0), (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 2, new char[]{2, 65513, 65524, 17, 16}, Gravity.isHorizontal(0), ImageFormat.getBitsPerPixel(0) + 6).intern());
        int i = setMax + 109;
        length = i % 128;
        if (i % 2 != 0) {
            z = true;
        }
        if (!z) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    public static Map<String, String> readStringStringMap(InputStream inputStream) throws IOException {
        Map<String, String> map;
        int readInt = readInt(inputStream);
        int i = 0;
        if (!(readInt == 0)) {
            map = new HashMap<>(readInt);
        } else {
            int i2 = setMax + 43;
            length = i2 % 128;
            int i3 = i2 % 2;
            map = Collections.emptyMap();
        }
        while (true) {
            if ((i < readInt ? (char) 24 : 18) != 24) {
                return map;
            }
            int i4 = length + 33;
            setMax = i4 % 128;
            int i5 = i4 % 2;
            map.put(readString(inputStream).intern(), readString(inputStream).intern());
            i++;
            int i6 = length + 65;
            setMax = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static void writeInt(OutputStream outputStream, int i) throws IOException {
        int i2 = setMax + 97;
        length = i2 % 128;
        int i3 = i2 % 2;
        try {
            outputStream.write(i & 255);
            outputStream.write((i >> 8) & 255);
            outputStream.write((i >> 16) & 255);
            outputStream.write((i >> 24) & 255);
            int i4 = setMax + 37;
            length = i4 % 128;
            if ((i4 % 2 != 0 ? 16 : '!') != '!') {
                Object[] objArr = null;
                int length2 = objArr.length;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static void writeLong(OutputStream outputStream, long j) throws IOException {
        try {
            int i = length + 49;
            setMax = i % 128;
            int i2 = i % 2;
            outputStream.write((byte) ((int) j));
            outputStream.write((byte) ((int) (j >>> 8)));
            outputStream.write((byte) ((int) (j >>> 16)));
            outputStream.write((byte) ((int) (j >>> 24)));
            outputStream.write((byte) ((int) (j >>> 32)));
            outputStream.write((byte) ((int) (j >>> 40)));
            outputStream.write((byte) ((int) (j >>> 48)));
            outputStream.write((byte) ((int) (j >>> 56)));
            int i3 = setMax + 55;
            length = i3 % 128;
            if ((i3 % 2 != 0 ? 20 : '\'') == 20) {
                int i4 = 20 / 0;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static void writeString(OutputStream outputStream, String str) throws IOException {
        int i = length + 13;
        setMax = i % 128;
        int i2 = i % 2;
        byte[] bytes = str.getBytes(setMax(213 - View.MeasureSpec.makeMeasureSpec(0, 0), 4 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)), new char[]{2, 65513, 65524, 17, 16}, PhoneNumberUtils.isVoiceMailNumber(""), 5 - Color.argb(0, 0, 0, 0)).intern());
        writeLong(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
        int i3 = length + 101;
        setMax = i3 % 128;
        if (!(i3 % 2 != 0)) {
            int i4 = 91 / 0;
        }
    }

    public static void writeStringStringMap(Map<String, String> map, OutputStream outputStream) throws IOException {
        Iterator<Map.Entry<String, String>> it;
        if (map == null) {
            writeInt(outputStream, 0);
            return;
        }
        int i = length + 91;
        setMax = i % 128;
        Object[] objArr = null;
        if ((i % 2 == 0 ? ',' : '6') != ',') {
            try {
                writeInt(outputStream, map.size());
                it = map.entrySet().iterator();
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            try {
                writeInt(outputStream, map.size());
                it = map.entrySet().iterator();
                int length2 = objArr.length;
            } catch (Exception e3) {
                throw e3;
            }
        }
        while (true) {
            if ((it.hasNext() ? 'V' : 23) != 23) {
                int i2 = setMax + 3;
                length = i2 % 128;
                if (i2 % 2 != 0) {
                    Map.Entry next = it.next();
                    writeString(outputStream, (String) next.getKey());
                    writeString(outputStream, (String) next.getValue());
                    int length3 = objArr.length;
                } else {
                    Map.Entry next2 = it.next();
                    writeString(outputStream, (String) next2.getKey());
                    writeString(outputStream, (String) next2.getValue());
                }
                int i3 = setMax + 11;
                length = i3 % 128;
                int i4 = i3 % 2;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if ((r0 == null) != true) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void clear() {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = length     // Catch:{ all -> 0x0073 }
            int r0 = r0 + 123
            int r1 = r0 % 128
            setMax = r1     // Catch:{ all -> 0x0073 }
            int r0 = r0 % 2
            r1 = 68
            r2 = 25
            if (r0 != 0) goto L_0x0014
            r0 = 68
            goto L_0x0016
        L_0x0014:
            r0 = 25
        L_0x0016:
            r3 = 0
            if (r0 == r1) goto L_0x0022
            java.io.File r0 = r6.c     // Catch:{ all -> 0x0073 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x005b
            goto L_0x0032
        L_0x0022:
            java.io.File r0 = r6.c     // Catch:{ all -> 0x0073 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0073 }
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x0071 }
            r1 = 1
            if (r0 == 0) goto L_0x002f
            r4 = 0
            goto L_0x0030
        L_0x002f:
            r4 = 1
        L_0x0030:
            if (r4 == r1) goto L_0x005b
        L_0x0032:
            int r1 = setMax     // Catch:{ all -> 0x0073 }
            int r1 = r1 + 95
            int r4 = r1 % 128
            length = r4     // Catch:{ all -> 0x0073 }
            int r1 = r1 % 2
            int r1 = r0.length     // Catch:{ all -> 0x0073 }
        L_0x003d:
            r4 = 72
            if (r3 >= r1) goto L_0x0044
            r5 = 72
            goto L_0x0046
        L_0x0044:
            r5 = 25
        L_0x0046:
            if (r5 == r4) goto L_0x0049
            goto L_0x005b
        L_0x0049:
            r4 = r0[r3]     // Catch:{ all -> 0x0073 }
            r4.delete()     // Catch:{ all -> 0x0073 }
            int r3 = r3 + 1
            int r4 = length     // Catch:{ all -> 0x0073 }
            int r4 = r4 + 111
            int r5 = r4 % 128
            setMax = r5     // Catch:{ all -> 0x0073 }
            int r4 = r4 % 2
            goto L_0x003d
        L_0x005b:
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.cache.DiskBasedCache$a> r0 = r6.f9351a     // Catch:{ Exception -> 0x006f }
            r0.clear()     // Catch:{ Exception -> 0x006f }
            r0 = 0
            r6.b = r0     // Catch:{ Exception -> 0x006d }
            java.lang.String r0 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ Exception -> 0x006d }
            java.lang.String r1 = "Cache cleared."
            com.alipay.iap.android.common.log.LoggerWrapper.d(r0, r1)     // Catch:{ Exception -> 0x006d }
            monitor-exit(r6)
            return
        L_0x006d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x006f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0071:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            monitor-exit(r6)
            goto L_0x0077
        L_0x0076:
            throw r0
        L_0x0077:
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.cache.DiskBasedCache.clear():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a A[SYNTHETIC, Splitter:B:56:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8 A[SYNTHETIC, Splitter:B:68:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e3 A[SYNTHETIC, Splitter:B:79:0x00e3] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:65:0x00aa=Splitter:B:65:0x00aa, B:53:0x007c=Splitter:B:53:0x007c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.alipay.imobile.network.quake.cache.Cache.Entry get(java.lang.String r12) throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            int r0 = length     // Catch:{ Exception -> 0x00f2 }
            int r0 = r0 + 3
            int r1 = r0 % 128
            setMax = r1     // Catch:{ Exception -> 0x00f2 }
            r1 = 2
            int r0 = r0 % r1
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x00f0 }
            r2 = 71
            if (r0 == 0) goto L_0x0016
            r0 = 9
            goto L_0x0018
        L_0x0016:
            r0 = 71
        L_0x0018:
            r3 = 0
            if (r0 == r2) goto L_0x002f
            int r12 = setMax     // Catch:{ Exception -> 0x002d }
            int r12 = r12 + 27
            int r0 = r12 % 128
            length = r0     // Catch:{ Exception -> 0x00f2 }
            int r12 = r12 % r1
            java.lang.String r12 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "can not get the cache entry with a null key"
            com.alipay.iap.android.common.log.LoggerWrapper.d(r12, r0)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r11)
            return r3
        L_0x002d:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00f0 }
        L_0x002f:
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.cache.DiskBasedCache$a> r0 = r11.f9351a     // Catch:{ all -> 0x00f0 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x00f0 }
            com.alipay.imobile.network.quake.cache.DiskBasedCache$a r0 = (com.alipay.imobile.network.quake.cache.DiskBasedCache.a) r0     // Catch:{ all -> 0x00f0 }
            if (r0 != 0) goto L_0x003b
            monitor-exit(r11)
            return r3
        L_0x003b:
            java.io.File r2 = r11.getFileForKey(r12)     // Catch:{ all -> 0x00f0 }
            r4 = 1
            r5 = 0
            com.alipay.imobile.network.quake.cache.DiskBasedCache$b r6 = new com.alipay.imobile.network.quake.cache.DiskBasedCache$b     // Catch:{ IOException -> 0x00a8, NegativeArraySizeException -> 0x007a, all -> 0x0078 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00a8, NegativeArraySizeException -> 0x007a, all -> 0x0078 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00a8, NegativeArraySizeException -> 0x007a, all -> 0x0078 }
            r8.<init>(r2)     // Catch:{ IOException -> 0x00a8, NegativeArraySizeException -> 0x007a, all -> 0x0078 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x00a8, NegativeArraySizeException -> 0x007a, all -> 0x0078 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00a8, NegativeArraySizeException -> 0x007a, all -> 0x0078 }
            com.alipay.imobile.network.quake.cache.DiskBasedCache.a.a((java.io.InputStream) r6)     // Catch:{ IOException -> 0x0076, NegativeArraySizeException -> 0x0074 }
            long r7 = r2.length()     // Catch:{ IOException -> 0x0076, NegativeArraySizeException -> 0x0074 }
            int r9 = r6.f9353a     // Catch:{ IOException -> 0x0076, NegativeArraySizeException -> 0x0074 }
            long r9 = (long) r9     // Catch:{ IOException -> 0x0076, NegativeArraySizeException -> 0x0074 }
            long r7 = r7 - r9
            int r8 = (int) r7     // Catch:{ IOException -> 0x0076, NegativeArraySizeException -> 0x0074 }
            byte[] r7 = a((java.io.InputStream) r6, (int) r8)     // Catch:{ IOException -> 0x0076, NegativeArraySizeException -> 0x0074 }
            com.alipay.imobile.network.quake.cache.Cache$Entry r12 = r0.a((byte[]) r7)     // Catch:{ IOException -> 0x0076, NegativeArraySizeException -> 0x0074 }
            r6.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x0072
        L_0x006a:
            r0 = move-exception
            java.lang.String r1 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = ""
            com.alipay.iap.android.common.log.LoggerWrapper.e(r1, r2, r0)     // Catch:{ all -> 0x00f0 }
        L_0x0072:
            monitor-exit(r11)
            return r12
        L_0x0074:
            r0 = move-exception
            goto L_0x007c
        L_0x0076:
            r0 = move-exception
            goto L_0x00aa
        L_0x0078:
            r12 = move-exception
            goto L_0x00e1
        L_0x007a:
            r0 = move-exception
            r6 = r3
        L_0x007c:
            java.lang.String r7 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00df }
            java.lang.String r8 = "%s: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x00df }
            r1[r5] = r2     // Catch:{ all -> 0x00df }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00df }
            r1[r4] = r0     // Catch:{ all -> 0x00df }
            java.lang.String r0 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r8, r1)     // Catch:{ all -> 0x00df }
            com.alipay.iap.android.common.log.LoggerWrapper.d(r7, r0)     // Catch:{ all -> 0x00df }
            r11.remove(r12)     // Catch:{ all -> 0x00df }
            if (r6 == 0) goto L_0x00a6
            r6.close()     // Catch:{ IOException -> 0x009e }
            goto L_0x00a6
        L_0x009e:
            r12 = move-exception
            java.lang.String r0 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = ""
            com.alipay.iap.android.common.log.LoggerWrapper.e(r0, r1, r12)     // Catch:{ all -> 0x00f0 }
        L_0x00a6:
            monitor-exit(r11)
            return r3
        L_0x00a8:
            r0 = move-exception
            r6 = r3
        L_0x00aa:
            java.lang.String r7 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00df }
            java.lang.String r8 = "%s: %s"
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x00df }
            r9[r5] = r2     // Catch:{ all -> 0x00df }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00df }
            r9[r4] = r0     // Catch:{ all -> 0x00df }
            java.lang.String r0 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r8, r9)     // Catch:{ all -> 0x00df }
            com.alipay.iap.android.common.log.LoggerWrapper.d(r7, r0)     // Catch:{ all -> 0x00df }
            r11.remove(r12)     // Catch:{ all -> 0x00df }
            if (r6 == 0) goto L_0x00dd
            r6.close()     // Catch:{ IOException -> 0x00d5 }
            int r12 = setMax     // Catch:{ all -> 0x00f0 }
            int r12 = r12 + 83
            int r0 = r12 % 128
            length = r0     // Catch:{ all -> 0x00f0 }
            int r12 = r12 % r1
            goto L_0x00dd
        L_0x00d5:
            r12 = move-exception
            java.lang.String r0 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = ""
            com.alipay.iap.android.common.log.LoggerWrapper.e(r0, r1, r12)     // Catch:{ all -> 0x00f0 }
        L_0x00dd:
            monitor-exit(r11)
            return r3
        L_0x00df:
            r12 = move-exception
            r3 = r6
        L_0x00e1:
            if (r3 == 0) goto L_0x00ef
            r3.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00ef
        L_0x00e7:
            r0 = move-exception
            java.lang.String r1 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = ""
            com.alipay.iap.android.common.log.LoggerWrapper.e(r1, r2, r0)     // Catch:{ all -> 0x00f0 }
        L_0x00ef:
            throw r12     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r12 = move-exception
            goto L_0x00f4
        L_0x00f2:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00f0 }
        L_0x00f4:
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.cache.DiskBasedCache.get(java.lang.String):com.alipay.imobile.network.quake.cache.Cache$Entry");
    }

    public File getFileForKey(String str) {
        File file = new File(this.c, a(str));
        int i = setMax + 59;
        length = i % 128;
        int i2 = i % 2;
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if ((r0) != true) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r11.c.mkdirs() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8 A[SYNTHETIC, Splitter:B:57:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3 A[SYNTHETIC, Splitter:B:66:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00b2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void initialize() {
        /*
            r11 = this;
            monitor-enter(r11)
            java.io.File r0 = r11.c     // Catch:{ all -> 0x00d5 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00d5 }
            r1 = 88
            if (r0 != 0) goto L_0x000e
            r0 = 26
            goto L_0x0010
        L_0x000e:
            r0 = 88
        L_0x0010:
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L_0x0059
            int r0 = length     // Catch:{ all -> 0x00d5 }
            int r0 = r0 + 11
            int r1 = r0 % 128
            setMax = r1     // Catch:{ all -> 0x00d5 }
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0034
            java.io.File r0 = r11.c     // Catch:{ all -> 0x00d5 }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x00d5 }
            super.hashCode()     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x002e
            r0 = 0
            goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            if (r0 == r4) goto L_0x0054
            goto L_0x003c
        L_0x0032:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x0034:
            java.io.File r0 = r11.c     // Catch:{ Exception -> 0x0056 }
            boolean r0 = r0.mkdirs()     // Catch:{ Exception -> 0x0056 }
            if (r0 != 0) goto L_0x0054
        L_0x003c:
            java.lang.String r0 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ Exception -> 0x0052 }
            java.lang.String r1 = "Unable to create cache dir %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0052 }
            java.io.File r4 = r11.c     // Catch:{ Exception -> 0x0052 }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x0052 }
            r2[r3] = r4     // Catch:{ Exception -> 0x0052 }
            java.lang.String r1 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r1, r2)     // Catch:{ Exception -> 0x0052 }
            com.alipay.iap.android.common.log.LoggerWrapper.e(r0, r1)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0054
        L_0x0052:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x0054:
            monitor-exit(r11)
            return
        L_0x0056:
            r0 = move-exception
            goto L_0x00d4
        L_0x0059:
            java.io.File r0 = r11.c     // Catch:{ all -> 0x00d5 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x00d5 }
            if (r0 != 0) goto L_0x0063
            monitor-exit(r11)
            return
        L_0x0063:
            int r1 = r0.length     // Catch:{ all -> 0x00d5 }
        L_0x0064:
            if (r3 >= r1) goto L_0x00d0
            r5 = r0[r3]     // Catch:{ all -> 0x00d5 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0092, all -> 0x0090 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0092, all -> 0x0090 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x0092, all -> 0x0090 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0092, all -> 0x0090 }
            com.alipay.imobile.network.quake.cache.DiskBasedCache$a r7 = com.alipay.imobile.network.quake.cache.DiskBasedCache.a.a((java.io.InputStream) r6)     // Catch:{ IOException -> 0x008e }
            long r8 = r5.length()     // Catch:{ IOException -> 0x008e }
            r7.f9352a = r8     // Catch:{ IOException -> 0x008e }
            java.lang.String r8 = r7.b     // Catch:{ IOException -> 0x008e }
            r11.a((java.lang.String) r8, (com.alipay.imobile.network.quake.cache.DiskBasedCache.a) r7)     // Catch:{ IOException -> 0x008e }
            r6.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x00b2
        L_0x0085:
            r5 = move-exception
            java.lang.String r6 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00d5 }
            java.lang.String r7 = ""
        L_0x008a:
            com.alipay.iap.android.common.log.LoggerWrapper.e(r6, r7, r5)     // Catch:{ all -> 0x00d5 }
            goto L_0x00b2
        L_0x008e:
            r7 = move-exception
            goto L_0x0094
        L_0x0090:
            r0 = move-exception
            goto L_0x00c1
        L_0x0092:
            r7 = move-exception
            r6 = r2
        L_0x0094:
            java.lang.String r8 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00bf }
            java.lang.String r9 = "disk cache can not read file="
            java.lang.String r10 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00bf }
            java.lang.String r9 = r9.concat(r10)     // Catch:{ all -> 0x00bf }
            com.alipay.iap.android.common.log.LoggerWrapper.i(r8, r9, r7)     // Catch:{ all -> 0x00bf }
            r5.delete()     // Catch:{ all -> 0x00bf }
            if (r6 == 0) goto L_0x00b2
            r6.close()     // Catch:{ IOException -> 0x00ac }
            goto L_0x00b2
        L_0x00ac:
            r5 = move-exception
            java.lang.String r6 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00d5 }
            java.lang.String r7 = ""
            goto L_0x008a
        L_0x00b2:
            int r3 = r3 + 1
            int r5 = setMax     // Catch:{ all -> 0x00d5 }
            int r5 = r5 + 43
            int r6 = r5 % 128
            length = r6     // Catch:{ all -> 0x00d5 }
            int r5 = r5 % 2
            goto L_0x0064
        L_0x00bf:
            r0 = move-exception
            r2 = r6
        L_0x00c1:
            if (r2 == 0) goto L_0x00cf
            r2.close()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00cf
        L_0x00c7:
            r1 = move-exception
            java.lang.String r2 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = ""
            com.alipay.iap.android.common.log.LoggerWrapper.e(r2, r3, r1)     // Catch:{ all -> 0x00d5 }
        L_0x00cf:
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00d0:
            r11.e = r4     // Catch:{ Exception -> 0x0056 }
            monitor-exit(r11)
            return
        L_0x00d4:
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r11)
            goto L_0x00d9
        L_0x00d8:
            throw r0
        L_0x00d9:
            goto L_0x00d8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.cache.DiskBasedCache.initialize():void");
    }

    public boolean isInitialized() {
        int i = length + 109;
        setMax = i % 128;
        int i2 = i % 2;
        boolean z = this.e;
        int i3 = setMax + 25;
        length = i3 % 128;
        if (i3 % 2 == 0) {
            return z;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:23|24|25|26) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:37|38|39|40) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:60|61|62|63) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        com.alipay.iap.android.common.log.LoggerWrapper.e(com.alipay.imobile.network.quake.Quake.TAG, "Failed to close the output stream pointer of disk cache.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0097 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x00da */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093 A[SYNTHETIC, Splitter:B:37:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c9 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d6 A[SYNTHETIC, Splitter:B:60:0x00d6] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0051=Splitter:B:23:0x0051, B:39:0x0097=Splitter:B:39:0x0097, B:62:0x00da=Splitter:B:62:0x00da} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void put(java.lang.String r11, com.alipay.imobile.network.quake.cache.Cache.Entry r12) throws java.io.IOException {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = setMax     // Catch:{ all -> 0x00e2 }
            int r0 = r0 + 125
            int r1 = r0 % 128
            length = r1     // Catch:{ all -> 0x00e2 }
            r1 = 2
            int r0 = r0 % r1
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x00e2 }
            r2 = 16
            if (r0 == 0) goto L_0x0015
            r0 = 5
            goto L_0x0017
        L_0x0015:
            r0 = 16
        L_0x0017:
            if (r0 == r2) goto L_0x0022
            java.lang.String r11 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00e2 }
            java.lang.String r12 = "can not save the cache entry with a null key"
            com.alipay.iap.android.common.log.LoggerWrapper.d(r11, r12)     // Catch:{ all -> 0x00e2 }
            monitor-exit(r10)
            return
        L_0x0022:
            byte[] r0 = r12.data     // Catch:{ all -> 0x00e2 }
            int r0 = r0.length     // Catch:{ all -> 0x00e2 }
            r10.a((int) r0)     // Catch:{ all -> 0x00e2 }
            java.io.File r0 = r10.getFileForKey(r11)     // Catch:{ all -> 0x00e2 }
            r2 = 0
            r3 = 0
            r4 = 1
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0077, all -> 0x0075 }
            com.alipay.imobile.network.quake.cache.DiskBasedCache$a r6 = new com.alipay.imobile.network.quake.cache.DiskBasedCache$a     // Catch:{ IOException -> 0x0073 }
            r6.<init>(r11, r12)     // Catch:{ IOException -> 0x0073 }
            boolean r7 = r6.a((java.io.OutputStream) r5)     // Catch:{ IOException -> 0x0073 }
            if (r7 == 0) goto L_0x005a
            byte[] r7 = r12.data     // Catch:{ IOException -> 0x0073 }
            r5.write(r7)     // Catch:{ IOException -> 0x0073 }
            r10.a((java.lang.String) r11, (com.alipay.imobile.network.quake.cache.DiskBasedCache.a) r6)     // Catch:{ IOException -> 0x0073 }
            r5.close()     // Catch:{ IOException -> 0x0051 }
            monitor-exit(r10)
            return
        L_0x0051:
            java.lang.String r11 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00e2 }
            java.lang.String r12 = "Failed to close the output stream pointer of disk cache."
            com.alipay.iap.android.common.log.LoggerWrapper.e(r11, r12)     // Catch:{ all -> 0x00e2 }
            monitor-exit(r10)
            return
        L_0x005a:
            java.lang.String r6 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ IOException -> 0x0073 }
            java.lang.String r7 = "Failed to write header for %s"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0073 }
            java.lang.String r9 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0073 }
            r8[r3] = r9     // Catch:{ IOException -> 0x0073 }
            java.lang.String r7 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r7, r8)     // Catch:{ IOException -> 0x0073 }
            com.alipay.iap.android.common.log.LoggerWrapper.d(r6, r7)     // Catch:{ IOException -> 0x0073 }
            java.io.IOException r6 = new java.io.IOException     // Catch:{ IOException -> 0x0073 }
            r6.<init>()     // Catch:{ IOException -> 0x0073 }
            throw r6     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            r6 = move-exception
            goto L_0x0079
        L_0x0075:
            r11 = move-exception
            goto L_0x00d4
        L_0x0077:
            r6 = move-exception
            r5 = r2
        L_0x0079:
            java.lang.String r7 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = "Failed to put key=%s, entry=%s for %s "
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x00d2 }
            r9[r3] = r11     // Catch:{ all -> 0x00d2 }
            r9[r4] = r12     // Catch:{ all -> 0x00d2 }
            java.lang.String r11 = r0.getAbsolutePath()     // Catch:{ all -> 0x00d2 }
            r9[r1] = r11     // Catch:{ all -> 0x00d2 }
            java.lang.String r11 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r8, r9)     // Catch:{ all -> 0x00d2 }
            com.alipay.iap.android.common.log.LoggerWrapper.e(r7, r11, r6)     // Catch:{ all -> 0x00d2 }
            if (r5 == 0) goto L_0x009e
            r5.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x009e
        L_0x0097:
            java.lang.String r11 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00e2 }
            java.lang.String r12 = "Failed to close the output stream pointer of disk cache."
            com.alipay.iap.android.common.log.LoggerWrapper.e(r11, r12)     // Catch:{ all -> 0x00e2 }
        L_0x009e:
            boolean r11 = r0.delete()     // Catch:{ all -> 0x00e2 }
            if (r11 != 0) goto L_0x00bb
            java.lang.String r11 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00e2 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
            java.lang.String r5 = "Could not clean up file "
            r12.<init>(r5)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x00e2 }
            r12.append(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00e2 }
            com.alipay.iap.android.common.log.LoggerWrapper.d(r11, r12)     // Catch:{ all -> 0x00e2 }
        L_0x00bb:
            int r11 = setMax     // Catch:{ all -> 0x00e2 }
            int r11 = r11 + 31
            int r12 = r11 % 128
            length = r12     // Catch:{ all -> 0x00e2 }
            int r11 = r11 % r1
            if (r11 == 0) goto L_0x00c7
            r3 = 1
        L_0x00c7:
            if (r3 == r4) goto L_0x00cb
            monitor-exit(r10)
            return
        L_0x00cb:
            super.hashCode()     // Catch:{ all -> 0x00d0 }
            monitor-exit(r10)
            return
        L_0x00d0:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00e2 }
        L_0x00d2:
            r11 = move-exception
            r2 = r5
        L_0x00d4:
            if (r2 == 0) goto L_0x00e1
            r2.close()     // Catch:{ IOException -> 0x00da }
            goto L_0x00e1
        L_0x00da:
            java.lang.String r12 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = "Failed to close the output stream pointer of disk cache."
            com.alipay.iap.android.common.log.LoggerWrapper.e(r12, r0)     // Catch:{ all -> 0x00e2 }
        L_0x00e1:
            throw r11     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.cache.DiskBasedCache.put(java.lang.String, com.alipay.imobile.network.quake.cache.Cache$Entry):void");
    }

    public synchronized void remove(String str) {
        String str2;
        String buildMessage;
        Object[] objArr = null;
        if ((TextUtils.isEmpty(str) ? Typography.greater : 2) != '>') {
            try {
                boolean delete = getFileForKey(str).delete();
                b(str);
                if ((!delete ? 18 : ':') == 18) {
                    int i = length + 115;
                    setMax = i % 128;
                    if (i % 2 == 0) {
                        str2 = Quake.TAG;
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = str;
                        objArr2[0] = a(str);
                        buildMessage = LoggerWrapper.buildMessage("Could not delete cache entry for key=%s, filename=%s", objArr2);
                    } else {
                        str2 = Quake.TAG;
                        buildMessage = LoggerWrapper.buildMessage("Could not delete cache entry for key=%s, filename=%s", str, a(str));
                    }
                    LoggerWrapper.d(str2, buildMessage);
                }
                int i2 = setMax + 43;
                length = i2 % 128;
                if ((i2 % 2 != 0 ? ',' : 27) == ',') {
                    int length2 = objArr.length;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            int i3 = setMax + 59;
            length = i3 % 128;
            int i4 = i3 % 2;
            LoggerWrapper.d(Quake.TAG, "can not remove the cache entry with a null key");
            int i5 = length + 119;
            setMax = i5 % 128;
            if (i5 % 2 == 0) {
                super.hashCode();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if ((r4 <= 0) != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        if (r4 > 0) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMaxSizeInBytes(int r4) {
        /*
            r3 = this;
            int r0 = setMax
            int r0 = r0 + 121
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r1 = 84
            if (r0 == 0) goto L_0x0011
            r0 = 55
            goto L_0x0013
        L_0x0011:
            r0 = 84
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x0022
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0020 }
            if (r4 <= 0) goto L_0x001c
            r0 = 0
            goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            if (r0 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0020:
            r4 = move-exception
            throw r4
        L_0x0022:
            if (r4 <= 0) goto L_0x0026
        L_0x0024:
            r3.d = r4
        L_0x0026:
            int r4 = length
            int r4 = r4 + 11
            int r0 = r4 % 128
            setMax = r0
            int r4 = r4 % 2
            r0 = 14
            if (r4 != 0) goto L_0x0037
            r4 = 42
            goto L_0x0039
        L_0x0037:
            r4 = 14
        L_0x0039:
            if (r4 == r0) goto L_0x0041
            r4 = 17
            int r4 = r4 / r2
            return
        L_0x003f:
            r4 = move-exception
            throw r4
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.cache.DiskBasedCache.setMaxSizeInBytes(int):void");
    }

    private static String setMax(int i, int i2, char[] cArr, boolean z, int i3) {
        char[] cArr2 = new char[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = length + 69;
            setMax = i5 % 128;
            if (!(i5 % 2 != 0)) {
                cArr2[i4] = (char) (i << cArr[i4]);
                cArr2[i4] = (char) (cArr2[i4] % getMin);
                i4 += 92;
            } else {
                cArr2[i4] = (char) (cArr[i4] + i);
                cArr2[i4] = (char) (cArr2[i4] - getMin);
                i4++;
            }
        }
        if (i2 > 0) {
            int i6 = length + 21;
            setMax = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            int i8 = i3 - i2;
            System.arraycopy(cArr3, 0, cArr2, i8, i2);
            System.arraycopy(cArr3, i2, cArr2, 0, i8);
        }
        if (z) {
            try {
                int i9 = setMax + 29;
                length = i9 % 128;
                if (i9 % 2 != 0) {
                }
                char[] cArr4 = new char[i3];
                int i10 = 0;
                while (true) {
                    if (!(i10 < i3)) {
                        break;
                    }
                    int i11 = length + 119;
                    setMax = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[i10] = cArr2[(i3 - i10) - 1];
                    i10++;
                }
                cArr2 = cArr4;
            } catch (Exception e2) {
                throw e2;
            }
        }
        String str = new String(cArr2);
        int i13 = setMax + 39;
        length = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }
}
