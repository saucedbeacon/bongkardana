package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import o.TitleBarRightButtonView;

public final class DotView<T> extends TitleBarRightButtonView.AnonymousClass1<T> {
    final Callable<? extends Throwable> getMax;

    public DotView(Callable<? extends Throwable> callable) {
        this.getMax = callable;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        try {
            th = (Throwable) setRefreshAnimation.getMax(this.getMax.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            registerNode.getMax(th);
        }
        EmptyDisposable.error(th, (GriverProgressBar<?>) griverProgressBar);
    }
}
