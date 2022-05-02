package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class performIntercept {
    private final AtomicReference<ensurePreDrawListener> setMax = new AtomicReference<>();
    public final PlaybackStateCompat<ensurePreDrawListener, List<Class<?>>> setMin = new PlaybackStateCompat<>();

    @Nullable
    public final List<Class<?>> length(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        ensurePreDrawListener andSet = this.setMax.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new ensurePreDrawListener(cls, cls2, cls3);
        } else {
            andSet.setMin = cls;
            andSet.getMin = cls2;
            andSet.getMax = cls3;
        }
        synchronized (this.setMin) {
            list = this.setMin.get(andSet);
        }
        this.setMax.set(andSet);
        return list;
    }
}
