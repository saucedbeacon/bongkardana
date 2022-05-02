package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class access$008<T> extends onLoadMoreStateChanged<T, T> {
    final removeStateDidChangeHandler getMax;
    final removeStateDidChangeHandler getMin;
    final RedDotManager<? super T> length;
    final RedDotManager<? super Throwable> setMax;

    public access$008(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotManager<? super T> redDotManager, RedDotManager<? super Throwable> redDotManager2, removeStateDidChangeHandler removestatedidchangehandler, removeStateDidChangeHandler removestatedidchangehandler2) {
        super(r1);
        this.length = redDotManager;
        this.setMax = redDotManager2;
        this.getMin = removestatedidchangehandler;
        this.getMax = removestatedidchangehandler2;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new getMin(griverProgressBar, this.length, this.setMax, this.getMin, this.getMax));
    }

    static final class getMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        final removeStateDidChangeHandler getMax;
        final GriverProgressBar<? super T> getMin;
        GriverProgressBar.UpdateRunnable isInside;
        final RedDotManager<? super T> length;
        final removeStateDidChangeHandler setMax;
        final RedDotManager<? super Throwable> setMin;
        boolean toIntRange;

        getMin(GriverProgressBar<? super T> griverProgressBar, RedDotManager<? super T> redDotManager, RedDotManager<? super Throwable> redDotManager2, removeStateDidChangeHandler removestatedidchangehandler, removeStateDidChangeHandler removestatedidchangehandler2) {
            this.getMin = griverProgressBar;
            this.length = redDotManager;
            this.setMin = redDotManager2;
            this.setMax = removestatedidchangehandler;
            this.getMax = removestatedidchangehandler2;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.isInside, updateRunnable)) {
                this.isInside = updateRunnable;
                this.getMin.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.isInside.dispose();
        }

        public final boolean isDisposed() {
            return this.isInside.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.toIntRange) {
                try {
                    this.length.accept(t);
                    this.getMin.onNext(t);
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.isInside.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.toIntRange) {
                SecuritySignature.getMax(th);
                return;
            }
            this.toIntRange = true;
            try {
                this.setMin.accept(th);
            } catch (Throwable th2) {
                registerNode.getMax(th2);
                th = new CompositeException(th, th2);
            }
            this.getMin.onError(th);
            try {
                this.getMax.getMax();
            } catch (Throwable th3) {
                registerNode.getMax(th3);
                SecuritySignature.getMax(th3);
            }
        }

        public final void onComplete() {
            if (!this.toIntRange) {
                try {
                    this.setMax.getMax();
                    this.toIntRange = true;
                    this.getMin.onComplete();
                    try {
                        this.getMax.getMax();
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        SecuritySignature.getMax(th);
                    }
                } catch (Throwable th2) {
                    registerNode.getMax(th2);
                    onError(th2);
                }
            }
        }
    }
}
