package o;

import io.reactivex.annotations.NonNull;

public interface RedDotModel<T1, T2, T3, T4, R> {
    @NonNull
    R setMin(@NonNull T1 t1, @NonNull T2 t2, @NonNull T3 t3, @NonNull T4 t4) throws Exception;
}
