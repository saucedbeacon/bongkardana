package o;

import io.reactivex.annotations.NonNull;
import o.GriverProgressBar;

public interface setOptionMenuIcon<T> {
    void onComplete();

    void onError(@NonNull Throwable th);

    void onSubscribe(@NonNull GriverProgressBar.UpdateRunnable updateRunnable);

    void onSuccess(@NonNull T t);
}
