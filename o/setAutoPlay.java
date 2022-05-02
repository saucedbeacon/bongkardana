package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setAutoPlay<T, U extends Collection<? super T>, B> extends onLoadMoreStateChanged<T, U> {
    final Callable<U> getMax;
    final Callable<? extends TitleBarRightButtonView.AnonymousClass4<B>> length;

    public setAutoPlay(TitleBarRightButtonView.AnonymousClass4<T> r1, Callable<? extends TitleBarRightButtonView.AnonymousClass4<B>> callable, Callable<U> callable2) {
        super(r1);
        this.length = callable;
        this.getMax = callable2;
    }

    public final void subscribeActual(GriverProgressBar<? super U> griverProgressBar) {
        this.setMin.subscribe(new getMax(new SecurityStorage(griverProgressBar), this.getMax, this.length));
    }

    static final class getMax<T, U extends Collection<? super T>, B> extends setTargetScrollWithLayout<T, U, U> implements GriverProgressBar.UpdateRunnable {
        final Callable<? extends TitleBarRightButtonView.AnonymousClass4<B>> IsOverlapping;
        GriverProgressBar.UpdateRunnable equals;
        final Callable<U> toFloatRange;
        final AtomicReference<GriverProgressBar.UpdateRunnable> toIntRange = new AtomicReference<>();
        U values;

        public final /* synthetic */ void setMin(GriverProgressBar griverProgressBar, Object obj) {
            this.length.onNext((Collection) obj);
        }

        getMax(GriverProgressBar<? super U> griverProgressBar, Callable<U> callable, Callable<? extends TitleBarRightButtonView.AnonymousClass4<B>> callable2) {
            super(griverProgressBar, new initTitleSegControl());
            this.toFloatRange = callable;
            this.IsOverlapping = callable2;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.equals, updateRunnable)) {
                this.equals = updateRunnable;
                GriverProgressBar griverProgressBar = this.length;
                try {
                    this.values = (Collection) setRefreshAnimation.getMax(this.toFloatRange.call(), "The buffer supplied is null");
                    try {
                        TitleBarRightButtonView.AnonymousClass4 r2 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.IsOverlapping.call(), "The boundary ObservableSource supplied is null");
                        setMin setmin = new setMin(this);
                        this.toIntRange.set(setmin);
                        griverProgressBar.onSubscribe(this);
                        if (!this.getMin) {
                            r2.subscribe(setmin);
                        }
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        this.getMin = true;
                        updateRunnable.dispose();
                        EmptyDisposable.error(th, (GriverProgressBar<?>) griverProgressBar);
                    }
                } catch (Throwable th2) {
                    registerNode.getMax(th2);
                    this.getMin = true;
                    updateRunnable.dispose();
                    EmptyDisposable.error(th2, (GriverProgressBar<?>) griverProgressBar);
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
            dispose();
            this.length.onError(th);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            o.decryptString.getMax(r2.setMin, r2.length, r2, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            r2.setMin.offer(r0);
            r2.setMax = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (length() == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onComplete() {
            /*
                r2 = this;
                monitor-enter(r2)
                U r0 = r2.values     // Catch:{ all -> 0x0021 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x0021 }
                return
            L_0x0007:
                r1 = 0
                r2.values = r1     // Catch:{ all -> 0x0021 }
                monitor-exit(r2)     // Catch:{ all -> 0x0021 }
                o.getRefreshViewHeight r1 = r2.setMin
                r1.offer(r0)
                r0 = 1
                r2.setMax = r0
                boolean r0 = r2.length()
                if (r0 == 0) goto L_0x0020
                o.getRefreshViewHeight r0 = r2.setMin
                o.GriverProgressBar r1 = r2.length
                o.decryptString.getMax(r0, r1, r2, r2)
            L_0x0020:
                return
            L_0x0021:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setAutoPlay.getMax.onComplete():void");
        }

        public final void dispose() {
            if (!this.getMin) {
                this.getMin = true;
                this.equals.dispose();
                DisposableHelper.dispose(this.toIntRange);
                if (length()) {
                    this.setMin.clear();
                }
            }
        }

        public final boolean isDisposed() {
            return this.getMin;
        }

        /* access modifiers changed from: package-private */
        public final void toFloatRange() {
            try {
                U u = (Collection) setRefreshAnimation.getMax(this.toFloatRange.call(), "The buffer supplied is null");
                try {
                    TitleBarRightButtonView.AnonymousClass4 r1 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.IsOverlapping.call(), "The boundary ObservableSource supplied is null");
                    setMin setmin = new setMin(this);
                    if (DisposableHelper.replace(this.toIntRange, setmin)) {
                        synchronized (this) {
                            U u2 = this.values;
                            if (u2 != null) {
                                this.values = u;
                                r1.subscribe(setmin);
                                length(u2, this);
                            }
                        }
                    }
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.getMin = true;
                    this.equals.dispose();
                    this.length.onError(th);
                }
            } catch (Throwable th2) {
                registerNode.getMax(th2);
                dispose();
                this.length.onError(th2);
            }
        }
    }

    static final class setMin<T, U extends Collection<? super T>, B> extends setGlobalUserData<B> {
        boolean length;
        final getMax<T, U, B> setMin;

        setMin(getMax<T, U, B> getmax) {
            this.setMin = getmax;
        }

        public final void onNext(B b) {
            if (!this.length) {
                this.length = true;
                dispose();
                this.setMin.toFloatRange();
            }
        }

        public final void onError(Throwable th) {
            if (this.length) {
                SecuritySignature.getMax(th);
                return;
            }
            this.length = true;
            this.setMin.onError(th);
        }

        public final void onComplete() {
            if (!this.length) {
                this.length = true;
                this.setMin.toFloatRange();
            }
        }
    }
}
