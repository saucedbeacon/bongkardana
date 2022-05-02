package o;

import io.reactivex.annotations.NonNull;

public interface removeNode<T1, T2, R> {
    @NonNull
    R setMax(@NonNull T1 t1, @NonNull T2 t2) throws Exception;
}
