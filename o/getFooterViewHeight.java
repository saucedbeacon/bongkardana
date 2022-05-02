package o;

import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class getFooterViewHeight<T> extends setBadgeData<T> {
    private final TitleBarRightButtonView.AnonymousClass1<T> getMin;

    public getFooterViewHeight(TitleBarRightButtonView.AnonymousClass1<T> r1) {
        this.getMin = r1;
    }

    public final void setMax(getbEva<? super T> getbeva) {
        this.getMin.subscribe(new setMin(getbeva));
    }

    static final class setMin<T> implements GriverProgressBar<T>, getFmt {
        GriverProgressBar.UpdateRunnable getMax;
        final getbEva<? super T> getMin;

        public final void request(long j) {
        }

        setMin(getbEva<? super T> getbeva) {
            this.getMin = getbeva;
        }

        public final void onComplete() {
            this.getMin.onComplete();
        }

        public final void onError(Throwable th) {
            this.getMin.onError(th);
        }

        public final void onNext(T t) {
            this.getMin.onNext(t);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.getMax = updateRunnable;
            this.getMin.onSubscribe(this);
        }

        public final void cancel() {
            this.getMax.dispose();
        }
    }
}
