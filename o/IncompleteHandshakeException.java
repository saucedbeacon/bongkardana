package o;

import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import o.Draft_76;
import o.Framedata;

public final class IncompleteHandshakeException implements checkAlloc {
    private boolean equals;
    final boolean getMax;
    final InvalidDataException getMin;
    /* access modifiers changed from: private */
    @Nullable
    public translateSingleFrame isInside;
    final submit length;
    final HandshakeBuilder setMax;
    final generateKey setMin;

    private IncompleteHandshakeException(generateKey generatekey, InvalidDataException invalidDataException, boolean z) {
        this.setMin = generatekey;
        this.getMin = invalidDataException;
        this.getMax = z;
        this.setMax = new HandshakeBuilder(generatekey, z);
        AnonymousClass5 r4 = new submit() {
            public final void setMax() {
                HandshakeBuilder handshakeBuilder = IncompleteHandshakeException.this.setMax;
                handshakeBuilder.getMax = true;
                isFin isfin = handshakeBuilder.getMin;
                if (isfin != null) {
                    isfin.setMax();
                }
            }
        };
        this.length = r4;
        r4.length((long) generatekey.extraCallbackWithResult, TimeUnit.MILLISECONDS);
    }

    public static IncompleteHandshakeException setMax(generateKey generatekey, InvalidDataException invalidDataException) {
        IncompleteHandshakeException incompleteHandshakeException = new IncompleteHandshakeException(generatekey, invalidDataException, false);
        incompleteHandshakeException.isInside = generatekey.IsOverlapping.setMin(incompleteHandshakeException);
        return incompleteHandshakeException;
    }

    public final InvalidDataException getMin() {
        return this.getMin;
    }

    public final InvalidHandshakeException length() throws IOException {
        synchronized (this) {
            if (!this.equals) {
                this.equals = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.setMax.length = MPaaSSCLogCatImpl.toIntRange().getMin("response.body().close()");
        this.length.setMin();
        this.isInside.callStart(this);
        try {
            this.setMin.setMin.getMin(this);
            InvalidHandshakeException isInside2 = isInside();
            if (isInside2 != null) {
                Draft_17 draft_17 = this.setMin.setMin;
                draft_17.getMax(draft_17.setMax, this);
                return isInside2;
            }
            throw new IOException("Canceled");
        } catch (IOException e) {
            IOException max = setMax(e);
            this.isInside.callFailed(this, max);
            throw max;
        } catch (Throwable th) {
            Draft_17 draft_172 = this.setMin.setMin;
            draft_172.getMax(draft_172.setMax, this);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final IOException setMax(@Nullable IOException iOException) {
        if (!this.length.getMin()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void setMin(getRole getrole) {
        synchronized (this) {
            if (!this.equals) {
                this.equals = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.setMax.length = MPaaSSCLogCatImpl.toIntRange().getMin("response.body().close()");
        this.isInside.callStart(this);
        Draft_17 draft_17 = this.setMin.setMin;
        setMax setmax = new setMax(getrole);
        synchronized (draft_17) {
            draft_17.length.add(setmax);
        }
        draft_17.getMax();
    }

    public final void setMax() {
        HandshakeBuilder handshakeBuilder = this.setMax;
        handshakeBuilder.getMax = true;
        isFin isfin = handshakeBuilder.getMin;
        if (isfin != null) {
            isfin.setMax();
        }
    }

    public final boolean getMax() {
        return this.setMax.length();
    }

    final class setMax extends InvalidFrameException {
        static final /* synthetic */ boolean setMin = (!IncompleteHandshakeException.class.desiredAssertionStatus());
        final getRole setMax;

        setMax(getRole getrole) {
            super("OkHttp %s", IncompleteHandshakeException.this.setMin());
            this.setMax = getrole;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[Catch:{ IOException -> 0x0050, all -> 0x0027, all -> 0x00c1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[Catch:{ IOException -> 0x0050, all -> 0x0027, all -> 0x00c1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005b A[Catch:{ IOException -> 0x0050, all -> 0x0027, all -> 0x00c1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3 A[Catch:{ IOException -> 0x0050, all -> 0x0027, all -> 0x00c1 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void getMin() {
            /*
                r7 = this;
                o.IncompleteHandshakeException r0 = o.IncompleteHandshakeException.this
                o.submit r0 = r0.length
                r0.setMin()
                r0 = 1
                r1 = 0
                o.IncompleteHandshakeException r2 = o.IncompleteHandshakeException.this     // Catch:{ IOException -> 0x0050, all -> 0x0027 }
                o.InvalidHandshakeException r1 = r2.isInside()     // Catch:{ IOException -> 0x0050, all -> 0x0027 }
                o.getRole r2 = r7.setMax     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
                o.IncompleteHandshakeException r3 = o.IncompleteHandshakeException.this     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
                r2.onResponse(r3, r1)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
                o.IncompleteHandshakeException r0 = o.IncompleteHandshakeException.this
                o.generateKey r0 = r0.setMin
                o.Draft_17 r0 = r0.setMin
                java.util.Deque<o.IncompleteHandshakeException$setMax> r1 = r0.getMin
                r0.getMax(r1, r7)
                return
            L_0x0022:
                r1 = move-exception
                r2 = 1
                goto L_0x002a
            L_0x0025:
                r1 = move-exception
                goto L_0x0053
            L_0x0027:
                r2 = move-exception
                r1 = r2
                r2 = 0
            L_0x002a:
                o.IncompleteHandshakeException r3 = o.IncompleteHandshakeException.this     // Catch:{ all -> 0x00c1 }
                o.HandshakeBuilder r3 = r3.setMax     // Catch:{ all -> 0x00c1 }
                r3.getMax = r0     // Catch:{ all -> 0x00c1 }
                o.isFin r0 = r3.getMin     // Catch:{ all -> 0x00c1 }
                if (r0 == 0) goto L_0x0037
                r0.setMax()     // Catch:{ all -> 0x00c1 }
            L_0x0037:
                if (r2 != 0) goto L_0x004f
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00c1 }
                java.lang.String r2 = "canceled due to "
                java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c1 }
                java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x00c1 }
                r0.<init>(r2)     // Catch:{ all -> 0x00c1 }
                o.getRole r2 = r7.setMax     // Catch:{ all -> 0x00c1 }
                o.IncompleteHandshakeException r3 = o.IncompleteHandshakeException.this     // Catch:{ all -> 0x00c1 }
                r2.onFailure(r3, r0)     // Catch:{ all -> 0x00c1 }
            L_0x004f:
                throw r1     // Catch:{ all -> 0x00c1 }
            L_0x0050:
                r0 = move-exception
                r1 = r0
                r0 = 0
            L_0x0053:
                o.IncompleteHandshakeException r2 = o.IncompleteHandshakeException.this     // Catch:{ all -> 0x00c1 }
                java.io.IOException r1 = r2.setMax(r1)     // Catch:{ all -> 0x00c1 }
                if (r0 == 0) goto L_0x00a3
                o.MPaaSSCLogCatImpl r0 = o.MPaaSSCLogCatImpl.toIntRange()     // Catch:{ all -> 0x00c1 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
                java.lang.String r4 = "Callback failure for "
                r3.<init>(r4)     // Catch:{ all -> 0x00c1 }
                o.IncompleteHandshakeException r4 = o.IncompleteHandshakeException.this     // Catch:{ all -> 0x00c1 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
                r5.<init>()     // Catch:{ all -> 0x00c1 }
                boolean r6 = r4.getMax()     // Catch:{ all -> 0x00c1 }
                if (r6 == 0) goto L_0x0077
                java.lang.String r6 = "canceled "
                goto L_0x0079
            L_0x0077:
                java.lang.String r6 = ""
            L_0x0079:
                r5.append(r6)     // Catch:{ all -> 0x00c1 }
                boolean r6 = r4.getMax     // Catch:{ all -> 0x00c1 }
                if (r6 == 0) goto L_0x0083
                java.lang.String r6 = "web socket"
                goto L_0x0085
            L_0x0083:
                java.lang.String r6 = "call"
            L_0x0085:
                r5.append(r6)     // Catch:{ all -> 0x00c1 }
                java.lang.String r6 = " to "
                r5.append(r6)     // Catch:{ all -> 0x00c1 }
                java.lang.String r4 = r4.setMin()     // Catch:{ all -> 0x00c1 }
                r5.append(r4)     // Catch:{ all -> 0x00c1 }
                java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x00c1 }
                r3.append(r4)     // Catch:{ all -> 0x00c1 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00c1 }
                r0.setMax((int) r2, (java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x00c1 }
                goto L_0x00b5
            L_0x00a3:
                o.IncompleteHandshakeException r0 = o.IncompleteHandshakeException.this     // Catch:{ all -> 0x00c1 }
                o.translateSingleFrame r0 = r0.isInside     // Catch:{ all -> 0x00c1 }
                o.IncompleteHandshakeException r2 = o.IncompleteHandshakeException.this     // Catch:{ all -> 0x00c1 }
                r0.callFailed(r2, r1)     // Catch:{ all -> 0x00c1 }
                o.getRole r0 = r7.setMax     // Catch:{ all -> 0x00c1 }
                o.IncompleteHandshakeException r2 = o.IncompleteHandshakeException.this     // Catch:{ all -> 0x00c1 }
                r0.onFailure(r2, r1)     // Catch:{ all -> 0x00c1 }
            L_0x00b5:
                o.IncompleteHandshakeException r0 = o.IncompleteHandshakeException.this
                o.generateKey r0 = r0.setMin
                o.Draft_17 r0 = r0.setMin
                java.util.Deque<o.IncompleteHandshakeException$setMax> r1 = r0.getMin
                r0.getMax(r1, r7)
                return
            L_0x00c1:
                r0 = move-exception
                o.IncompleteHandshakeException r1 = o.IncompleteHandshakeException.this
                o.generateKey r1 = r1.setMin
                o.Draft_17 r1 = r1.setMin
                java.util.Deque<o.IncompleteHandshakeException$setMax> r2 = r1.getMin
                r1.getMax(r2, r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.IncompleteHandshakeException.setMax.getMin():void");
        }
    }

    /* access modifiers changed from: package-private */
    public final String setMin() {
        Draft_76.getMin length2 = this.getMin.setMin.length("/...");
        length2.setMax = Draft_76.getMin("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true, (Charset) null);
        length2.getMin = Draft_76.getMin("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true, (Charset) null);
        return length2.setMin().toString();
    }

    /* access modifiers changed from: package-private */
    public final InvalidHandshakeException isInside() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.setMin.equals);
        arrayList.add(this.setMax);
        arrayList.add(new getTransfereMasked(this.setMin.hashCode));
        generateKey generatekey = this.setMin;
        arrayList.add(new CloseFrame(generatekey.toString != null ? generatekey.toString.getMax : generatekey.FastBitmap$CoordinateSystem));
        arrayList.add(new initMessage(this.setMin));
        if (!this.getMax) {
            arrayList.addAll(this.setMin.toFloatRange);
        }
        arrayList.add(new setOptcode(this.getMax));
        InvalidHandshakeException max = new Framedata.Opcode(arrayList, (isFin) null, (getOpcode) null, (setFin) null, 0, this.getMin, this, this.isInside, this.setMin.onRelationshipValidationResult, this.setMin.extraCallback, this.setMin.onPostMessage).getMax(this.getMin);
        if (!this.setMax.length()) {
            return max;
        }
        initCloseCode.getMin((Closeable) max);
        throw new IOException("Canceled");
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        generateKey generatekey = this.setMin;
        IncompleteHandshakeException incompleteHandshakeException = new IncompleteHandshakeException(generatekey, this.getMin, this.getMax);
        incompleteHandshakeException.isInside = generatekey.IsOverlapping.setMin(incompleteHandshakeException);
        return incompleteHandshakeException;
    }
}
