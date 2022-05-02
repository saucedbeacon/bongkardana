package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.GriverSwipeRefreshLayout;
import o.TitleBarRightButtonView;
import o.hasCornerMarking;

public final class RefreshHeader<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> implements getSecondFloorView<Boolean> {
    final TitleBarRightButtonView.AnonymousClass4<T> getMax;
    final getChildren<? super T> getMin;

    public RefreshHeader(TitleBarRightButtonView.AnonymousClass4<T> r1, getChildren<? super T> getchildren) {
        this.getMax = r1;
        this.getMin = getchildren;
    }

    public final class RefreshState<T, U> extends onLoadMoreStateChanged<T, U> {
        final setStateDidChangeHandler<? super U, ? super T> getMax;
        final Callable<? extends U> length;

        public RefreshState(TitleBarRightButtonView.AnonymousClass4<T> r1, Callable<? extends U> callable, setStateDidChangeHandler<? super U, ? super T> setstatedidchangehandler) {
            super(r1);
            this.length = callable;
            this.getMax = setstatedidchangehandler;
        }

        public final void subscribeActual(GriverProgressBar<? super U> griverProgressBar) {
            try {
                this.setMin.subscribe(new getMin(griverProgressBar, setRefreshAnimation.getMax(this.length.call(), "The initialSupplier returned a null value"), this.getMax));
            } catch (Throwable th) {
                EmptyDisposable.error(th, (GriverProgressBar<?>) griverProgressBar);
            }
        }

        static final class getMin<T, U> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
            final U getMax;
            boolean getMin;
            final GriverProgressBar<? super U> length;
            GriverProgressBar.UpdateRunnable setMax;
            final setStateDidChangeHandler<? super U, ? super T> setMin;

            getMin(GriverProgressBar<? super U> griverProgressBar, U u, setStateDidChangeHandler<? super U, ? super T> setstatedidchangehandler) {
                this.length = griverProgressBar;
                this.setMin = setstatedidchangehandler;
                this.getMax = u;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                if (DisposableHelper.validate(this.setMax, updateRunnable)) {
                    this.setMax = updateRunnable;
                    this.length.onSubscribe(this);
                }
            }

            public final void dispose() {
                this.setMax.dispose();
            }

            public final boolean isDisposed() {
                return this.setMax.isDisposed();
            }

            public final void onNext(T t) {
                if (!this.getMin) {
                    try {
                        this.setMin.setMax(this.getMax, t);
                    } catch (Throwable th) {
                        this.setMax.dispose();
                        onError(th);
                    }
                }
            }

            public final void onError(Throwable th) {
                if (this.getMin) {
                    SecuritySignature.getMax(th);
                    return;
                }
                this.getMin = true;
                this.length.onError(th);
            }

            public final void onComplete() {
                if (!this.getMin) {
                    this.getMin = true;
                    this.length.onNext(this.getMax);
                    this.length.onComplete();
                }
            }
        }
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super Boolean> cornerMarkingUIController) {
        this.getMax.subscribe(new getMax(cornerMarkingUIController, this.getMin));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setMax() {
        GriverSwipeRefreshLayout.WMLAScrollerInfo wMLAScrollerInfo = new GriverSwipeRefreshLayout.WMLAScrollerInfo(this.getMax, this.getMin);
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, wMLAScrollerInfo) : wMLAScrollerInfo;
    }

    public final class RefreshHeaderStyle<T, U extends Collection<? super T>> extends onLoadMoreStateChanged<T, U> {
        final boolean IsOverlapping;
        final Callable<U> equals;
        final hasCornerMarking getMax;
        final TimeUnit getMin;
        final int isInside;
        final long length;
        final long setMax;

        public RefreshHeaderStyle(TitleBarRightButtonView.AnonymousClass4<T> r1, long j, long j2, TimeUnit timeUnit, hasCornerMarking hascornermarking, Callable<U> callable, int i, boolean z) {
            super(r1);
            this.setMax = j;
            this.length = j2;
            this.getMin = timeUnit;
            this.getMax = hascornermarking;
            this.equals = callable;
            this.isInside = i;
            this.IsOverlapping = z;
        }

        public final void subscribeActual(GriverProgressBar<? super U> griverProgressBar) {
            if (this.setMax == this.length && this.isInside == Integer.MAX_VALUE) {
                this.setMin.subscribe(new length(new SecurityStorage(griverProgressBar), this.equals, this.setMax, this.getMin, this.getMax));
                return;
            }
            hasCornerMarking.getMin createWorker = this.getMax.createWorker();
            if (this.setMax == this.length) {
                this.setMin.subscribe(new setMax(new SecurityStorage(griverProgressBar), this.equals, this.setMax, this.getMin, this.isInside, this.IsOverlapping, createWorker));
            } else {
                this.setMin.subscribe(new getMax(new SecurityStorage(griverProgressBar), this.equals, this.setMax, this.length, this.getMin, createWorker));
            }
        }

        static final class length<T, U extends Collection<? super T>> extends setTargetScrollWithLayout<T, U, U> implements Runnable, GriverProgressBar.UpdateRunnable {
            final AtomicReference<GriverProgressBar.UpdateRunnable> FastBitmap$CoordinateSystem = new AtomicReference<>();
            final TimeUnit IsOverlapping;
            final Callable<U> equals;
            GriverProgressBar.UpdateRunnable hashCode;
            final hasCornerMarking toFloatRange;
            final long toIntRange;
            U values;

            public final /* synthetic */ void setMin(GriverProgressBar griverProgressBar, Object obj) {
                this.length.onNext((Collection) obj);
            }

            length(GriverProgressBar<? super U> griverProgressBar, Callable<U> callable, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking) {
                super(griverProgressBar, new initTitleSegControl());
                this.equals = callable;
                this.toIntRange = j;
                this.IsOverlapping = timeUnit;
                this.toFloatRange = hascornermarking;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                if (DisposableHelper.validate(this.hashCode, updateRunnable)) {
                    this.hashCode = updateRunnable;
                    try {
                        this.values = (Collection) setRefreshAnimation.getMax(this.equals.call(), "The buffer supplied is null");
                        this.length.onSubscribe(this);
                        if (!this.getMin) {
                            hasCornerMarking hascornermarking = this.toFloatRange;
                            long j = this.toIntRange;
                            GriverProgressBar.UpdateRunnable schedulePeriodicallyDirect = hascornermarking.schedulePeriodicallyDirect(this, j, j, this.IsOverlapping);
                            if (!this.FastBitmap$CoordinateSystem.compareAndSet((Object) null, schedulePeriodicallyDirect)) {
                                schedulePeriodicallyDirect.dispose();
                            }
                        }
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        dispose();
                        EmptyDisposable.error(th, (GriverProgressBar<?>) this.length);
                    }
                }
            }

            public final void onNext(T t) {
                synchronized (this) {
                    U u = this.values;
                    if (u != null) {
                        u.add(t);
                    }
                }
            }

            public final void onError(Throwable th) {
                synchronized (this) {
                    this.values = null;
                }
                this.length.onError(th);
                DisposableHelper.dispose(this.FastBitmap$CoordinateSystem);
            }

            public final void onComplete() {
                U u;
                synchronized (this) {
                    u = this.values;
                    this.values = null;
                }
                if (u != null) {
                    this.setMin.offer(u);
                    this.setMax = true;
                    if (length()) {
                        decryptString.getMax(this.setMin, this.length, (GriverProgressBar.UpdateRunnable) null, this);
                    }
                }
                DisposableHelper.dispose(this.FastBitmap$CoordinateSystem);
            }

            public final void dispose() {
                DisposableHelper.dispose(this.FastBitmap$CoordinateSystem);
                this.hashCode.dispose();
            }

            public final boolean isDisposed() {
                return this.FastBitmap$CoordinateSystem.get() == DisposableHelper.DISPOSED;
            }

            public final void run() {
                U u;
                try {
                    U u2 = (Collection) setRefreshAnimation.getMax(this.equals.call(), "The bufferSupplier returned a null buffer");
                    synchronized (this) {
                        u = this.values;
                        if (u != null) {
                            this.values = u2;
                        }
                    }
                    if (u == null) {
                        DisposableHelper.dispose(this.FastBitmap$CoordinateSystem);
                    } else {
                        length(u, this);
                    }
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.length.onError(th);
                    dispose();
                }
            }
        }

        static final class getMax<T, U extends Collection<? super T>> extends setTargetScrollWithLayout<T, U, U> implements Runnable, GriverProgressBar.UpdateRunnable {
            final List<U> FastBitmap$CoordinateSystem = new LinkedList();
            final long IsOverlapping;
            final TimeUnit equals;
            final long toFloatRange;
            final Callable<U> toIntRange;
            final hasCornerMarking.getMin toString;
            GriverProgressBar.UpdateRunnable values;

            public final /* synthetic */ void setMin(GriverProgressBar griverProgressBar, Object obj) {
                griverProgressBar.onNext((Collection) obj);
            }

            getMax(GriverProgressBar<? super U> griverProgressBar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, hasCornerMarking.getMin getmin) {
                super(griverProgressBar, new initTitleSegControl());
                this.toIntRange = callable;
                this.IsOverlapping = j;
                this.toFloatRange = j2;
                this.equals = timeUnit;
                this.toString = getmin;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                if (DisposableHelper.validate(this.values, updateRunnable)) {
                    this.values = updateRunnable;
                    try {
                        Collection collection = (Collection) setRefreshAnimation.getMax(this.toIntRange.call(), "The buffer supplied is null");
                        this.FastBitmap$CoordinateSystem.add(collection);
                        this.length.onSubscribe(this);
                        hasCornerMarking.getMin getmin = this.toString;
                        long j = this.toFloatRange;
                        getmin.length(this, j, j, this.equals);
                        this.toString.setMin(new getMin(collection), this.IsOverlapping, this.equals);
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        updateRunnable.dispose();
                        EmptyDisposable.error(th, (GriverProgressBar<?>) this.length);
                        this.toString.dispose();
                    }
                }
            }

            public final void onNext(T t) {
                synchronized (this) {
                    for (U add : this.FastBitmap$CoordinateSystem) {
                        add.add(t);
                    }
                }
            }

            public final void onError(Throwable th) {
                this.setMax = true;
                synchronized (this) {
                    this.FastBitmap$CoordinateSystem.clear();
                }
                this.length.onError(th);
                this.toString.dispose();
            }

            public final void onComplete() {
                ArrayList<Collection> arrayList;
                synchronized (this) {
                    arrayList = new ArrayList<>(this.FastBitmap$CoordinateSystem);
                    this.FastBitmap$CoordinateSystem.clear();
                }
                for (Collection offer : arrayList) {
                    this.setMin.offer(offer);
                }
                this.setMax = true;
                if (length()) {
                    decryptString.getMax(this.setMin, this.length, this.toString, this);
                }
            }

            public final void dispose() {
                if (!this.getMin) {
                    this.getMin = true;
                    synchronized (this) {
                        this.FastBitmap$CoordinateSystem.clear();
                    }
                    this.values.dispose();
                    this.toString.dispose();
                }
            }

            public final boolean isDisposed() {
                return this.getMin;
            }

            public final void run() {
                if (!this.getMin) {
                    try {
                        Collection collection = (Collection) setRefreshAnimation.getMax(this.toIntRange.call(), "The bufferSupplier returned a null buffer");
                        synchronized (this) {
                            if (!this.getMin) {
                                this.FastBitmap$CoordinateSystem.add(collection);
                                this.toString.setMin(new setMin(collection), this.IsOverlapping, this.equals);
                            }
                        }
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        this.length.onError(th);
                        dispose();
                    }
                }
            }

            final class setMin implements Runnable {
                private final U setMax;

                setMin(U u) {
                    this.setMax = u;
                }

                public final void run() {
                    synchronized (getMax.this) {
                        getMax.this.FastBitmap$CoordinateSystem.remove(this.setMax);
                    }
                    getMax getmax = getMax.this;
                    getmax.getMax(this.setMax, getmax.toString);
                }
            }

            final class getMin implements Runnable {
                private final U getMin;

                getMin(U u) {
                    this.getMin = u;
                }

                public final void run() {
                    synchronized (getMax.this) {
                        getMax.this.FastBitmap$CoordinateSystem.remove(this.getMin);
                    }
                    getMax getmax = getMax.this;
                    getmax.getMax(this.getMin, getmax.toString);
                }
            }
        }

        static final class setMax<T, U extends Collection<? super T>> extends setTargetScrollWithLayout<T, U, U> implements Runnable, GriverProgressBar.UpdateRunnable {
            GriverProgressBar.UpdateRunnable FastBitmap$CoordinateSystem;
            long Grayscale$Algorithm;
            final int IsOverlapping;
            final TimeUnit equals;
            final boolean hashCode;
            long invokeSuspend;
            final hasCornerMarking.getMin toDoubleRange;
            final Callable<U> toFloatRange;
            final long toIntRange;
            U toString;
            GriverProgressBar.UpdateRunnable values;

            public final /* synthetic */ void setMin(GriverProgressBar griverProgressBar, Object obj) {
                griverProgressBar.onNext((Collection) obj);
            }

            setMax(GriverProgressBar<? super U> griverProgressBar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, hasCornerMarking.getMin getmin) {
                super(griverProgressBar, new initTitleSegControl());
                this.toFloatRange = callable;
                this.toIntRange = j;
                this.equals = timeUnit;
                this.IsOverlapping = i;
                this.hashCode = z;
                this.toDoubleRange = getmin;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                if (DisposableHelper.validate(this.values, updateRunnable)) {
                    this.values = updateRunnable;
                    try {
                        this.toString = (Collection) setRefreshAnimation.getMax(this.toFloatRange.call(), "The buffer supplied is null");
                        this.length.onSubscribe(this);
                        hasCornerMarking.getMin getmin = this.toDoubleRange;
                        long j = this.toIntRange;
                        this.FastBitmap$CoordinateSystem = getmin.length(this, j, j, this.equals);
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        updateRunnable.dispose();
                        EmptyDisposable.error(th, (GriverProgressBar<?>) this.length);
                        this.toDoubleRange.dispose();
                    }
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
                if (r7.hashCode == false) goto L_0x0028;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
                r7.FastBitmap$CoordinateSystem.dispose();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
                getMax(r0, r7);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
                r8 = (java.util.Collection) o.setRefreshAnimation.getMax(r7.toFloatRange.call(), "The buffer supplied is null");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
                monitor-enter(r7);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
                r7.toString = r8;
                r7.Grayscale$Algorithm++;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
                monitor-exit(r7);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
                if (r7.hashCode == false) goto L_?;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
                r0 = r7.toDoubleRange;
                r4 = r7.toIntRange;
                r7.FastBitmap$CoordinateSystem = r0.length(r7, r4, r4, r7.equals);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
                r8 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
                o.registerNode.getMax(r8);
                r7.length.onError(r8);
                dispose();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onNext(T r8) {
                /*
                    r7 = this;
                    monitor-enter(r7)
                    U r0 = r7.toString     // Catch:{ all -> 0x0065 }
                    if (r0 != 0) goto L_0x0007
                    monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                    return
                L_0x0007:
                    r0.add(r8)     // Catch:{ all -> 0x0065 }
                    int r8 = r0.size()     // Catch:{ all -> 0x0065 }
                    int r1 = r7.IsOverlapping     // Catch:{ all -> 0x0065 }
                    if (r8 >= r1) goto L_0x0014
                    monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                    return
                L_0x0014:
                    r8 = 0
                    r7.toString = r8     // Catch:{ all -> 0x0065 }
                    long r1 = r7.invokeSuspend     // Catch:{ all -> 0x0065 }
                    r3 = 1
                    long r1 = r1 + r3
                    r7.invokeSuspend = r1     // Catch:{ all -> 0x0065 }
                    monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                    boolean r8 = r7.hashCode
                    if (r8 == 0) goto L_0x0028
                    o.GriverProgressBar$UpdateRunnable r8 = r7.FastBitmap$CoordinateSystem
                    r8.dispose()
                L_0x0028:
                    r7.getMax(r0, r7)
                    java.util.concurrent.Callable<U> r8 = r7.toFloatRange     // Catch:{ all -> 0x0058 }
                    java.lang.Object r8 = r8.call()     // Catch:{ all -> 0x0058 }
                    java.lang.String r0 = "The buffer supplied is null"
                    java.lang.Object r8 = o.setRefreshAnimation.getMax(r8, (java.lang.String) r0)     // Catch:{ all -> 0x0058 }
                    java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x0058 }
                    monitor-enter(r7)
                    r7.toString = r8     // Catch:{ all -> 0x0055 }
                    long r0 = r7.Grayscale$Algorithm     // Catch:{ all -> 0x0055 }
                    long r0 = r0 + r3
                    r7.Grayscale$Algorithm = r0     // Catch:{ all -> 0x0055 }
                    monitor-exit(r7)     // Catch:{ all -> 0x0055 }
                    boolean r8 = r7.hashCode
                    if (r8 == 0) goto L_0x0054
                    o.hasCornerMarking$getMin r0 = r7.toDoubleRange
                    long r4 = r7.toIntRange
                    java.util.concurrent.TimeUnit r6 = r7.equals
                    r1 = r7
                    r2 = r4
                    o.GriverProgressBar$UpdateRunnable r8 = r0.length(r1, r2, r4, r6)
                    r7.FastBitmap$CoordinateSystem = r8
                L_0x0054:
                    return
                L_0x0055:
                    r8 = move-exception
                    monitor-exit(r7)
                    throw r8
                L_0x0058:
                    r8 = move-exception
                    o.registerNode.getMax(r8)
                    o.GriverProgressBar r0 = r7.length
                    r0.onError(r8)
                    r7.dispose()
                    return
                L_0x0065:
                    r8 = move-exception
                    monitor-exit(r7)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: o.RefreshHeader.RefreshHeaderStyle.setMax.onNext(java.lang.Object):void");
            }

            public final void onError(Throwable th) {
                synchronized (this) {
                    this.toString = null;
                }
                this.length.onError(th);
                this.toDoubleRange.dispose();
            }

            public final void onComplete() {
                U u;
                this.toDoubleRange.dispose();
                synchronized (this) {
                    u = this.toString;
                    this.toString = null;
                }
                if (u != null) {
                    this.setMin.offer(u);
                    this.setMax = true;
                    if (length()) {
                        decryptString.getMax(this.setMin, this.length, this, this);
                    }
                }
            }

            public final void dispose() {
                if (!this.getMin) {
                    this.getMin = true;
                    this.values.dispose();
                    this.toDoubleRange.dispose();
                    synchronized (this) {
                        this.toString = null;
                    }
                }
            }

            public final boolean isDisposed() {
                return this.getMin;
            }

            public final void run() {
                try {
                    U u = (Collection) setRefreshAnimation.getMax(this.toFloatRange.call(), "The bufferSupplier returned a null buffer");
                    synchronized (this) {
                        U u2 = this.toString;
                        if (u2 != null) {
                            if (this.invokeSuspend == this.Grayscale$Algorithm) {
                                this.toString = u;
                                getMax(u2, this);
                            }
                        }
                    }
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    dispose();
                    this.length.onError(th);
                }
            }
        }
    }

    static final class getMax<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        GriverProgressBar.UpdateRunnable getMin;
        final TitleBarRightButtonView.CornerMarkingUIController<? super Boolean> length;
        boolean setMax;
        final getChildren<? super T> setMin;

        getMax(TitleBarRightButtonView.CornerMarkingUIController<? super Boolean> cornerMarkingUIController, getChildren<? super T> getchildren) {
            this.length = cornerMarkingUIController;
            this.setMin = getchildren;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.getMin, updateRunnable)) {
                this.getMin = updateRunnable;
                this.length.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.setMax) {
                try {
                    if (this.setMin.test(t)) {
                        this.setMax = true;
                        this.getMin.dispose();
                        this.length.onSuccess(Boolean.TRUE);
                    }
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.getMin.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.setMax) {
                SecuritySignature.getMax(th);
                return;
            }
            this.setMax = true;
            this.length.onError(th);
        }

        public final void onComplete() {
            if (!this.setMax) {
                this.setMax = true;
                this.length.onSuccess(Boolean.FALSE);
            }
        }

        public final void dispose() {
            this.getMin.dispose();
        }

        public final boolean isDisposed() {
            return this.getMin.isDisposed();
        }
    }
}
