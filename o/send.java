package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class send<V> implements ListenableFuture<V> {
    private static final Logger IsOverlapping;
    static final getMin getMax;
    private static final Object isInside = new Object();
    static final boolean setMin = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    @Nullable
    volatile IsOverlapping getMin;
    @Nullable
    volatile length length;
    @Nullable
    volatile Object setMax;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: o.send$getMax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: o.send$equals} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: o.send$getMax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: o.send$getMax} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "getMin"
            java.lang.String r1 = "length"
            java.lang.Class<o.send> r2 = o.send.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            setMin = r3
            java.lang.String r3 = r2.getName()
            java.util.logging.Logger r3 = java.util.logging.Logger.getLogger(r3)
            IsOverlapping = r3
            o.send$getMax r3 = new o.send$getMax     // Catch:{ all -> 0x004a }
            java.lang.Class<o.send$IsOverlapping> r4 = o.send.IsOverlapping.class
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r4, r5, r1)     // Catch:{ all -> 0x004a }
            java.lang.Class<o.send$IsOverlapping> r4 = o.send.IsOverlapping.class
            java.lang.Class<o.send$IsOverlapping> r6 = o.send.IsOverlapping.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r4, r6, r0)     // Catch:{ all -> 0x004a }
            java.lang.Class<o.send$IsOverlapping> r4 = o.send.IsOverlapping.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r4, r0)     // Catch:{ all -> 0x004a }
            java.lang.Class<o.send$length> r0 = o.send.length.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)     // Catch:{ all -> 0x004a }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "setMax"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)     // Catch:{ all -> 0x004a }
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x004a }
            r0 = 0
            goto L_0x0050
        L_0x004a:
            r0 = move-exception
            o.send$equals r3 = new o.send$equals
            r3.<init>()
        L_0x0050:
            getMax = r3
            if (r0 == 0) goto L_0x005d
            java.util.logging.Logger r1 = IsOverlapping
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005d:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            isInside = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.send.<clinit>():void");
    }

    static final class IsOverlapping {
        static final IsOverlapping getMax = new IsOverlapping((byte) 0);
        @Nullable
        volatile IsOverlapping getMin;
        @Nullable
        volatile Thread length;

        private IsOverlapping(byte b) {
        }

        IsOverlapping() {
            send.getMax.setMin(this, Thread.currentThread());
        }
    }

    private void getMax(IsOverlapping isOverlapping) {
        isOverlapping.length = null;
        while (true) {
            IsOverlapping isOverlapping2 = this.getMin;
            if (isOverlapping2 != IsOverlapping.getMax) {
                IsOverlapping isOverlapping3 = null;
                while (isOverlapping2 != null) {
                    IsOverlapping isOverlapping4 = isOverlapping2.getMin;
                    if (isOverlapping2.length != null) {
                        isOverlapping3 = isOverlapping2;
                    } else if (isOverlapping3 != null) {
                        isOverlapping3.getMin = isOverlapping4;
                        if (isOverlapping3.length == null) {
                        }
                    } else if (getMax.length(this, isOverlapping2, isOverlapping4)) {
                    }
                    isOverlapping2 = isOverlapping4;
                }
                return;
            }
            return;
        }
    }

    static final class length {
        static final length setMin = new length((Runnable) null, (Executor) null);
        @Nullable
        length getMax;
        final Runnable length;
        final Executor setMax;

        length(Runnable runnable, Executor executor) {
            this.length = runnable;
            this.setMax = executor;
        }
    }

    static final class setMax {
        static final setMax getMin = new setMax(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable getMax;

        setMax(Throwable th) {
            this.getMax = (Throwable) send.getMax(th);
        }
    }

    static final class setMin {
        static final setMin getMax;
        static final setMin setMin;
        @Nullable
        final Throwable length;
        final boolean setMax;

        static {
            if (send.setMin) {
                setMin = null;
                getMax = null;
                return;
            }
            setMin = new setMin(false, (Throwable) null);
            getMax = new setMin(true, (Throwable) null);
        }

        setMin(boolean z, @Nullable Throwable th) {
            this.setMax = z;
            this.length = th;
        }
    }

    static final class toIntRange<V> implements Runnable {
        final send<V> getMax;
        final ListenableFuture<? extends V> setMin;

        public final void run() {
            if (this.getMax.setMax == this) {
                if (send.getMax.getMax((send<?>) this.getMax, (Object) this, send.getMin((ListenableFuture<?>) this.setMin))) {
                    send.getMax((send<?>) this.getMax);
                }
            }
        }
    }

    protected send() {
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.setMax;
            if ((obj != null) && (!(obj instanceof toIntRange))) {
                return setMax(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                IsOverlapping isOverlapping = this.getMin;
                if (isOverlapping != IsOverlapping.getMax) {
                    IsOverlapping isOverlapping2 = new IsOverlapping();
                    do {
                        getMax.getMax(isOverlapping2, isOverlapping);
                        if (getMax.length(this, isOverlapping, isOverlapping2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.setMax;
                                    if ((obj2 != null) && (!(obj2 instanceof toIntRange))) {
                                        return setMax(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    getMax(isOverlapping2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            getMax(isOverlapping2);
                        } else {
                            isOverlapping = this.getMin;
                        }
                    } while (isOverlapping != IsOverlapping.getMax);
                }
                return setMax(this.setMax);
            }
            while (nanos > 0) {
                Object obj3 = this.setMax;
                if ((obj3 != null) && (!(obj3 instanceof toIntRange))) {
                    return setMax(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String obj4 = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
            String obj5 = sb.toString();
            if (nanos + 1000 < 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj5);
                sb2.append(" (plus ");
                String obj6 = sb2.toString();
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                boolean z = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj6);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String obj7 = sb3.toString();
                    if (z) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(obj7);
                        sb4.append(",");
                        obj7 = sb4.toString();
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(obj7);
                    sb5.append(" ");
                    obj6 = sb5.toString();
                }
                if (z) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj6);
                    sb6.append(nanos2);
                    sb6.append(" nanoseconds ");
                    obj6 = sb6.toString();
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(obj6);
                sb7.append("delay)");
                obj5 = sb7.toString();
            }
            if (isDone()) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(obj5);
                sb8.append(" but future completed as timeout expired");
                throw new TimeoutException(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append(obj5);
            sb9.append(" for ");
            sb9.append(obj4);
            throw new TimeoutException(sb9.toString());
        }
        throw new InterruptedException();
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.setMax;
            if ((obj2 != null) && (!(obj2 instanceof toIntRange))) {
                return setMax(obj2);
            }
            IsOverlapping isOverlapping = this.getMin;
            if (isOverlapping != IsOverlapping.getMax) {
                IsOverlapping isOverlapping2 = new IsOverlapping();
                do {
                    getMax.getMax(isOverlapping2, isOverlapping);
                    if (getMax.length(this, isOverlapping, isOverlapping2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.setMax;
                            } else {
                                getMax(isOverlapping2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof toIntRange))));
                        return setMax(obj);
                    }
                    isOverlapping = this.getMin;
                } while (isOverlapping != IsOverlapping.getMax);
            }
            return setMax(this.setMax);
        }
        throw new InterruptedException();
    }

    private static V setMax(Object obj) throws ExecutionException {
        if (obj instanceof setMin) {
            Throwable th = ((setMin) obj).length;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof setMax) {
            throw new ExecutionException(((setMax) obj).getMax);
        } else if (obj == isInside) {
            return null;
        } else {
            return obj;
        }
    }

    public final boolean isDone() {
        Object obj = this.setMax;
        return (!(obj instanceof toIntRange)) & (obj != null);
    }

    public final boolean isCancelled() {
        return this.setMax instanceof setMin;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.ListenableFuture<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.setMax
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof o.send.toIntRange
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005d
            boolean r3 = setMin
            if (r3 == 0) goto L_0x001f
            o.send$setMin r3 = new o.send$setMin
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            o.send$setMin r3 = o.send.setMin.getMax
            goto L_0x0026
        L_0x0024:
            o.send$setMin r3 = o.send.setMin.setMin
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            o.send$getMin r6 = getMax
            boolean r6 = r6.getMax((o.send<?>) r4, (java.lang.Object) r0, (java.lang.Object) r3)
            if (r6 == 0) goto L_0x0055
            getMax((o.send<?>) r4)
            boolean r4 = r0 instanceof o.send.toIntRange
            if (r4 == 0) goto L_0x005e
            o.send$toIntRange r0 = (o.send.toIntRange) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.setMin
            boolean r4 = r0 instanceof o.send
            if (r4 == 0) goto L_0x0051
            r4 = r0
            o.send r4 = (o.send) r4
            java.lang.Object r0 = r4.setMax
            if (r0 != 0) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            boolean r6 = r0 instanceof o.send.toIntRange
            r5 = r5 | r6
            if (r5 != 0) goto L_0x004f
            goto L_0x005e
        L_0x004f:
            r5 = 1
            goto L_0x0028
        L_0x0051:
            r0.cancel(r8)
            goto L_0x005e
        L_0x0055:
            java.lang.Object r0 = r4.setMax
            boolean r6 = r0 instanceof o.send.toIntRange
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.send.cancel(boolean):boolean");
    }

    public final void addListener(Runnable runnable, Executor executor) {
        if (runnable == null) {
            throw null;
        } else if (executor != null) {
            length length2 = this.length;
            if (length2 != length.setMin) {
                length length3 = new length(runnable, executor);
                do {
                    length3.getMax = length2;
                    if (!getMax.getMax((send<?>) this, length2, length3)) {
                        length2 = this.length;
                    } else {
                        return;
                    }
                } while (length2 != length.setMin);
            }
            setMin(runnable, executor);
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public boolean setMin(@Nullable V v) {
        if (v == null) {
            v = isInside;
        }
        if (!getMax.getMax((send<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        getMax((send<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean getMax(Throwable th) {
        if (th != null) {
            if (!getMax.getMax((send<?>) this, (Object) null, (Object) new setMax(th))) {
                return false;
            }
            getMax((send<?>) this);
            return true;
        }
        throw null;
    }

    static Object getMin(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof send) {
            Object obj = ((send) listenableFuture).setMax;
            if (!(obj instanceof setMin)) {
                return obj;
            }
            setMin setmin = (setMin) obj;
            if (setmin.setMax) {
                return setmin.length != null ? new setMin(false, setmin.length) : setMin.setMin;
            }
            return obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!setMin) && isCancelled) {
            return setMin.setMin;
        }
        try {
            Object min = setMin(listenableFuture);
            if (min == null) {
                return isInside;
            }
            return min;
        } catch (ExecutionException e) {
            return new setMax(e.getCause());
        } catch (CancellationException e2) {
            if (!isCancelled) {
                return new setMax(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2));
            }
            return new setMin(false, e2);
        } catch (Throwable th) {
            return new setMax(th);
        }
    }

    private static <V> V setMin(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    static void getMax(send<?> send) {
        length length2 = null;
        send<V> send2 = send;
        while (true) {
            send2.getMin();
            length length3 = send2.length(length2);
            while (true) {
                if (length3 != null) {
                    length2 = length3.getMax;
                    Runnable runnable = length3.length;
                    if (runnable instanceof toIntRange) {
                        toIntRange tointrange = (toIntRange) runnable;
                        send<V> send3 = tointrange.getMax;
                        if (send3.setMax == tointrange) {
                            if (getMax.getMax((send<?>) send3, (Object) tointrange, getMin((ListenableFuture<?>) tointrange.setMin))) {
                                send2 = send3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        setMin(runnable, length3.setMax);
                    }
                    length3 = length2;
                } else {
                    return;
                }
            }
        }
    }

    private void getMin() {
        IsOverlapping isOverlapping;
        do {
            isOverlapping = this.getMin;
        } while (!getMax.length(this, isOverlapping, IsOverlapping.getMax));
        while (isOverlapping != null) {
            Thread thread = isOverlapping.length;
            if (thread != null) {
                isOverlapping.length = null;
                LockSupport.unpark(thread);
            }
            isOverlapping = isOverlapping.getMin;
        }
    }

    private length length(length length2) {
        length length3;
        do {
            length3 = this.length;
        } while (!getMax.getMax((send<?>) this, length3, length.setMin));
        length length4 = length3;
        length length5 = length2;
        length length6 = length4;
        while (length6 != null) {
            length length7 = length6.getMax;
            length6.getMax = length5;
            length5 = length6;
            length6 = length7;
        }
        return length5;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            getMin(sb);
        } else {
            try {
                Object obj = this.setMax;
                if (obj instanceof toIntRange) {
                    StringBuilder sb2 = new StringBuilder("setFuture=[");
                    ListenableFuture<? extends V> listenableFuture = ((toIntRange) obj).setMin;
                    sb2.append(listenableFuture == this ? "this future" : String.valueOf(listenableFuture));
                    sb2.append("]");
                    str = sb2.toString();
                } else if (this instanceof ScheduledFuture) {
                    StringBuilder sb3 = new StringBuilder("remaining delay=[");
                    sb3.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
                    sb3.append(" ms]");
                    str = sb3.toString();
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                StringBuilder sb4 = new StringBuilder("Exception thrown from implementation: ");
                sb4.append(e.getClass());
                str = sb4.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                getMin(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void getMin(StringBuilder sb) {
        try {
            Object min = setMin(this);
            sb.append("SUCCESS, result=[");
            sb.append(min == this ? "this future" : String.valueOf(min));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void setMin(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = IsOverlapping;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }

    static abstract class getMin {
        /* access modifiers changed from: package-private */
        public abstract void getMax(IsOverlapping isOverlapping, IsOverlapping isOverlapping2);

        /* access modifiers changed from: package-private */
        public abstract boolean getMax(send<?> send, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean getMax(send<?> send, length length, length length2);

        /* access modifiers changed from: package-private */
        public abstract boolean length(send<?> send, IsOverlapping isOverlapping, IsOverlapping isOverlapping2);

        /* access modifiers changed from: package-private */
        public abstract void setMin(IsOverlapping isOverlapping, Thread thread);

        private getMin() {
        }

        /* synthetic */ getMin(byte b) {
            this();
        }
    }

    static final class getMax extends getMin {
        final AtomicReferenceFieldUpdater<send, Object> getMax;
        final AtomicReferenceFieldUpdater<IsOverlapping, IsOverlapping> getMin;
        final AtomicReferenceFieldUpdater<send, IsOverlapping> length;
        final AtomicReferenceFieldUpdater<IsOverlapping, Thread> setMax;
        final AtomicReferenceFieldUpdater<send, length> setMin;

        getMax(AtomicReferenceFieldUpdater<IsOverlapping, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<IsOverlapping, IsOverlapping> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<send, IsOverlapping> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<send, length> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<send, Object> atomicReferenceFieldUpdater5) {
            super((byte) 0);
            this.setMax = atomicReferenceFieldUpdater;
            this.getMin = atomicReferenceFieldUpdater2;
            this.length = atomicReferenceFieldUpdater3;
            this.setMin = atomicReferenceFieldUpdater4;
            this.getMax = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public final void setMin(IsOverlapping isOverlapping, Thread thread) {
            this.setMax.lazySet(isOverlapping, thread);
        }

        /* access modifiers changed from: package-private */
        public final void getMax(IsOverlapping isOverlapping, IsOverlapping isOverlapping2) {
            this.getMin.lazySet(isOverlapping, isOverlapping2);
        }

        /* access modifiers changed from: package-private */
        public final boolean length(send<?> send, IsOverlapping isOverlapping, IsOverlapping isOverlapping2) {
            return this.length.compareAndSet(send, isOverlapping, isOverlapping2);
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(send<?> send, length length2, length length3) {
            return this.setMin.compareAndSet(send, length2, length3);
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(send<?> send, Object obj, Object obj2) {
            return this.getMax.compareAndSet(send, obj, obj2);
        }
    }

    static final class equals extends getMin {
        equals() {
            super((byte) 0);
        }

        /* access modifiers changed from: package-private */
        public final void setMin(IsOverlapping isOverlapping, Thread thread) {
            isOverlapping.length = thread;
        }

        /* access modifiers changed from: package-private */
        public final void getMax(IsOverlapping isOverlapping, IsOverlapping isOverlapping2) {
            isOverlapping.getMin = isOverlapping2;
        }

        /* access modifiers changed from: package-private */
        public final boolean length(send<?> send, IsOverlapping isOverlapping, IsOverlapping isOverlapping2) {
            synchronized (send) {
                if (send.getMin != isOverlapping) {
                    return false;
                }
                send.getMin = isOverlapping2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(send<?> send, length length, length length2) {
            synchronized (send) {
                if (send.length != length) {
                    return false;
                }
                send.length = length2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(send<?> send, Object obj, Object obj2) {
            synchronized (send) {
                if (send.setMax != obj) {
                    return false;
                }
                send.setMax = obj2;
                return true;
            }
        }
    }

    @NonNull
    static <T> T getMax(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }
}
