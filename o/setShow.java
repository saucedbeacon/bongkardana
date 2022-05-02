package o;

import io.reactivex.annotations.NonNull;

public interface setShow<T1, T2, T3, R> {
    @NonNull
    R getMin(@NonNull T1 t1, @NonNull T2 t2, @NonNull T3 t3) throws Exception;
}
