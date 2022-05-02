package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class createIconBitmap<T> extends onLoadMoreStateChanged<T, T> {
    final RedDotDrawable<? super Throwable, ? extends T> getMin;

    public createIconBitmap(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super Throwable, ? extends T> redDotDrawable) {
        super(r1);
        this.getMin = redDotDrawable;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new getMax(griverProgressBar, this.getMin));
    }

    static final class getMax<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        final GriverProgressBar<? super T> getMin;
        GriverProgressBar.UpdateRunnable setMax;
        final RedDotDrawable<? super Throwable, ? extends T> setMin;

        getMax(GriverProgressBar<? super T> griverProgressBar, RedDotDrawable<? super Throwable, ? extends T> redDotDrawable) {
            this.getMin = griverProgressBar;
            this.setMin = redDotDrawable;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.setMax, updateRunnable)) {
                this.setMax = updateRunnable;
                this.getMin.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.setMax.dispose();
        }

        public final boolean isDisposed() {
            return this.setMax.isDisposed();
        }

        public final void onNext(T t) {
            this.getMin.onNext(t);
        }

        public final void onError(Throwable th) {
            try {
                Object apply = this.setMin.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.getMin.onError(nullPointerException);
                    return;
                }
                this.getMin.onNext(apply);
                this.getMin.onComplete();
            } catch (Throwable th2) {
                registerNode.getMax(th2);
                this.getMin.onError(new CompositeException(th, th2));
            }
        }

        public final void onComplete() {
            this.getMin.onComplete();
        }
    }
}
