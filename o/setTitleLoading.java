package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setTitleLoading<T> extends TitleBarRightButtonView.AnonymousClass1<T> {
    final setMinDuration<? extends T> getMax;

    public setTitleLoading(setMinDuration<? extends T> setminduration) {
        this.getMax = setminduration;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.getMax.getMin(new getMin(griverProgressBar));
    }

    public static <T> TitleBarRightButtonView.CornerMarkingUIController<T> getMax(GriverProgressBar<? super T> griverProgressBar) {
        return new getMin(griverProgressBar);
    }

    static final class getMin<T> extends isChildScrollToTop<T> implements TitleBarRightButtonView.CornerMarkingUIController<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        GriverProgressBar.UpdateRunnable upstream;

        getMin(GriverProgressBar<? super T> griverProgressBar) {
            super(griverProgressBar);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            complete(t);
        }

        public final void onError(Throwable th) {
            error(th);
        }

        public final void dispose() {
            super.dispose();
            this.upstream.dispose();
        }
    }
}
