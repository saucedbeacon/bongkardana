package o;

import java.util.concurrent.Callable;
import o.TitleBarRightButtonView;

public final class clearAllTabs<T> extends TitleBarRightButtonView.AnonymousClass1<T> implements Callable<T> {
    final Callable<? extends T> setMin;

    public clearAllTabs(Callable<? extends T> callable) {
        this.setMin = callable;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        isChildScrollToTop ischildscrolltotop = new isChildScrollToTop(griverProgressBar);
        griverProgressBar.onSubscribe(ischildscrolltotop);
        if (!ischildscrolltotop.isDisposed()) {
            try {
                ischildscrolltotop.complete(setRefreshAnimation.getMax(this.setMin.call(), "Callable returned null"));
            } catch (Throwable th) {
                registerNode.getMax(th);
                if (!ischildscrolltotop.isDisposed()) {
                    griverProgressBar.onError(th);
                } else {
                    SecuritySignature.getMax(th);
                }
            }
        }
    }

    public final T call() throws Exception {
        return setRefreshAnimation.getMax(this.setMin.call(), "The callable returned a null value");
    }
}
