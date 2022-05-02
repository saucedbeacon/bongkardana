package o;

import io.reactivex.annotations.Nullable;

public interface getRefreshViewHeight<T> extends GriverPullRefreshService<T> {
    @Nullable
    T poll();
}
