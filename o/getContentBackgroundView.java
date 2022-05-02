package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;
import o.hasCornerMarking;

public final class getContentBackgroundView<T> extends onLoadMoreStateChanged<T, TitleBarRightButtonView.AnonymousClass1<T>> {
    final boolean IsOverlapping;
    final long getMax;
    final hasCornerMarking getMin;
    final long length;
    final TimeUnit setMax;
    final long toFloatRange;
    final int toIntRange;

    public getContentBackgroundView(TitleBarRightButtonView.AnonymousClass4<T> r1, long j, long j2, TimeUnit timeUnit, hasCornerMarking hascornermarking, long j3, int i, boolean z) {
        super(r1);
        this.getMax = j;
        this.length = j2;
        this.setMax = timeUnit;
        this.getMin = hascornermarking;
        this.toFloatRange = j3;
        this.toIntRange = i;
        this.IsOverlapping = z;
    }

    public final void subscribeActual(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar) {
        SecurityStorage securityStorage = new SecurityStorage(griverProgressBar);
        if (this.getMax != this.length) {
            this.setMin.subscribe(new getMin(securityStorage, this.getMax, this.length, this.setMax, this.getMin.createWorker(), this.toIntRange));
        } else if (this.toFloatRange == Long.MAX_VALUE) {
            this.setMin.subscribe(new setMax(securityStorage, this.getMax, this.setMax, this.getMin, this.toIntRange));
        } else {
            this.setMin.subscribe(new length(securityStorage, this.getMax, this.setMax, this.getMin, this.toIntRange, this.toFloatRange, this.IsOverlapping));
        }
    }

    static final class setMax<T> extends setTargetScrollWithLayout<T, Object, TitleBarRightButtonView.AnonymousClass1<T>> implements GriverProgressBar.UpdateRunnable, Runnable {
        static final Object toDoubleRange = new Object();
        volatile boolean FastBitmap$CoordinateSystem;
        final TimeUnit IsOverlapping;
        final long equals;
        getDynamicDataEncryptComp<T> hashCode;
        final hasCornerMarking toFloatRange;
        final int toIntRange;
        final setLoadMoreTipColor toString = new setLoadMoreTipColor();
        GriverProgressBar.UpdateRunnable values;

        setMax(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking, int i) {
            super(griverProgressBar, new initTitleSegControl());
            this.equals = j;
            this.IsOverlapping = timeUnit;
            this.toFloatRange = hascornermarking;
            this.toIntRange = i;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.values, updateRunnable)) {
                this.values = updateRunnable;
                this.hashCode = getDynamicDataEncryptComp.setMin(this.toIntRange);
                GriverProgressBar griverProgressBar = this.length;
                griverProgressBar.onSubscribe(this);
                griverProgressBar.onNext(this.hashCode);
                if (!this.getMin) {
                    hasCornerMarking hascornermarking = this.toFloatRange;
                    long j = this.equals;
                    this.toString.replace(hascornermarking.schedulePeriodicallyDirect(this, j, j, this.IsOverlapping));
                }
            }
        }

        public final void onNext(T t) {
            if (!this.FastBitmap$CoordinateSystem) {
                if (setMax()) {
                    this.hashCode.onNext(t);
                    if (this.isInside.addAndGet(-1) == 0) {
                        return;
                    }
                } else {
                    this.setMin.offer(NotificationLite.next(t));
                    if (!length()) {
                        return;
                    }
                }
                toFloatRange();
            }
        }

        public final void onError(Throwable th) {
            this.getMax = th;
            this.setMax = true;
            if (length()) {
                toFloatRange();
            }
            this.length.onError(th);
        }

        public final void onComplete() {
            this.setMax = true;
            if (length()) {
                toFloatRange();
            }
            this.length.onComplete();
        }

        public final void dispose() {
            this.getMin = true;
        }

        public final boolean isDisposed() {
            return this.getMin;
        }

        public final void run() {
            if (this.getMin) {
                this.FastBitmap$CoordinateSystem = true;
            }
            this.setMin.offer(toDoubleRange);
            if (length()) {
                toFloatRange();
            }
        }

        private void toFloatRange() {
            initTitleSegControl inittitlesegcontrol = (initTitleSegControl) this.setMin;
            GriverProgressBar griverProgressBar = this.length;
            getDynamicDataEncryptComp<T> getdynamicdataencryptcomp = this.hashCode;
            int i = 1;
            while (true) {
                boolean z = this.FastBitmap$CoordinateSystem;
                boolean z2 = this.setMax;
                Object poll = inittitlesegcontrol.poll();
                if (!z2 || !(poll == null || poll == toDoubleRange)) {
                    if (poll == null) {
                        i = this.isInside.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else if (poll == toDoubleRange) {
                        getdynamicdataencryptcomp.onComplete();
                        if (!z) {
                            getdynamicdataencryptcomp = getDynamicDataEncryptComp.setMin(this.toIntRange);
                            this.hashCode = getdynamicdataencryptcomp;
                            griverProgressBar.onNext(getdynamicdataencryptcomp);
                        } else {
                            this.values.dispose();
                        }
                    } else {
                        getdynamicdataencryptcomp.onNext(NotificationLite.getValue(poll));
                    }
                }
            }
            this.hashCode = null;
            inittitlesegcontrol.clear();
            Throwable th = this.getMax;
            if (th != null) {
                getdynamicdataencryptcomp.onError(th);
            } else {
                getdynamicdataencryptcomp.onComplete();
            }
            this.toString.dispose();
        }
    }

    static final class length<T> extends setTargetScrollWithLayout<T, Object, TitleBarRightButtonView.AnonymousClass1<T>> implements GriverProgressBar.UpdateRunnable {
        final long FastBitmap$CoordinateSystem;
        volatile boolean Grayscale$Algorithm;
        final long IsOverlapping;
        final setLoadMoreTipColor Mean$Arithmetic = new setLoadMoreTipColor();
        final TimeUnit equals;
        final hasCornerMarking.getMin hashCode;
        GriverProgressBar.UpdateRunnable invoke;
        getDynamicDataEncryptComp<T> invokeSuspend;
        long toDoubleRange;
        final int toFloatRange;
        final hasCornerMarking toIntRange;
        final boolean toString;
        long values;

        length(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking, int i, long j2, boolean z) {
            super(griverProgressBar, new initTitleSegControl());
            this.IsOverlapping = j;
            this.equals = timeUnit;
            this.toIntRange = hascornermarking;
            this.toFloatRange = i;
            this.FastBitmap$CoordinateSystem = j2;
            this.toString = z;
            if (z) {
                this.hashCode = hascornermarking.createWorker();
            } else {
                this.hashCode = null;
            }
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            GriverProgressBar.UpdateRunnable updateRunnable2;
            if (DisposableHelper.validate(this.invoke, updateRunnable)) {
                this.invoke = updateRunnable;
                GriverProgressBar griverProgressBar = this.length;
                griverProgressBar.onSubscribe(this);
                if (!this.getMin) {
                    getDynamicDataEncryptComp<T> min = getDynamicDataEncryptComp.setMin(this.toFloatRange);
                    this.invokeSuspend = min;
                    griverProgressBar.onNext(min);
                    setMax setmax = new setMax(this.toDoubleRange, this);
                    if (this.toString) {
                        hasCornerMarking.getMin getmin = this.hashCode;
                        long j = this.IsOverlapping;
                        updateRunnable2 = getmin.length(setmax, j, j, this.equals);
                    } else {
                        hasCornerMarking hascornermarking = this.toIntRange;
                        long j2 = this.IsOverlapping;
                        updateRunnable2 = hascornermarking.schedulePeriodicallyDirect(setmax, j2, j2, this.equals);
                    }
                    this.Mean$Arithmetic.replace(updateRunnable2);
                }
            }
        }

        public final void onNext(T t) {
            if (!this.Grayscale$Algorithm) {
                if (setMax()) {
                    getDynamicDataEncryptComp<T> getdynamicdataencryptcomp = this.invokeSuspend;
                    getdynamicdataencryptcomp.onNext(t);
                    long j = this.values + 1;
                    if (j >= this.FastBitmap$CoordinateSystem) {
                        this.toDoubleRange++;
                        this.values = 0;
                        getdynamicdataencryptcomp.onComplete();
                        getDynamicDataEncryptComp<T> min = getDynamicDataEncryptComp.setMin(this.toFloatRange);
                        this.invokeSuspend = min;
                        this.length.onNext(min);
                        if (this.toString) {
                            ((GriverProgressBar.UpdateRunnable) this.Mean$Arithmetic.get()).dispose();
                            hasCornerMarking.getMin getmin = this.hashCode;
                            setMax setmax = new setMax(this.toDoubleRange, this);
                            long j2 = this.IsOverlapping;
                            DisposableHelper.replace(this.Mean$Arithmetic, getmin.length(setmax, j2, j2, this.equals));
                        }
                    } else {
                        this.values = j;
                    }
                    if (this.isInside.addAndGet(-1) == 0) {
                        return;
                    }
                } else {
                    this.setMin.offer(NotificationLite.next(t));
                    if (!length()) {
                        return;
                    }
                }
                toIntRange();
            }
        }

        public final void onError(Throwable th) {
            this.getMax = th;
            this.setMax = true;
            if (length()) {
                toIntRange();
            }
            this.length.onError(th);
        }

        public final void onComplete() {
            this.setMax = true;
            if (length()) {
                toIntRange();
            }
            this.length.onComplete();
        }

        public final void dispose() {
            this.getMin = true;
        }

        public final boolean isDisposed() {
            return this.getMin;
        }

        /* access modifiers changed from: package-private */
        public final void toIntRange() {
            initTitleSegControl inittitlesegcontrol = (initTitleSegControl) this.setMin;
            GriverProgressBar griverProgressBar = this.length;
            getDynamicDataEncryptComp<T> getdynamicdataencryptcomp = this.invokeSuspend;
            int i = 1;
            while (!this.Grayscale$Algorithm) {
                boolean z = this.setMax;
                Object poll = inittitlesegcontrol.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof setMax;
                if (z && (z2 || z3)) {
                    this.invokeSuspend = null;
                    inittitlesegcontrol.clear();
                    Throwable th = this.getMax;
                    if (th != null) {
                        getdynamicdataencryptcomp.onError(th);
                    } else {
                        getdynamicdataencryptcomp.onComplete();
                    }
                    DisposableHelper.dispose(this.Mean$Arithmetic);
                    hasCornerMarking.getMin getmin = this.hashCode;
                    if (getmin != null) {
                        getmin.dispose();
                        return;
                    }
                    return;
                } else if (z2) {
                    i = this.isInside.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    setMax setmax = (setMax) poll;
                    if (!this.toString || this.toDoubleRange == setmax.length) {
                        getdynamicdataencryptcomp.onComplete();
                        this.values = 0;
                        getdynamicdataencryptcomp = getDynamicDataEncryptComp.setMin(this.toFloatRange);
                        this.invokeSuspend = getdynamicdataencryptcomp;
                        griverProgressBar.onNext(getdynamicdataencryptcomp);
                    }
                } else {
                    getdynamicdataencryptcomp.onNext(NotificationLite.getValue(poll));
                    long j = this.values + 1;
                    if (j >= this.FastBitmap$CoordinateSystem) {
                        this.toDoubleRange++;
                        this.values = 0;
                        getdynamicdataencryptcomp.onComplete();
                        getdynamicdataencryptcomp = getDynamicDataEncryptComp.setMin(this.toFloatRange);
                        this.invokeSuspend = getdynamicdataencryptcomp;
                        this.length.onNext(getdynamicdataencryptcomp);
                        if (this.toString) {
                            GriverProgressBar.UpdateRunnable updateRunnable = (GriverProgressBar.UpdateRunnable) this.Mean$Arithmetic.get();
                            updateRunnable.dispose();
                            hasCornerMarking.getMin getmin2 = this.hashCode;
                            setMax setmax2 = new setMax(this.toDoubleRange, this);
                            long j2 = this.IsOverlapping;
                            GriverProgressBar.UpdateRunnable length = getmin2.length(setmax2, j2, j2, this.equals);
                            if (!this.Mean$Arithmetic.compareAndSet(updateRunnable, length)) {
                                length.dispose();
                            }
                        }
                    } else {
                        this.values = j;
                    }
                }
            }
            this.invoke.dispose();
            inittitlesegcontrol.clear();
            DisposableHelper.dispose(this.Mean$Arithmetic);
            hasCornerMarking.getMin getmin3 = this.hashCode;
            if (getmin3 != null) {
                getmin3.dispose();
            }
        }

        static final class setMax implements Runnable {
            final long length;
            final length<?> setMax;

            setMax(long j, length<?> length2) {
                this.length = j;
                this.setMax = length2;
            }

            public final void run() {
                length<?> length2 = this.setMax;
                if (!length2.getMin) {
                    length2.setMin.offer(this);
                } else {
                    length2.Grayscale$Algorithm = true;
                }
                if (length2.length()) {
                    length2.toIntRange();
                }
            }
        }
    }

    static final class getMin<T> extends setTargetScrollWithLayout<T, Object, TitleBarRightButtonView.AnonymousClass1<T>> implements GriverProgressBar.UpdateRunnable, Runnable {
        GriverProgressBar.UpdateRunnable FastBitmap$CoordinateSystem;
        final hasCornerMarking.getMin IsOverlapping;
        final long equals;
        volatile boolean hashCode;
        final int toDoubleRange;
        final long toFloatRange;
        final TimeUnit toIntRange;
        final List<getDynamicDataEncryptComp<T>> values = new LinkedList();

        getMin(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar, long j, long j2, TimeUnit timeUnit, hasCornerMarking.getMin getmin, int i) {
            super(griverProgressBar, new initTitleSegControl());
            this.toFloatRange = j;
            this.equals = j2;
            this.toIntRange = timeUnit;
            this.IsOverlapping = getmin;
            this.toDoubleRange = i;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.FastBitmap$CoordinateSystem, updateRunnable)) {
                this.FastBitmap$CoordinateSystem = updateRunnable;
                this.length.onSubscribe(this);
                if (!this.getMin) {
                    getDynamicDataEncryptComp min = getDynamicDataEncryptComp.setMin(this.toDoubleRange);
                    this.values.add(min);
                    this.length.onNext(min);
                    this.IsOverlapping.setMin(new setMin(min), this.toFloatRange, this.toIntRange);
                    hasCornerMarking.getMin getmin = this.IsOverlapping;
                    long j = this.equals;
                    getmin.length(this, j, j, this.toIntRange);
                }
            }
        }

        public final void onNext(T t) {
            if (setMax()) {
                for (getDynamicDataEncryptComp<T> onNext : this.values) {
                    onNext.onNext(t);
                }
                if (this.isInside.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                this.setMin.offer(t);
                if (!length()) {
                    return;
                }
            }
            equals();
        }

        public final void onError(Throwable th) {
            this.getMax = th;
            this.setMax = true;
            if (length()) {
                equals();
            }
            this.length.onError(th);
        }

        public final void onComplete() {
            this.setMax = true;
            if (length()) {
                equals();
            }
            this.length.onComplete();
        }

        public final void dispose() {
            this.getMin = true;
        }

        public final boolean isDisposed() {
            return this.getMin;
        }

        /* access modifiers changed from: package-private */
        public final void getMax(getDynamicDataEncryptComp<T> getdynamicdataencryptcomp) {
            this.setMin.offer(new length(getdynamicdataencryptcomp, false));
            if (length()) {
                equals();
            }
        }

        private void equals() {
            initTitleSegControl inittitlesegcontrol = (initTitleSegControl) this.setMin;
            GriverProgressBar griverProgressBar = this.length;
            List<getDynamicDataEncryptComp<T>> list = this.values;
            int i = 1;
            while (!this.hashCode) {
                boolean z = this.setMax;
                Object poll = inittitlesegcontrol.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof length;
                if (z && (z2 || z3)) {
                    inittitlesegcontrol.clear();
                    Throwable th = this.getMax;
                    if (th != null) {
                        for (getDynamicDataEncryptComp<T> onError : list) {
                            onError.onError(th);
                        }
                    } else {
                        for (getDynamicDataEncryptComp<T> onComplete : list) {
                            onComplete.onComplete();
                        }
                    }
                    list.clear();
                    this.IsOverlapping.dispose();
                    return;
                } else if (z2) {
                    i = this.isInside.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    length length2 = (length) poll;
                    if (!length2.getMax) {
                        list.remove(length2.setMin);
                        length2.setMin.onComplete();
                        if (list.isEmpty() && this.getMin) {
                            this.hashCode = true;
                        }
                    } else if (!this.getMin) {
                        getDynamicDataEncryptComp min = getDynamicDataEncryptComp.setMin(this.toDoubleRange);
                        list.add(min);
                        griverProgressBar.onNext(min);
                        this.IsOverlapping.setMin(new setMin(min), this.toFloatRange, this.toIntRange);
                    }
                } else {
                    for (getDynamicDataEncryptComp<T> onNext : list) {
                        onNext.onNext(poll);
                    }
                }
            }
            this.FastBitmap$CoordinateSystem.dispose();
            inittitlesegcontrol.clear();
            list.clear();
            this.IsOverlapping.dispose();
        }

        public final void run() {
            length length2 = new length(getDynamicDataEncryptComp.setMin(this.toDoubleRange), true);
            if (!this.getMin) {
                this.setMin.offer(length2);
            }
            if (length()) {
                equals();
            }
        }

        static final class length<T> {
            final boolean getMax;
            final getDynamicDataEncryptComp<T> setMin;

            length(getDynamicDataEncryptComp<T> getdynamicdataencryptcomp, boolean z) {
                this.setMin = getdynamicdataencryptcomp;
                this.getMax = z;
            }
        }

        final class setMin implements Runnable {
            private final getDynamicDataEncryptComp<T> getMin;

            setMin(getDynamicDataEncryptComp<T> getdynamicdataencryptcomp) {
                this.getMin = getdynamicdataencryptcomp;
            }

            public final void run() {
                getMin.this.getMax(this.getMin);
            }
        }
    }
}
