package o;

import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class getUnChecked<T> extends onLoadMoreStateChanged<T, T> {
    final TitleBarRightButtonView.AnonymousClass4<? extends T> length;

    public getUnChecked(TitleBarRightButtonView.AnonymousClass4<T> r1, TitleBarRightButtonView.AnonymousClass4<? extends T> r2) {
        super(r1);
        this.length = r2;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        setMax setmax = new setMax(griverProgressBar, this.length);
        griverProgressBar.onSubscribe(setmax.getMax);
        this.setMin.subscribe(setmax);
    }

    static final class setMax<T> implements GriverProgressBar<T> {
        final setLoadMoreTipColor getMax = new setLoadMoreTipColor();
        final GriverProgressBar<? super T> getMin;
        boolean length = true;
        final TitleBarRightButtonView.AnonymousClass4<? extends T> setMin;

        setMax(GriverProgressBar<? super T> griverProgressBar, TitleBarRightButtonView.AnonymousClass4<? extends T> r2) {
            this.getMin = griverProgressBar;
            this.setMin = r2;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.getMax.update(updateRunnable);
        }

        public final void onNext(T t) {
            if (this.length) {
                this.length = false;
            }
            this.getMin.onNext(t);
        }

        public final void onError(Throwable th) {
            this.getMin.onError(th);
        }

        public final void onComplete() {
            if (this.length) {
                this.length = false;
                this.setMin.subscribe(this);
                return;
            }
            this.getMin.onComplete();
        }
    }
}
