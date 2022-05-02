package o;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class setAttachListener<V> extends setAllowStacking<V> {
    public static <V> setAttachListener<V> length() {
        return new setAttachListener<>();
    }

    public final boolean getMax(@Nullable V v) {
        return super.getMax(v);
    }

    public final boolean getMin(Throwable th) {
        return super.getMin(th);
    }

    public final boolean getMax(ListenableFuture<? extends V> listenableFuture) {
        return super.getMax(listenableFuture);
    }

    private setAttachListener() {
    }
}
