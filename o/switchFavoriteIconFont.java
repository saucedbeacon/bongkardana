package o;

import io.reactivex.annotations.NonNull;
import o.GriverProgressBar;

public interface switchFavoriteIconFont {
    void onComplete();

    void onError(@NonNull Throwable th);

    void onSubscribe(@NonNull GriverProgressBar.UpdateRunnable updateRunnable);
}
