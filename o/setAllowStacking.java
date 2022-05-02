package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.futures.DirectExecutor;
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

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class setAllowStacking<V> implements ListenableFuture<V> {
    private static final Object equals = new Object();
    private static final Logger isInside;
    static final getMin length;
    static final boolean setMin = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    @Nullable
    volatile Object getMax;
    @Nullable
    volatile getMax getMin;
    @Nullable
    volatile IsOverlapping setMax;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: o.setAllowStacking$length} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: o.setAllowStacking$isInside} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: o.setAllowStacking$length} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: o.setAllowStacking$length} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "setMax"
            java.lang.String r1 = "getMax"
            java.lang.Class<o.setAllowStacking> r2 = o.setAllowStacking.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            setMin = r3
            java.lang.String r3 = r2.getName()
            java.util.logging.Logger r3 = java.util.logging.Logger.getLogger(r3)
            isInside = r3
            o.setAllowStacking$length r3 = new o.setAllowStacking$length     // Catch:{ all -> 0x004a }
            java.lang.Class<o.setAllowStacking$IsOverlapping> r4 = o.setAllowStacking.IsOverlapping.class
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r4, r5, r1)     // Catch:{ all -> 0x004a }
            java.lang.Class<o.setAllowStacking$IsOverlapping> r4 = o.setAllowStacking.IsOverlapping.class
            java.lang.Class<o.setAllowStacking$IsOverlapping> r6 = o.setAllowStacking.IsOverlapping.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r4, r6, r0)     // Catch:{ all -> 0x004a }
            java.lang.Class<o.setAllowStacking$IsOverlapping> r4 = o.setAllowStacking.IsOverlapping.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r4, r0)     // Catch:{ all -> 0x004a }
            java.lang.Class<o.setAllowStacking$getMax> r0 = o.setAllowStacking.getMax.class
            java.lang.String r4 = "getMin"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r4)     // Catch:{ all -> 0x004a }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)     // Catch:{ all -> 0x004a }
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x004a }
            r0 = 0
            goto L_0x0050
        L_0x004a:
            r0 = move-exception
            o.setAllowStacking$isInside r3 = new o.setAllowStacking$isInside
            r3.<init>()
        L_0x0050:
            length = r3
            if (r0 == 0) goto L_0x005d
            java.util.logging.Logger r1 = isInside
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005d:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            equals = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAllowStacking.<clinit>():void");
    }

    static final class IsOverlapping {
        static final IsOverlapping setMin = new IsOverlapping((byte) 0);
        @Nullable
        volatile Thread getMax;
        @Nullable
        volatile IsOverlapping setMax;

        private IsOverlapping(byte b) {
        }

        IsOverlapping() {
            setAllowStacking.length.getMax(this, Thread.currentThread());
        }
    }

    private void getMax(IsOverlapping isOverlapping) {
        isOverlapping.getMax = null;
        while (true) {
            IsOverlapping isOverlapping2 = this.setMax;
            if (isOverlapping2 != IsOverlapping.setMin) {
                IsOverlapping isOverlapping3 = null;
                while (isOverlapping2 != null) {
                    IsOverlapping isOverlapping4 = isOverlapping2.setMax;
                    if (isOverlapping2.getMax != null) {
                        isOverlapping3 = isOverlapping2;
                    } else if (isOverlapping3 != null) {
                        isOverlapping3.setMax = isOverlapping4;
                        if (isOverlapping3.getMax == null) {
                        }
                    } else if (length.getMax((setAllowStacking<?>) this, isOverlapping2, isOverlapping4)) {
                    }
                    isOverlapping2 = isOverlapping4;
                }
                return;
            }
            return;
        }
    }

    static final class getMax {
        static final getMax setMax = new getMax((Runnable) null, (Executor) null);
        final Executor getMax;
        @Nullable
        getMax length;
        final Runnable setMin;

        getMax(Runnable runnable, Executor executor) {
            this.setMin = runnable;
            this.getMax = executor;
        }
    }

    static final class setMax {
        static final setMax setMax = new setMax(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable length;

        setMax(Throwable th) {
            this.length = (Throwable) setAllowStacking.length(th);
        }
    }

    static final class setMin {
        static final setMin getMin;
        static final setMin length;
        @Nullable
        final Throwable getMax;
        final boolean setMin;

        static {
            if (setAllowStacking.setMin) {
                getMin = null;
                length = null;
                return;
            }
            getMin = new setMin(false, (Throwable) null);
            length = new setMin(true, (Throwable) null);
        }

        setMin(boolean z, @Nullable Throwable th) {
            this.setMin = z;
            this.getMax = th;
        }
    }

    static final class toFloatRange<V> implements Runnable {
        final ListenableFuture<? extends V> getMax;
        final setAllowStacking<V> setMax;

        toFloatRange(setAllowStacking<V> setallowstacking, ListenableFuture<? extends V> listenableFuture) {
            this.setMax = setallowstacking;
            this.getMax = listenableFuture;
        }

        public final void run() {
            if (this.setMax.getMax == this) {
                if (setAllowStacking.length.length(this.setMax, this, setAllowStacking.length((ListenableFuture<?>) this.getMax))) {
                    setAllowStacking.getMin((setAllowStacking<?>) this.setMax);
                }
            }
        }
    }

    protected setAllowStacking() {
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.getMax;
            if ((obj != null) && (!(obj instanceof toFloatRange))) {
                return setMax(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                IsOverlapping isOverlapping = this.setMax;
                if (isOverlapping != IsOverlapping.setMin) {
                    IsOverlapping isOverlapping2 = new IsOverlapping();
                    do {
                        length.setMin(isOverlapping2, isOverlapping);
                        if (length.getMax((setAllowStacking<?>) this, isOverlapping, isOverlapping2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.getMax;
                                    if ((obj2 != null) && (!(obj2 instanceof toFloatRange))) {
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
                            isOverlapping = this.setMax;
                        }
                    } while (isOverlapping != IsOverlapping.setMin);
                }
                return setMax(this.getMax);
            }
            while (nanos > 0) {
                Object obj3 = this.getMax;
                if ((obj3 != null) && (!(obj3 instanceof toFloatRange))) {
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
            Object obj2 = this.getMax;
            if ((obj2 != null) && (!(obj2 instanceof toFloatRange))) {
                return setMax(obj2);
            }
            IsOverlapping isOverlapping = this.setMax;
            if (isOverlapping != IsOverlapping.setMin) {
                IsOverlapping isOverlapping2 = new IsOverlapping();
                do {
                    length.setMin(isOverlapping2, isOverlapping);
                    if (length.getMax((setAllowStacking<?>) this, isOverlapping, isOverlapping2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.getMax;
                            } else {
                                getMax(isOverlapping2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof toFloatRange))));
                        return setMax(obj);
                    }
                    isOverlapping = this.setMax;
                } while (isOverlapping != IsOverlapping.setMin);
            }
            return setMax(this.getMax);
        }
        throw new InterruptedException();
    }

    private static V setMax(Object obj) throws ExecutionException {
        if (obj instanceof setMin) {
            Throwable th = ((setMin) obj).getMax;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof setMax) {
            throw new ExecutionException(((setMax) obj).length);
        } else if (obj == equals) {
            return null;
        } else {
            return obj;
        }
    }

    public final boolean isDone() {
        Object obj = this.getMax;
        return (!(obj instanceof toFloatRange)) & (obj != null);
    }

    public final boolean isCancelled() {
        return this.getMax instanceof setMin;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.ListenableFuture<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.getMax
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof o.setAllowStacking.toFloatRange
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005d
            boolean r3 = setMin
            if (r3 == 0) goto L_0x001f
            o.setAllowStacking$setMin r3 = new o.setAllowStacking$setMin
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            o.setAllowStacking$setMin r3 = o.setAllowStacking.setMin.length
            goto L_0x0026
        L_0x0024:
            o.setAllowStacking$setMin r3 = o.setAllowStacking.setMin.getMin
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            o.setAllowStacking$getMin r6 = length
            boolean r6 = r6.length(r4, r0, r3)
            if (r6 == 0) goto L_0x0055
            getMin((o.setAllowStacking<?>) r4)
            boolean r4 = r0 instanceof o.setAllowStacking.toFloatRange
            if (r4 == 0) goto L_0x005e
            o.setAllowStacking$toFloatRange r0 = (o.setAllowStacking.toFloatRange) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.getMax
            boolean r4 = r0 instanceof o.setAllowStacking
            if (r4 == 0) goto L_0x0051
            r4 = r0
            o.setAllowStacking r4 = (o.setAllowStacking) r4
            java.lang.Object r0 = r4.getMax
            if (r0 != 0) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            boolean r6 = r0 instanceof o.setAllowStacking.toFloatRange
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
            java.lang.Object r0 = r4.getMax
            boolean r6 = r0 instanceof o.setAllowStacking.toFloatRange
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAllowStacking.cancel(boolean):boolean");
    }

    public final void addListener(Runnable runnable, Executor executor) {
        if (runnable == null) {
            throw null;
        } else if (executor != null) {
            getMax getmax = this.getMin;
            if (getmax != getMax.setMax) {
                getMax getmax2 = new getMax(runnable, executor);
                do {
                    getmax2.length = getmax;
                    if (!length.getMax((setAllowStacking<?>) this, getmax, getmax2)) {
                        getmax = this.getMin;
                    } else {
                        return;
                    }
                } while (getmax != getMax.setMax);
            }
            getMax(runnable, executor);
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public boolean getMax(@Nullable V v) {
        if (v == null) {
            v = equals;
        }
        if (!length.length(this, (Object) null, v)) {
            return false;
        }
        getMin((setAllowStacking<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean getMin(Throwable th) {
        if (th != null) {
            if (!length.length(this, (Object) null, new setMax(th))) {
                return false;
            }
            getMin((setAllowStacking<?>) this);
            return true;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public boolean getMax(ListenableFuture<? extends V> listenableFuture) {
        toFloatRange tofloatrange;
        setMax setmax;
        if (listenableFuture != null) {
            Object obj = this.getMax;
            if (obj == null) {
                if (listenableFuture.isDone()) {
                    if (!length.length(this, (Object) null, length((ListenableFuture<?>) listenableFuture))) {
                        return false;
                    }
                    getMin((setAllowStacking<?>) this);
                    return true;
                }
                tofloatrange = new toFloatRange(this, listenableFuture);
                if (length.length(this, (Object) null, tofloatrange)) {
                    try {
                        listenableFuture.addListener(tofloatrange, DirectExecutor.INSTANCE);
                    } catch (Throwable unused) {
                        setmax = setMax.setMax;
                    }
                    return true;
                }
                obj = this.getMax;
            }
            if (obj instanceof setMin) {
                listenableFuture.cancel(((setMin) obj).setMin);
            }
            return false;
        }
        throw null;
        length.length(this, tofloatrange, setmax);
        return true;
    }

    static Object length(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof setAllowStacking) {
            Object obj = ((setAllowStacking) listenableFuture).getMax;
            if (!(obj instanceof setMin)) {
                return obj;
            }
            setMin setmin = (setMin) obj;
            if (!setmin.setMin) {
                return obj;
            }
            if (setmin.getMax != null) {
                return new setMin(false, setmin.getMax);
            }
            return setMin.getMin;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!setMin) && isCancelled) {
            return setMin.getMin;
        }
        try {
            Object length2 = length(listenableFuture);
            if (length2 == null) {
                return equals;
            }
            return length2;
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

    private static <V> V length(Future<V> future) throws ExecutionException {
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

    static void getMin(setAllowStacking<?> setallowstacking) {
        getMax getmax = null;
        setAllowStacking<V> setallowstacking2 = setallowstacking;
        while (true) {
            setallowstacking2.getMin();
            getMax length2 = setallowstacking2.length(getmax);
            while (true) {
                if (length2 != null) {
                    getmax = length2.length;
                    Runnable runnable = length2.setMin;
                    if (runnable instanceof toFloatRange) {
                        toFloatRange tofloatrange = (toFloatRange) runnable;
                        setAllowStacking<V> setallowstacking3 = tofloatrange.setMax;
                        if (setallowstacking3.getMax == tofloatrange) {
                            if (length.length(setallowstacking3, tofloatrange, length((ListenableFuture<?>) tofloatrange.getMax))) {
                                setallowstacking2 = setallowstacking3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        getMax(runnable, length2.getMax);
                    }
                    length2 = getmax;
                } else {
                    return;
                }
            }
        }
    }

    private void getMin() {
        IsOverlapping isOverlapping;
        do {
            isOverlapping = this.setMax;
        } while (!length.getMax((setAllowStacking<?>) this, isOverlapping, IsOverlapping.setMin));
        while (isOverlapping != null) {
            Thread thread = isOverlapping.getMax;
            if (thread != null) {
                isOverlapping.getMax = null;
                LockSupport.unpark(thread);
            }
            isOverlapping = isOverlapping.setMax;
        }
    }

    private getMax length(getMax getmax) {
        getMax getmax2;
        do {
            getmax2 = this.getMin;
        } while (!length.getMax((setAllowStacking<?>) this, getmax2, getMax.setMax));
        getMax getmax3 = getmax2;
        getMax getmax4 = getmax;
        getMax getmax5 = getmax3;
        while (getmax5 != null) {
            getMax getmax6 = getmax5.length;
            getmax5.length = getmax4;
            getmax4 = getmax5;
            getmax5 = getmax6;
        }
        return getmax4;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            length(sb);
        } else {
            try {
                Object obj = this.getMax;
                if (obj instanceof toFloatRange) {
                    StringBuilder sb2 = new StringBuilder("setFuture=[");
                    ListenableFuture<? extends V> listenableFuture = ((toFloatRange) obj).getMax;
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
                length(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void length(StringBuilder sb) {
        try {
            Object length2 = length(this);
            sb.append("SUCCESS, result=[");
            sb.append(length2 == this ? "this future" : String.valueOf(length2));
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

    private static void getMax(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = isInside;
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
        public abstract void getMax(IsOverlapping isOverlapping, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean getMax(setAllowStacking<?> setallowstacking, IsOverlapping isOverlapping, IsOverlapping isOverlapping2);

        /* access modifiers changed from: package-private */
        public abstract boolean getMax(setAllowStacking<?> setallowstacking, getMax getmax, getMax getmax2);

        /* access modifiers changed from: package-private */
        public abstract boolean length(setAllowStacking<?> setallowstacking, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract void setMin(IsOverlapping isOverlapping, IsOverlapping isOverlapping2);

        private getMin() {
        }

        /* synthetic */ getMin(byte b) {
            this();
        }
    }

    static final class length extends getMin {
        final AtomicReferenceFieldUpdater<setAllowStacking, Object> getMax;
        final AtomicReferenceFieldUpdater<IsOverlapping, Thread> getMin;
        final AtomicReferenceFieldUpdater<setAllowStacking, IsOverlapping> length;
        final AtomicReferenceFieldUpdater<setAllowStacking, getMax> setMax;
        final AtomicReferenceFieldUpdater<IsOverlapping, IsOverlapping> setMin;

        length(AtomicReferenceFieldUpdater<IsOverlapping, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<IsOverlapping, IsOverlapping> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<setAllowStacking, IsOverlapping> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<setAllowStacking, getMax> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<setAllowStacking, Object> atomicReferenceFieldUpdater5) {
            super((byte) 0);
            this.getMin = atomicReferenceFieldUpdater;
            this.setMin = atomicReferenceFieldUpdater2;
            this.length = atomicReferenceFieldUpdater3;
            this.setMax = atomicReferenceFieldUpdater4;
            this.getMax = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public final void getMax(IsOverlapping isOverlapping, Thread thread) {
            this.getMin.lazySet(isOverlapping, thread);
        }

        /* access modifiers changed from: package-private */
        public final void setMin(IsOverlapping isOverlapping, IsOverlapping isOverlapping2) {
            this.setMin.lazySet(isOverlapping, isOverlapping2);
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(setAllowStacking<?> setallowstacking, IsOverlapping isOverlapping, IsOverlapping isOverlapping2) {
            return this.length.compareAndSet(setallowstacking, isOverlapping, isOverlapping2);
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(setAllowStacking<?> setallowstacking, getMax getmax, getMax getmax2) {
            return this.setMax.compareAndSet(setallowstacking, getmax, getmax2);
        }

        /* access modifiers changed from: package-private */
        public final boolean length(setAllowStacking<?> setallowstacking, Object obj, Object obj2) {
            return this.getMax.compareAndSet(setallowstacking, obj, obj2);
        }
    }

    static final class isInside extends getMin {
        isInside() {
            super((byte) 0);
        }

        /* access modifiers changed from: package-private */
        public final void getMax(IsOverlapping isOverlapping, Thread thread) {
            isOverlapping.getMax = thread;
        }

        /* access modifiers changed from: package-private */
        public final void setMin(IsOverlapping isOverlapping, IsOverlapping isOverlapping2) {
            isOverlapping.setMax = isOverlapping2;
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(setAllowStacking<?> setallowstacking, IsOverlapping isOverlapping, IsOverlapping isOverlapping2) {
            synchronized (setallowstacking) {
                if (setallowstacking.setMax != isOverlapping) {
                    return false;
                }
                setallowstacking.setMax = isOverlapping2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(setAllowStacking<?> setallowstacking, getMax getmax, getMax getmax2) {
            synchronized (setallowstacking) {
                if (setallowstacking.getMin != getmax) {
                    return false;
                }
                setallowstacking.getMin = getmax2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean length(setAllowStacking<?> setallowstacking, Object obj, Object obj2) {
            synchronized (setallowstacking) {
                if (setallowstacking.getMax != obj) {
                    return false;
                }
                setallowstacking.getMax = obj2;
                return true;
            }
        }
    }

    @NonNull
    static <T> T length(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }
}
