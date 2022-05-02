package o;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o.addPreDrawListener;
import o.isPointInChildBounds;
import o.onNewStateAttachHandlers;
import o.setPositiveButtonIcon;

public final class setScene<R> implements DecodeJob.getMax<R>, addPreDrawListener.getMin {
    private static final length getMin = new length();
    private final access$500 FastBitmap$CoordinateSystem;
    private boolean Grayscale$Algorithm;
    private boolean ICustomTabsCallback;
    private final setPositiveButtonIcon.length<setScene<?>> IsOverlapping;
    private boolean Mean$Arithmetic;
    private boolean b;
    private DecodeJob<R> create;
    private final isPointInChildBounds equals;
    private volatile boolean getCause;
    final getMin getMax;
    private final access$500 hashCode;
    private boolean invoke;
    private boolean invokeSuspend;
    private final length isInside;
    DataSource length;
    private fireTrigger<?> onNavigationEvent;
    onNewStateAttachHandlers<?> setMax;
    GlideException setMin;
    private final AtomicInteger toDoubleRange;
    private final onNewStateAttachHandlers.length toFloatRange;
    private final getTransitionTimeMs toIntRange;
    private final access$500 toString;
    private setPivotY valueOf;
    private final access$500 values;

    setScene(access$500 access_500, access$500 access_5002, access$500 access_5003, access$500 access_5004, getTransitionTimeMs gettransitiontimems, onNewStateAttachHandlers.length length2, setPositiveButtonIcon.length<setScene<?>> length3) {
        this(access_500, access_5002, access_5003, access_5004, gettransitiontimems, length2, length3, getMin);
    }

    @VisibleForTesting
    private setScene(access$500 access_500, access$500 access_5002, access$500 access_5003, access$500 access_5004, getTransitionTimeMs gettransitiontimems, onNewStateAttachHandlers.length length2, setPositiveButtonIcon.length<setScene<?>> length3, length length4) {
        this.getMax = new getMin();
        this.equals = new isPointInChildBounds.length();
        this.toDoubleRange = new AtomicInteger();
        this.FastBitmap$CoordinateSystem = access_500;
        this.values = access_5002;
        this.toString = access_5003;
        this.hashCode = access_5004;
        this.toIntRange = gettransitiontimems;
        this.toFloatRange = length2;
        this.IsOverlapping = length3;
        this.isInside = length4;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final synchronized setScene<R> length(setPivotY setpivoty, boolean z, boolean z2, boolean z3, boolean z4) {
        this.valueOf = setpivoty;
        this.invokeSuspend = z;
        this.invoke = z2;
        this.Mean$Arithmetic = z3;
        this.Grayscale$Algorithm = z4;
        return this;
    }

    public final synchronized void getMin(DecodeJob<R> decodeJob) {
        access$500 access_500;
        this.create = decodeJob;
        if (decodeJob.length()) {
            access_500 = this.FastBitmap$CoordinateSystem;
        } else if (this.invoke) {
            access_500 = this.toString;
        } else {
            access_500 = this.Mean$Arithmetic ? this.hashCode : this.values;
        }
        access_500.execute(decodeJob);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void setMax(getDescendantRect getdescendantrect, Executor executor) {
        this.equals.setMax();
        this.getMax.getMax.add(new getMax(getdescendantrect, executor));
        boolean z = true;
        if (this.b) {
            length(1);
            executor.execute(new setMin(getdescendantrect));
        } else if (this.ICustomTabsCallback) {
            length(1);
            executor.execute(new setMax(getdescendantrect));
        } else {
            if (this.getCause) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Cannot add callbacks to a cancelled EngineJob");
            }
        }
    }

    public final synchronized void setMin(getDescendantRect getdescendantrect) {
        this.equals.setMax();
        this.getMax.getMax.remove(new getMax(getdescendantrect, clamp.setMin()));
        if (this.getMax.setMin()) {
            boolean z = true;
            if (!getMax()) {
                this.getCause = true;
                DecodeJob<R> decodeJob = this.create;
                decodeJob.Grayscale$Algorithm = true;
                getViewVelocity getviewvelocity = decodeJob.invoke;
                if (getviewvelocity != null) {
                    getviewvelocity.getMax();
                }
                this.toIntRange.length(this, this.valueOf);
            }
            if (!this.b) {
                if (!this.ICustomTabsCallback) {
                    z = false;
                }
            }
            if (z && this.toDoubleRange.get() == 0) {
                setMax();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean length() {
        return this.Grayscale$Algorithm;
    }

    private boolean getMax() {
        return this.ICustomTabsCallback || this.b || this.getCause;
    }

    private synchronized void length(int i) {
        if (!getMax()) {
            throw new IllegalArgumentException("Not yet complete!");
        } else if (this.toDoubleRange.getAndAdd(i) == 0 && this.setMax != null) {
            this.setMax.toIntRange();
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMin() {
        onNewStateAttachHandlers<?> onnewstateattachhandlers;
        synchronized (this) {
            this.equals.setMax();
            if (getMax()) {
                int decrementAndGet = this.toDoubleRange.decrementAndGet();
                if (!(decrementAndGet >= 0)) {
                    throw new IllegalArgumentException("Can't decrement below 0");
                } else if (decrementAndGet == 0) {
                    onnewstateattachhandlers = this.setMax;
                    setMax();
                } else {
                    onnewstateattachhandlers = null;
                }
            } else {
                throw new IllegalArgumentException("Not yet complete!");
            }
        }
        if (onnewstateattachhandlers != null) {
            onnewstateattachhandlers.equals();
        }
    }

    private synchronized void setMax() {
        if (this.valueOf != null) {
            this.getMax.getMax.clear();
            this.valueOf = null;
            this.setMax = null;
            this.onNavigationEvent = null;
            this.ICustomTabsCallback = false;
            this.getCause = false;
            this.b = false;
            DecodeJob<R> decodeJob = this.create;
            if (decodeJob.getMin.length()) {
                decodeJob.getMax();
            }
            this.create = null;
            this.setMin = null;
            this.length = null;
            this.IsOverlapping.getMin(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r6.toIntRange.setMin(r6, r7, r8);
        r7 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r7.hasNext() == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        r8 = r7.next();
        r8.setMax.execute(new o.setScene.setMin(r6, r8.setMin));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        getMin();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(o.fireTrigger<R> r7, com.bumptech.glide.load.DataSource r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.onNavigationEvent = r7     // Catch:{ all -> 0x0090 }
            r6.length = r8     // Catch:{ all -> 0x0090 }
            monitor-exit(r6)     // Catch:{ all -> 0x0090 }
            monitor-enter(r6)
            o.isPointInChildBounds r7 = r6.equals     // Catch:{ all -> 0x008d }
            r7.setMax()     // Catch:{ all -> 0x008d }
            boolean r7 = r6.getCause     // Catch:{ all -> 0x008d }
            if (r7 == 0) goto L_0x001a
            o.fireTrigger<?> r7 = r6.onNavigationEvent     // Catch:{ all -> 0x008d }
            r7.length()     // Catch:{ all -> 0x008d }
            r6.setMax()     // Catch:{ all -> 0x008d }
            monitor-exit(r6)     // Catch:{ all -> 0x008d }
            return
        L_0x001a:
            o.setScene$getMin r7 = r6.getMax     // Catch:{ all -> 0x008d }
            boolean r7 = r7.setMin()     // Catch:{ all -> 0x008d }
            if (r7 != 0) goto L_0x0085
            boolean r7 = r6.b     // Catch:{ all -> 0x008d }
            if (r7 != 0) goto L_0x007d
            o.fireTrigger<?> r1 = r6.onNavigationEvent     // Catch:{ all -> 0x008d }
            boolean r2 = r6.invokeSuspend     // Catch:{ all -> 0x008d }
            o.setPivotY r4 = r6.valueOf     // Catch:{ all -> 0x008d }
            o.onNewStateAttachHandlers$length r5 = r6.toFloatRange     // Catch:{ all -> 0x008d }
            o.onNewStateAttachHandlers r7 = new o.onNewStateAttachHandlers     // Catch:{ all -> 0x008d }
            r3 = 1
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x008d }
            r6.setMax = r7     // Catch:{ all -> 0x008d }
            r7 = 1
            r6.b = r7     // Catch:{ all -> 0x008d }
            o.setScene$getMin r8 = r6.getMax     // Catch:{ all -> 0x008d }
            o.setScene$getMin r0 = new o.setScene$getMin     // Catch:{ all -> 0x008d }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x008d }
            java.util.List<o.setScene$getMax> r8 = r8.getMax     // Catch:{ all -> 0x008d }
            r1.<init>(r8)     // Catch:{ all -> 0x008d }
            r0.<init>(r1)     // Catch:{ all -> 0x008d }
            java.util.List<o.setScene$getMax> r8 = r0.getMax     // Catch:{ all -> 0x008d }
            int r8 = r8.size()     // Catch:{ all -> 0x008d }
            int r8 = r8 + r7
            r6.length(r8)     // Catch:{ all -> 0x008d }
            o.setPivotY r7 = r6.valueOf     // Catch:{ all -> 0x008d }
            o.onNewStateAttachHandlers<?> r8 = r6.setMax     // Catch:{ all -> 0x008d }
            monitor-exit(r6)     // Catch:{ all -> 0x008d }
            o.getTransitionTimeMs r1 = r6.toIntRange
            r1.setMin(r6, r7, r8)
            java.util.Iterator r7 = r0.iterator()
        L_0x0060:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0079
            java.lang.Object r8 = r7.next()
            o.setScene$getMax r8 = (o.setScene.getMax) r8
            java.util.concurrent.Executor r0 = r8.setMax
            o.setScene$setMin r1 = new o.setScene$setMin
            o.getDescendantRect r8 = r8.setMin
            r1.<init>(r8)
            r0.execute(r1)
            goto L_0x0060
        L_0x0079:
            r6.getMin()
            return
        L_0x007d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008d }
            java.lang.String r8 = "Already have resource"
            r7.<init>(r8)     // Catch:{ all -> 0x008d }
            throw r7     // Catch:{ all -> 0x008d }
        L_0x0085:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008d }
            java.lang.String r8 = "Received a resource without any callbacks to notify"
            r7.<init>(r8)     // Catch:{ all -> 0x008d }
            throw r7     // Catch:{ all -> 0x008d }
        L_0x008d:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0090:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0094
        L_0x0093:
            throw r7
        L_0x0094:
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setScene.setMax(o.fireTrigger, com.bumptech.glide.load.DataSource):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r4.toIntRange.setMin(r4, r0, (o.onNewStateAttachHandlers<?>) null);
        r5 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r5.hasNext() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r0 = r5.next();
        r0.setMax.execute(new o.setScene.setMax(r4, r0.setMin));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        getMin();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(com.bumptech.glide.load.engine.GlideException r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.setMin = r5     // Catch:{ all -> 0x0077 }
            monitor-exit(r4)     // Catch:{ all -> 0x0077 }
            monitor-enter(r4)
            o.isPointInChildBounds r5 = r4.equals     // Catch:{ all -> 0x0074 }
            r5.setMax()     // Catch:{ all -> 0x0074 }
            boolean r5 = r4.getCause     // Catch:{ all -> 0x0074 }
            if (r5 == 0) goto L_0x0013
            r4.setMax()     // Catch:{ all -> 0x0074 }
            monitor-exit(r4)     // Catch:{ all -> 0x0074 }
            return
        L_0x0013:
            o.setScene$getMin r5 = r4.getMax     // Catch:{ all -> 0x0074 }
            boolean r5 = r5.setMin()     // Catch:{ all -> 0x0074 }
            if (r5 != 0) goto L_0x006c
            boolean r5 = r4.ICustomTabsCallback     // Catch:{ all -> 0x0074 }
            if (r5 != 0) goto L_0x0064
            r5 = 1
            r4.ICustomTabsCallback = r5     // Catch:{ all -> 0x0074 }
            o.setPivotY r0 = r4.valueOf     // Catch:{ all -> 0x0074 }
            o.setScene$getMin r1 = r4.getMax     // Catch:{ all -> 0x0074 }
            o.setScene$getMin r2 = new o.setScene$getMin     // Catch:{ all -> 0x0074 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0074 }
            java.util.List<o.setScene$getMax> r1 = r1.getMax     // Catch:{ all -> 0x0074 }
            r3.<init>(r1)     // Catch:{ all -> 0x0074 }
            r2.<init>(r3)     // Catch:{ all -> 0x0074 }
            java.util.List<o.setScene$getMax> r1 = r2.getMax     // Catch:{ all -> 0x0074 }
            int r1 = r1.size()     // Catch:{ all -> 0x0074 }
            int r1 = r1 + r5
            r4.length(r1)     // Catch:{ all -> 0x0074 }
            monitor-exit(r4)     // Catch:{ all -> 0x0074 }
            o.getTransitionTimeMs r5 = r4.toIntRange
            r1 = 0
            r5.setMin(r4, r0, r1)
            java.util.Iterator r5 = r2.iterator()
        L_0x0047:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r5.next()
            o.setScene$getMax r0 = (o.setScene.getMax) r0
            java.util.concurrent.Executor r1 = r0.setMax
            o.setScene$setMax r2 = new o.setScene$setMax
            o.getDescendantRect r0 = r0.setMin
            r2.<init>(r0)
            r1.execute(r2)
            goto L_0x0047
        L_0x0060:
            r4.getMin()
            return
        L_0x0064:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "Already failed once"
            r5.<init>(r0)     // Catch:{ all -> 0x0074 }
            throw r5     // Catch:{ all -> 0x0074 }
        L_0x006c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "Received an exception without any callbacks to notify"
            r5.<init>(r0)     // Catch:{ all -> 0x0074 }
            throw r5     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0077:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x007b
        L_0x007a:
            throw r5
        L_0x007b:
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setScene.setMin(com.bumptech.glide.load.engine.GlideException):void");
    }

    @NonNull
    public final isPointInChildBounds j_() {
        return this.equals;
    }

    class setMax implements Runnable {
        private final getDescendantRect setMax;

        setMax(getDescendantRect getdescendantrect) {
            this.setMax = getdescendantrect;
        }

        public final void run() {
            synchronized (this.setMax.isInside()) {
                synchronized (setScene.this) {
                    if (setScene.this.getMax.setMax(this.setMax)) {
                        setScene setscene = setScene.this;
                        try {
                            this.setMax.setMax(setscene.setMin);
                        } catch (Throwable th) {
                            throw new transitionToState(th);
                        }
                    }
                    setScene.this.getMin();
                }
            }
        }
    }

    class setMin implements Runnable {
        private final getDescendantRect setMax;

        setMin(getDescendantRect getdescendantrect) {
            this.setMax = getdescendantrect;
        }

        public final void run() {
            synchronized (this.setMax.isInside()) {
                synchronized (setScene.this) {
                    if (setScene.this.getMax.setMax(this.setMax)) {
                        setScene.this.setMax.toIntRange();
                        setScene setscene = setScene.this;
                        try {
                            this.setMax.length(setscene.setMax, setscene.length);
                            setScene.this.setMin(this.setMax);
                        } catch (Throwable th) {
                            throw new transitionToState(th);
                        }
                    }
                    setScene.this.getMin();
                }
            }
        }
    }

    static final class getMin implements Iterable<getMax> {
        final List<getMax> getMax;

        getMin() {
            this(new ArrayList(2));
        }

        getMin(List<getMax> list) {
            this.getMax = list;
        }

        /* access modifiers changed from: package-private */
        public final boolean setMax(getDescendantRect getdescendantrect) {
            return this.getMax.contains(new getMax(getdescendantrect, clamp.setMin()));
        }

        /* access modifiers changed from: package-private */
        public final boolean setMin() {
            return this.getMax.isEmpty();
        }

        @NonNull
        public final Iterator<getMax> iterator() {
            return this.getMax.iterator();
        }
    }

    static final class getMax {
        final Executor setMax;
        final getDescendantRect setMin;

        getMax(getDescendantRect getdescendantrect, Executor executor) {
            this.setMin = getdescendantrect;
            this.setMax = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof getMax) {
                return this.setMin.equals(((getMax) obj).setMin);
            }
            return false;
        }

        public final int hashCode() {
            return this.setMin.hashCode();
        }
    }

    @VisibleForTesting
    static class length {
        length() {
        }
    }

    public final void setMin(DecodeJob<?> decodeJob) {
        access$500 access_500;
        if (this.invoke) {
            access_500 = this.toString;
        } else {
            access_500 = this.Mean$Arithmetic ? this.hashCode : this.values;
        }
        access_500.execute(decodeJob);
    }
}
