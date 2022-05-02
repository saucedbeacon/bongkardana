package o;

import com.google.android.exoplayer2.C;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.Nullable;
import o.setHttpStatus;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

public final class ServerHandshakeBuilder {
    static final /* synthetic */ boolean toString = (!ServerHandshakeBuilder.class.desiredAssertionStatus());
    final setMax IsOverlapping;
    boolean equals;
    public final HandshakedataImpl1 getMax;
    long getMin = 0;
    final length isInside;
    /* access modifiers changed from: package-private */
    public final Deque<Draft_75> length = new ArrayDeque();
    long setMax;
    public final int setMin;
    /* access modifiers changed from: private */
    public setHttpStatus.setMin toDoubleRange;
    final getMax toFloatRange = new getMax();
    final getMax toIntRange = new getMax();
    ErrorCode values = null;

    ServerHandshakeBuilder(int i, HandshakedataImpl1 handshakedataImpl1, boolean z, boolean z2, @Nullable Draft_75 draft_75) {
        if (handshakedataImpl1 != null) {
            this.setMin = i;
            this.getMax = handshakedataImpl1;
            warn warn = handshakedataImpl1.FastBitmap$CoordinateSystem;
            int i2 = 65535;
            this.setMax = (long) ((warn.setMax & 128) != 0 ? warn.getMax[7] : 65535);
            warn warn2 = handshakedataImpl1.toString;
            this.isInside = new length((long) ((warn2.setMax & 128) != 0 ? warn2.getMax[7] : i2));
            this.IsOverlapping = new setMax();
            this.isInside.getMax = z2;
            this.IsOverlapping.length = z;
            if (draft_75 != null) {
                this.length.add(draft_75);
            }
            if (length() && draft_75 != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!length() && draft_75 == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    public final synchronized boolean getMin() {
        if (this.values != null) {
            return false;
        }
        if ((this.isInside.getMax || this.isInside.setMax) && ((this.IsOverlapping.length || this.IsOverlapping.setMax) && this.equals)) {
            return false;
        }
        return true;
    }

    public final boolean length() {
        return this.getMax.getMax == ((this.setMin & 1) == 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r2.toFloatRange.getMin() != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        throw new java.net.SocketTimeoutException(id.dana.twilio.identityverification.TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized o.Draft_75 getMax() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            o.ServerHandshakeBuilder$getMax r0 = r2.toFloatRange     // Catch:{ all -> 0x005f }
            r0.setMin()     // Catch:{ all -> 0x005f }
        L_0x0006:
            java.util.Deque<o.Draft_75> r0 = r2.length     // Catch:{ all -> 0x004d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0023
            okhttp3.internal.http2.ErrorCode r0 = r2.values     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0023
            r2.wait()     // Catch:{ InterruptedException -> 0x0016 }
            goto L_0x0006
        L_0x0016:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004d }
            r0.interrupt()     // Catch:{ all -> 0x004d }
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x004d }
            r0.<init>()     // Catch:{ all -> 0x004d }
            throw r0     // Catch:{ all -> 0x004d }
        L_0x0023:
            o.ServerHandshakeBuilder$getMax r0 = r2.toFloatRange     // Catch:{ all -> 0x005f }
            boolean r0 = r0.getMin()     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0045
            java.util.Deque<o.Draft_75> r0 = r2.length     // Catch:{ all -> 0x005f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x003d
            java.util.Deque<o.Draft_75> r0 = r2.length     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x005f }
            o.Draft_75 r0 = (o.Draft_75) r0     // Catch:{ all -> 0x005f }
            monitor-exit(r2)
            return r0
        L_0x003d:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x005f }
            okhttp3.internal.http2.ErrorCode r1 = r2.values     // Catch:{ all -> 0x005f }
            r0.<init>(r1)     // Catch:{ all -> 0x005f }
            throw r0     // Catch:{ all -> 0x005f }
        L_0x0045:
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch:{ all -> 0x005f }
            throw r0     // Catch:{ all -> 0x005f }
        L_0x004d:
            r0 = move-exception
            o.ServerHandshakeBuilder$getMax r1 = r2.toFloatRange     // Catch:{ all -> 0x005f }
            boolean r1 = r1.getMin()     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x005e
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch:{ all -> 0x005f }
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005e:
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0063
        L_0x0062:
            throw r0
        L_0x0063:
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ServerHandshakeBuilder.getMax():o.Draft_75");
    }

    public final recordDnsTime setMax() {
        synchronized (this) {
            if (!this.equals) {
                if (!length()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.IsOverlapping;
    }

    public final boolean getMax(ErrorCode errorCode) {
        if (toString || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.values != null) {
                    return false;
                }
                if (this.isInside.getMax && this.IsOverlapping.length) {
                    return false;
                }
                this.values = errorCode;
                notifyAll();
                this.getMax.length(this.setMin);
                return true;
            }
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public final void setMin() {
        boolean min;
        if (toString || !Thread.holdsLock(this)) {
            synchronized (this) {
                this.isInside.getMax = true;
                min = getMin();
                notifyAll();
            }
            if (!min) {
                this.getMax.length(this.setMin);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void setMin(ErrorCode errorCode) {
        if (this.values == null) {
            this.values = errorCode;
            notifyAll();
        }
    }

    final class length implements recordWsHsTime {
        static final /* synthetic */ boolean getMin = (!ServerHandshakeBuilder.class.desiredAssertionStatus());
        boolean getMax;
        private final long isInside;
        private final submitLazy length = new submitLazy();
        boolean setMax;
        private final submitLazy toFloatRange = new submitLazy();

        length(long j) {
            this.isInside = j;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:42|43|44) */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d6, code lost:
            throw new java.io.InterruptedIOException();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00ca */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long a_(o.submitLazy r19, long r20) throws java.io.IOException {
            /*
                r18 = this;
                r1 = r18
                r2 = r20
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 < 0) goto L_0x0122
            L_0x000a:
                o.ServerHandshakeBuilder r6 = o.ServerHandshakeBuilder.this
                monitor-enter(r6)
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x011f }
                o.ServerHandshakeBuilder$getMax r0 = r0.toFloatRange     // Catch:{ all -> 0x011f }
                r0.setMin()     // Catch:{ all -> 0x011f }
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                okhttp3.internal.http2.ErrorCode r0 = r0.values     // Catch:{ all -> 0x010b }
                if (r0 == 0) goto L_0x001f
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                okhttp3.internal.http2.ErrorCode r0 = r0.values     // Catch:{ all -> 0x010b }
                goto L_0x0020
            L_0x001f:
                r0 = 0
            L_0x0020:
                boolean r8 = r1.setMax     // Catch:{ all -> 0x010b }
                if (r8 != 0) goto L_0x0103
                o.ServerHandshakeBuilder r8 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                java.util.Deque r8 = r8.length     // Catch:{ all -> 0x010b }
                boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x010b }
                r9 = -1
                if (r8 != 0) goto L_0x0053
                o.ServerHandshakeBuilder r8 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                o.setHttpStatus$setMin r8 = r8.toDoubleRange     // Catch:{ all -> 0x010b }
                if (r8 == 0) goto L_0x0053
                o.ServerHandshakeBuilder r7 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                java.util.Deque r7 = r7.length     // Catch:{ all -> 0x010b }
                java.lang.Object r7 = r7.removeFirst()     // Catch:{ all -> 0x010b }
                o.Draft_75 r7 = (o.Draft_75) r7     // Catch:{ all -> 0x010b }
                o.ServerHandshakeBuilder r8 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                o.setHttpStatus$setMin r8 = r8.toDoubleRange     // Catch:{ all -> 0x010b }
                r13 = r19
                r16 = r8
                r11 = r9
                goto L_0x00db
            L_0x0053:
                o.submitLazy r8 = r1.toFloatRange     // Catch:{ all -> 0x010b }
                long r11 = r8.setMax     // Catch:{ all -> 0x010b }
                int r8 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r8 <= 0) goto L_0x00a8
                o.submitLazy r8 = r1.toFloatRange     // Catch:{ all -> 0x010b }
                o.submitLazy r11 = r1.toFloatRange     // Catch:{ all -> 0x010b }
                long r11 = r11.setMax     // Catch:{ all -> 0x010b }
                long r11 = java.lang.Math.min(r2, r11)     // Catch:{ all -> 0x010b }
                r13 = r19
                long r11 = r8.a_(r13, r11)     // Catch:{ all -> 0x010b }
                o.ServerHandshakeBuilder r8 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                long r14 = r8.getMin     // Catch:{ all -> 0x010b }
                long r14 = r14 + r11
                r8.getMin = r14     // Catch:{ all -> 0x010b }
                if (r0 != 0) goto L_0x00d8
                o.ServerHandshakeBuilder r8 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                long r14 = r8.getMin     // Catch:{ all -> 0x010b }
                o.ServerHandshakeBuilder r8 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                o.HandshakedataImpl1 r8 = r8.getMax     // Catch:{ all -> 0x010b }
                o.warn r8 = r8.toString     // Catch:{ all -> 0x010b }
                int r7 = r8.setMax     // Catch:{ all -> 0x010b }
                r7 = r7 & 128(0x80, float:1.794E-43)
                if (r7 == 0) goto L_0x008a
                int[] r7 = r8.getMax     // Catch:{ all -> 0x010b }
                r8 = 7
                r7 = r7[r8]     // Catch:{ all -> 0x010b }
                goto L_0x008d
            L_0x008a:
                r7 = 65535(0xffff, float:9.1834E-41)
            L_0x008d:
                int r7 = r7 / 2
                long r7 = (long) r7     // Catch:{ all -> 0x010b }
                int r17 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
                if (r17 < 0) goto L_0x00d8
                o.ServerHandshakeBuilder r7 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                o.HandshakedataImpl1 r7 = r7.getMax     // Catch:{ all -> 0x010b }
                o.ServerHandshakeBuilder r8 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                int r8 = r8.setMin     // Catch:{ all -> 0x010b }
                o.ServerHandshakeBuilder r14 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                long r14 = r14.getMin     // Catch:{ all -> 0x010b }
                r7.length(r8, r14)     // Catch:{ all -> 0x010b }
                o.ServerHandshakeBuilder r7 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                r7.getMin = r4     // Catch:{ all -> 0x010b }
                goto L_0x00d8
            L_0x00a8:
                r13 = r19
                boolean r7 = r1.getMax     // Catch:{ all -> 0x010b }
                if (r7 != 0) goto L_0x00d7
                if (r0 != 0) goto L_0x00d7
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x010b }
                r0.wait()     // Catch:{ InterruptedException -> 0x00ca }
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x011f }
                o.ServerHandshakeBuilder$getMax r0 = r0.toFloatRange     // Catch:{ all -> 0x011f }
                boolean r0 = r0.getMin()     // Catch:{ all -> 0x011f }
                if (r0 != 0) goto L_0x00c2
                monitor-exit(r6)     // Catch:{ all -> 0x011f }
                goto L_0x000a
            L_0x00c2:
                java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException     // Catch:{ all -> 0x011f }
                java.lang.String r2 = "timeout"
                r0.<init>(r2)     // Catch:{ all -> 0x011f }
                throw r0     // Catch:{ all -> 0x011f }
            L_0x00ca:
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x010b }
                r0.interrupt()     // Catch:{ all -> 0x010b }
                java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x010b }
                r0.<init>()     // Catch:{ all -> 0x010b }
                throw r0     // Catch:{ all -> 0x010b }
            L_0x00d7:
                r11 = r9
            L_0x00d8:
                r7 = 0
                r16 = 0
            L_0x00db:
                o.ServerHandshakeBuilder r8 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x011f }
                o.ServerHandshakeBuilder$getMax r8 = r8.toFloatRange     // Catch:{ all -> 0x011f }
                boolean r8 = r8.getMin()     // Catch:{ all -> 0x011f }
                if (r8 != 0) goto L_0x00fb
                monitor-exit(r6)     // Catch:{ all -> 0x011f }
                if (r7 == 0) goto L_0x00ea
                if (r16 != 0) goto L_0x000a
            L_0x00ea:
                int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r2 == 0) goto L_0x00f2
                r1.length(r11)
                return r11
            L_0x00f2:
                if (r0 != 0) goto L_0x00f5
                return r9
            L_0x00f5:
                okhttp3.internal.http2.StreamResetException r2 = new okhttp3.internal.http2.StreamResetException
                r2.<init>(r0)
                throw r2
            L_0x00fb:
                java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException     // Catch:{ all -> 0x011f }
                java.lang.String r2 = "timeout"
                r0.<init>(r2)     // Catch:{ all -> 0x011f }
                throw r0     // Catch:{ all -> 0x011f }
            L_0x0103:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x010b }
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch:{ all -> 0x010b }
                throw r0     // Catch:{ all -> 0x010b }
            L_0x010b:
                r0 = move-exception
                o.ServerHandshakeBuilder r2 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x011f }
                o.ServerHandshakeBuilder$getMax r2 = r2.toFloatRange     // Catch:{ all -> 0x011f }
                boolean r2 = r2.getMin()     // Catch:{ all -> 0x011f }
                if (r2 == 0) goto L_0x011e
                java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException     // Catch:{ all -> 0x011f }
                java.lang.String r2 = "timeout"
                r0.<init>(r2)     // Catch:{ all -> 0x011f }
                throw r0     // Catch:{ all -> 0x011f }
            L_0x011e:
                throw r0     // Catch:{ all -> 0x011f }
            L_0x011f:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            L_0x0122:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = java.lang.String.valueOf(r20)
                java.lang.String r3 = "byteCount < 0: "
                java.lang.String r2 = r3.concat(r2)
                r0.<init>(r2)
                goto L_0x0133
            L_0x0132:
                throw r0
            L_0x0133:
                goto L_0x0132
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ServerHandshakeBuilder.length.a_(o.submitLazy, long):long");
        }

        private void length(long j) {
            if (getMin || !Thread.holdsLock(ServerHandshakeBuilder.this)) {
                ServerHandshakeBuilder.this.getMax.setMax(j);
                return;
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public final void getMax(schedule schedule, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            if (getMin || !Thread.holdsLock(ServerHandshakeBuilder.this)) {
                while (j > 0) {
                    synchronized (ServerHandshakeBuilder.this) {
                        z = this.getMax;
                        z2 = true;
                        z3 = this.toFloatRange.setMax + j > this.isInside;
                    }
                    if (z3) {
                        schedule.isInside(j);
                        ServerHandshakeBuilder serverHandshakeBuilder = ServerHandshakeBuilder.this;
                        ErrorCode errorCode = ErrorCode.FLOW_CONTROL_ERROR;
                        if (serverHandshakeBuilder.getMax(errorCode)) {
                            serverHandshakeBuilder.getMax.getMin(serverHandshakeBuilder.setMin, errorCode);
                            return;
                        }
                        return;
                    } else if (z) {
                        schedule.isInside(j);
                        return;
                    } else {
                        long a_ = schedule.a_(this.length, j);
                        if (a_ != -1) {
                            j -= a_;
                            synchronized (ServerHandshakeBuilder.this) {
                                if (this.setMax) {
                                    j2 = this.length.setMax;
                                    this.length.Mean$Arithmetic();
                                } else {
                                    if (this.toFloatRange.setMax != 0) {
                                        z2 = false;
                                    }
                                    this.toFloatRange.getMin((recordWsHsTime) this.length);
                                    if (z2) {
                                        ServerHandshakeBuilder.this.notifyAll();
                                    }
                                    j2 = 0;
                                }
                            }
                            if (j2 > 0) {
                                length(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            throw new AssertionError();
        }

        public final recordSSLTime getMin() {
            return ServerHandshakeBuilder.this.toFloatRange;
        }

        public final void close() throws IOException {
            long j;
            setHttpStatus.setMin setmin;
            ArrayList arrayList;
            synchronized (ServerHandshakeBuilder.this) {
                this.setMax = true;
                j = this.toFloatRange.setMax;
                submitLazy submitlazy = this.toFloatRange;
                try {
                    submitlazy.isInside(submitlazy.setMax);
                    setmin = null;
                    if (ServerHandshakeBuilder.this.length.isEmpty() || ServerHandshakeBuilder.this.toDoubleRange == null) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(ServerHandshakeBuilder.this.length);
                        ServerHandshakeBuilder.this.length.clear();
                        ArrayList arrayList3 = arrayList2;
                        setmin = ServerHandshakeBuilder.this.toDoubleRange;
                        arrayList = arrayList3;
                    }
                    ServerHandshakeBuilder.this.notifyAll();
                } catch (EOFException e) {
                    throw new AssertionError(e);
                }
            }
            if (j > 0) {
                length(j);
            }
            ServerHandshakeBuilder.this.equals();
            if (setmin != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void equals() throws IOException {
        boolean z;
        boolean min;
        if (toString || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.isInside.getMax && this.isInside.setMax && (this.IsOverlapping.length || this.IsOverlapping.setMax);
                min = getMin();
            }
            if (z) {
                ErrorCode errorCode = ErrorCode.CANCEL;
                if (getMax(errorCode)) {
                    this.getMax.invoke.getMin(this.setMin, errorCode);
                }
            } else if (!min) {
                this.getMax.length(this.setMin);
            }
        } else {
            throw new AssertionError();
        }
    }

    final class setMax implements recordDnsTime {
        static final /* synthetic */ boolean setMin = (!ServerHandshakeBuilder.class.desiredAssertionStatus());
        private final submitLazy getMin = new submitLazy();
        boolean length;
        boolean setMax;

        setMax() {
        }

        public final void setMin(submitLazy submitlazy, long j) throws IOException {
            if (setMin || !Thread.holdsLock(ServerHandshakeBuilder.this)) {
                this.getMin.setMin(submitlazy, j);
                while (this.getMin.setMax >= 16384) {
                    getMin(false);
                }
                return;
            }
            throw new AssertionError();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00aa, code lost:
            r12 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b3, code lost:
            if (r11.getMax.toIntRange.getMin() != false) goto L_0x00b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bc, code lost:
            throw new java.net.SocketTimeoutException(id.dana.twilio.identityverification.TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bd, code lost:
            throw r12;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0028 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void getMin(boolean r12) throws java.io.IOException {
            /*
                r11 = this;
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this
                monitor-enter(r0)
                o.ServerHandshakeBuilder r1 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x00be }
                o.ServerHandshakeBuilder$getMax r1 = r1.toIntRange     // Catch:{ all -> 0x00be }
                r1.setMin()     // Catch:{ all -> 0x00be }
            L_0x000a:
                o.ServerHandshakeBuilder r1 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x00aa }
                long r1 = r1.setMax     // Catch:{ all -> 0x00aa }
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L_0x0035
                boolean r1 = r11.length     // Catch:{ all -> 0x00aa }
                if (r1 != 0) goto L_0x0035
                boolean r1 = r11.setMax     // Catch:{ all -> 0x00aa }
                if (r1 != 0) goto L_0x0035
                o.ServerHandshakeBuilder r1 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x00aa }
                okhttp3.internal.http2.ErrorCode r1 = r1.values     // Catch:{ all -> 0x00aa }
                if (r1 != 0) goto L_0x0035
                o.ServerHandshakeBuilder r1 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x00aa }
                r1.wait()     // Catch:{ InterruptedException -> 0x0028 }
                goto L_0x000a
            L_0x0028:
                java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00aa }
                r12.interrupt()     // Catch:{ all -> 0x00aa }
                java.io.InterruptedIOException r12 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00aa }
                r12.<init>()     // Catch:{ all -> 0x00aa }
                throw r12     // Catch:{ all -> 0x00aa }
            L_0x0035:
                o.ServerHandshakeBuilder r1 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x00be }
                o.ServerHandshakeBuilder$getMax r1 = r1.toIntRange     // Catch:{ all -> 0x00be }
                boolean r1 = r1.getMin()     // Catch:{ all -> 0x00be }
                if (r1 != 0) goto L_0x00a2
                o.ServerHandshakeBuilder r1 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x00be }
                r1.isInside()     // Catch:{ all -> 0x00be }
                o.ServerHandshakeBuilder r1 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x00be }
                long r1 = r1.setMax     // Catch:{ all -> 0x00be }
                o.submitLazy r3 = r11.getMin     // Catch:{ all -> 0x00be }
                long r3 = r3.setMax     // Catch:{ all -> 0x00be }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x00be }
                o.ServerHandshakeBuilder r1 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x00be }
                long r2 = r1.setMax     // Catch:{ all -> 0x00be }
                long r2 = r2 - r9
                r1.setMax = r2     // Catch:{ all -> 0x00be }
                monitor-exit(r0)     // Catch:{ all -> 0x00be }
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this
                o.ServerHandshakeBuilder$getMax r0 = r0.toIntRange
                r0.setMin()
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x008e }
                o.HandshakedataImpl1 r5 = r0.getMax     // Catch:{ all -> 0x008e }
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x008e }
                int r6 = r0.setMin     // Catch:{ all -> 0x008e }
                if (r12 == 0) goto L_0x0074
                o.submitLazy r12 = r11.getMin     // Catch:{ all -> 0x008e }
                long r0 = r12.setMax     // Catch:{ all -> 0x008e }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x0074
                r12 = 1
                r7 = 1
                goto L_0x0076
            L_0x0074:
                r12 = 0
                r7 = 0
            L_0x0076:
                o.submitLazy r8 = r11.getMin     // Catch:{ all -> 0x008e }
                r5.length(r6, r7, r8, r9)     // Catch:{ all -> 0x008e }
                o.ServerHandshakeBuilder r12 = o.ServerHandshakeBuilder.this
                o.ServerHandshakeBuilder$getMax r12 = r12.toIntRange
                boolean r12 = r12.getMin()
                if (r12 != 0) goto L_0x0086
                return
            L_0x0086:
                java.net.SocketTimeoutException r12 = new java.net.SocketTimeoutException
                java.lang.String r0 = "timeout"
                r12.<init>(r0)
                throw r12
            L_0x008e:
                r12 = move-exception
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this
                o.ServerHandshakeBuilder$getMax r0 = r0.toIntRange
                boolean r0 = r0.getMin()
                if (r0 == 0) goto L_0x00a1
                java.net.SocketTimeoutException r12 = new java.net.SocketTimeoutException
                java.lang.String r0 = "timeout"
                r12.<init>(r0)
                throw r12
            L_0x00a1:
                throw r12
            L_0x00a2:
                java.net.SocketTimeoutException r12 = new java.net.SocketTimeoutException     // Catch:{ all -> 0x00be }
                java.lang.String r1 = "timeout"
                r12.<init>(r1)     // Catch:{ all -> 0x00be }
                throw r12     // Catch:{ all -> 0x00be }
            L_0x00aa:
                r12 = move-exception
                o.ServerHandshakeBuilder r1 = o.ServerHandshakeBuilder.this     // Catch:{ all -> 0x00be }
                o.ServerHandshakeBuilder$getMax r1 = r1.toIntRange     // Catch:{ all -> 0x00be }
                boolean r1 = r1.getMin()     // Catch:{ all -> 0x00be }
                if (r1 == 0) goto L_0x00bd
                java.net.SocketTimeoutException r12 = new java.net.SocketTimeoutException     // Catch:{ all -> 0x00be }
                java.lang.String r1 = "timeout"
                r12.<init>(r1)     // Catch:{ all -> 0x00be }
                throw r12     // Catch:{ all -> 0x00be }
            L_0x00bd:
                throw r12     // Catch:{ all -> 0x00be }
            L_0x00be:
                r12 = move-exception
                monitor-exit(r0)
                goto L_0x00c2
            L_0x00c1:
                throw r12
            L_0x00c2:
                goto L_0x00c1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ServerHandshakeBuilder.setMax.getMin(boolean):void");
        }

        public final void flush() throws IOException {
            if (setMin || !Thread.holdsLock(ServerHandshakeBuilder.this)) {
                synchronized (ServerHandshakeBuilder.this) {
                    ServerHandshakeBuilder.this.isInside();
                }
                while (this.getMin.setMax > 0) {
                    getMin(false);
                    ServerHandshakeBuilder.this.getMax.invoke.setMin();
                }
                return;
            }
            throw new AssertionError();
        }

        public final recordSSLTime getMin() {
            return ServerHandshakeBuilder.this.toIntRange;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
            if (r8.getMax.IsOverlapping.length != false) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
            if (r8.getMin.setMax <= 0) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
            if (r8.getMin.setMax <= 0) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
            getMin(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
            r8.getMax.getMax.length(r8.getMax.setMin, true, (o.submitLazy) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
            r0 = r8.getMax;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.setMax = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            r8.getMax.getMax.invoke.setMin();
            r8.getMax.equals();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() throws java.io.IOException {
            /*
                r8 = this;
                boolean r0 = setMin
                if (r0 != 0) goto L_0x0013
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this
                boolean r0 = java.lang.Thread.holdsLock(r0)
                if (r0 != 0) goto L_0x000d
                goto L_0x0013
            L_0x000d:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L_0x0013:
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this
                monitor-enter(r0)
                boolean r1 = r8.setMax     // Catch:{ all -> 0x0063 }
                if (r1 == 0) goto L_0x001c
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                return
            L_0x001c:
                monitor-exit(r0)
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this
                o.ServerHandshakeBuilder$setMax r0 = r0.IsOverlapping
                boolean r0 = r0.length
                r1 = 1
                if (r0 != 0) goto L_0x004b
                o.submitLazy r0 = r8.getMin
                long r2 = r0.setMax
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003c
            L_0x0030:
                o.submitLazy r0 = r8.getMin
                long r2 = r0.setMax
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x004b
                r8.getMin(r1)
                goto L_0x0030
            L_0x003c:
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this
                o.HandshakedataImpl1 r2 = r0.getMax
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this
                int r3 = r0.setMin
                r4 = 1
                r5 = 0
                r6 = 0
                r2.length(r3, r4, r5, r6)
            L_0x004b:
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this
                monitor-enter(r0)
                r8.setMax = r1     // Catch:{ all -> 0x0060 }
                monitor-exit(r0)     // Catch:{ all -> 0x0060 }
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this
                o.HandshakedataImpl1 r0 = r0.getMax
                o.AndroidSCLogCatImpl r0 = r0.invoke
                r0.setMin()
                o.ServerHandshakeBuilder r0 = o.ServerHandshakeBuilder.this
                r0.equals()
                return
            L_0x0060:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x0063:
                r1 = move-exception
                monitor-exit(r0)
                goto L_0x0067
            L_0x0066:
                throw r1
            L_0x0067:
                goto L_0x0066
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ServerHandshakeBuilder.setMax.close():void");
        }
    }

    /* access modifiers changed from: package-private */
    public final void isInside() throws IOException {
        if (this.IsOverlapping.setMax) {
            throw new IOException("stream closed");
        } else if (this.IsOverlapping.length) {
            throw new IOException("stream finished");
        } else if (this.values != null) {
            throw new StreamResetException(this.values);
        }
    }

    class getMax extends submit {
        getMax() {
        }

        public final void setMax() {
            ServerHandshakeBuilder serverHandshakeBuilder = ServerHandshakeBuilder.this;
            ErrorCode errorCode = ErrorCode.CANCEL;
            if (serverHandshakeBuilder.getMax(errorCode)) {
                serverHandshakeBuilder.getMax.getMin(serverHandshakeBuilder.setMin, errorCode);
            }
            HandshakedataImpl1 handshakedataImpl1 = ServerHandshakeBuilder.this.getMax;
            synchronized (handshakedataImpl1) {
                if (handshakedataImpl1.isInside >= handshakedataImpl1.equals) {
                    handshakedataImpl1.equals++;
                    handshakedataImpl1.values = System.nanoTime() + C.NANOS_PER_SECOND;
                    try {
                        handshakedataImpl1.toIntRange.execute(new InvalidFrameException("OkHttp %s ping", handshakedataImpl1.getMin) {
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void getMin(
/*
Method generation error in method: o.HandshakedataImpl1.3.getMin():void, dex: classes4.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.HandshakedataImpl1.3.getMin():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:260)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:70)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
        }

        public final IOException setMin(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }
}
