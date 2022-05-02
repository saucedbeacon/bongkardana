package okhttp3.logging;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import o.MPaaSSCLogCatImpl;
import o.increaseBuffer;

public final class HttpLoggingInterceptor implements increaseBuffer {
    private static int IsOverlapping = 1;
    private static final Charset getMax = Charset.forName(getMax(new char[]{54751, 30336, 2272, 8913, 62555, 36457}).intern());
    private static long getMin;
    private static int toFloatRange;
    private final setMax length;
    private volatile Set<String> setMax;
    public volatile Level setMin;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface setMax {
        public static final setMax setMin = new setMax() {
            public final void getMax(String str) {
                MPaaSSCLogCatImpl.toIntRange().setMax(4, str, (Throwable) null);
            }
        };

        void getMax(String str);
    }

    static void setMin() {
        getMin = -7346729810574400758L;
    }

    static {
        setMin();
        int i = toFloatRange + 67;
        IsOverlapping = i % 128;
        if ((i % 2 == 0 ? 28 : 'C') != 'C') {
            Object obj = null;
            super.hashCode();
        }
    }

    public HttpLoggingInterceptor() {
        this(setMax.setMin);
    }

    private HttpLoggingInterceptor(setMax setmax) {
        try {
            this.setMax = Collections.emptySet();
            this.setMin = Level.NONE;
            this.length = setmax;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: o.MonitorHelper} */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0292  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.InvalidHandshakeException getMax(o.increaseBuffer.setMax r23) throws java.io.IOException {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            int r2 = IsOverlapping
            int r2 = r2 + 5
            int r3 = r2 % 128
            toFloatRange = r3
            int r2 = r2 % 2
            okhttp3.logging.HttpLoggingInterceptor$Level r2 = r1.setMin
            o.InvalidDataException r3 = r23.getMin()
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.NONE
            if (r2 != r4) goto L_0x001d
            o.InvalidHandshakeException r0 = r0.getMax(r3)
            return r0
        L_0x001d:
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.BODY
            r6 = 1
            if (r2 != r4) goto L_0x0037
            int r4 = IsOverlapping
            int r4 = r4 + 99
            int r7 = r4 % 128
            toFloatRange = r7
            int r4 = r4 % 2
            r7 = 91
            if (r4 == 0) goto L_0x0033
            r4 = 24
            goto L_0x0035
        L_0x0033:
            r4 = 91
        L_0x0035:
            r4 = 1
            goto L_0x0038
        L_0x0037:
            r4 = 0
        L_0x0038:
            if (r4 != 0) goto L_0x0041
            okhttp3.logging.HttpLoggingInterceptor$Level r7 = okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS
            if (r2 != r7) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r2 = 0
            goto L_0x0042
        L_0x0041:
            r2 = 1
        L_0x0042:
            o.getPart r7 = r3.setMax
            if (r7 == 0) goto L_0x0048
            r8 = 0
            goto L_0x0049
        L_0x0048:
            r8 = 1
        L_0x0049:
            if (r8 == r6) goto L_0x004d
            r8 = 1
            goto L_0x004e
        L_0x004d:
            r8 = 0
        L_0x004e:
            o.Draft$HandshakeState r9 = r23.setMin()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "--> "
            r10.<init>(r11)
            java.lang.String r11 = r3.getMin
            r10.append(r11)
            r11 = 32
            r10.append(r11)
            o.Draft_76 r12 = r3.setMin
            r10.append(r12)
            java.lang.String r12 = " "
            java.lang.String r13 = ""
            if (r9 == 0) goto L_0x007f
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r12)
            okhttp3.Protocol r9 = r9.getMax()
            r14.append(r9)
            java.lang.String r9 = r14.toString()
            goto L_0x0080
        L_0x007f:
            r9 = r13
        L_0x0080:
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "-byte body)"
            java.lang.String r14 = " ("
            if (r2 != 0) goto L_0x00b5
            int r15 = toFloatRange
            int r15 = r15 + 89
            int r5 = r15 % 128
            IsOverlapping = r5
            int r15 = r15 % 2
            if (r8 == 0) goto L_0x00b5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            r5.append(r14)
            r17 = r12
            long r11 = r7.setMin()
            r5.append(r11)
            r5.append(r10)
            java.lang.String r9 = r5.toString()
            goto L_0x00b7
        L_0x00b5:
            r17 = r12
        L_0x00b7:
            okhttp3.logging.HttpLoggingInterceptor$setMax r5 = r1.length
            r5.getMax(r9)
            java.lang.String r5 = "-byte body omitted)"
            r11 = -1
            if (r2 == 0) goto L_0x020e
            int r9 = toFloatRange
            int r9 = r9 + 105
            int r15 = r9 % 128
            IsOverlapping = r15
            int r9 = r9 % 2
            if (r8 == 0) goto L_0x010a
            o.translateRegularFrame r9 = r7.setMax()
            if (r9 == 0) goto L_0x00eb
            okhttp3.logging.HttpLoggingInterceptor$setMax r9 = r1.length
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r6 = "Content-Type: "
            r15.<init>(r6)
            o.translateRegularFrame r6 = r7.setMax()
            r15.append(r6)
            java.lang.String r6 = r15.toString()
            r9.getMax(r6)
        L_0x00eb:
            long r19 = r7.setMin()
            int r6 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x010a
            okhttp3.logging.HttpLoggingInterceptor$setMax r6 = r1.length
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r15 = "Content-Length: "
            r9.<init>(r15)
            long r11 = r7.setMin()
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r6.getMax(r9)
        L_0x010a:
            o.Draft_75 r6 = r3.length
            java.lang.String[] r9 = r6.length
            int r9 = r9.length
            int r9 = r9 / 2
            r11 = 0
        L_0x0112:
            if (r11 >= r9) goto L_0x0116
            r12 = 1
            goto L_0x0117
        L_0x0116:
            r12 = 0
        L_0x0117:
            r15 = 1
            if (r12 == r15) goto L_0x01c7
            java.lang.String r6 = "--> END "
            if (r4 == 0) goto L_0x01b3
            if (r8 != 0) goto L_0x0122
            goto L_0x01b3
        L_0x0122:
            o.Draft_75 r8 = r3.length
            boolean r8 = getMax((o.Draft_75) r8)
            if (r8 == 0) goto L_0x0144
            okhttp3.logging.HttpLoggingInterceptor$setMax r7 = r1.length
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.String r6 = r3.getMin
            r8.append(r6)
            java.lang.String r6 = " (encoded body omitted)"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.getMax(r6)
            goto L_0x020e
        L_0x0144:
            o.submitLazy r8 = new o.submitLazy
            r8.<init>()
            r7.getMin(r8)
            java.nio.charset.Charset r9 = getMax
            o.translateRegularFrame r11 = r7.setMax()
            if (r11 == 0) goto L_0x015a
            java.nio.charset.Charset r9 = getMax
            java.nio.charset.Charset r9 = r11.setMin(r9)
        L_0x015a:
            okhttp3.logging.HttpLoggingInterceptor$setMax r11 = r1.length
            r11.getMax(r13)
            boolean r11 = getMax((o.submitLazy) r8)
            if (r11 == 0) goto L_0x0190
            okhttp3.logging.HttpLoggingInterceptor$setMax r11 = r1.length
            java.lang.String r8 = r8.setMin((java.nio.charset.Charset) r9)
            r11.getMax(r8)
            okhttp3.logging.HttpLoggingInterceptor$setMax r8 = r1.length
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            java.lang.String r6 = r3.getMin
            r9.append(r6)
            r9.append(r14)
            long r6 = r7.setMin()
            r9.append(r6)
            r9.append(r10)
            java.lang.String r6 = r9.toString()
            r8.getMax(r6)
            goto L_0x020e
        L_0x0190:
            okhttp3.logging.HttpLoggingInterceptor$setMax r8 = r1.length
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            java.lang.String r6 = r3.getMin
            r9.append(r6)
            java.lang.String r6 = " (binary "
            r9.append(r6)
            long r6 = r7.setMin()
            r9.append(r6)
            r9.append(r5)
            java.lang.String r6 = r9.toString()
            r8.getMax(r6)
            goto L_0x020e
        L_0x01b3:
            okhttp3.logging.HttpLoggingInterceptor$setMax r7 = r1.length
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.String r6 = r3.getMin
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.getMax(r6)
            goto L_0x020e
        L_0x01c7:
            int r12 = toFloatRange
            int r12 = r12 + 107
            int r15 = r12 % 128
            IsOverlapping = r15
            int r12 = r12 % 2
            java.lang.String r15 = "Content-Type"
            if (r12 != 0) goto L_0x01e5
            java.lang.String[] r12 = r6.length
            int r21 = r11 >>> 2
            r12 = r12[r21]
            boolean r15 = r15.equalsIgnoreCase(r12)
            r18 = r7
            r7 = 1
            if (r15 != 0) goto L_0x0208
            goto L_0x01fd
        L_0x01e5:
            java.lang.String[] r12 = r6.length
            int r21 = r11 * 2
            r12 = r12[r21]
            boolean r15 = r15.equalsIgnoreCase(r12)
            if (r15 != 0) goto L_0x01f6
            r18 = r7
            r7 = 1
            r15 = 1
            goto L_0x01fa
        L_0x01f6:
            r18 = r7
            r7 = 1
            r15 = 0
        L_0x01fa:
            if (r15 == r7) goto L_0x01fd
            goto L_0x0208
        L_0x01fd:
            java.lang.String r15 = "Content-Length"
            boolean r12 = r15.equalsIgnoreCase(r12)
            if (r12 != 0) goto L_0x0208
            r1.getMax(r6, r11)
        L_0x0208:
            int r11 = r11 + 1
            r7 = r18
            goto L_0x0112
        L_0x020e:
            r7 = 1
            long r8 = java.lang.System.nanoTime()
            o.InvalidHandshakeException r0 = r0.getMax(r3)     // Catch:{ Exception -> 0x03ef }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = java.lang.System.nanoTime()
            long r11 = r11 - r8
            long r8 = r3.toMillis(r11)
            o.NotSendableException r3 = r0.toFloatRange
            long r11 = r3.setMax()
            r18 = -1
            int r6 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x0246
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r11)     // Catch:{ Exception -> 0x0243 }
            java.lang.String r15 = "-byte"
            r6.append(r15)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0240 }
            goto L_0x0248
        L_0x0240:
            r0 = move-exception
            goto L_0x03ed
        L_0x0243:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0246:
            java.lang.String r6 = "unknown-length"
        L_0x0248:
            okhttp3.logging.HttpLoggingInterceptor$setMax r15 = r1.length
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r19 = r10
            java.lang.String r10 = "<-- "
            r7.<init>(r10)
            int r10 = r0.getMax
            r7.append(r10)
            java.lang.String r10 = r0.length
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0264
            r20 = r11
            r10 = r13
            goto L_0x0276
        L_0x0264:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r20 = r11
            r11 = r17
            r10.<init>(r11)
            java.lang.String r11 = r0.length
            r10.append(r11)
            java.lang.String r10 = r10.toString()
        L_0x0276:
            r7.append(r10)
            r10 = 32
            r7.append(r10)
            o.InvalidDataException r10 = r0.getMin
            o.Draft_76 r10 = r10.setMin
            r7.append(r10)
            r7.append(r14)
            r7.append(r8)
            java.lang.String r8 = "ms"
            r7.append(r8)
            if (r2 != 0) goto L_0x02a6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = ", "
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r6 = " body"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            goto L_0x02a7
        L_0x02a6:
            r6 = r13
        L_0x02a7:
            r7.append(r6)
            r6 = 41
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r15.getMax(r6)
            if (r2 == 0) goto L_0x03ee
            o.Draft_75 r2 = r0.toIntRange
            java.lang.String[] r6 = r2.length
            int r6 = r6.length
            int r6 = r6 / 2
            r7 = 0
        L_0x02c0:
            if (r7 >= r6) goto L_0x02c8
            r1.getMax(r2, r7)
            int r7 = r7 + 1
            goto L_0x02c0
        L_0x02c8:
            if (r4 == 0) goto L_0x02cd
            r16 = 0
            goto L_0x02cf
        L_0x02cd:
            r16 = 1
        L_0x02cf:
            if (r16 == 0) goto L_0x02d3
            goto L_0x03e5
        L_0x02d3:
            boolean r4 = o.ClientHandshake.setMax(r0)     // Catch:{ Exception -> 0x0240 }
            r6 = 43
            if (r4 != 0) goto L_0x02de
            r4 = 43
            goto L_0x02e0
        L_0x02de:
            r4 = 85
        L_0x02e0:
            if (r4 == r6) goto L_0x03e5
            o.Draft_75 r4 = r0.toIntRange
            boolean r4 = getMax((o.Draft_75) r4)
            r6 = 4
            if (r4 == 0) goto L_0x02ed
            r4 = 4
            goto L_0x02ef
        L_0x02ed:
            r4 = 56
        L_0x02ef:
            r7 = 0
            if (r4 == r6) goto L_0x03c7
            o.schedule r4 = r3.getMax()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.getMin(r8)
            o.submitLazy r4 = r4.getMax()
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r2 = r2.length(r6)
            java.lang.String r6 = "gzip"
            boolean r2 = r6.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0336
            long r8 = r4.setMax
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            o.MonitorHelper r6 = new o.MonitorHelper     // Catch:{ all -> 0x032f }
            o.submitLazy r4 = r4.clone()     // Catch:{ all -> 0x032f }
            r6.<init>(r4)     // Catch:{ all -> 0x032f }
            o.submitLazy r4 = new o.submitLazy     // Catch:{ all -> 0x032c }
            r4.<init>()     // Catch:{ all -> 0x032c }
            r4.getMin((o.recordWsHsTime) r6)     // Catch:{ all -> 0x032c }
            r6.close()
            r7 = r2
            goto L_0x0336
        L_0x032c:
            r0 = move-exception
            r7 = r6
            goto L_0x0330
        L_0x032f:
            r0 = move-exception
        L_0x0330:
            if (r7 == 0) goto L_0x0335
            r7.close()
        L_0x0335:
            throw r0
        L_0x0336:
            java.nio.charset.Charset r2 = getMax
            o.translateRegularFrame r3 = r3.getMin()
            r6 = 51
            if (r3 == 0) goto L_0x0343
            r8 = 31
            goto L_0x0345
        L_0x0343:
            r8 = 51
        L_0x0345:
            if (r8 == r6) goto L_0x034d
            java.nio.charset.Charset r2 = getMax
            java.nio.charset.Charset r2 = r3.setMin(r2)
        L_0x034d:
            boolean r3 = getMax((o.submitLazy) r4)
            if (r3 != 0) goto L_0x0371
            okhttp3.logging.HttpLoggingInterceptor$setMax r2 = r1.length
            r2.getMax(r13)
            okhttp3.logging.HttpLoggingInterceptor$setMax r2 = r1.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "<-- END HTTP (binary "
            r3.<init>(r6)
            long r6 = r4.setMax
            r3.append(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.getMax(r3)
            return r0
        L_0x0371:
            r5 = 0
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0389
            okhttp3.logging.HttpLoggingInterceptor$setMax r3 = r1.length
            r3.getMax(r13)
            okhttp3.logging.HttpLoggingInterceptor$setMax r3 = r1.length
            o.submitLazy r5 = r4.clone()
            java.lang.String r2 = r5.setMin((java.nio.charset.Charset) r2)
            r3.getMax(r2)
        L_0x0389:
            java.lang.String r2 = "<-- END HTTP ("
            if (r7 == 0) goto L_0x03ae
            okhttp3.logging.HttpLoggingInterceptor$setMax r3 = r1.length
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            long r8 = r4.setMax
            r5.append(r8)
            java.lang.String r2 = "-byte, "
            r5.append(r2)
            r5.append(r7)
            java.lang.String r2 = "-gzipped-byte body)"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3.getMax(r2)
            goto L_0x03ee
        L_0x03ae:
            okhttp3.logging.HttpLoggingInterceptor$setMax r3 = r1.length
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            long r6 = r4.setMax
            r5.append(r6)
            r2 = r19
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3.getMax(r2)
            goto L_0x03ee
        L_0x03c7:
            int r2 = IsOverlapping
            int r2 = r2 + 73
            int r3 = r2 % 128
            toFloatRange = r3
            int r2 = r2 % 2
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            if (r2 == 0) goto L_0x03df
            okhttp3.logging.HttpLoggingInterceptor$setMax r2 = r1.length
            r2.getMax(r3)
            int r2 = r7.length     // Catch:{ all -> 0x03dc }
            goto L_0x03ee
        L_0x03dc:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x03df:
            okhttp3.logging.HttpLoggingInterceptor$setMax r2 = r1.length
            r2.getMax(r3)
            goto L_0x03ee
        L_0x03e5:
            okhttp3.logging.HttpLoggingInterceptor$setMax r2 = r1.length
            java.lang.String r3 = "<-- END HTTP"
            r2.getMax(r3)
            goto L_0x03ee
        L_0x03ed:
            throw r0
        L_0x03ee:
            return r0
        L_0x03ef:
            r0 = move-exception
            r2 = r0
            okhttp3.logging.HttpLoggingInterceptor$setMax r0 = r1.length
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "<-- HTTP FAILED: "
            java.lang.String r3 = r4.concat(r3)
            r0.getMax(r3)
            goto L_0x0402
        L_0x0401:
            throw r2
        L_0x0402:
            goto L_0x0401
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.getMax(o.increaseBuffer$setMax):o.InvalidHandshakeException");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if ((r3.setMax.contains(r4.length[r5 / 3]) ? '?' : kotlin.text.Typography.dollar) != '$') goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r3.setMax.contains(r4.length[r5 * 2]) != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r0 = r4.length[(r5 * 2) + 1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getMax(o.Draft_75 r4, int r5) {
        /*
            r3 = this;
            int r0 = IsOverlapping     // Catch:{ Exception -> 0x007d }
            int r0 = r0 + 13
            int r1 = r0 % 128
            toFloatRange = r1     // Catch:{ Exception -> 0x007b }
            int r0 = r0 % 2
            r1 = 77
            if (r0 == 0) goto L_0x0011
            r0 = 42
            goto L_0x0013
        L_0x0011:
            r0 = 77
        L_0x0013:
            if (r0 == r1) goto L_0x002d
            java.util.Set<java.lang.String> r0 = r3.setMax
            java.lang.String[] r1 = r4.length
            int r2 = r5 / 3
            r1 = r1[r2]
            boolean r0 = r0.contains(r1)
            r1 = 36
            if (r0 == 0) goto L_0x0028
            r0 = 63
            goto L_0x002a
        L_0x0028:
            r0 = 36
        L_0x002a:
            if (r0 == r1) goto L_0x0049
            goto L_0x003b
        L_0x002d:
            java.util.Set<java.lang.String> r0 = r3.setMax
            java.lang.String[] r1 = r4.length
            int r2 = r5 * 2
            r1 = r1[r2]
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0049
        L_0x003b:
            int r0 = IsOverlapping
            int r0 = r0 + 47
            int r1 = r0 % 128
            toFloatRange = r1
            int r0 = r0 % 2
            java.lang.String r0 = "██"
            goto L_0x0051
        L_0x0049:
            java.lang.String[] r0 = r4.length
            int r1 = r5 * 2
            int r1 = r1 + 1
            r0 = r0[r1]
        L_0x0051:
            okhttp3.logging.HttpLoggingInterceptor$setMax r1 = r3.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String[] r4 = r4.length
            int r5 = r5 * 2
            r4 = r4[r5]
            r2.append(r4)
            java.lang.String r4 = ": "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.getMax(r4)
            int r4 = IsOverlapping
            int r4 = r4 + 95
            int r5 = r4 % 128
            toFloatRange = r5
            int r4 = r4 % 2
            return
        L_0x007b:
            r4 = move-exception
            throw r4
        L_0x007d:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.getMax(o.Draft_75, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00fd, code lost:
        if (r3 <= 57343) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x012b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0127 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011b A[Catch:{ EOFException -> 0x0161 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getMax(o.submitLazy r17) {
        /*
            r0 = r17
            o.submitLazy r8 = new o.submitLazy     // Catch:{ EOFException -> 0x0161 }
            r8.<init>()     // Catch:{ EOFException -> 0x0161 }
            long r1 = r0.setMax     // Catch:{ EOFException -> 0x0161 }
            r3 = 64
            r9 = 2
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001f
            int r1 = toFloatRange     // Catch:{ Exception -> 0x001d }
            int r1 = r1 + 77
            int r2 = r1 % 128
            IsOverlapping = r2     // Catch:{ Exception -> 0x001d }
            int r1 = r1 % r9
            long r1 = r0.setMax     // Catch:{ EOFException -> 0x0161 }
            r5 = r1
            goto L_0x0020
        L_0x001d:
            r0 = move-exception
            goto L_0x0085
        L_0x001f:
            r5 = r3
        L_0x0020:
            r3 = 0
            r1 = r17
            r2 = r8
            r1.getMax(r2, r3, r5)     // Catch:{ EOFException -> 0x0161 }
            r0 = 0
        L_0x0029:
            r1 = 16
            r2 = 1
            if (r0 >= r1) goto L_0x0160
            boolean r1 = r8.setMax()     // Catch:{ EOFException -> 0x0161 }
            if (r1 != 0) goto L_0x0160
            long r3 = r8.setMax     // Catch:{ EOFException -> 0x0161 }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x015a
            byte r1 = r8.getMax((long) r5)     // Catch:{ EOFException -> 0x0161 }
            r3 = r1 & 128(0x80, float:1.794E-43)
            r4 = 3
            r5 = 4
            r10 = 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0055
            int r3 = IsOverlapping
            int r3 = r3 + r2
            int r5 = r3 % 128
            toFloatRange = r5
            int r3 = r3 % r9
            r3 = r1 & 127(0x7f, float:1.78E-43)
            r5 = 1
            r11 = 0
            goto L_0x00a0
        L_0x0055:
            r3 = r1 & 224(0xe0, float:3.14E-43)
            r11 = 65
            r12 = 192(0xc0, float:2.69E-43)
            if (r3 != r12) goto L_0x0060
            r3 = 65
            goto L_0x0061
        L_0x0060:
            r3 = 4
        L_0x0061:
            if (r3 == r11) goto L_0x009b
            r3 = r1 & 240(0xf0, float:3.36E-43)
            r11 = 224(0xe0, float:3.14E-43)
            if (r3 != r11) goto L_0x0086
            int r3 = toFloatRange     // Catch:{ Exception -> 0x001d }
            int r3 = r3 + 7
            int r5 = r3 % 128
            IsOverlapping = r5     // Catch:{ Exception -> 0x001d }
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x007d
            r3 = r1 | 82
            r5 = 18200(0x4718, float:2.5504E-41)
            r5 = 2
            r11 = 18200(0x4718, float:2.5504E-41)
            goto L_0x00a0
        L_0x007d:
            r3 = r1 & 15
            r5 = 2048(0x800, float:2.87E-42)
            r5 = 3
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x00a0
        L_0x0085:
            throw r0
        L_0x0086:
            r3 = r1 & 248(0xf8, float:3.48E-43)
            r11 = 240(0xf0, float:3.36E-43)
            if (r3 != r11) goto L_0x0091
            r3 = r1 & 7
            r11 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a0
        L_0x0091:
            r3 = 1
            r8.isInside(r3)     // Catch:{ EOFException -> 0x0161 }
        L_0x0096:
            r6 = 65533(0xfffd, float:9.1831E-41)
            goto L_0x0115
        L_0x009b:
            r3 = r1 & 31
            r5 = 2
            r11 = 128(0x80, float:1.794E-43)
        L_0x00a0:
            long r12 = r8.setMax     // Catch:{ EOFException -> 0x0161 }
            long r14 = (long) r5
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x012b
            int r1 = toFloatRange
            int r1 = r1 + 39
            int r12 = r1 % 128
            IsOverlapping = r12
            int r1 = r1 % r9
            r1 = 1
        L_0x00b1:
            if (r1 >= r5) goto L_0x00b5
            r12 = 1
            goto L_0x00b6
        L_0x00b5:
            r12 = 0
        L_0x00b6:
            if (r12 == 0) goto L_0x00d2
            long r12 = (long) r1
            byte r6 = r8.getMax((long) r12)     // Catch:{ EOFException -> 0x0161 }
            r7 = r6 & 192(0xc0, float:2.69E-43)
            if (r7 != r10) goto L_0x00c3
            r7 = 1
            goto L_0x00c4
        L_0x00c3:
            r7 = 0
        L_0x00c4:
            if (r7 == 0) goto L_0x00ce
            int r3 = r3 << 6
            r6 = r6 & 63
            r3 = r3 | r6
            int r1 = r1 + 1
            goto L_0x00b1
        L_0x00ce:
            r8.isInside(r12)     // Catch:{ EOFException -> 0x0161 }
            goto L_0x0096
        L_0x00d2:
            r8.isInside(r14)     // Catch:{ EOFException -> 0x0161 }
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r1) goto L_0x00ec
            int r1 = IsOverlapping
            int r1 = r1 + r4
            int r3 = r1 % 128
            toFloatRange = r3
            int r1 = r1 % r9
            int r1 = IsOverlapping
            int r1 = r1 + 75
            int r3 = r1 % 128
            toFloatRange = r3
            int r1 = r1 % r9
            goto L_0x0096
        L_0x00ec:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r1) goto L_0x0100
            int r1 = toFloatRange
            int r1 = r1 + 35
            int r4 = r1 % 128
            IsOverlapping = r4
            int r1 = r1 % r9
            r1 = 57343(0xdfff, float:8.0355E-41)
            if (r3 > r1) goto L_0x0100
            goto L_0x0096
        L_0x0100:
            if (r3 >= r11) goto L_0x0104
            r1 = 0
            goto L_0x0105
        L_0x0104:
            r1 = 1
        L_0x0105:
            if (r1 == r2) goto L_0x0114
            int r1 = toFloatRange     // Catch:{ Exception -> 0x0112 }
            int r1 = r1 + 31
            int r3 = r1 % 128
            IsOverlapping = r3     // Catch:{ Exception -> 0x0112 }
            int r1 = r1 % 2
            goto L_0x0096
        L_0x0112:
            r0 = move-exception
            throw r0
        L_0x0114:
            r6 = r3
        L_0x0115:
            boolean r1 = java.lang.Character.isISOControl(r6)     // Catch:{ EOFException -> 0x0161 }
            if (r1 == 0) goto L_0x0127
            boolean r1 = java.lang.Character.isWhitespace(r6)     // Catch:{ EOFException -> 0x0161 }
            if (r1 != 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r2 = 0
        L_0x0123:
            if (r2 == 0) goto L_0x0127
            r1 = 0
            return r1
        L_0x0127:
            int r0 = r0 + 1
            goto L_0x0029
        L_0x012b:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ EOFException -> 0x0161 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0161 }
            java.lang.String r3 = "size < "
            r2.<init>(r3)     // Catch:{ EOFException -> 0x0161 }
            r2.append(r5)     // Catch:{ EOFException -> 0x0161 }
            java.lang.String r3 = ": "
            r2.append(r3)     // Catch:{ EOFException -> 0x0161 }
            long r3 = r8.setMax     // Catch:{ EOFException -> 0x0161 }
            r2.append(r3)     // Catch:{ EOFException -> 0x0161 }
            java.lang.String r3 = " (to read code point prefixed 0x"
            r2.append(r3)     // Catch:{ EOFException -> 0x0161 }
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch:{ EOFException -> 0x0161 }
            r2.append(r1)     // Catch:{ EOFException -> 0x0161 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ EOFException -> 0x0161 }
            java.lang.String r1 = r2.toString()     // Catch:{ EOFException -> 0x0161 }
            r0.<init>(r1)     // Catch:{ EOFException -> 0x0161 }
            throw r0     // Catch:{ EOFException -> 0x0161 }
        L_0x015a:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ EOFException -> 0x0161 }
            r0.<init>()     // Catch:{ EOFException -> 0x0161 }
            throw r0     // Catch:{ EOFException -> 0x0161 }
        L_0x0160:
            return r2
        L_0x0161:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.getMax(o.submitLazy):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r4 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r4.equalsIgnoreCase(com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP) == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getMax(o.Draft_75 r4) {
        /*
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r4 = r4.length(r0)     // Catch:{ Exception -> 0x006c }
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            if (r2 == r1) goto L_0x0010
            goto L_0x006b
        L_0x0010:
            int r2 = toFloatRange     // Catch:{ Exception -> 0x006c }
            int r2 = r2 + 103
            int r3 = r2 % 128
            IsOverlapping = r3     // Catch:{ Exception -> 0x006c }
            int r2 = r2 % 2
            java.lang.String r2 = "identity"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0024
            r2 = 0
            goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            if (r2 == 0) goto L_0x0028
            goto L_0x006b
        L_0x0028:
            int r2 = toFloatRange
            int r2 = r2 + 23
            int r3 = r2 % 128
            IsOverlapping = r3
            int r2 = r2 % 2
            java.lang.String r3 = "gzip"
            if (r2 != 0) goto L_0x0041
            boolean r4 = r4.equalsIgnoreCase(r3)
            r2 = 0
            int r2 = r2.length     // Catch:{ all -> 0x003f }
            if (r4 != 0) goto L_0x006b
            goto L_0x0047
        L_0x003f:
            r4 = move-exception
            throw r4
        L_0x0041:
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L_0x006b
        L_0x0047:
            int r4 = IsOverlapping
            int r4 = r4 + 71
            int r2 = r4 % 128
            toFloatRange = r2
            int r4 = r4 % 2
            int r4 = toFloatRange     // Catch:{ Exception -> 0x0069 }
            int r4 = r4 + 47
            int r2 = r4 % 128
            IsOverlapping = r2
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x005f
            r4 = 1
            goto L_0x0060
        L_0x005f:
            r4 = 0
        L_0x0060:
            if (r4 == r1) goto L_0x0063
            return r1
        L_0x0063:
            r4 = 99
            int r4 = r4 / r0
            return r1
        L_0x0067:
            r4 = move-exception
            throw r4
        L_0x0069:
            r4 = move-exception
            throw r4
        L_0x006b:
            return r0
        L_0x006c:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.getMax(o.Draft_75):boolean");
    }

    private static String getMax(char[] cArr) {
        int i = IsOverlapping + 47;
        toFloatRange = i % 128;
        int i2 = i % 2;
        char c = cArr[0];
        int i3 = 1;
        char[] cArr2 = new char[(cArr.length - 1)];
        while (true) {
            if ((i3 < cArr.length ? ' ' : 'D') == 'D') {
                break;
            }
            try {
                cArr2[i3 - 1] = (char) ((int) (((long) (cArr[i3] ^ (i3 * c))) ^ getMin));
                i3++;
            } catch (Exception e) {
                throw e;
            }
        }
        String str = new String(cArr2);
        int i4 = IsOverlapping + 59;
        toFloatRange = i4 % 128;
        if ((i4 % 2 != 0 ? 'b' : 'S') == 'S') {
            return str;
        }
        int i5 = 16 / 0;
        return str;
    }
}
