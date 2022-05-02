package o;

public interface enableLoadMore<T> {
    void drain();

    void innerComplete(setAutoRefreshingDuration<T> setautorefreshingduration);

    void innerError(setAutoRefreshingDuration<T> setautorefreshingduration, Throwable th);

    void innerNext(setAutoRefreshingDuration<T> setautorefreshingduration, T t);
}
