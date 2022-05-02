package o;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import o.TitleBarRightButtonView;

public final class createDefaultTabBar<T> extends TitleBarRightButtonView.AnonymousClass1<T> {
    final long getMax;
    final TimeUnit getMin;
    final Future<? extends T> length;

    public createDefaultTabBar(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.length = future;
        this.getMax = j;
        this.getMin = timeUnit;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        isChildScrollToTop ischildscrolltotop = new isChildScrollToTop(griverProgressBar);
        griverProgressBar.onSubscribe(ischildscrolltotop);
        if (!ischildscrolltotop.isDisposed()) {
            try {
                ischildscrolltotop.complete(setRefreshAnimation.getMax(this.getMin != null ? this.length.get(this.getMax, this.getMin) : this.length.get(), "Future returned null"));
            } catch (Throwable th) {
                registerNode.getMax(th);
                if (!ischildscrolltotop.isDisposed()) {
                    griverProgressBar.onError(th);
                }
            }
        }
    }
}
