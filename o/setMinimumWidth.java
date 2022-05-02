package o;

import com.bca.xco.widget.connection.httpclient.internal.http2.a;
import com.bca.xco.widget.connection.httpclient.internal.http2.l;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;

public final class setMinimumWidth {
    static final /* synthetic */ boolean IsOverlapping = (!setMinimumWidth.class.desiredAssertionStatus());
    final setMin equals;
    public final int getMax;
    long getMin = 0;
    /* access modifiers changed from: package-private */
    public final getMin isInside = new getMin();
    long length;
    List<CardView> setMax;
    public final setContentPadding setMin;
    private final List<CardView> toDoubleRange;
    final getMax toFloatRange;
    /* access modifiers changed from: package-private */
    public final getMin toIntRange = new getMin();
    /* access modifiers changed from: private */
    public a toString = null;

    setMinimumWidth(int i, setContentPadding setcontentpadding, boolean z, boolean z2, List<CardView> list) {
        if (setcontentpadding == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.getMax = i;
            this.setMin = setcontentpadding;
            getContentPaddingLeft getcontentpaddingleft = setcontentpadding.getMax;
            int i2 = 65535;
            this.length = (long) ((getcontentpaddingleft.setMin & 128) != 0 ? getcontentpaddingleft.setMax[7] : 65535);
            getContentPaddingLeft getcontentpaddingleft2 = setcontentpadding.setMax;
            this.toFloatRange = new getMax(this, (long) ((getcontentpaddingleft2.setMin & 128) != 0 ? getcontentpaddingleft2.setMax[7] : i2), (byte) 0);
            this.equals = new setMin();
            boolean unused = this.toFloatRange.equals = z2;
            boolean unused2 = this.equals.length = z;
            this.toDoubleRange = list;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }

    public final synchronized boolean setMax() {
        if (this.toString != null) {
            return false;
        }
        if ((this.toFloatRange.equals || this.toFloatRange.toIntRange) && ((this.equals.length || this.equals.setMin) && this.setMax != null)) {
            return false;
        }
        return true;
    }

    public final boolean length() {
        return this.setMin.length == ((this.getMax & 1) == 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003f, code lost:
        if (r2.isInside.length() != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0048, code lost:
        throw new java.net.SocketTimeoutException(id.dana.twilio.identityverification.TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0049, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<o.CardView> getMax() {
        /*
            r2 = this;
            monitor-enter(r2)
            o.setMinimumWidth$getMin r0 = r2.isInside     // Catch:{ all -> 0x004a }
            r0.getMin()     // Catch:{ all -> 0x004a }
        L_0x0006:
            java.util.List<o.CardView> r0 = r2.setMax     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0018
            com.bca.xco.widget.connection.httpclient.internal.http2.a r0 = r2.toString     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0018
            r2.wait()     // Catch:{ InterruptedException -> 0x0012 }
            goto L_0x0006
        L_0x0012:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0038 }
            r0.<init>()     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0018:
            o.setMinimumWidth$getMin r0 = r2.isInside     // Catch:{ all -> 0x004a }
            boolean r0 = r0.length()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0030
            java.util.List<o.CardView> r0 = r2.setMax     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0028
            java.util.List<o.CardView> r0 = r2.setMax     // Catch:{ all -> 0x004a }
            monitor-exit(r2)
            return r0
        L_0x0028:
            com.bca.xco.widget.connection.httpclient.internal.http2.l r0 = new com.bca.xco.widget.connection.httpclient.internal.http2.l     // Catch:{ all -> 0x004a }
            com.bca.xco.widget.connection.httpclient.internal.http2.a r1 = r2.toString     // Catch:{ all -> 0x004a }
            r0.<init>(r1)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x0030:
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x0038:
            r0 = move-exception
            o.setMinimumWidth$getMin r1 = r2.isInside     // Catch:{ all -> 0x004a }
            boolean r1 = r1.length()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0049
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x0049:
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x004e
        L_0x004d:
            throw r0
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMinimumWidth.getMax():java.util.List");
    }

    public final entryRemoved getMin() {
        synchronized (this) {
            if (this.setMax == null) {
                if (!length()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.equals;
    }

    public final boolean getMin(a aVar) {
        if (IsOverlapping || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.toString != null) {
                    return false;
                }
                if (this.toFloatRange.equals && this.equals.length) {
                    return false;
                }
                this.toString = aVar;
                notifyAll();
                this.setMin.getMin(this.getMax);
                return true;
            }
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public final void setMin() {
        boolean max;
        if (IsOverlapping || !Thread.holdsLock(this)) {
            synchronized (this) {
                boolean unused = this.toFloatRange.equals = true;
                max = setMax();
                notifyAll();
            }
            if (!max) {
                this.setMin.getMin(this.getMax);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void length(a aVar) {
        if (this.toString == null) {
            this.toString = aVar;
            notifyAll();
        }
    }

    final class getMax implements safeSizeOf {
        static final /* synthetic */ boolean length = (!setMinimumWidth.class.desiredAssertionStatus());
        /* access modifiers changed from: private */
        public boolean equals;
        private final long getMax;
        private final maxSize getMin;
        private final maxSize setMax;
        /* access modifiers changed from: private */
        public boolean toIntRange;

        /* synthetic */ getMax(setMinimumWidth setminimumwidth, long j, byte b) {
            this(j);
        }

        private getMax(long j) {
            this.getMin = new maxSize();
            this.setMax = new maxSize();
            this.getMax = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
            r13 = o.setMinimumWidth.getMax(r10.setMin);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
            monitor-enter(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            o.setMinimumWidth.getMax(r10.setMin).getMin += r11;
            r2 = o.setMinimumWidth.getMax(r10.setMin).getMin;
            r4 = o.setMinimumWidth.getMax(r10.setMin).setMax;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x009c, code lost:
            if ((r4.setMin & 128) == 0) goto L_0x00a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
            r7 = r4.setMax[7];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
            if (r2 < ((long) (r7 / 2))) goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a9, code lost:
            o.setMinimumWidth.getMax(r10.setMin).getMin(0, o.setMinimumWidth.getMax(r10.setMin).getMin);
            o.setMinimumWidth.getMax(r10.setMin).getMin = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c3, code lost:
            monitor-exit(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c4, code lost:
            return r11;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long length(o.maxSize r11, long r12) {
            /*
                r10 = this;
                r0 = 0
                int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x00df
                o.setMinimumWidth r2 = o.setMinimumWidth.this
                monitor-enter(r2)
                r10.setMax()     // Catch:{ all -> 0x00dc }
                boolean r3 = r10.toIntRange     // Catch:{ all -> 0x00dc }
                if (r3 != 0) goto L_0x00d4
                o.setMinimumWidth r3 = o.setMinimumWidth.this     // Catch:{ all -> 0x00dc }
                com.bca.xco.widget.connection.httpclient.internal.http2.a r3 = r3.toString     // Catch:{ all -> 0x00dc }
                if (r3 != 0) goto L_0x00c8
                o.maxSize r3 = r10.setMax     // Catch:{ all -> 0x00dc }
                long r3 = r3.setMax     // Catch:{ all -> 0x00dc }
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 != 0) goto L_0x0024
                r11 = -1
                monitor-exit(r2)     // Catch:{ all -> 0x00dc }
                return r11
            L_0x0024:
                o.maxSize r3 = r10.setMax     // Catch:{ all -> 0x00dc }
                o.maxSize r4 = r10.setMax     // Catch:{ all -> 0x00dc }
                long r4 = r4.setMax     // Catch:{ all -> 0x00dc }
                long r12 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x00dc }
                long r11 = r3.length((o.maxSize) r11, (long) r12)     // Catch:{ all -> 0x00dc }
                o.setMinimumWidth r13 = o.setMinimumWidth.this     // Catch:{ all -> 0x00dc }
                long r3 = r13.getMin     // Catch:{ all -> 0x00dc }
                long r3 = r3 + r11
                r13.getMin = r3     // Catch:{ all -> 0x00dc }
                o.setMinimumWidth r13 = o.setMinimumWidth.this     // Catch:{ all -> 0x00dc }
                long r3 = r13.getMin     // Catch:{ all -> 0x00dc }
                o.setMinimumWidth r13 = o.setMinimumWidth.this     // Catch:{ all -> 0x00dc }
                o.setContentPadding r13 = r13.setMin     // Catch:{ all -> 0x00dc }
                o.getContentPaddingLeft r13 = r13.setMax     // Catch:{ all -> 0x00dc }
                int r5 = r13.setMin     // Catch:{ all -> 0x00dc }
                r5 = r5 & 128(0x80, float:1.794E-43)
                r6 = 7
                r7 = 65535(0xffff, float:9.1834E-41)
                if (r5 == 0) goto L_0x0054
                int[] r13 = r13.setMax     // Catch:{ all -> 0x00dc }
                r13 = r13[r6]     // Catch:{ all -> 0x00dc }
                goto L_0x0057
            L_0x0054:
                r13 = 65535(0xffff, float:9.1834E-41)
            L_0x0057:
                int r13 = r13 / 2
                long r8 = (long) r13     // Catch:{ all -> 0x00dc }
                int r13 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r13 < 0) goto L_0x0075
                o.setMinimumWidth r13 = o.setMinimumWidth.this     // Catch:{ all -> 0x00dc }
                o.setContentPadding r13 = r13.setMin     // Catch:{ all -> 0x00dc }
                o.setMinimumWidth r3 = o.setMinimumWidth.this     // Catch:{ all -> 0x00dc }
                int r3 = r3.getMax     // Catch:{ all -> 0x00dc }
                o.setMinimumWidth r4 = o.setMinimumWidth.this     // Catch:{ all -> 0x00dc }
                long r4 = r4.getMin     // Catch:{ all -> 0x00dc }
                r13.getMin((int) r3, (long) r4)     // Catch:{ all -> 0x00dc }
                o.setMinimumWidth r13 = o.setMinimumWidth.this     // Catch:{ all -> 0x00dc }
                r13.getMin = r0     // Catch:{ all -> 0x00dc }
            L_0x0075:
                monitor-exit(r2)     // Catch:{ all -> 0x00dc }
                o.setMinimumWidth r13 = o.setMinimumWidth.this
                o.setContentPadding r13 = r13.setMin
                monitor-enter(r13)
                o.setMinimumWidth r2 = o.setMinimumWidth.this     // Catch:{ all -> 0x00c5 }
                o.setContentPadding r2 = r2.setMin     // Catch:{ all -> 0x00c5 }
                long r3 = r2.getMin     // Catch:{ all -> 0x00c5 }
                long r3 = r3 + r11
                r2.getMin = r3     // Catch:{ all -> 0x00c5 }
                o.setMinimumWidth r2 = o.setMinimumWidth.this     // Catch:{ all -> 0x00c5 }
                o.setContentPadding r2 = r2.setMin     // Catch:{ all -> 0x00c5 }
                long r2 = r2.getMin     // Catch:{ all -> 0x00c5 }
                o.setMinimumWidth r4 = o.setMinimumWidth.this     // Catch:{ all -> 0x00c5 }
                o.setContentPadding r4 = r4.setMin     // Catch:{ all -> 0x00c5 }
                o.getContentPaddingLeft r4 = r4.setMax     // Catch:{ all -> 0x00c5 }
                int r5 = r4.setMin     // Catch:{ all -> 0x00c5 }
                r5 = r5 & 128(0x80, float:1.794E-43)
                if (r5 == 0) goto L_0x00a2
                int[] r4 = r4.setMax     // Catch:{ all -> 0x00c5 }
                r7 = r4[r6]     // Catch:{ all -> 0x00c5 }
            L_0x00a2:
                int r7 = r7 / 2
                long r4 = (long) r7     // Catch:{ all -> 0x00c5 }
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x00c3
                o.setMinimumWidth r2 = o.setMinimumWidth.this     // Catch:{ all -> 0x00c5 }
                o.setContentPadding r2 = r2.setMin     // Catch:{ all -> 0x00c5 }
                r3 = 0
                o.setMinimumWidth r4 = o.setMinimumWidth.this     // Catch:{ all -> 0x00c5 }
                o.setContentPadding r4 = r4.setMin     // Catch:{ all -> 0x00c5 }
                long r4 = r4.getMin     // Catch:{ all -> 0x00c5 }
                r2.getMin((int) r3, (long) r4)     // Catch:{ all -> 0x00c5 }
                o.setMinimumWidth r2 = o.setMinimumWidth.this     // Catch:{ all -> 0x00c5 }
                o.setContentPadding r2 = r2.setMin     // Catch:{ all -> 0x00c5 }
                r2.getMin = r0     // Catch:{ all -> 0x00c5 }
            L_0x00c3:
                monitor-exit(r13)     // Catch:{ all -> 0x00c5 }
                return r11
            L_0x00c5:
                r11 = move-exception
                monitor-exit(r13)
                throw r11
            L_0x00c8:
                com.bca.xco.widget.connection.httpclient.internal.http2.l r11 = new com.bca.xco.widget.connection.httpclient.internal.http2.l     // Catch:{ all -> 0x00dc }
                o.setMinimumWidth r12 = o.setMinimumWidth.this     // Catch:{ all -> 0x00dc }
                com.bca.xco.widget.connection.httpclient.internal.http2.a r12 = r12.toString     // Catch:{ all -> 0x00dc }
                r11.<init>(r12)     // Catch:{ all -> 0x00dc }
                throw r11     // Catch:{ all -> 0x00dc }
            L_0x00d4:
                java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x00dc }
                java.lang.String r12 = "stream closed"
                r11.<init>(r12)     // Catch:{ all -> 0x00dc }
                throw r11     // Catch:{ all -> 0x00dc }
            L_0x00dc:
                r11 = move-exception
                monitor-exit(r2)
                throw r11
            L_0x00df:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r12 = java.lang.String.valueOf(r12)
                java.lang.String r13 = "byteCount < 0: "
                java.lang.String r12 = r13.concat(r12)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setMinimumWidth.getMax.length(o.maxSize, long):long");
        }

        private void setMax() {
            setMinimumWidth.this.isInside.getMin();
            while (this.setMax.setMax == 0 && !this.equals && !this.toIntRange && setMinimumWidth.this.toString == null) {
                try {
                    setMinimumWidth.length(setMinimumWidth.this);
                } catch (Throwable th) {
                    if (setMinimumWidth.this.isInside.length()) {
                        throw new SocketTimeoutException(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
                    }
                    throw th;
                }
            }
            if (setMinimumWidth.this.isInside.length()) {
                throw new SocketTimeoutException(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
            }
        }

        /* access modifiers changed from: package-private */
        public final void setMin(put put, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            if (length || !Thread.holdsLock(setMinimumWidth.this)) {
                while (j > 0) {
                    synchronized (setMinimumWidth.this) {
                        z = this.equals;
                        z2 = true;
                        z3 = this.setMax.setMax + j > this.getMax;
                    }
                    if (z3) {
                        put.setMin(j);
                        setMinimumWidth setminimumwidth = setMinimumWidth.this;
                        a aVar = a.FLOW_CONTROL_ERROR;
                        if (setminimumwidth.getMin(aVar)) {
                            setminimumwidth.setMin.length(setminimumwidth.getMax, aVar);
                            return;
                        }
                        return;
                    } else if (z) {
                        put.setMin(j);
                        return;
                    } else {
                        long length2 = put.length(this.getMin, j);
                        if (length2 != -1) {
                            j -= length2;
                            synchronized (setMinimumWidth.this) {
                                if (this.setMax.setMax != 0) {
                                    z2 = false;
                                }
                                this.setMax.length((safeSizeOf) this.getMin);
                                if (z2) {
                                    setMinimumWidth.this.notifyAll();
                                }
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

        public final loadParameters setMin() {
            return setMinimumWidth.this.isInside;
        }

        public final void close() {
            synchronized (setMinimumWidth.this) {
                this.toIntRange = true;
                maxSize maxsize = this.setMax;
                try {
                    maxsize.setMin(maxsize.setMax);
                    setMinimumWidth.this.notifyAll();
                } catch (EOFException e) {
                    throw new AssertionError(e);
                }
            }
            setMinimumWidth.toIntRange(setMinimumWidth.this);
        }
    }

    final class setMin implements entryRemoved {
        static final /* synthetic */ boolean getMin = (!setMinimumWidth.class.desiredAssertionStatus());
        private final maxSize getMax = new maxSize();
        /* access modifiers changed from: private */
        public boolean length;
        /* access modifiers changed from: private */
        public boolean setMin;

        setMin() {
        }

        public final void setMax(maxSize maxsize, long j) {
            if (getMin || !Thread.holdsLock(setMinimumWidth.this)) {
                this.getMax.setMax(maxsize, j);
                while (this.getMax.setMax >= 16384) {
                    setMax(false);
                }
                return;
            }
            throw new AssertionError();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
            r12 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
            if (o.setMinimumWidth.IsOverlapping(r11.setMax).length() != false) goto L_0x00ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c1, code lost:
            throw new java.net.SocketTimeoutException(id.dana.twilio.identityverification.TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c2, code lost:
            throw r12;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void setMax(boolean r12) {
            /*
                r11 = this;
                o.setMinimumWidth r0 = o.setMinimumWidth.this
                monitor-enter(r0)
                o.setMinimumWidth r1 = o.setMinimumWidth.this     // Catch:{ all -> 0x00c3 }
                o.setMinimumWidth$getMin r1 = r1.toIntRange     // Catch:{ all -> 0x00c3 }
                r1.getMin()     // Catch:{ all -> 0x00c3 }
            L_0x000c:
                o.setMinimumWidth r1 = o.setMinimumWidth.this     // Catch:{ all -> 0x00ad }
                long r1 = r1.length     // Catch:{ all -> 0x00ad }
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L_0x002c
                boolean r1 = r11.length     // Catch:{ all -> 0x00ad }
                if (r1 != 0) goto L_0x002c
                boolean r1 = r11.setMin     // Catch:{ all -> 0x00ad }
                if (r1 != 0) goto L_0x002c
                o.setMinimumWidth r1 = o.setMinimumWidth.this     // Catch:{ all -> 0x00ad }
                com.bca.xco.widget.connection.httpclient.internal.http2.a r1 = r1.toString     // Catch:{ all -> 0x00ad }
                if (r1 != 0) goto L_0x002c
                o.setMinimumWidth r1 = o.setMinimumWidth.this     // Catch:{ all -> 0x00ad }
                o.setMinimumWidth.length((o.setMinimumWidth) r1)     // Catch:{ all -> 0x00ad }
                goto L_0x000c
            L_0x002c:
                o.setMinimumWidth r1 = o.setMinimumWidth.this     // Catch:{ all -> 0x00c3 }
                o.setMinimumWidth$getMin r1 = r1.toIntRange     // Catch:{ all -> 0x00c3 }
                boolean r1 = r1.length()     // Catch:{ all -> 0x00c3 }
                if (r1 != 0) goto L_0x00a5
                o.setMinimumWidth r1 = o.setMinimumWidth.this     // Catch:{ all -> 0x00c3 }
                o.setMinimumWidth.toFloatRange(r1)     // Catch:{ all -> 0x00c3 }
                o.setMinimumWidth r1 = o.setMinimumWidth.this     // Catch:{ all -> 0x00c3 }
                long r1 = r1.length     // Catch:{ all -> 0x00c3 }
                o.maxSize r3 = r11.getMax     // Catch:{ all -> 0x00c3 }
                long r3 = r3.setMax     // Catch:{ all -> 0x00c3 }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x00c3 }
                o.setMinimumWidth r1 = o.setMinimumWidth.this     // Catch:{ all -> 0x00c3 }
                long r2 = r1.length     // Catch:{ all -> 0x00c3 }
                long r2 = r2 - r9
                r1.length = r2     // Catch:{ all -> 0x00c3 }
                monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
                o.setMinimumWidth r0 = o.setMinimumWidth.this
                o.setMinimumWidth$getMin r0 = r0.toIntRange
                r0.getMin()
                o.setMinimumWidth r0 = o.setMinimumWidth.this     // Catch:{ all -> 0x008f }
                o.setContentPadding r5 = r0.setMin     // Catch:{ all -> 0x008f }
                o.setMinimumWidth r0 = o.setMinimumWidth.this     // Catch:{ all -> 0x008f }
                int r6 = r0.getMax     // Catch:{ all -> 0x008f }
                if (r12 == 0) goto L_0x0073
                o.maxSize r12 = r11.getMax     // Catch:{ all -> 0x008f }
                long r0 = r12.setMax     // Catch:{ all -> 0x008f }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x0073
                r12 = 1
                r7 = 1
                goto L_0x0075
            L_0x0073:
                r12 = 0
                r7 = 0
            L_0x0075:
                o.maxSize r8 = r11.getMax     // Catch:{ all -> 0x008f }
                r5.getMax(r6, r7, r8, r9)     // Catch:{ all -> 0x008f }
                o.setMinimumWidth r12 = o.setMinimumWidth.this
                o.setMinimumWidth$getMin r12 = r12.toIntRange
                boolean r12 = r12.length()
                if (r12 != 0) goto L_0x0087
                return
            L_0x0087:
                java.net.SocketTimeoutException r12 = new java.net.SocketTimeoutException
                java.lang.String r0 = "timeout"
                r12.<init>(r0)
                throw r12
            L_0x008f:
                r12 = move-exception
                o.setMinimumWidth r0 = o.setMinimumWidth.this
                o.setMinimumWidth$getMin r0 = r0.toIntRange
                boolean r0 = r0.length()
                if (r0 == 0) goto L_0x00a4
                java.net.SocketTimeoutException r12 = new java.net.SocketTimeoutException
                java.lang.String r0 = "timeout"
                r12.<init>(r0)
                throw r12
            L_0x00a4:
                throw r12
            L_0x00a5:
                java.net.SocketTimeoutException r12 = new java.net.SocketTimeoutException     // Catch:{ all -> 0x00c3 }
                java.lang.String r1 = "timeout"
                r12.<init>(r1)     // Catch:{ all -> 0x00c3 }
                throw r12     // Catch:{ all -> 0x00c3 }
            L_0x00ad:
                r12 = move-exception
                o.setMinimumWidth r1 = o.setMinimumWidth.this     // Catch:{ all -> 0x00c3 }
                o.setMinimumWidth$getMin r1 = r1.toIntRange     // Catch:{ all -> 0x00c3 }
                boolean r1 = r1.length()     // Catch:{ all -> 0x00c3 }
                if (r1 == 0) goto L_0x00c2
                java.net.SocketTimeoutException r12 = new java.net.SocketTimeoutException     // Catch:{ all -> 0x00c3 }
                java.lang.String r1 = "timeout"
                r12.<init>(r1)     // Catch:{ all -> 0x00c3 }
                throw r12     // Catch:{ all -> 0x00c3 }
            L_0x00c2:
                throw r12     // Catch:{ all -> 0x00c3 }
            L_0x00c3:
                r12 = move-exception
                monitor-exit(r0)
                goto L_0x00c7
            L_0x00c6:
                throw r12
            L_0x00c7:
                goto L_0x00c6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setMinimumWidth.setMin.setMax(boolean):void");
        }

        public final void flush() {
            if (getMin || !Thread.holdsLock(setMinimumWidth.this)) {
                synchronized (setMinimumWidth.this) {
                    setMinimumWidth.toFloatRange(setMinimumWidth.this);
                }
                while (this.getMax.setMax > 0) {
                    setMax(false);
                    setMinimumWidth.this.setMin.toIntRange.getMin();
                }
                return;
            }
            throw new AssertionError();
        }

        public final loadParameters setMin() {
            return setMinimumWidth.this.toIntRange;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
            if (r8.setMax.equals.length != false) goto L_0x004f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
            if (r8.getMax.setMax <= 0) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
            if (r8.getMax.setMax <= 0) goto L_0x004f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
            setMax(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
            o.setMinimumWidth.getMax(r8.setMax).getMax(o.setMinimumWidth.getMin(r8.setMax), true, (o.maxSize) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
            r0 = r8.setMax;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.setMin = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
            o.setMinimumWidth.getMax(r8.setMax).toIntRange.getMin();
            o.setMinimumWidth.toIntRange(r8.setMax);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
                r8 = this;
                boolean r0 = getMin
                if (r0 != 0) goto L_0x0013
                o.setMinimumWidth r0 = o.setMinimumWidth.this
                boolean r0 = java.lang.Thread.holdsLock(r0)
                if (r0 != 0) goto L_0x000d
                goto L_0x0013
            L_0x000d:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L_0x0013:
                o.setMinimumWidth r0 = o.setMinimumWidth.this
                monitor-enter(r0)
                boolean r1 = r8.setMin     // Catch:{ all -> 0x0069 }
                if (r1 == 0) goto L_0x001c
                monitor-exit(r0)     // Catch:{ all -> 0x0069 }
                return
            L_0x001c:
                monitor-exit(r0)
                o.setMinimumWidth r0 = o.setMinimumWidth.this
                o.setMinimumWidth$setMin r0 = r0.equals
                boolean r0 = r0.length
                r1 = 1
                if (r0 != 0) goto L_0x004f
                o.maxSize r0 = r8.getMax
                long r2 = r0.setMax
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003c
            L_0x0030:
                o.maxSize r0 = r8.getMax
                long r2 = r0.setMax
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x004f
                r8.setMax((boolean) r1)
                goto L_0x0030
            L_0x003c:
                o.setMinimumWidth r0 = o.setMinimumWidth.this
                o.setContentPadding r2 = r0.setMin
                o.setMinimumWidth r0 = o.setMinimumWidth.this
                int r3 = r0.getMax
                r4 = 1
                r5 = 0
                r6 = 0
                r2.getMax(r3, r4, r5, r6)
            L_0x004f:
                o.setMinimumWidth r0 = o.setMinimumWidth.this
                monitor-enter(r0)
                r8.setMin = r1     // Catch:{ all -> 0x0066 }
                monitor-exit(r0)     // Catch:{ all -> 0x0066 }
                o.setMinimumWidth r0 = o.setMinimumWidth.this
                o.setContentPadding r0 = r0.setMin
                o.setMinimumHeight r0 = r0.toIntRange
                r0.getMin()
                o.setMinimumWidth r0 = o.setMinimumWidth.this
                o.setMinimumWidth.toIntRange(r0)
                return
            L_0x0066:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x0069:
                r1 = move-exception
                monitor-exit(r0)
                goto L_0x006d
            L_0x006c:
                throw r1
            L_0x006d:
                goto L_0x006c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setMinimumWidth.setMin.close():void");
        }
    }

    class getMin extends remove {
        getMin() {
        }

        public final void getMax() {
            setMinimumWidth setminimumwidth = setMinimumWidth.this;
            a aVar = a.CANCEL;
            if (setminimumwidth.getMin(aVar)) {
                setminimumwidth.setMin.length(setminimumwidth.getMax, aVar);
            }
        }

        public final IOException getMax(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    static /* synthetic */ void length(setMinimumWidth setminimumwidth) {
        try {
            setminimumwidth.wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    static /* synthetic */ void toIntRange(setMinimumWidth setminimumwidth) {
        boolean z;
        boolean max;
        if (IsOverlapping || !Thread.holdsLock(setminimumwidth)) {
            synchronized (setminimumwidth) {
                z = !setminimumwidth.toFloatRange.equals && setminimumwidth.toFloatRange.toIntRange && (setminimumwidth.equals.length || setminimumwidth.equals.setMin);
                max = setminimumwidth.setMax();
            }
            if (z) {
                a aVar = a.CANCEL;
                if (setminimumwidth.getMin(aVar)) {
                    setminimumwidth.setMin.getMin(setminimumwidth.getMax, aVar);
                }
            } else if (!max) {
                setminimumwidth.setMin.getMin(setminimumwidth.getMax);
            }
        } else {
            throw new AssertionError();
        }
    }

    static /* synthetic */ void toFloatRange(setMinimumWidth setminimumwidth) {
        if (setminimumwidth.equals.setMin) {
            throw new IOException("stream closed");
        } else if (setminimumwidth.equals.length) {
            throw new IOException("stream finished");
        } else if (setminimumwidth.toString != null) {
            throw new l(setminimumwidth.toString);
        }
    }
}
