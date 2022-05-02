package o;

import o.GriverPullRefreshService;

public final class getProgressView<T> extends GriverPullRefreshService.IGRiverRefreshStyle<T> {
    public final void onNext(T t) {
        this.setMax = t;
    }

    public final void onError(Throwable th) {
        this.setMax = null;
        this.getMax = th;
        countDown();
    }
}
