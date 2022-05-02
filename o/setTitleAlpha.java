package o;

import io.reactivex.exceptions.CompositeException;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setTitleAlpha<T> extends onLoadMoreStateChanged<T, T> {
    final boolean getMin;
    final RedDotDrawable<? super Throwable, ? extends TitleBarRightButtonView.AnonymousClass4<? extends T>> length;

    public setTitleAlpha(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super Throwable, ? extends TitleBarRightButtonView.AnonymousClass4<? extends T>> redDotDrawable, boolean z) {
        super(r1);
        this.length = redDotDrawable;
        this.getMin = z;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        getMax getmax = new getMax(griverProgressBar, this.length, this.getMin);
        griverProgressBar.onSubscribe(getmax.setMin);
        this.setMin.subscribe(getmax);
    }

    static final class getMax<T> implements GriverProgressBar<T> {
        final boolean getMax;
        final RedDotDrawable<? super Throwable, ? extends TitleBarRightButtonView.AnonymousClass4<? extends T>> getMin;
        final GriverProgressBar<? super T> length;
        boolean setMax;
        final setLoadMoreTipColor setMin = new setLoadMoreTipColor();
        boolean toIntRange;

        getMax(GriverProgressBar<? super T> griverProgressBar, RedDotDrawable<? super Throwable, ? extends TitleBarRightButtonView.AnonymousClass4<? extends T>> redDotDrawable, boolean z) {
            this.length = griverProgressBar;
            this.getMin = redDotDrawable;
            this.getMax = z;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.setMin.replace(updateRunnable);
        }

        public final void onNext(T t) {
            if (!this.toIntRange) {
                this.length.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            if (!this.setMax) {
                this.setMax = true;
                if (!this.getMax || (th instanceof Exception)) {
                    try {
                        TitleBarRightButtonView.AnonymousClass4 r1 = (TitleBarRightButtonView.AnonymousClass4) this.getMin.apply(th);
                        if (r1 == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.length.onError(nullPointerException);
                            return;
                        }
                        r1.subscribe(this);
                    } catch (Throwable th2) {
                        registerNode.getMax(th2);
                        this.length.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.length.onError(th);
                }
            } else if (this.toIntRange) {
                SecuritySignature.getMax(th);
            } else {
                this.length.onError(th);
            }
        }

        public final void onComplete() {
            if (!this.toIntRange) {
                this.toIntRange = true;
                this.setMax = true;
                this.length.onComplete();
            }
        }
    }
}
