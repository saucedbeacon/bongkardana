package o;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import o.increaseBuffer;
import o.setTransferemasked;
import okhttp3.internal.connection.RouteException;

public final class isFin {
    public static final /* synthetic */ boolean toFloatRange = (!isFin.class.desiredAssertionStatus());
    private final setTransferemasked FastBitmap$CoordinateSystem;
    private setTransferemasked.length IsOverlapping;
    private final Object equals;
    public final Draft_10 getMax;
    public getCloseCode getMin;
    private boolean hashCode;
    public getOpcode isInside;
    public final postProcessHandshakeResponseAsServer length;
    public final translateSingleFrame setMax;
    public final checkAlloc setMin;
    private boolean toDoubleRange;
    public setFin toIntRange;
    private int toString;
    private boolean values;

    public isFin(Draft_10 draft_10, postProcessHandshakeResponseAsServer postprocesshandshakeresponseasserver, checkAlloc checkalloc, translateSingleFrame translatesingleframe, Object obj) {
        this.getMax = draft_10;
        this.length = postprocesshandshakeresponseasserver;
        this.setMin = checkalloc;
        this.setMax = translatesingleframe;
        this.FastBitmap$CoordinateSystem = new setTransferemasked(postprocesshandshakeresponseasserver, LimitExedeedException.length.getMax(this.getMax), checkalloc, translatesingleframe);
        this.equals = obj;
    }

    public final getOpcode getMin(generateKey generatekey, increaseBuffer.setMax setmax, boolean z) {
        getOpcode getopcode;
        try {
            setFin length2 = length(setmax.setMax(), setmax.length(), setmax.getMax(), generatekey.onMessageChannelReady, generatekey.getMax(), z);
            if (length2.getMin != null) {
                getopcode = new Handshakedata(generatekey, setmax, this, length2.getMin);
            } else {
                length2.length.setSoTimeout(setmax.length());
                length2.toFloatRange.getMin().length((long) setmax.length(), TimeUnit.MILLISECONDS);
                length2.isInside.getMin().length((long) setmax.getMax(), TimeUnit.MILLISECONDS);
                getopcode = new iterateHttpFields(generatekey, this, length2.toFloatRange, length2.isInside);
            }
            synchronized (this.getMax) {
                this.isInside = getopcode;
            }
            return getopcode;
        } catch (IOException e) {
            throw new RouteException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r0.setMax(r9) != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o.setFin length(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            o.setFin r0 = r3.setMax(r4, r5, r6, r7, r8)
            o.Draft_10 r1 = r3.getMax
            monitor-enter(r1)
            int r2 = r0.toIntRange     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            boolean r2 = r0.setMax()     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return r0
        L_0x0013:
            monitor-exit(r1)
            boolean r1 = r0.setMax(r9)
            if (r1 != 0) goto L_0x001e
            r3.getMin()
            goto L_0x0000
        L_0x001e:
            return r0
        L_0x001f:
            r4 = move-exception
            monitor-exit(r1)
            goto L_0x0023
        L_0x0022:
            throw r4
        L_0x0023:
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isFin.length(int, int, int, int, boolean, boolean):o.setFin");
    }

    private setFin setMax(int i, int i2, int i3, int i4, boolean z) throws IOException {
        Socket socket;
        Socket socket2;
        setFin setfin;
        setFin setfin2;
        boolean z2;
        getCloseCode getclosecode;
        boolean z3;
        setTransferemasked.length length2;
        synchronized (this.getMax) {
            if (this.toDoubleRange) {
                throw new IllegalStateException("released");
            } else if (this.isInside != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.values) {
                setFin setfin3 = this.toIntRange;
                if (!toFloatRange) {
                    if (!Thread.holdsLock(this.getMax)) {
                        throw new AssertionError();
                    }
                }
                setFin setfin4 = this.toIntRange;
                socket = null;
                if (setfin4 == null || !setfin4.equals) {
                    socket2 = null;
                } else {
                    socket2 = getMin(false, false, true);
                }
                if (this.toIntRange != null) {
                    setfin2 = this.toIntRange;
                    setfin = null;
                } else {
                    setfin = setfin3;
                    setfin2 = null;
                }
                if (!this.hashCode) {
                    setfin = null;
                }
                if (setfin2 == null) {
                    LimitExedeedException.length.setMax(this.getMax, this.length, this, (getCloseCode) null);
                    if (this.toIntRange != null) {
                        setfin2 = this.toIntRange;
                        getclosecode = null;
                        z2 = true;
                    } else {
                        getclosecode = this.getMin;
                    }
                } else {
                    getclosecode = null;
                }
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        initCloseCode.getMax(socket2);
        if (setfin != null) {
            this.setMax.connectionReleased(this.setMin, setfin);
        }
        if (z2) {
            this.setMax.connectionAcquired(this.setMin, setfin2);
        }
        if (setfin2 != null) {
            this.getMin = this.toIntRange.getMax;
            return setfin2;
        }
        if (getclosecode != null || ((length2 = this.IsOverlapping) != null && length2.getMin())) {
            z3 = false;
        } else {
            this.IsOverlapping = this.FastBitmap$CoordinateSystem.length();
            z3 = true;
        }
        synchronized (this.getMax) {
            if (!this.values) {
                if (z3) {
                    ArrayList arrayList = new ArrayList(this.IsOverlapping.length);
                    int size = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        getCloseCode getclosecode2 = (getCloseCode) arrayList.get(i5);
                        LimitExedeedException.length.setMax(this.getMax, this.length, this, getclosecode2);
                        if (this.toIntRange != null) {
                            setfin2 = this.toIntRange;
                            this.getMin = getclosecode2;
                            z2 = true;
                            break;
                        }
                        i5++;
                    }
                }
                if (!z2) {
                    if (getclosecode == null) {
                        setTransferemasked.length length3 = this.IsOverlapping;
                        if (length3.getMin()) {
                            List<getCloseCode> list = length3.length;
                            int i6 = length3.setMax;
                            length3.setMax = i6 + 1;
                            getclosecode = list.get(i6);
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                    this.getMin = getclosecode;
                    this.toString = 0;
                    setfin2 = new setFin(this.getMax, getclosecode);
                    getMin(setfin2, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (z2) {
            this.setMax.connectionAcquired(this.setMin, setfin2);
            return setfin2;
        }
        setfin2.getMax(i, i2, i3, i4, z, this.setMin, this.setMax);
        LimitExedeedException.length.getMax(this.getMax).setMin(setfin2.getMax);
        synchronized (this.getMax) {
            this.hashCode = true;
            LimitExedeedException.length.setMax(this.getMax, setfin2);
            if (setfin2.setMax()) {
                socket = LimitExedeedException.length.getMax(this.getMax, this.length, this);
                setfin2 = this.toIntRange;
            }
        }
        initCloseCode.getMax(socket);
        this.setMax.connectionAcquired(this.setMin, setfin2);
        return setfin2;
    }

    public final void setMax(boolean z, getOpcode getopcode, long j, IOException iOException) {
        setFin setfin;
        Socket min;
        boolean z2;
        this.setMax.responseBodyEnd(this.setMin, j);
        synchronized (this.getMax) {
            if (getopcode != null) {
                if (getopcode == this.isInside) {
                    if (!z) {
                        this.toIntRange.toIntRange++;
                    }
                    setfin = this.toIntRange;
                    min = getMin(z, false, true);
                    if (this.toIntRange != null) {
                        setfin = null;
                    }
                    z2 = this.toDoubleRange;
                }
            }
            StringBuilder sb = new StringBuilder("expected ");
            sb.append(this.isInside);
            sb.append(" but was ");
            sb.append(getopcode);
            throw new IllegalStateException(sb.toString());
        }
        initCloseCode.getMax(min);
        if (setfin != null) {
            this.setMax.connectionReleased(this.setMin, setfin);
        }
        if (iOException != null) {
            this.setMax.callFailed(this.setMin, LimitExedeedException.length.length(this.setMin, iOException));
        } else if (z2) {
            LimitExedeedException.length.length(this.setMin, (IOException) null);
            this.setMax.callEnd(this.setMin);
        }
    }

    public final getOpcode getMax() {
        getOpcode getopcode;
        synchronized (this.getMax) {
            getopcode = this.isInside;
        }
        return getopcode;
    }

    public final synchronized setFin length() {
        return this.toIntRange;
    }

    public final void setMin() {
        setFin setfin;
        Socket min;
        synchronized (this.getMax) {
            setfin = this.toIntRange;
            min = getMin(false, true, false);
            if (this.toIntRange != null) {
                setfin = null;
            }
        }
        initCloseCode.getMax(min);
        if (setfin != null) {
            LimitExedeedException.length.length(this.setMin, (IOException) null);
            this.setMax.connectionReleased(this.setMin, setfin);
            this.setMax.callEnd(this.setMin);
        }
    }

    public final void getMin() {
        setFin setfin;
        Socket min;
        synchronized (this.getMax) {
            setfin = this.toIntRange;
            min = getMin(true, false, false);
            if (this.toIntRange != null) {
                setfin = null;
            }
        }
        initCloseCode.getMax(min);
        if (setfin != null) {
            this.setMax.connectionReleased(this.setMin, setfin);
        }
    }

    public final Socket getMin(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (toFloatRange || Thread.holdsLock(this.getMax)) {
            if (z3) {
                this.isInside = null;
            }
            if (z2) {
                this.toDoubleRange = true;
            }
            setFin setfin = this.toIntRange;
            if (setfin == null) {
                return null;
            }
            if (z) {
                setfin.equals = true;
            }
            if (this.isInside != null) {
                return null;
            }
            if (!this.toDoubleRange && !this.toIntRange.equals) {
                return null;
            }
            setMax(this.toIntRange);
            if (this.toIntRange.FastBitmap$CoordinateSystem.isEmpty()) {
                this.toIntRange.hashCode = System.nanoTime();
                if (LimitExedeedException.length.getMin(this.getMax, this.toIntRange)) {
                    socket = this.toIntRange.length;
                    this.toIntRange = null;
                    return socket;
                }
            }
            socket = null;
            this.toIntRange = null;
            return socket;
        }
        throw new AssertionError();
    }

    public final void setMax() {
        getOpcode getopcode;
        setFin setfin;
        synchronized (this.getMax) {
            this.values = true;
            getopcode = this.isInside;
            setfin = this.toIntRange;
        }
        if (getopcode != null) {
            getopcode.getMax();
        } else if (setfin != null) {
            initCloseCode.getMax(setfin.setMax);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(java.io.IOException r10) {
        /*
            r9 = this;
            o.Draft_10 r0 = r9.getMax
            monitor-enter(r0)
            boolean r1 = r10 instanceof okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x008e }
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0021
            okhttp3.internal.http2.StreamResetException r10 = (okhttp3.internal.http2.StreamResetException) r10     // Catch:{ all -> 0x008e }
            okhttp3.internal.http2.ErrorCode r10 = r10.errorCode     // Catch:{ all -> 0x008e }
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x008e }
            if (r10 != r1) goto L_0x001a
            int r10 = r9.toString     // Catch:{ all -> 0x008e }
            int r10 = r10 + r4
            r9.toString = r10     // Catch:{ all -> 0x008e }
            if (r10 <= r4) goto L_0x006f
            goto L_0x006b
        L_0x001a:
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ all -> 0x008e }
            if (r10 == r1) goto L_0x006f
            r9.getMin = r3     // Catch:{ all -> 0x008e }
            goto L_0x006d
        L_0x0021:
            o.setFin r1 = r9.toIntRange     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x006f
            o.setFin r1 = r9.toIntRange     // Catch:{ all -> 0x008e }
            boolean r1 = r1.setMax()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r10 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x006f
        L_0x0031:
            o.setFin r1 = r9.toIntRange     // Catch:{ all -> 0x008e }
            int r1 = r1.toIntRange     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x006d
            o.getCloseCode r1 = r9.getMin     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x006b
            if (r10 == 0) goto L_0x006b
            o.setTransferemasked r1 = r9.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x008e }
            o.getCloseCode r5 = r9.getMin     // Catch:{ all -> 0x008e }
            java.net.Proxy r6 = r5.length     // Catch:{ all -> 0x008e }
            java.net.Proxy$Type r6 = r6.type()     // Catch:{ all -> 0x008e }
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT     // Catch:{ all -> 0x008e }
            if (r6 == r7) goto L_0x0066
            o.postProcessHandshakeResponseAsServer r6 = r1.getMax     // Catch:{ all -> 0x008e }
            java.net.ProxySelector r6 = r6.toIntRange     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x0066
            o.postProcessHandshakeResponseAsServer r6 = r1.getMax     // Catch:{ all -> 0x008e }
            java.net.ProxySelector r6 = r6.toIntRange     // Catch:{ all -> 0x008e }
            o.postProcessHandshakeResponseAsServer r7 = r1.getMax     // Catch:{ all -> 0x008e }
            o.Draft_76 r7 = r7.setMax     // Catch:{ all -> 0x008e }
            java.net.URI r7 = r7.setMax()     // Catch:{ all -> 0x008e }
            java.net.Proxy r8 = r5.length     // Catch:{ all -> 0x008e }
            java.net.SocketAddress r8 = r8.address()     // Catch:{ all -> 0x008e }
            r6.connectFailed(r7, r8, r10)     // Catch:{ all -> 0x008e }
        L_0x0066:
            o.Framedata r10 = r1.length     // Catch:{ all -> 0x008e }
            r10.getMin(r5)     // Catch:{ all -> 0x008e }
        L_0x006b:
            r9.getMin = r3     // Catch:{ all -> 0x008e }
        L_0x006d:
            r10 = 1
            goto L_0x0070
        L_0x006f:
            r10 = 0
        L_0x0070:
            o.setFin r1 = r9.toIntRange     // Catch:{ all -> 0x008e }
            java.net.Socket r10 = r9.getMin((boolean) r10, (boolean) r2, (boolean) r4)     // Catch:{ all -> 0x008e }
            o.setFin r2 = r9.toIntRange     // Catch:{ all -> 0x008e }
            if (r2 != 0) goto L_0x0080
            boolean r2 = r9.hashCode     // Catch:{ all -> 0x008e }
            if (r2 != 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r3 = r1
        L_0x0080:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            o.initCloseCode.getMax((java.net.Socket) r10)
            if (r3 == 0) goto L_0x008d
            o.translateSingleFrame r10 = r9.setMax
            o.checkAlloc r0 = r9.setMin
            r10.connectionReleased(r0, r3)
        L_0x008d:
            return
        L_0x008e:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isFin.setMin(java.io.IOException):void");
    }

    public final void getMin(setFin setfin, boolean z) {
        if (!toFloatRange && !Thread.holdsLock(this.getMax)) {
            throw new AssertionError();
        } else if (this.toIntRange == null) {
            this.toIntRange = setfin;
            this.hashCode = z;
            setfin.FastBitmap$CoordinateSystem.add(new getMin(this, this.equals));
        } else {
            throw new IllegalStateException();
        }
    }

    private void setMax(setFin setfin) {
        int size = setfin.FastBitmap$CoordinateSystem.size();
        for (int i = 0; i < size; i++) {
            if (setfin.FastBitmap$CoordinateSystem.get(i).get() == this) {
                setfin.FastBitmap$CoordinateSystem.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean toIntRange() {
        if (this.getMin != null) {
            return true;
        }
        setTransferemasked.length length2 = this.IsOverlapping;
        return (length2 != null && length2.getMin()) || this.FastBitmap$CoordinateSystem.getMax();
    }

    public final String toString() {
        setFin length2 = length();
        return length2 != null ? length2.toString() : this.length.toString();
    }

    public static final class getMin extends WeakReference<isFin> {
        public final Object setMax;

        getMin(isFin isfin, Object obj) {
            super(isfin);
            this.setMax = obj;
        }
    }
}
