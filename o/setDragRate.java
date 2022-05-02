package o;

import io.reactivex.internal.functions.Functions;

public final class setDragRate extends setFavoriteBtnVisibility {
    final Runnable length;

    public setDragRate(Runnable runnable) {
        this.length = runnable;
    }

    public final void setMax(switchFavoriteIconFont switchfavoriteiconfont) {
        Runnable runnable = Functions.getMin;
        setRefreshAnimation.getMax(runnable, "run is null");
        OnStateChangeListener onStateChangeListener = new OnStateChangeListener(runnable);
        switchfavoriteiconfont.onSubscribe(onStateChangeListener);
        try {
            this.length.run();
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
