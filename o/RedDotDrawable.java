package o;

import io.reactivex.annotations.NonNull;

public interface RedDotDrawable<T, R> {
    R apply(@NonNull T t) throws Exception;
}
