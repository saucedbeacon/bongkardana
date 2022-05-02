package o;

import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

public final class getRefreshOffset extends setFavoriteBtnVisibility {
    final Callable<?> setMax;

    public getRefreshOffset(Callable<?> callable) {
        this.setMax = callable;
    }

    public final void setMax(switchFavoriteIconFont switchfavoriteiconfont) {
        Runnable runnable = Functions.getMin;
        setRefreshAnimation.getMax(runnable, "run is null");
        OnStateChangeListener onStateChangeListener = new OnStateChangeListener(runnable);
        switchfavoriteiconfont.onSubscribe(onStateChangeListener);
        try {
            this.setMax.call();
            if (!onStateChangeListener.isDisposed()) {
                switchfavoriteiconfont.onComplete();
            }
        } catch (Throwable th) {
            registerNode.getMax(th);
            if (!onStateChangeListener.isDisposed()) {
                switchfavoriteiconfont.onError(th);
            } else {
                SecuritySignature.getMax(th);
            }
        }
    }
}
