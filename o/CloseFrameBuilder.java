package o;

import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class CloseFrameBuilder implements Closeable, Flushable {
    static final Pattern length = Pattern.compile("[a-z0-9_-]{1,120}");
    static final /* synthetic */ boolean toString = (!CloseFrameBuilder.class.desiredAssertionStatus());
    boolean FastBitmap$CoordinateSystem;
    private long Grayscale$Algorithm;
    boolean IsOverlapping;
    private long Mean$Arithmetic = 0;
    private final Executor create;
    int equals;
    private final Runnable getCause = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r5.length.FastBitmap$CoordinateSystem = true;
            r5.length.setMax = o.recordMonitorOfSndMsg.getMax(o.recordMonitorOfSndMsg.getMin());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                o.CloseFrameBuilder r0 = o.CloseFrameBuilder.this
                monitor-enter(r0)
                o.CloseFrameBuilder r1 = o.CloseFrameBuilder.this     // Catch:{ all -> 0x0045 }
                boolean r1 = r1.toIntRange     // Catch:{ all -> 0x0045 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x000d
                r1 = 1
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                o.CloseFrameBuilder r4 = o.CloseFrameBuilder.this     // Catch:{ all -> 0x0045 }
                boolean r4 = r4.isInside     // Catch:{ all -> 0x0045 }
                r1 = r1 | r4
                if (r1 == 0) goto L_0x0017
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0017:
                o.CloseFrameBuilder r1 = o.CloseFrameBuilder.this     // Catch:{ IOException -> 0x001d }
                r1.getMin()     // Catch:{ IOException -> 0x001d }
                goto L_0x0021
            L_0x001d:
                o.CloseFrameBuilder r1 = o.CloseFrameBuilder.this     // Catch:{ all -> 0x0045 }
                r1.hashCode = r3     // Catch:{ all -> 0x0045 }
            L_0x0021:
                o.CloseFrameBuilder r1 = o.CloseFrameBuilder.this     // Catch:{ IOException -> 0x0033 }
                boolean r1 = r1.setMin()     // Catch:{ IOException -> 0x0033 }
                if (r1 == 0) goto L_0x0043
                o.CloseFrameBuilder r1 = o.CloseFrameBuilder.this     // Catch:{ IOException -> 0x0033 }
                r1.getMax()     // Catch:{ IOException -> 0x0033 }
                o.CloseFrameBuilder r1 = o.CloseFrameBuilder.this     // Catch:{ IOException -> 0x0033 }
                r1.equals = r2     // Catch:{ IOException -> 0x0033 }
                goto L_0x0043
            L_0x0033:
                o.CloseFrameBuilder r1 = o.CloseFrameBuilder.this     // Catch:{ all -> 0x0045 }
                r1.FastBitmap$CoordinateSystem = r3     // Catch:{ all -> 0x0045 }
                o.CloseFrameBuilder r1 = o.CloseFrameBuilder.this     // Catch:{ all -> 0x0045 }
                o.recordDnsTime r2 = o.recordMonitorOfSndMsg.getMin()     // Catch:{ all -> 0x0045 }
                o.executeSerial r2 = o.recordMonitorOfSndMsg.getMax((o.recordDnsTime) r2)     // Catch:{ all -> 0x0045 }
                r1.setMax = r2     // Catch:{ all -> 0x0045 }
            L_0x0043:
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0045:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.CloseFrameBuilder.AnonymousClass2.run():void");
        }
    };
    final verbose getMax;
    final File getMin;
    boolean hashCode;
    private long invoke = 0;
    private final int invokeSuspend;
    boolean isInside;
    executeSerial setMax;
    final int setMin;
    private final File toDoubleRange;
    final LinkedHashMap<String, length> toFloatRange = new LinkedHashMap<>(0, 0.75f, true);
    boolean toIntRange;
    private final File valueOf;
    private final File values;

    private CloseFrameBuilder(verbose verbose, File file, Executor executor) {
        this.getMax = verbose;
        this.getMin = file;
        this.invokeSuspend = 201105;
        this.values = new File(file, "journal");
        this.toDoubleRange = new File(file, "journal.tmp");
        this.valueOf = new File(file, "journal.bkp");
        this.setMin = 2;
        this.Grayscale$Algorithm = ConvertUtils.MB;
        this.create = executor;
    }

    private synchronized void setMax() throws IOException {
        if (!toString) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        if (!this.toIntRange) {
            if (this.getMax.setMax(this.valueOf)) {
                if (this.getMax.setMax(this.values)) {
                    this.getMax.length(this.valueOf);
                } else {
                    this.getMax.setMin(this.valueOf, this.values);
                }
            }
            if (this.getMax.setMax(this.values)) {
                try {
                    length();
                    toIntRange();
                    this.toIntRange = true;
                    return;
                } catch (IOException e) {
                    MPaaSSCLogCatImpl intRange = MPaaSSCLogCatImpl.toIntRange();
                    StringBuilder sb = new StringBuilder("DiskLruCache ");
                    sb.append(this.getMin);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    intRange.setMax(5, sb.toString(), (Throwable) e);
                    close();
                    this.getMax.isInside(this.getMin);
                    this.isInside = false;
                } catch (Throwable th) {
                    this.isInside = false;
                    throw th;
                }
            }
            getMax();
            this.toIntRange = true;
        }
    }

    public static CloseFrameBuilder setMax(verbose verbose, File file) {
        return new CloseFrameBuilder(verbose, file, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), initCloseCode.getMax("OkHttp DiskLruCache", true)));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:51|52|(1:54)(1:55)|56|57) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r10.equals = r0 - r10.toFloatRange.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0108, code lost:
        if (r1.setMax() == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010a, code lost:
        getMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010e, code lost:
        r10.setMax = o.recordMonitorOfSndMsg.getMax((o.recordDnsTime) new o.CloseFrameBuilder.AnonymousClass4(r10, r10.getMax.setMin(r10.values)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0124, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fb */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:58:0x0125=Splitter:B:58:0x0125, B:51:0x00fb=Splitter:B:51:0x00fb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void length() throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            o.verbose r1 = r10.getMax
            java.io.File r2 = r10.values
            o.recordWsHsTime r1 = r1.getMin(r2)
            o.schedule r1 = o.recordMonitorOfSndMsg.setMin((o.recordWsHsTime) r1)
            java.lang.String r2 = r1.Grayscale$Algorithm()     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = r1.Grayscale$Algorithm()     // Catch:{ all -> 0x0150 }
            java.lang.String r4 = r1.Grayscale$Algorithm()     // Catch:{ all -> 0x0150 }
            java.lang.String r5 = r1.Grayscale$Algorithm()     // Catch:{ all -> 0x0150 }
            java.lang.String r6 = r1.Grayscale$Algorithm()     // Catch:{ all -> 0x0150 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x0150 }
            if (r7 == 0) goto L_0x0125
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x0150 }
            if (r7 == 0) goto L_0x0125
            int r7 = r10.invokeSuspend     // Catch:{ all -> 0x0150 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0150 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0150 }
            if (r4 == 0) goto L_0x0125
            int r4 = r10.setMin     // Catch:{ all -> 0x0150 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0150 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0150 }
            if (r4 == 0) goto L_0x0125
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0150 }
            if (r4 == 0) goto L_0x0125
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.Grayscale$Algorithm()     // Catch:{ EOFException -> 0x00fb }
            r3 = 32
            int r4 = r2.indexOf(r3)     // Catch:{ EOFException -> 0x00fb }
            java.lang.String r5 = "unexpected journal line: "
            r6 = -1
            if (r4 == r6) goto L_0x00ed
            int r7 = r4 + 1
            int r3 = r2.indexOf(r3, r7)     // Catch:{ EOFException -> 0x00fb }
            if (r3 != r6) goto L_0x007f
            java.lang.String r7 = r2.substring(r7)     // Catch:{ EOFException -> 0x00fb }
            r8 = 6
            if (r4 != r8) goto L_0x0083
            java.lang.String r8 = "REMOVE"
            boolean r8 = r2.startsWith(r8)     // Catch:{ EOFException -> 0x00fb }
            if (r8 == 0) goto L_0x0083
            java.util.LinkedHashMap<java.lang.String, o.CloseFrameBuilder$length> r2 = r10.toFloatRange     // Catch:{ EOFException -> 0x00fb }
            r2.remove(r7)     // Catch:{ EOFException -> 0x00fb }
            goto L_0x00db
        L_0x007f:
            java.lang.String r7 = r2.substring(r7, r3)     // Catch:{ EOFException -> 0x00fb }
        L_0x0083:
            java.util.LinkedHashMap<java.lang.String, o.CloseFrameBuilder$length> r8 = r10.toFloatRange     // Catch:{ EOFException -> 0x00fb }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ EOFException -> 0x00fb }
            o.CloseFrameBuilder$length r8 = (o.CloseFrameBuilder.length) r8     // Catch:{ EOFException -> 0x00fb }
            if (r8 != 0) goto L_0x0097
            o.CloseFrameBuilder$length r8 = new o.CloseFrameBuilder$length     // Catch:{ EOFException -> 0x00fb }
            r8.<init>(r7)     // Catch:{ EOFException -> 0x00fb }
            java.util.LinkedHashMap<java.lang.String, o.CloseFrameBuilder$length> r9 = r10.toFloatRange     // Catch:{ EOFException -> 0x00fb }
            r9.put(r7, r8)     // Catch:{ EOFException -> 0x00fb }
        L_0x0097:
            r7 = 5
            if (r3 == r6) goto L_0x00ba
            if (r4 != r7) goto L_0x00ba
            java.lang.String r9 = "CLEAN"
            boolean r9 = r2.startsWith(r9)     // Catch:{ EOFException -> 0x00fb }
            if (r9 == 0) goto L_0x00ba
            int r3 = r3 + 1
            java.lang.String r2 = r2.substring(r3)     // Catch:{ EOFException -> 0x00fb }
            java.lang.String r3 = " "
            java.lang.String[] r2 = r2.split(r3)     // Catch:{ EOFException -> 0x00fb }
            r3 = 1
            r8.getMin = r3     // Catch:{ EOFException -> 0x00fb }
            r3 = 0
            r8.equals = r3     // Catch:{ EOFException -> 0x00fb }
            r8.length(r2)     // Catch:{ EOFException -> 0x00fb }
            goto L_0x00db
        L_0x00ba:
            if (r3 != r6) goto L_0x00ce
            if (r4 != r7) goto L_0x00ce
            java.lang.String r7 = "DIRTY"
            boolean r7 = r2.startsWith(r7)     // Catch:{ EOFException -> 0x00fb }
            if (r7 == 0) goto L_0x00ce
            o.CloseFrameBuilder$setMin r2 = new o.CloseFrameBuilder$setMin     // Catch:{ EOFException -> 0x00fb }
            r2.<init>(r8)     // Catch:{ EOFException -> 0x00fb }
            r8.equals = r2     // Catch:{ EOFException -> 0x00fb }
            goto L_0x00db
        L_0x00ce:
            if (r3 != r6) goto L_0x00df
            r3 = 4
            if (r4 != r3) goto L_0x00df
            java.lang.String r3 = "READ"
            boolean r3 = r2.startsWith(r3)     // Catch:{ EOFException -> 0x00fb }
            if (r3 == 0) goto L_0x00df
        L_0x00db:
            int r0 = r0 + 1
            goto L_0x0053
        L_0x00df:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x00fb }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ EOFException -> 0x00fb }
            java.lang.String r2 = r5.concat(r2)     // Catch:{ EOFException -> 0x00fb }
            r3.<init>(r2)     // Catch:{ EOFException -> 0x00fb }
            throw r3     // Catch:{ EOFException -> 0x00fb }
        L_0x00ed:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x00fb }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ EOFException -> 0x00fb }
            java.lang.String r2 = r5.concat(r2)     // Catch:{ EOFException -> 0x00fb }
            r3.<init>(r2)     // Catch:{ EOFException -> 0x00fb }
            throw r3     // Catch:{ EOFException -> 0x00fb }
        L_0x00fb:
            java.util.LinkedHashMap<java.lang.String, o.CloseFrameBuilder$length> r2 = r10.toFloatRange     // Catch:{ all -> 0x0150 }
            int r2 = r2.size()     // Catch:{ all -> 0x0150 }
            int r0 = r0 - r2
            r10.equals = r0     // Catch:{ all -> 0x0150 }
            boolean r0 = r1.setMax()     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x010e
            r10.getMax()     // Catch:{ all -> 0x0150 }
            goto L_0x0121
        L_0x010e:
            o.verbose r0 = r10.getMax     // Catch:{ all -> 0x0150 }
            java.io.File r2 = r10.values     // Catch:{ all -> 0x0150 }
            o.recordDnsTime r0 = r0.setMin(r2)     // Catch:{ all -> 0x0150 }
            o.CloseFrameBuilder$4 r2 = new o.CloseFrameBuilder$4     // Catch:{ all -> 0x0150 }
            r2.<init>(r0)     // Catch:{ all -> 0x0150 }
            o.executeSerial r0 = o.recordMonitorOfSndMsg.getMax((o.recordDnsTime) r2)     // Catch:{ all -> 0x0150 }
            r10.setMax = r0     // Catch:{ all -> 0x0150 }
        L_0x0121:
            o.initCloseCode.getMin((java.io.Closeable) r1)
            return
        L_0x0125:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0150 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.<init>(r8)     // Catch:{ all -> 0x0150 }
            r7.append(r2)     // Catch:{ all -> 0x0150 }
            r7.append(r0)     // Catch:{ all -> 0x0150 }
            r7.append(r3)     // Catch:{ all -> 0x0150 }
            r7.append(r0)     // Catch:{ all -> 0x0150 }
            r7.append(r5)     // Catch:{ all -> 0x0150 }
            r7.append(r0)     // Catch:{ all -> 0x0150 }
            r7.append(r6)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0150 }
            r4.<init>(r0)     // Catch:{ all -> 0x0150 }
            throw r4     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r0 = move-exception
            o.initCloseCode.getMin((java.io.Closeable) r1)
            goto L_0x0156
        L_0x0155:
            throw r0
        L_0x0156:
            goto L_0x0155
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CloseFrameBuilder.length():void");
    }

    private void toIntRange() throws IOException {
        this.getMax.length(this.toDoubleRange);
        Iterator<length> it = this.toFloatRange.values().iterator();
        while (it.hasNext()) {
            length next = it.next();
            int i = 0;
            if (next.equals == null) {
                while (i < this.setMin) {
                    this.invoke += next.length[i];
                    i++;
                }
            } else {
                next.equals = null;
                while (i < this.setMin) {
                    this.getMax.length(next.getMax[i]);
                    this.getMax.length(next.setMin[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final synchronized void getMax() throws IOException {
        if (this.setMax != null) {
            this.setMax.close();
        }
        executeSerial max = recordMonitorOfSndMsg.getMax(this.getMax.getMax(this.toDoubleRange));
        try {
            max.setMin("libcore.io.DiskLruCache").equals(10);
            max.setMin("1").equals(10);
            max.toDoubleRange((long) this.invokeSuspend).equals(10);
            max.toDoubleRange((long) this.setMin).equals(10);
            max.equals(10);
            for (length next : this.toFloatRange.values()) {
                if (next.equals != null) {
                    max.setMin("DIRTY").equals(32);
                    max.setMin(next.setMax);
                    max.equals(10);
                } else {
                    max.setMin("CLEAN").equals(32);
                    max.setMin(next.setMax);
                    next.setMax(max);
                    max.equals(10);
                }
            }
            max.close();
            if (this.getMax.setMax(this.values)) {
                this.getMax.setMin(this.values, this.valueOf);
            }
            this.getMax.setMin(this.toDoubleRange, this.values);
            this.getMax.length(this.valueOf);
            this.setMax = recordMonitorOfSndMsg.getMax((recordDnsTime) new setPayload(this.getMax.setMin(this.values)) {
                static final /* synthetic */ boolean length = (!CloseFrameBuilder.class.desiredAssertionStatus());

                /* access modifiers changed from: protected */
                public final void length() {
                    if (length || Thread.holdsLock(CloseFrameBuilder.this)) {
                        CloseFrameBuilder.this.IsOverlapping = true;
                        return;
                    }
                    throw new AssertionError();
                }
            });
            this.IsOverlapping = false;
            this.FastBitmap$CoordinateSystem = false;
        } catch (Throwable th) {
            max.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized o.CloseFrameBuilder.setMax getMin(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.setMax()     // Catch:{ all -> 0x0050 }
            r3.toFloatRange()     // Catch:{ all -> 0x0050 }
            length(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, o.CloseFrameBuilder$length> r0 = r3.toFloatRange     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            o.CloseFrameBuilder$length r0 = (o.CloseFrameBuilder.length) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.getMin     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            o.CloseFrameBuilder$setMax r0 = r0.getMin()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.equals     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.equals = r1     // Catch:{ all -> 0x0050 }
            o.executeSerial r1 = r3.setMax     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            o.executeSerial r1 = r1.setMin(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            o.executeSerial r1 = r1.equals(r2)     // Catch:{ all -> 0x0050 }
            o.executeSerial r4 = r1.setMin(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.equals(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.setMin()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.create     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.getCause     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CloseFrameBuilder.getMin(java.lang.String):o.CloseFrameBuilder$setMax");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized o.CloseFrameBuilder.setMin length(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.setMax()     // Catch:{ all -> 0x0074 }
            r5.toFloatRange()     // Catch:{ all -> 0x0074 }
            length(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, o.CloseFrameBuilder$length> r0 = r5.toFloatRange     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            o.CloseFrameBuilder$length r0 = (o.CloseFrameBuilder.length) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.IsOverlapping     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            o.CloseFrameBuilder$setMin r7 = r0.equals     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.hashCode     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            o.executeSerial r7 = r5.setMax     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            o.executeSerial r7 = r7.setMin(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            o.executeSerial r7 = r7.equals(r8)     // Catch:{ all -> 0x0074 }
            o.executeSerial r7 = r7.setMin(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.equals(r8)     // Catch:{ all -> 0x0074 }
            o.executeSerial r7 = r5.setMax     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.IsOverlapping     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            o.CloseFrameBuilder$length r0 = new o.CloseFrameBuilder$length     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, o.CloseFrameBuilder$length> r7 = r5.toFloatRange     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            o.CloseFrameBuilder$setMin r6 = new o.CloseFrameBuilder$setMin     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.equals = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.create     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.getCause     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CloseFrameBuilder.length(java.lang.String, long):o.CloseFrameBuilder$setMin");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ed, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void getMin(o.CloseFrameBuilder.setMin r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            o.CloseFrameBuilder$length r0 = r10.getMax     // Catch:{ all -> 0x00f4 }
            o.CloseFrameBuilder$setMin r1 = r0.equals     // Catch:{ all -> 0x00f4 }
            if (r1 != r10) goto L_0x00ee
            r1 = 0
            if (r11 == 0) goto L_0x0040
            boolean r2 = r0.getMin     // Catch:{ all -> 0x00f4 }
            if (r2 != 0) goto L_0x0040
            r2 = 0
        L_0x000f:
            int r3 = r9.setMin     // Catch:{ all -> 0x00f4 }
            if (r2 >= r3) goto L_0x0040
            boolean[] r3 = r10.length     // Catch:{ all -> 0x00f4 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f4 }
            if (r3 == 0) goto L_0x002d
            o.verbose r3 = r9.getMax     // Catch:{ all -> 0x00f4 }
            java.io.File[] r4 = r0.setMin     // Catch:{ all -> 0x00f4 }
            r4 = r4[r2]     // Catch:{ all -> 0x00f4 }
            boolean r3 = r3.setMax(r4)     // Catch:{ all -> 0x00f4 }
            if (r3 != 0) goto L_0x002a
            r10.setMax()     // Catch:{ all -> 0x00f4 }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.setMax()     // Catch:{ all -> 0x00f4 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f4 }
            java.lang.String r11 = "Newly created entry didn't create value for index "
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00f4 }
            java.lang.String r11 = r11.concat(r0)     // Catch:{ all -> 0x00f4 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f4 }
            throw r10     // Catch:{ all -> 0x00f4 }
        L_0x0040:
            int r10 = r9.setMin     // Catch:{ all -> 0x00f4 }
            if (r1 >= r10) goto L_0x0078
            java.io.File[] r10 = r0.setMin     // Catch:{ all -> 0x00f4 }
            r10 = r10[r1]     // Catch:{ all -> 0x00f4 }
            if (r11 == 0) goto L_0x0070
            o.verbose r2 = r9.getMax     // Catch:{ all -> 0x00f4 }
            boolean r2 = r2.setMax(r10)     // Catch:{ all -> 0x00f4 }
            if (r2 == 0) goto L_0x0075
            java.io.File[] r2 = r0.getMax     // Catch:{ all -> 0x00f4 }
            r2 = r2[r1]     // Catch:{ all -> 0x00f4 }
            o.verbose r3 = r9.getMax     // Catch:{ all -> 0x00f4 }
            r3.setMin(r10, r2)     // Catch:{ all -> 0x00f4 }
            long[] r10 = r0.length     // Catch:{ all -> 0x00f4 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f4 }
            o.verbose r10 = r9.getMax     // Catch:{ all -> 0x00f4 }
            long r5 = r10.toIntRange(r2)     // Catch:{ all -> 0x00f4 }
            long[] r10 = r0.length     // Catch:{ all -> 0x00f4 }
            r10[r1] = r5     // Catch:{ all -> 0x00f4 }
            long r7 = r9.invoke     // Catch:{ all -> 0x00f4 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.invoke = r7     // Catch:{ all -> 0x00f4 }
            goto L_0x0075
        L_0x0070:
            o.verbose r2 = r9.getMax     // Catch:{ all -> 0x00f4 }
            r2.length(r10)     // Catch:{ all -> 0x00f4 }
        L_0x0075:
            int r1 = r1 + 1
            goto L_0x0040
        L_0x0078:
            int r10 = r9.equals     // Catch:{ all -> 0x00f4 }
            r1 = 1
            int r10 = r10 + r1
            r9.equals = r10     // Catch:{ all -> 0x00f4 }
            r10 = 0
            r0.equals = r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r0.getMin     // Catch:{ all -> 0x00f4 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00b4
            r0.getMin = r1     // Catch:{ all -> 0x00f4 }
            o.executeSerial r10 = r9.setMax     // Catch:{ all -> 0x00f4 }
            java.lang.String r1 = "CLEAN"
            o.executeSerial r10 = r10.setMin(r1)     // Catch:{ all -> 0x00f4 }
            r10.equals(r3)     // Catch:{ all -> 0x00f4 }
            o.executeSerial r10 = r9.setMax     // Catch:{ all -> 0x00f4 }
            java.lang.String r1 = r0.setMax     // Catch:{ all -> 0x00f4 }
            r10.setMin(r1)     // Catch:{ all -> 0x00f4 }
            o.executeSerial r10 = r9.setMax     // Catch:{ all -> 0x00f4 }
            r0.setMax(r10)     // Catch:{ all -> 0x00f4 }
            o.executeSerial r10 = r9.setMax     // Catch:{ all -> 0x00f4 }
            r10.equals(r2)     // Catch:{ all -> 0x00f4 }
            if (r11 == 0) goto L_0x00d2
            long r10 = r9.Mean$Arithmetic     // Catch:{ all -> 0x00f4 }
            r1 = 1
            long r1 = r1 + r10
            r9.Mean$Arithmetic = r1     // Catch:{ all -> 0x00f4 }
            r0.IsOverlapping = r10     // Catch:{ all -> 0x00f4 }
            goto L_0x00d2
        L_0x00b4:
            java.util.LinkedHashMap<java.lang.String, o.CloseFrameBuilder$length> r10 = r9.toFloatRange     // Catch:{ all -> 0x00f4 }
            java.lang.String r11 = r0.setMax     // Catch:{ all -> 0x00f4 }
            r10.remove(r11)     // Catch:{ all -> 0x00f4 }
            o.executeSerial r10 = r9.setMax     // Catch:{ all -> 0x00f4 }
            java.lang.String r11 = "REMOVE"
            o.executeSerial r10 = r10.setMin(r11)     // Catch:{ all -> 0x00f4 }
            r10.equals(r3)     // Catch:{ all -> 0x00f4 }
            o.executeSerial r10 = r9.setMax     // Catch:{ all -> 0x00f4 }
            java.lang.String r11 = r0.setMax     // Catch:{ all -> 0x00f4 }
            r10.setMin(r11)     // Catch:{ all -> 0x00f4 }
            o.executeSerial r10 = r9.setMax     // Catch:{ all -> 0x00f4 }
            r10.equals(r2)     // Catch:{ all -> 0x00f4 }
        L_0x00d2:
            o.executeSerial r10 = r9.setMax     // Catch:{ all -> 0x00f4 }
            r10.flush()     // Catch:{ all -> 0x00f4 }
            long r10 = r9.invoke     // Catch:{ all -> 0x00f4 }
            long r0 = r9.Grayscale$Algorithm     // Catch:{ all -> 0x00f4 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e5
            boolean r10 = r9.setMin()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00ec
        L_0x00e5:
            java.util.concurrent.Executor r10 = r9.create     // Catch:{ all -> 0x00f4 }
            java.lang.Runnable r11 = r9.getCause     // Catch:{ all -> 0x00f4 }
            r10.execute(r11)     // Catch:{ all -> 0x00f4 }
        L_0x00ec:
            monitor-exit(r9)
            return
        L_0x00ee:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f4 }
            r10.<init>()     // Catch:{ all -> 0x00f4 }
            throw r10     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x00f8
        L_0x00f7:
            throw r10
        L_0x00f8:
            goto L_0x00f7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CloseFrameBuilder.getMin(o.CloseFrameBuilder$setMin, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean setMin() {
        int i = this.equals;
        return i >= 2000 && i >= this.toFloatRange.size();
    }

    public final synchronized boolean getMax(String str) throws IOException {
        setMax();
        toFloatRange();
        length(str);
        length length2 = this.toFloatRange.get(str);
        if (length2 == null) {
            return false;
        }
        getMax(length2);
        if (this.invoke <= this.Grayscale$Algorithm) {
            this.hashCode = false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax(length length2) throws IOException {
        if (length2.equals != null) {
            length2.equals.getMin();
        }
        for (int i = 0; i < this.setMin; i++) {
            this.getMax.length(length2.getMax[i]);
            this.invoke -= length2.length[i];
            length2.length[i] = 0;
        }
        this.equals++;
        this.setMax.setMin("REMOVE").equals(32).setMin(length2.setMax).equals(10);
        this.toFloatRange.remove(length2.setMax);
        if (setMin()) {
            this.create.execute(this.getCause);
        }
        return true;
    }

    private synchronized boolean equals() {
        return this.isInside;
    }

    private synchronized void toFloatRange() {
        if (equals()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.toIntRange) {
            toFloatRange();
            getMin();
            this.setMax.flush();
        }
    }

    public final synchronized void close() throws IOException {
        if (this.toIntRange) {
            if (!this.isInside) {
                for (length length2 : (length[]) this.toFloatRange.values().toArray(new length[this.toFloatRange.size()])) {
                    if (length2.equals != null) {
                        length2.equals.setMax();
                    }
                }
                getMin();
                this.setMax.close();
                this.setMax = null;
                this.isInside = true;
                return;
            }
        }
        this.isInside = true;
    }

    /* access modifiers changed from: package-private */
    public final void getMin() throws IOException {
        while (this.invoke > this.Grayscale$Algorithm) {
            getMax(this.toFloatRange.values().iterator().next());
        }
        this.hashCode = false;
    }

    private static void length(String str) {
        if (!length.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final class setMax implements Closeable {
        public final recordWsHsTime[] getMax;
        public final String getMin;
        private final long[] length;
        public final long setMin;

        setMax(String str, long j, recordWsHsTime[] recordwshstimeArr, long[] jArr) {
            this.getMin = str;
            this.setMin = j;
            this.getMax = recordwshstimeArr;
            this.length = jArr;
        }

        public final void close() {
            for (recordWsHsTime min : this.getMax) {
                initCloseCode.getMin((Closeable) min);
            }
        }
    }

    public final class setMin {
        final length getMax;
        final boolean[] length;
        private boolean setMax;

        setMin(length length2) {
            this.getMax = length2;
            this.length = length2.getMin ? null : new boolean[CloseFrameBuilder.this.setMin];
        }

        /* access modifiers changed from: package-private */
        public final void getMin() {
            if (this.getMax.equals == this) {
                for (int i = 0; i < CloseFrameBuilder.this.setMin; i++) {
                    try {
                        CloseFrameBuilder.this.getMax.length(this.getMax.setMin[i]);
                    } catch (IOException unused) {
                    }
                }
                this.getMax.equals = null;
            }
        }

        public final recordDnsTime getMin(int i) {
            synchronized (CloseFrameBuilder.this) {
                if (this.setMax) {
                    throw new IllegalStateException();
                } else if (this.getMax.equals != this) {
                    recordDnsTime min = recordMonitorOfSndMsg.getMin();
                    return min;
                } else {
                    if (!this.getMax.getMin) {
                        this.length[i] = true;
                    }
                    try {
                        AnonymousClass2 r1 = new setPayload(CloseFrameBuilder.this.getMax.getMax(this.getMax.setMin[i])) {
                            /* access modifiers changed from: protected */
                            public final void length() {
                                synchronized (CloseFrameBuilder.this) {
                                    setMin.this.getMin();
                                }
                            }
                        };
                        return r1;
                    } catch (FileNotFoundException unused) {
                        return recordMonitorOfSndMsg.getMin();
                    }
                }
            }
        }

        public final void setMin() throws IOException {
            synchronized (CloseFrameBuilder.this) {
                if (!this.setMax) {
                    if (this.getMax.equals == this) {
                        CloseFrameBuilder.this.getMin(this, true);
                    }
                    this.setMax = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public final void setMax() throws IOException {
            synchronized (CloseFrameBuilder.this) {
                if (!this.setMax) {
                    if (this.getMax.equals == this) {
                        CloseFrameBuilder.this.getMin(this, false);
                    }
                    this.setMax = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    final class length {
        long IsOverlapping;
        setMin equals;
        final File[] getMax;
        boolean getMin;
        final long[] length;
        final String setMax;
        final File[] setMin;

        length(String str) {
            this.setMax = str;
            this.length = new long[CloseFrameBuilder.this.setMin];
            this.getMax = new File[CloseFrameBuilder.this.setMin];
            this.setMin = new File[CloseFrameBuilder.this.setMin];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length2 = sb.length();
            for (int i = 0; i < CloseFrameBuilder.this.setMin; i++) {
                sb.append(i);
                this.getMax[i] = new File(CloseFrameBuilder.this.getMin, sb.toString());
                sb.append(".tmp");
                this.setMin[i] = new File(CloseFrameBuilder.this.getMin, sb.toString());
                sb.setLength(length2);
            }
        }

        /* access modifiers changed from: package-private */
        public final void length(String[] strArr) throws IOException {
            if (strArr.length == CloseFrameBuilder.this.setMin) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.length[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        StringBuilder sb = new StringBuilder("unexpected journal line: ");
                        sb.append(Arrays.toString(strArr));
                        throw new IOException(sb.toString());
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder("unexpected journal line: ");
            sb2.append(Arrays.toString(strArr));
            throw new IOException(sb2.toString());
        }

        /* access modifiers changed from: package-private */
        public final void setMax(executeSerial executeserial) throws IOException {
            for (long doubleRange : this.length) {
                executeserial.equals(32).toDoubleRange(doubleRange);
            }
        }

        /* access modifiers changed from: package-private */
        public final setMax getMin() {
            if (Thread.holdsLock(CloseFrameBuilder.this)) {
                recordWsHsTime[] recordwshstimeArr = new recordWsHsTime[CloseFrameBuilder.this.setMin];
                long[] jArr = (long[]) this.length.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < CloseFrameBuilder.this.setMin) {
                    try {
                        recordwshstimeArr[i2] = CloseFrameBuilder.this.getMax.getMin(this.getMax[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < CloseFrameBuilder.this.setMin && recordwshstimeArr[i] != null) {
                            initCloseCode.getMin((Closeable) recordwshstimeArr[i]);
                            i++;
                        }
                        try {
                            CloseFrameBuilder.this.getMax(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new setMax(this.setMax, this.IsOverlapping, recordwshstimeArr, jArr);
            }
            throw new AssertionError();
        }
    }
}
