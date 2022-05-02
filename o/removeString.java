package o;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.GriverProgressBar;
import o.pluginName;

public final class removeString<T> extends getStaticDataEncryptComp<T> {
    private static final Object[] IsOverlapping = new Object[0];
    static final setMax[] length = new setMax[0];
    static final setMax[] setMax = new setMax[0];
    final AtomicReference<Throwable> equals;
    public final AtomicReference<Object> getMax;
    final ReadWriteLock getMin;
    final Lock isInside;
    final AtomicReference<setMax<T>[]> setMin;
    long toFloatRange;
    final Lock toIntRange;

    @CheckReturnValue
    @NonNull
    public static <T> removeString<T> getMax() {
        return new removeString<>();
    }

    @CheckReturnValue
    @NonNull
    public static <T> removeString<T> setMin(T t) {
        return new removeString<>(t);
    }

    removeString() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.getMin = reentrantReadWriteLock;
        this.toIntRange = reentrantReadWriteLock.readLock();
        this.isInside = this.getMin.writeLock();
        this.setMin = new AtomicReference<>(setMax);
        this.getMax = new AtomicReference<>();
        this.equals = new AtomicReference<>();
    }

    private removeString(T t) {
        this();
        this.getMax.lazySet(setRefreshAnimation.getMax(t, "defaultValue is null"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        if (r0.test(r5) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r0.toFloatRange != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r5 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        if (r5 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0058, code lost:
        r0.getMin = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005a, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005c, code lost:
        r0.length = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005f, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0060, code lost:
        r5.getMin((o.pluginName.getMax<? super java.lang.Object>) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void subscribeActual(o.GriverProgressBar<? super T> r5) {
        /*
            r4 = this;
            o.removeString$setMax r0 = new o.removeString$setMax
            r0.<init>(r5, r4)
            r5.onSubscribe(r0)
            boolean r1 = r4.length(r0)
            if (r1 == 0) goto L_0x006b
            boolean r5 = r0.toFloatRange
            if (r5 == 0) goto L_0x0016
            r4.setMin(r0)
            return
        L_0x0016:
            boolean r5 = r0.toFloatRange
            if (r5 != 0) goto L_0x006a
            monitor-enter(r0)
            boolean r5 = r0.toFloatRange     // Catch:{ all -> 0x0067 }
            if (r5 == 0) goto L_0x0021
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return
        L_0x0021:
            boolean r5 = r0.getMax     // Catch:{ all -> 0x0067 }
            if (r5 == 0) goto L_0x0027
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return
        L_0x0027:
            o.removeString<T> r5 = r0.setMin     // Catch:{ all -> 0x0067 }
            java.util.concurrent.locks.Lock r1 = r5.toIntRange     // Catch:{ all -> 0x0067 }
            r1.lock()     // Catch:{ all -> 0x0067 }
            long r2 = r5.toFloatRange     // Catch:{ all -> 0x0067 }
            r0.toIntRange = r2     // Catch:{ all -> 0x0067 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r5 = r5.getMax     // Catch:{ all -> 0x0067 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0067 }
            r1.unlock()     // Catch:{ all -> 0x0067 }
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L_0x0041
            r3 = 1
            goto L_0x0042
        L_0x0041:
            r3 = 0
        L_0x0042:
            r0.getMin = r3     // Catch:{ all -> 0x0067 }
            r0.getMax = r1     // Catch:{ all -> 0x0067 }
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            if (r5 == 0) goto L_0x006a
            boolean r5 = r0.test(r5)
            if (r5 != 0) goto L_0x006a
        L_0x004f:
            boolean r5 = r0.toFloatRange
            if (r5 != 0) goto L_0x006a
            monitor-enter(r0)
            o.pluginName<java.lang.Object> r5 = r0.length     // Catch:{ all -> 0x0064 }
            if (r5 != 0) goto L_0x005c
            r0.getMin = r2     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x005c:
            r1 = 0
            r0.length = r1     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            r5.getMin(r0)
            goto L_0x004f
        L_0x0064:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L_0x0067:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L_0x006a:
            return
        L_0x006b:
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r4.equals
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = o.utAvaiable.setMax
            if (r0 != r1) goto L_0x007b
            r5.onComplete()
            return
        L_0x007b:
            r5.onError(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.removeString.subscribeActual(o.GriverProgressBar):void");
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        if (this.equals.get() != null) {
            updateRunnable.dispose();
        }
    }

    public final void onNext(T t) {
        setRefreshAnimation.getMax(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.equals.get() == null) {
            Object next = NotificationLite.next(t);
            getMax(next);
            for (setMax max : (setMax[]) this.setMin.get()) {
                max.setMax(next, this.toFloatRange);
            }
        }
    }

    public final void onError(Throwable th) {
        setRefreshAnimation.getMax(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.equals.compareAndSet((Object) null, th)) {
            SecuritySignature.getMax(th);
            return;
        }
        Object error = NotificationLite.error(th);
        setMax[] setmaxArr = (setMax[]) this.setMin.getAndSet(length);
        if (setmaxArr != length) {
            getMax(error);
        }
        for (setMax max : setmaxArr) {
            max.setMax(error, this.toFloatRange);
        }
    }

    public final void onComplete() {
        if (this.equals.compareAndSet((Object) null, utAvaiable.setMax)) {
            Object complete = NotificationLite.complete();
            setMax[] setmaxArr = (setMax[]) this.setMin.getAndSet(length);
            if (setmaxArr != length) {
                getMax(complete);
            }
            for (setMax max : setmaxArr) {
                max.setMax(complete, this.toFloatRange);
            }
        }
    }

    public final boolean length() {
        return ((setMax[]) this.setMin.get()).length != 0;
    }

    public final boolean setMin() {
        Object obj = this.getMax.get();
        return obj != null && !NotificationLite.isComplete(obj) && !NotificationLite.isError(obj);
    }

    private boolean length(setMax<T> setmax) {
        setMax[] setmaxArr;
        setMax[] setmaxArr2;
        do {
            setmaxArr = (setMax[]) this.setMin.get();
            if (setmaxArr == length) {
                return false;
            }
            int length2 = setmaxArr.length;
            setmaxArr2 = new setMax[(length2 + 1)];
            System.arraycopy(setmaxArr, 0, setmaxArr2, 0, length2);
            setmaxArr2[length2] = setmax;
        } while (!this.setMin.compareAndSet(setmaxArr, setmaxArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void setMin(setMax<T> setmax) {
        setMax<T>[] setmaxArr;
        setMax[] setmaxArr2;
        do {
            setmaxArr = (setMax[]) this.setMin.get();
            int length2 = setmaxArr.length;
            if (length2 != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    } else if (setmaxArr[i2] == setmax) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length2 == 1) {
                        setmaxArr2 = setMax;
                    } else {
                        setMax[] setmaxArr3 = new setMax[(length2 - 1)];
                        System.arraycopy(setmaxArr, 0, setmaxArr3, 0, i);
                        System.arraycopy(setmaxArr, i + 1, setmaxArr3, i, (length2 - i) - 1);
                        setmaxArr2 = setmaxArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.setMin.compareAndSet(setmaxArr, setmaxArr2));
    }

    private void getMax(Object obj) {
        this.isInside.lock();
        this.toFloatRange++;
        this.getMax.lazySet(obj);
        this.isInside.unlock();
    }

    static final class setMax<T> implements GriverProgressBar.UpdateRunnable, pluginName.getMax<Object> {
        boolean IsOverlapping;
        boolean getMax;
        boolean getMin;
        pluginName<Object> length;
        final GriverProgressBar<? super T> setMax;
        final removeString<T> setMin;
        volatile boolean toFloatRange;
        long toIntRange;

        setMax(GriverProgressBar<? super T> griverProgressBar, removeString<T> removestring) {
            this.setMax = griverProgressBar;
            this.setMin = removestring;
        }

        public final void dispose() {
            if (!this.toFloatRange) {
                this.toFloatRange = true;
                this.setMin.setMin(this);
            }
        }

        public final boolean isDisposed() {
            return this.toFloatRange;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0030, code lost:
            r3.IsOverlapping = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void setMax(java.lang.Object r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.toFloatRange
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r3.IsOverlapping
                if (r0 != 0) goto L_0x0036
                monitor-enter(r3)
                boolean r0 = r3.toFloatRange     // Catch:{ all -> 0x0033 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r3)     // Catch:{ all -> 0x0033 }
                return
            L_0x0010:
                long r0 = r3.toIntRange     // Catch:{ all -> 0x0033 }
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0018
                monitor-exit(r3)     // Catch:{ all -> 0x0033 }
                return
            L_0x0018:
                boolean r5 = r3.getMin     // Catch:{ all -> 0x0033 }
                if (r5 == 0) goto L_0x002c
                o.pluginName<java.lang.Object> r5 = r3.length     // Catch:{ all -> 0x0033 }
                if (r5 != 0) goto L_0x0027
                o.pluginName r5 = new o.pluginName     // Catch:{ all -> 0x0033 }
                r5.<init>()     // Catch:{ all -> 0x0033 }
                r3.length = r5     // Catch:{ all -> 0x0033 }
            L_0x0027:
                r5.getMin(r4)     // Catch:{ all -> 0x0033 }
                monitor-exit(r3)     // Catch:{ all -> 0x0033 }
                return
            L_0x002c:
                r5 = 1
                r3.getMax = r5     // Catch:{ all -> 0x0033 }
                monitor-exit(r3)     // Catch:{ all -> 0x0033 }
                r3.IsOverlapping = r5
                goto L_0x0036
            L_0x0033:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            L_0x0036:
                r3.test(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.removeString.setMax.setMax(java.lang.Object, long):void");
        }

        public final boolean test(Object obj) {
            return this.toFloatRange || NotificationLite.accept(obj, this.setMax);
        }
    }
}
