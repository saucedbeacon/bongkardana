package o;

import java.util.concurrent.CountDownLatch;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setPullRefreshDistance<T> extends CountDownLatch implements TitleBarRightButtonView.CornerMarkingUIController<T>, switchFavoriteIconFont, setOptionMenuIcon<T> {
    GriverProgressBar.UpdateRunnable getMin;
    Throwable length;
    volatile boolean setMax;
    T setMin;

    public setPullRefreshDistance() {
        super(1);
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        this.getMin = updateRunnable;
        if (this.setMax) {
            updateRunnable.dispose();
        }
    }

    public final void onSuccess(T t) {
        this.setMin = t;
        countDown();
    }

    public final void onError(Throwable th) {
        this.length = th;
        countDown();
    }

    public final void onComplete() {
        countDown();
    }

    public final T setMax() {
        if (getCount() != 0) {
            try {
                SGPluginExtras.getMax();
                await();
            } catch (InterruptedException e) {
                this.setMax = true;
                GriverProgressBar.UpdateRunnable updateRunnable = this.getMin;
                if (updateRunnable != null) {
                    updateRunnable.dispose();
                }
                throw utAvaiable.getMin(e);
            }
        }
        Throwable th = this.length;
        if (th == null) {
            return this.setMin;
        }
        throw utAvaiable.getMin(th);
    }
}
