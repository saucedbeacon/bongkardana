package o;

import io.reactivex.annotations.NonNull;

public interface getOptionMenuBlinkAnimator<T> {
    void onComplete();

    void onError(@NonNull Throwable th);

    void onNext(@NonNull T t);
}
