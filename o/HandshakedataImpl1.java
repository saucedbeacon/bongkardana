package o;

import com.google.android.exoplayer2.C;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.ServerHandshake;
import okhttp3.internal.http2.ErrorCode;

public final class HandshakedataImpl1 implements Closeable {
    static final /* synthetic */ boolean Mean$Arithmetic = (!HandshakedataImpl1.class.desiredAssertionStatus());
    /* access modifiers changed from: private */
    public static final ExecutorService getCause = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), initCloseCode.getMax("OkHttp Http2Connection", true));
    final warn FastBitmap$CoordinateSystem = new warn();
    final Socket Grayscale$Algorithm;
    /* access modifiers changed from: private */
    public long ICustomTabsCallback = 0;
    int IsOverlapping;
    /* access modifiers changed from: private */
    public long b = 0;
    /* access modifiers changed from: private */
    public boolean create;
    long equals = 0;
    final boolean getMax;
    final String getMin;
    long hashCode;
    public final AndroidSCLogCatImpl invoke;
    final getMin invokeSuspend;
    long isInside = 0;
    final setMax length;
    private final ExecutorService onNavigationEvent;
    private long onPostMessage = 0;
    private long onRelationshipValidationResult = 0;
    int setMax;
    final Map<Integer, ServerHandshakeBuilder> setMin = new LinkedHashMap();
    long toDoubleRange = 0;
    final printError toFloatRange;
    /* access modifiers changed from: package-private */
    public final ScheduledExecutorService toIntRange;
    warn toString = new warn();
    final Set<Integer> valueOf = new LinkedHashSet();
    long values = 0;

    public static class getMax {
        public int equals;
        public setMax getMax = setMax.toDoubleRange;
        public schedule getMin;
        printError isInside = printError.setMin;
        public Socket length;
        public String setMax;
        public executeSerial setMin;
        boolean toFloatRange = true;
    }

    public static abstract class setMax {
        public static final setMax toDoubleRange = new setMax() {
            public final void getMax(ServerHandshakeBuilder serverHandshakeBuilder) throws IOException {
                ErrorCode errorCode = ErrorCode.REFUSED_STREAM;
                if (serverHandshakeBuilder.getMax(errorCode)) {
                    HandshakedataImpl1 handshakedataImpl1 = serverHandshakeBuilder.getMax;
                    handshakedataImpl1.invoke.getMin(serverHandshakeBuilder.setMin, errorCode);
                }
            }
        };

        public abstract void getMax(ServerHandshakeBuilder serverHandshakeBuilder) throws IOException;

        public void length(HandshakedataImpl1 handshakedataImpl1) {
        }
    }

    static boolean getMax(int i) {
        return i != 0 && (i & 1) == 0;
    }

    static /* synthetic */ long equals(HandshakedataImpl1 handshakedataImpl1) {
        long j = handshakedataImpl1.onRelationshipValidationResult;
        handshakedataImpl1.onRelationshipValidationResult = 1 + j;
        return j;
    }

    static /* synthetic */ long isInside(HandshakedataImpl1 handshakedataImpl1) {
        long j = handshakedataImpl1.isInside;
        handshakedataImpl1.isInside = 1 + j;
        return j;
    }

    static /* synthetic */ long length(HandshakedataImpl1 handshakedataImpl1) {
        long j = handshakedataImpl1.ICustomTabsCallback;
        handshakedataImpl1.ICustomTabsCallback = 1 + j;
        return j;
    }

    static /* synthetic */ long toIntRange(HandshakedataImpl1 handshakedataImpl1) {
        long j = handshakedataImpl1.b;
        handshakedataImpl1.b = 1 + j;
        return j;
    }

    public HandshakedataImpl1(getMax getmax) {
        getMax getmax2 = getmax;
        this.toFloatRange = getmax2.isInside;
        this.getMax = getmax2.toFloatRange;
        this.length = getmax2.getMax;
        this.IsOverlapping = getmax2.toFloatRange ? 1 : 2;
        if (getmax2.toFloatRange) {
            this.IsOverlapping += 2;
        }
        if (getmax2.toFloatRange) {
            this.toString.setMax(7, C.DEFAULT_MUXED_BUFFER_SIZE);
        }
        this.getMin = getmax2.setMax;
        this.toIntRange = new ScheduledThreadPoolExecutor(1, initCloseCode.getMax(initCloseCode.length("OkHttp %s Writer", this.getMin), false));
        if (getmax2.equals != 0) {
            this.toIntRange.scheduleAtFixedRate(new length(), (long) getmax2.equals, (long) getmax2.equals, TimeUnit.MILLISECONDS);
        }
        this.onNavigationEvent = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), initCloseCode.getMax(initCloseCode.length("OkHttp %s Push Observer", this.getMin), true));
        int i = 65535;
        this.FastBitmap$CoordinateSystem.setMax(7, 65535);
        this.FastBitmap$CoordinateSystem.setMax(5, 16384);
        warn warn = this.FastBitmap$CoordinateSystem;
        this.hashCode = (long) ((warn.setMax & 128) != 0 ? warn.getMax[7] : i);
        this.Grayscale$Algorithm = getmax2.length;
        this.invoke = new AndroidSCLogCatImpl(getmax2.setMin, this.getMax);
        this.invokeSuspend = new getMin(new ServerHandshake(getmax2.getMin, this.getMax));
    }

    /* access modifiers changed from: package-private */
    public final synchronized ServerHandshakeBuilder setMax(int i) {
        return this.setMin.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    public final synchronized ServerHandshakeBuilder length(int i) {
        ServerHandshakeBuilder remove;
        remove = this.setMin.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public final synchronized int length() {
        warn warn = this.FastBitmap$CoordinateSystem;
        if ((warn.setMax & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return warn.getMax[4];
    }

    /* access modifiers changed from: package-private */
    public final synchronized void setMax(long j) {
        long j2 = this.toDoubleRange + j;
        this.toDoubleRange = j2;
        warn warn = this.toString;
        if (j2 >= ((long) (((warn.setMax & 128) != 0 ? warn.getMax[7] : 65535) / 2))) {
            length(0, this.toDoubleRange);
            this.toDoubleRange = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.ServerHandshakeBuilder setMax(java.util.List<o.setHttpStatus> r11, boolean r12) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r12 ^ 1
            o.AndroidSCLogCatImpl r7 = r10.invoke
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0064 }
            int r0 = r10.IsOverlapping     // Catch:{ all -> 0x0061 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0012
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0061 }
            r10.length((okhttp3.internal.http2.ErrorCode) r0)     // Catch:{ all -> 0x0061 }
        L_0x0012:
            boolean r0 = r10.create     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x005b
            int r8 = r10.IsOverlapping     // Catch:{ all -> 0x0061 }
            int r0 = r10.IsOverlapping     // Catch:{ all -> 0x0061 }
            int r0 = r0 + 2
            r10.IsOverlapping = r0     // Catch:{ all -> 0x0061 }
            o.ServerHandshakeBuilder r9 = new o.ServerHandshakeBuilder     // Catch:{ all -> 0x0061 }
            r4 = 0
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0061 }
            if (r12 == 0) goto L_0x003c
            long r0 = r10.hashCode     // Catch:{ all -> 0x0061 }
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x003c
            long r0 = r9.setMax     // Catch:{ all -> 0x0061 }
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r12 = 0
            goto L_0x003d
        L_0x003c:
            r12 = 1
        L_0x003d:
            boolean r0 = r9.getMin()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x004c
            java.util.Map<java.lang.Integer, o.ServerHandshakeBuilder> r0 = r10.setMin     // Catch:{ all -> 0x0061 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0061 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0061 }
        L_0x004c:
            monitor-exit(r10)     // Catch:{ all -> 0x0061 }
            o.AndroidSCLogCatImpl r0 = r10.invoke     // Catch:{ all -> 0x0064 }
            r0.setMin(r6, r8, r11)     // Catch:{ all -> 0x0064 }
            monitor-exit(r7)     // Catch:{ all -> 0x0064 }
            if (r12 == 0) goto L_0x005a
            o.AndroidSCLogCatImpl r11 = r10.invoke
            r11.setMin()
        L_0x005a:
            return r9
        L_0x005b:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0061 }
            r11.<init>()     // Catch:{ all -> 0x0061 }
            throw r11     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0064 }
            throw r11     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.HandshakedataImpl1.setMax(java.util.List, boolean):o.ServerHandshakeBuilder");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.hashCode), r8.invoke.getMax);
        r6 = (long) r3;
        r8.hashCode -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(int r9, boolean r10, o.submitLazy r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            o.AndroidSCLogCatImpl r12 = r8.invoke
            r12.getMin(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.hashCode     // Catch:{ InterruptedException -> 0x0058 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, o.ServerHandshakeBuilder> r3 = r8.setMin     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r3 = r8.hashCode     // Catch:{ all -> 0x0056 }
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0056 }
            int r4 = (int) r3     // Catch:{ all -> 0x0056 }
            o.AndroidSCLogCatImpl r3 = r8.invoke     // Catch:{ all -> 0x0056 }
            int r3 = r3.getMax     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0056 }
            long r4 = r8.hashCode     // Catch:{ all -> 0x0056 }
            long r6 = (long) r3     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.hashCode = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            o.AndroidSCLogCatImpl r4 = r8.invoke
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.getMin(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x0065
        L_0x0058:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0056 }
            r9.interrupt()     // Catch:{ all -> 0x0056 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0065:
            monitor-exit(r8)
            throw r9
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.HandshakedataImpl1.length(int, boolean, o.submitLazy, long):void");
    }

    /* access modifiers changed from: package-private */
    public final void getMin(int i, ErrorCode errorCode) {
        try {
            final int i2 = i;
            final ErrorCode errorCode2 = errorCode;
            this.toIntRange.execute(new InvalidFrameException("OkHttp %s stream %d", new Object[]{this.getMin, Integer.valueOf(i)}) {
                public final void getMin() {
                    try {
                        HandshakedataImpl1 handshakedataImpl1 = HandshakedataImpl1.this;
                        handshakedataImpl1.invoke.getMin(i2, errorCode2);
                    } catch (IOException unused) {
                        HandshakedataImpl1.setMin(HandshakedataImpl1.this);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void length(int i, long j) {
        try {
            final int i2 = i;
            final long j2 = j;
            this.toIntRange.execute(new InvalidFrameException("OkHttp Window Update %s stream %d", new Object[]{this.getMin, Integer.valueOf(i)}) {
                public final void getMin() {
                    try {
                        HandshakedataImpl1.this.invoke.getMin(i2, j2);
                    } catch (IOException unused) {
                        HandshakedataImpl1.setMin(HandshakedataImpl1.this);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    final class setMin extends InvalidFrameException {
        final int getMin;
        final boolean setMax = true;
        final int setMin;

        setMin(int i, int i2) {
            super("OkHttp %s ping %08x%08x", HandshakedataImpl1.this.getMin, Integer.valueOf(i), Integer.valueOf(i2));
            this.getMin = i;
            this.setMin = i2;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|7) */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
            r0.getMax(r1, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void getMin() {
            /*
                r5 = this;
                o.HandshakedataImpl1 r0 = o.HandshakedataImpl1.this
                boolean r1 = r5.setMax
                int r2 = r5.getMin
                int r3 = r5.setMin
                o.AndroidSCLogCatImpl r4 = r0.invoke     // Catch:{ IOException -> 0x000e }
                r4.length(r1, r2, r3)     // Catch:{ IOException -> 0x000e }
                return
            L_0x000e:
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ IOException -> 0x0013 }
                r0.getMax(r1, r1)     // Catch:{ IOException -> 0x0013 }
            L_0x0013:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.HandshakedataImpl1.setMin.getMin():void");
        }
    }

    final class length extends InvalidFrameException {
        length() {
            super("OkHttp %s ping", HandshakedataImpl1.this.getMin);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|21) */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
            r0.getMax(r1, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void getMin() {
            /*
                r8 = this;
                o.HandshakedataImpl1 r0 = o.HandshakedataImpl1.this
                monitor-enter(r0)
                o.HandshakedataImpl1 r1 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x0034 }
                long r1 = r1.b     // Catch:{ all -> 0x0034 }
                o.HandshakedataImpl1 r3 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x0034 }
                long r3 = r3.ICustomTabsCallback     // Catch:{ all -> 0x0034 }
                r5 = 1
                r6 = 0
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x0017
                r1 = 1
                goto L_0x001d
            L_0x0017:
                o.HandshakedataImpl1 r1 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x0034 }
                o.HandshakedataImpl1.length((o.HandshakedataImpl1) r1)     // Catch:{ all -> 0x0034 }
                r1 = 0
            L_0x001d:
                monitor-exit(r0)     // Catch:{ all -> 0x0034 }
                if (r1 == 0) goto L_0x0026
                o.HandshakedataImpl1 r0 = o.HandshakedataImpl1.this
                o.HandshakedataImpl1.setMin(r0)
                return
            L_0x0026:
                o.HandshakedataImpl1 r0 = o.HandshakedataImpl1.this
                o.AndroidSCLogCatImpl r1 = r0.invoke     // Catch:{ IOException -> 0x002e }
                r1.length(r6, r5, r6)     // Catch:{ IOException -> 0x002e }
                return
            L_0x002e:
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ IOException -> 0x0033 }
                r0.getMax(r1, r1)     // Catch:{ IOException -> 0x0033 }
            L_0x0033:
                return
            L_0x0034:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.HandshakedataImpl1.length.getMin():void");
        }
    }

    private void length(ErrorCode errorCode) throws IOException {
        synchronized (this.invoke) {
            synchronized (this) {
                if (!this.create) {
                    this.create = true;
                    int i = this.setMax;
                    this.invoke.getMin(i, errorCode, initCloseCode.length);
                }
            }
        }
    }

    public final void close() throws IOException {
        getMax(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    /* access modifiers changed from: package-private */
    public final void getMax(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        if (Mean$Arithmetic || !Thread.holdsLock(this)) {
            ServerHandshakeBuilder[] serverHandshakeBuilderArr = null;
            try {
                length(errorCode);
                e = null;
            } catch (IOException e) {
                e = e;
            }
            synchronized (this) {
                if (!this.setMin.isEmpty()) {
                    serverHandshakeBuilderArr = (ServerHandshakeBuilder[]) this.setMin.values().toArray(new ServerHandshakeBuilder[this.setMin.size()]);
                    this.setMin.clear();
                }
            }
            if (serverHandshakeBuilderArr != null) {
                for (ServerHandshakeBuilder serverHandshakeBuilder : serverHandshakeBuilderArr) {
                    try {
                        if (serverHandshakeBuilder.getMax(errorCode2)) {
                            serverHandshakeBuilder.getMax.invoke.getMin(serverHandshakeBuilder.setMin, errorCode2);
                        }
                    } catch (IOException e2) {
                        if (e != null) {
                            e = e2;
                        }
                    }
                }
            }
            try {
                this.invoke.close();
            } catch (IOException e3) {
                if (e == null) {
                    e = e3;
                }
            }
            try {
                this.Grayscale$Algorithm.close();
            } catch (IOException e4) {
                e = e4;
            }
            this.toIntRange.shutdown();
            this.onNavigationEvent.shutdown();
            if (e != null) {
                throw e;
            }
            return;
        }
        throw new AssertionError();
    }

    public final void setMin() throws IOException {
        this.invoke.getMax();
        this.invoke.setMin(this.toString);
        warn warn = this.toString;
        int i = (warn.setMax & 128) != 0 ? warn.getMax[7] : 65535;
        if (i != 65535) {
            this.invoke.getMin(0, (long) (i - 65535));
        }
        new Thread(this.invokeSuspend).start();
    }

    public final synchronized boolean length(long j) {
        if (this.create) {
            return false;
        }
        if (this.isInside >= this.equals || j < this.values) {
            return true;
        }
        return false;
    }

    class getMin extends InvalidFrameException implements ServerHandshake.getMax {
        final ServerHandshake getMin;

        getMin(ServerHandshake serverHandshake) {
            super("OkHttp %s", HandshakedataImpl1.this.getMin);
            this.getMin = serverHandshake;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:28|29|30|31) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
            r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r2 = r9.length;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r9.length.getMax(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
            o.initCloseCode.getMin((java.io.Closeable) r9.getMin);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
            throw r2;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0076 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void getMin() {
            /*
                r9 = this;
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                o.ServerHandshake r2 = r9.getMin     // Catch:{ IOException -> 0x0076 }
                boolean r3 = r2.setMax     // Catch:{ IOException -> 0x0076 }
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x001c
                boolean r2 = r2.getMin(r4, r9)     // Catch:{ IOException -> 0x0076 }
                if (r2 == 0) goto L_0x0013
                goto L_0x004e
            L_0x0013:
                java.lang.String r2 = "Required SETTINGS preface not received"
                java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0076 }
                java.io.IOException r2 = o.setHttpStatusMessage.getMin(r2, r3)     // Catch:{ IOException -> 0x0076 }
                throw r2     // Catch:{ IOException -> 0x0076 }
            L_0x001c:
                o.schedule r2 = r2.getMin     // Catch:{ IOException -> 0x0076 }
                o.printConnMonitorLog r3 = o.setHttpStatusMessage.getMax     // Catch:{ IOException -> 0x0076 }
                int r3 = r3.size()     // Catch:{ IOException -> 0x0076 }
                long r6 = (long) r3     // Catch:{ IOException -> 0x0076 }
                o.printConnMonitorLog r2 = r2.length(r6)     // Catch:{ IOException -> 0x0076 }
                java.util.logging.Logger r3 = o.ServerHandshake.setMin     // Catch:{ IOException -> 0x0076 }
                java.util.logging.Level r6 = java.util.logging.Level.FINE     // Catch:{ IOException -> 0x0076 }
                boolean r3 = r3.isLoggable(r6)     // Catch:{ IOException -> 0x0076 }
                if (r3 == 0) goto L_0x0046
                java.util.logging.Logger r3 = o.ServerHandshake.setMin     // Catch:{ IOException -> 0x0076 }
                java.lang.String r6 = "<< CONNECTION %s"
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0076 }
                java.lang.String r8 = r2.hex()     // Catch:{ IOException -> 0x0076 }
                r7[r5] = r8     // Catch:{ IOException -> 0x0076 }
                java.lang.String r6 = o.initCloseCode.length((java.lang.String) r6, (java.lang.Object[]) r7)     // Catch:{ IOException -> 0x0076 }
                r3.fine(r6)     // Catch:{ IOException -> 0x0076 }
            L_0x0046:
                o.printConnMonitorLog r3 = o.setHttpStatusMessage.getMax     // Catch:{ IOException -> 0x0076 }
                boolean r3 = r3.equals(r2)     // Catch:{ IOException -> 0x0076 }
                if (r3 == 0) goto L_0x0065
            L_0x004e:
                o.ServerHandshake r2 = r9.getMin     // Catch:{ IOException -> 0x0076 }
                boolean r2 = r2.getMin(r5, r9)     // Catch:{ IOException -> 0x0076 }
                if (r2 != 0) goto L_0x004e
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.NO_ERROR     // Catch:{ IOException -> 0x0076 }
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0076 }
                o.HandshakedataImpl1 r2 = o.HandshakedataImpl1.this     // Catch:{ IOException -> 0x005f }
            L_0x005c:
                r2.getMax(r0, r1)     // Catch:{ IOException -> 0x005f }
            L_0x005f:
                o.ServerHandshake r0 = r9.getMin
                o.initCloseCode.getMin((java.io.Closeable) r0)
                return
            L_0x0065:
                java.lang.String r3 = "Expected a connection header but was %s"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0076 }
                java.lang.String r2 = r2.utf8()     // Catch:{ IOException -> 0x0076 }
                r4[r5] = r2     // Catch:{ IOException -> 0x0076 }
                java.io.IOException r2 = o.setHttpStatusMessage.getMin(r3, r4)     // Catch:{ IOException -> 0x0076 }
                throw r2     // Catch:{ IOException -> 0x0076 }
            L_0x0074:
                r2 = move-exception
                goto L_0x007d
            L_0x0076:
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x0074 }
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x0074 }
                o.HandshakedataImpl1 r2 = o.HandshakedataImpl1.this     // Catch:{ IOException -> 0x005f }
                goto L_0x005c
            L_0x007d:
                o.HandshakedataImpl1 r3 = o.HandshakedataImpl1.this     // Catch:{ IOException -> 0x0082 }
                r3.getMax(r0, r1)     // Catch:{ IOException -> 0x0082 }
            L_0x0082:
                o.ServerHandshake r0 = r9.getMin
                o.initCloseCode.getMin((java.io.Closeable) r0)
                goto L_0x0089
            L_0x0088:
                throw r2
            L_0x0089:
                goto L_0x0088
            */
            throw new UnsupportedOperationException("Method not decompiled: o.HandshakedataImpl1.getMin.getMin():void");
        }

        public final void getMax(boolean z, int i, schedule schedule, int i2) throws IOException {
            if (HandshakedataImpl1.getMax(i)) {
                HandshakedataImpl1 handshakedataImpl1 = HandshakedataImpl1.this;
                submitLazy submitlazy = new submitLazy();
                long j = (long) i2;
                schedule.setMin(j);
                schedule.a_(submitlazy, j);
                if (submitlazy.setMax == j) {
                    handshakedataImpl1.setMax((InvalidFrameException) new InvalidFrameException("OkHttp %s Push Data[%s]", new Object[]{handshakedataImpl1.getMin, Integer.valueOf(i)}, i, submitlazy, i2, z) {
                        final /* synthetic */ submitLazy getMin;
                        final /* synthetic */ int length;
                        final /* synthetic */ boolean setMax;
                        final /* synthetic */ int setMin;

                        {
                            this.setMin = r4;
                            this.getMin = r5;
                            this.length = r6;
                            this.setMax = r7;
                        }

                        public final void getMin() {
                            try {
                                HandshakedataImpl1.this.toFloatRange.setMin(this.getMin, this.length);
                                HandshakedataImpl1.this.invoke.getMin(this.setMin, ErrorCode.CANCEL);
                                synchronized (HandshakedataImpl1.this) {
                                    HandshakedataImpl1.this.valueOf.remove(Integer.valueOf(this.setMin));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    });
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(submitlazy.setMax);
                sb.append(" != ");
                sb.append(i2);
                throw new IOException(sb.toString());
            }
            ServerHandshakeBuilder max = HandshakedataImpl1.this.setMax(i);
            if (max == null) {
                HandshakedataImpl1.this.getMin(i, ErrorCode.PROTOCOL_ERROR);
                long j2 = (long) i2;
                HandshakedataImpl1.this.setMax(j2);
                schedule.isInside(j2);
            } else if (ServerHandshakeBuilder.toString || !Thread.holdsLock(max)) {
                max.isInside.getMax(schedule, (long) i2);
                if (z) {
                    max.setMin();
                }
            } else {
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
            if (o.ServerHandshakeBuilder.toString != false) goto L_0x009d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
            if (java.lang.Thread.holdsLock(r4) != false) goto L_0x0097;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            r4.equals = true;
            r4.length.add(o.initCloseCode.length(r15));
            r14 = r4.getMin();
            r4.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
            if (r14 != false) goto L_0x00ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
            r4.getMax.length(r4.setMin);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
            if (r13 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
            r4.setMin();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void setMin(boolean r13, int r14, java.util.List<o.setHttpStatus> r15) {
            /*
                r12 = this;
                boolean r0 = o.HandshakedataImpl1.getMax((int) r14)
                r1 = 0
                r2 = 1
                r3 = 2
                if (r0 == 0) goto L_0x0027
                o.HandshakedataImpl1 r0 = o.HandshakedataImpl1.this
                o.HandshakedataImpl1$5 r11 = new o.HandshakedataImpl1$5     // Catch:{ RejectedExecutionException -> 0x0026 }
                java.lang.String r6 = "OkHttp %s Push Headers[%s]"
                java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ RejectedExecutionException -> 0x0026 }
                java.lang.String r3 = r0.getMin     // Catch:{ RejectedExecutionException -> 0x0026 }
                r7[r1] = r3     // Catch:{ RejectedExecutionException -> 0x0026 }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r14)     // Catch:{ RejectedExecutionException -> 0x0026 }
                r7[r2] = r1     // Catch:{ RejectedExecutionException -> 0x0026 }
                r4 = r11
                r5 = r0
                r8 = r14
                r9 = r15
                r10 = r13
                r4.<init>(r6, r7, r8, r9, r10)     // Catch:{ RejectedExecutionException -> 0x0026 }
                r0.setMax((o.InvalidFrameException) r11)     // Catch:{ RejectedExecutionException -> 0x0026 }
            L_0x0026:
                return
            L_0x0027:
                o.HandshakedataImpl1 r0 = o.HandshakedataImpl1.this
                monitor-enter(r0)
                o.HandshakedataImpl1 r4 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00c3 }
                o.ServerHandshakeBuilder r4 = r4.setMax((int) r14)     // Catch:{ all -> 0x00c3 }
                if (r4 != 0) goto L_0x008b
                o.HandshakedataImpl1 r4 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00c3 }
                boolean r4 = r4.create     // Catch:{ all -> 0x00c3 }
                if (r4 == 0) goto L_0x003c
                monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
                return
            L_0x003c:
                o.HandshakedataImpl1 r4 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00c3 }
                int r4 = r4.setMax     // Catch:{ all -> 0x00c3 }
                if (r14 > r4) goto L_0x0044
                monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
                return
            L_0x0044:
                int r4 = r14 % 2
                o.HandshakedataImpl1 r5 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00c3 }
                int r5 = r5.IsOverlapping     // Catch:{ all -> 0x00c3 }
                int r5 = r5 % r3
                if (r4 != r5) goto L_0x004f
                monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
                return
            L_0x004f:
                o.Draft_75 r9 = o.initCloseCode.length((java.util.List<o.setHttpStatus>) r15)     // Catch:{ all -> 0x00c3 }
                o.ServerHandshakeBuilder r15 = new o.ServerHandshakeBuilder     // Catch:{ all -> 0x00c3 }
                o.HandshakedataImpl1 r6 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00c3 }
                r7 = 0
                r4 = r15
                r5 = r14
                r8 = r13
                r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c3 }
                o.HandshakedataImpl1 r13 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00c3 }
                r13.setMax = r14     // Catch:{ all -> 0x00c3 }
                o.HandshakedataImpl1 r13 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00c3 }
                java.util.Map<java.lang.Integer, o.ServerHandshakeBuilder> r13 = r13.setMin     // Catch:{ all -> 0x00c3 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00c3 }
                r13.put(r4, r15)     // Catch:{ all -> 0x00c3 }
                java.util.concurrent.ExecutorService r13 = o.HandshakedataImpl1.getCause     // Catch:{ all -> 0x00c3 }
                o.HandshakedataImpl1$getMin$2 r4 = new o.HandshakedataImpl1$getMin$2     // Catch:{ all -> 0x00c3 }
                java.lang.String r5 = "OkHttp %s stream %d"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00c3 }
                o.HandshakedataImpl1 r6 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00c3 }
                java.lang.String r6 = r6.getMin     // Catch:{ all -> 0x00c3 }
                r3[r1] = r6     // Catch:{ all -> 0x00c3 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00c3 }
                r3[r2] = r14     // Catch:{ all -> 0x00c3 }
                r4.<init>(r5, r3, r15)     // Catch:{ all -> 0x00c3 }
                r13.execute(r4)     // Catch:{ all -> 0x00c3 }
                monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
                return
            L_0x008b:
                monitor-exit(r0)
                boolean r14 = o.ServerHandshakeBuilder.toString
                if (r14 != 0) goto L_0x009d
                boolean r14 = java.lang.Thread.holdsLock(r4)
                if (r14 != 0) goto L_0x0097
                goto L_0x009d
            L_0x0097:
                java.lang.AssertionError r13 = new java.lang.AssertionError
                r13.<init>()
                throw r13
            L_0x009d:
                monitor-enter(r4)
                r4.equals = r2     // Catch:{ all -> 0x00c0 }
                java.util.Deque<o.Draft_75> r14 = r4.length     // Catch:{ all -> 0x00c0 }
                o.Draft_75 r15 = o.initCloseCode.length((java.util.List<o.setHttpStatus>) r15)     // Catch:{ all -> 0x00c0 }
                r14.add(r15)     // Catch:{ all -> 0x00c0 }
                boolean r14 = r4.getMin()     // Catch:{ all -> 0x00c0 }
                r4.notifyAll()     // Catch:{ all -> 0x00c0 }
                monitor-exit(r4)     // Catch:{ all -> 0x00c0 }
                if (r14 != 0) goto L_0x00ba
                o.HandshakedataImpl1 r14 = r4.getMax
                int r15 = r4.setMin
                r14.length((int) r15)
            L_0x00ba:
                if (r13 == 0) goto L_0x00bf
                r4.setMin()
            L_0x00bf:
                return
            L_0x00c0:
                r13 = move-exception
                monitor-exit(r4)
                throw r13
            L_0x00c3:
                r13 = move-exception
                monitor-exit(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o.HandshakedataImpl1.getMin.setMin(boolean, int, java.util.List):void");
        }

        public final void length(int i, ErrorCode errorCode) {
            if (HandshakedataImpl1.getMax(i)) {
                HandshakedataImpl1 handshakedataImpl1 = HandshakedataImpl1.this;
                handshakedataImpl1.setMax((InvalidFrameException) new InvalidFrameException("OkHttp %s Push Reset[%s]", new Object[]{handshakedataImpl1.getMin, Integer.valueOf(i)}, i, errorCode) {
                    final /* synthetic */ int getMin;
                    final /* synthetic */ ErrorCode setMin;

                    {
                        this.getMin = r4;
                        this.setMin = r5;
                    }

                    public final void getMin() {
                        synchronized (HandshakedataImpl1.this) {
                            HandshakedataImpl1.this.valueOf.remove(Integer.valueOf(this.getMin));
                        }
                    }
                });
                return;
            }
            ServerHandshakeBuilder length2 = HandshakedataImpl1.this.length(i);
            if (length2 != null) {
                length2.setMin(errorCode);
            }
        }

        public final void length(final warn warn) {
            try {
                HandshakedataImpl1.this.toIntRange.execute(new InvalidFrameException("OkHttp %s ACK Settings", new Object[]{HandshakedataImpl1.this.getMin}) {
                    final /* synthetic */ boolean getMin = false;

                    /* JADX WARNING: Can't wrap try/catch for region: R(8:2|3|d|31|32|33|34|35) */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0095 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void getMin() {
                        /*
                            r13 = this;
                            o.HandshakedataImpl1$getMin r0 = o.HandshakedataImpl1.getMin.this
                            boolean r1 = r13.getMin
                            o.warn r2 = r7
                            o.HandshakedataImpl1 r3 = o.HandshakedataImpl1.this
                            o.AndroidSCLogCatImpl r3 = r3.invoke
                            monitor-enter(r3)
                            o.HandshakedataImpl1 r4 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00d2 }
                            monitor-enter(r4)     // Catch:{ all -> 0x00d2 }
                            o.HandshakedataImpl1 r5 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00cf }
                            o.warn r5 = r5.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x00cf }
                            int r6 = r5.setMax     // Catch:{ all -> 0x00cf }
                            r6 = r6 & 128(0x80, float:1.794E-43)
                            r7 = 7
                            r8 = 65535(0xffff, float:9.1834E-41)
                            if (r6 == 0) goto L_0x0021
                            int[] r5 = r5.getMax     // Catch:{ all -> 0x00cf }
                            r5 = r5[r7]     // Catch:{ all -> 0x00cf }
                            goto L_0x0024
                        L_0x0021:
                            r5 = 65535(0xffff, float:9.1834E-41)
                        L_0x0024:
                            r6 = 0
                            if (r1 == 0) goto L_0x0032
                            o.HandshakedataImpl1 r1 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00cf }
                            o.warn r1 = r1.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x00cf }
                            r1.setMax = r6     // Catch:{ all -> 0x00cf }
                            int[] r1 = r1.getMax     // Catch:{ all -> 0x00cf }
                            java.util.Arrays.fill(r1, r6)     // Catch:{ all -> 0x00cf }
                        L_0x0032:
                            o.HandshakedataImpl1 r1 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00cf }
                            o.warn r1 = r1.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x00cf }
                            r9 = 0
                        L_0x0037:
                            r10 = 10
                            if (r9 >= r10) goto L_0x004b
                            boolean r10 = r2.getMin(r9)     // Catch:{ all -> 0x00cf }
                            if (r10 == 0) goto L_0x0048
                            int[] r10 = r2.getMax     // Catch:{ all -> 0x00cf }
                            r10 = r10[r9]     // Catch:{ all -> 0x00cf }
                            r1.setMax(r9, r10)     // Catch:{ all -> 0x00cf }
                        L_0x0048:
                            int r9 = r9 + 1
                            goto L_0x0037
                        L_0x004b:
                            o.HandshakedataImpl1 r1 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00cf }
                            o.warn r1 = r1.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x00cf }
                            int r2 = r1.setMax     // Catch:{ all -> 0x00cf }
                            r2 = r2 & 128(0x80, float:1.794E-43)
                            if (r2 == 0) goto L_0x0059
                            int[] r1 = r1.getMax     // Catch:{ all -> 0x00cf }
                            r8 = r1[r7]     // Catch:{ all -> 0x00cf }
                        L_0x0059:
                            r1 = -1
                            r2 = 0
                            r9 = 0
                            if (r8 == r1) goto L_0x0087
                            if (r8 == r5) goto L_0x0087
                            int r8 = r8 - r5
                            long r7 = (long) r8     // Catch:{ all -> 0x00cf }
                            o.HandshakedataImpl1 r1 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00cf }
                            java.util.Map<java.lang.Integer, o.ServerHandshakeBuilder> r1 = r1.setMin     // Catch:{ all -> 0x00cf }
                            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00cf }
                            if (r1 != 0) goto L_0x0088
                            o.HandshakedataImpl1 r1 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00cf }
                            java.util.Map<java.lang.Integer, o.ServerHandshakeBuilder> r1 = r1.setMin     // Catch:{ all -> 0x00cf }
                            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00cf }
                            o.HandshakedataImpl1 r2 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00cf }
                            java.util.Map<java.lang.Integer, o.ServerHandshakeBuilder> r2 = r2.setMin     // Catch:{ all -> 0x00cf }
                            int r2 = r2.size()     // Catch:{ all -> 0x00cf }
                            o.ServerHandshakeBuilder[] r2 = new o.ServerHandshakeBuilder[r2]     // Catch:{ all -> 0x00cf }
                            java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x00cf }
                            o.ServerHandshakeBuilder[] r1 = (o.ServerHandshakeBuilder[]) r1     // Catch:{ all -> 0x00cf }
                            r2 = r1
                            goto L_0x0088
                        L_0x0087:
                            r7 = r9
                        L_0x0088:
                            monitor-exit(r4)     // Catch:{ all -> 0x00cf }
                            o.HandshakedataImpl1 r1 = o.HandshakedataImpl1.this     // Catch:{ IOException -> 0x0095 }
                            o.AndroidSCLogCatImpl r1 = r1.invoke     // Catch:{ IOException -> 0x0095 }
                            o.HandshakedataImpl1 r4 = o.HandshakedataImpl1.this     // Catch:{ IOException -> 0x0095 }
                            o.warn r4 = r4.FastBitmap$CoordinateSystem     // Catch:{ IOException -> 0x0095 }
                            r1.setMax(r4)     // Catch:{ IOException -> 0x0095 }
                            goto L_0x009a
                        L_0x0095:
                            o.HandshakedataImpl1 r1 = o.HandshakedataImpl1.this     // Catch:{ all -> 0x00d2 }
                            o.HandshakedataImpl1.setMin(r1)     // Catch:{ all -> 0x00d2 }
                        L_0x009a:
                            monitor-exit(r3)     // Catch:{ all -> 0x00d2 }
                            if (r2 == 0) goto L_0x00b7
                            int r1 = r2.length
                            r3 = 0
                        L_0x009f:
                            if (r3 >= r1) goto L_0x00b7
                            r4 = r2[r3]
                            monitor-enter(r4)
                            long r11 = r4.setMax     // Catch:{ all -> 0x00b4 }
                            long r11 = r11 + r7
                            r4.setMax = r11     // Catch:{ all -> 0x00b4 }
                            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                            if (r5 <= 0) goto L_0x00b0
                            r4.notifyAll()     // Catch:{ all -> 0x00b4 }
                        L_0x00b0:
                            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
                            int r3 = r3 + 1
                            goto L_0x009f
                        L_0x00b4:
                            r0 = move-exception
                            monitor-exit(r4)
                            throw r0
                        L_0x00b7:
                            java.util.concurrent.ExecutorService r1 = o.HandshakedataImpl1.getCause
                            o.HandshakedataImpl1$getMin$1 r2 = new o.HandshakedataImpl1$getMin$1
                            r3 = 1
                            java.lang.Object[] r3 = new java.lang.Object[r3]
                            o.HandshakedataImpl1 r4 = o.HandshakedataImpl1.this
                            java.lang.String r4 = r4.getMin
                            r3[r6] = r4
                            java.lang.String r4 = "OkHttp %s settings"
                            r2.<init>(r4, r3)
                            r1.execute(r2)
                            return
                        L_0x00cf:
                            r0 = move-exception
                            monitor-exit(r4)     // Catch:{ all -> 0x00d2 }
                            throw r0     // Catch:{ all -> 0x00d2 }
                        L_0x00d2:
                            r0 = move-exception
                            monitor-exit(r3)
                            goto L_0x00d6
                        L_0x00d5:
                            throw r0
                        L_0x00d6:
                            goto L_0x00d5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.HandshakedataImpl1.getMin.AnonymousClass3.getMin():void");
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }

        public final void length(boolean z, int i, int i2) {
            if (z) {
                synchronized (HandshakedataImpl1.this) {
                    if (i == 1) {
                        try {
                            HandshakedataImpl1.toIntRange(HandshakedataImpl1.this);
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (i == 2) {
                        HandshakedataImpl1.isInside(HandshakedataImpl1.this);
                    } else if (i == 3) {
                        HandshakedataImpl1.equals(HandshakedataImpl1.this);
                        HandshakedataImpl1.this.notifyAll();
                    }
                }
                return;
            }
            try {
                HandshakedataImpl1.this.toIntRange.execute(new setMin(i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        public final void getMax(int i, printConnMonitorLog printconnmonitorlog) {
            ServerHandshakeBuilder[] serverHandshakeBuilderArr;
            printconnmonitorlog.size();
            synchronized (HandshakedataImpl1.this) {
                serverHandshakeBuilderArr = (ServerHandshakeBuilder[]) HandshakedataImpl1.this.setMin.values().toArray(new ServerHandshakeBuilder[HandshakedataImpl1.this.setMin.size()]);
                boolean unused = HandshakedataImpl1.this.create = true;
            }
            for (ServerHandshakeBuilder serverHandshakeBuilder : serverHandshakeBuilderArr) {
                if (serverHandshakeBuilder.setMin > i && serverHandshakeBuilder.length()) {
                    serverHandshakeBuilder.setMin(ErrorCode.REFUSED_STREAM);
                    HandshakedataImpl1.this.length(serverHandshakeBuilder.setMin);
                }
            }
        }

        public final void getMin(int i, long j) {
            if (i == 0) {
                synchronized (HandshakedataImpl1.this) {
                    HandshakedataImpl1.this.hashCode += j;
                    HandshakedataImpl1.this.notifyAll();
                }
                return;
            }
            ServerHandshakeBuilder max = HandshakedataImpl1.this.setMax(i);
            if (max != null) {
                synchronized (max) {
                    max.setMax += j;
                    if (j > 0) {
                        max.notifyAll();
                    }
                }
            }
        }

        public final void setMin(int i, List<setHttpStatus> list) {
            HandshakedataImpl1 handshakedataImpl1 = HandshakedataImpl1.this;
            synchronized (handshakedataImpl1) {
                if (handshakedataImpl1.valueOf.contains(Integer.valueOf(i))) {
                    handshakedataImpl1.getMin(i, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                handshakedataImpl1.valueOf.add(Integer.valueOf(i));
                try {
                    handshakedataImpl1.setMax((InvalidFrameException) new InvalidFrameException("OkHttp %s Push Request[%s]", new Object[]{handshakedataImpl1.getMin, Integer.valueOf(i)}, i, list) {
                        final /* synthetic */ int getMin;
                        final /* synthetic */ List setMin;

                        {
                            this.getMin = r4;
                            this.setMin = r5;
                        }

                        public final void getMin() {
                            try {
                                HandshakedataImpl1.this.invoke.getMin(this.getMin, ErrorCode.CANCEL);
                                synchronized (HandshakedataImpl1.this) {
                                    HandshakedataImpl1.this.valueOf.remove(Integer.valueOf(this.getMin));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void setMax(InvalidFrameException invalidFrameException) {
        if (!this.create) {
            this.onNavigationEvent.execute(invalidFrameException);
        }
    }

    static /* synthetic */ void setMin(HandshakedataImpl1 handshakedataImpl1) {
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            handshakedataImpl1.getMax(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }
}
