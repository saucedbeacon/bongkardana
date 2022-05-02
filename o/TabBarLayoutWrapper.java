package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class TabBarLayoutWrapper<T> extends TitleBarRightButtonView.AnonymousClass1<T> {
    final setEvVer<? extends T> getMax;

    public TabBarLayoutWrapper(setEvVer<? extends T> setevver) {
        this.getMax = setevver;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.getMax.getMin(new getMin(griverProgressBar));
    }

    static final class getMin<T> implements switchTheme<T>, GriverProgressBar.UpdateRunnable {
        final GriverProgressBar<? super T> getMin;
        getFmt setMin;

        getMin(GriverProgressBar<? super T> griverProgressBar) {
            this.getMin = griverProgressBar;
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

        public final void onSubscribe(getFmt getfmt) {
            if (SubscriptionHelper.validate(this.setMin, getfmt)) {
                this.setMin = getfmt;
                this.getMin.onSubscribe(this);
                getfmt.request(Long.MAX_VALUE);
            }
        }

        public final void dispose() {
            this.setMin.cancel();
            this.setMin = SubscriptionHelper.CANCELLED;
        }

        public final boolean isDisposed() {
            return this.setMin == SubscriptionHelper.CANCELLED;
        }
    }
}
