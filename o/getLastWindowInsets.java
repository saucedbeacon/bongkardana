package o;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o.setPositiveButtonIcon;

public final class getLastWindowInsets {
    public static final fireTransitionCompleted<?, ?, ?> length = new fireTransitionCompleted(Object.class, Object.class, Object.class, Collections.singletonList(new parseLayoutDescription(Object.class, Object.class, Object.class, Collections.emptyList(), new setOnConstraintsChanged(), (setPositiveButtonIcon.length<List<Throwable>>) null)), (setPositiveButtonIcon.length<List<Throwable>>) null);
    public final PlaybackStateCompat<ensurePreDrawListener, fireTransitionCompleted<?, ?, ?>> getMax = new PlaybackStateCompat<>();
    private final AtomicReference<ensurePreDrawListener> getMin = new AtomicReference<>();

    public static boolean setMax(@Nullable fireTransitionCompleted<?, ?, ?> firetransitioncompleted) {
        return length.equals(firetransitioncompleted);
    }

    @Nullable
    public final <Data, TResource, Transcode> fireTransitionCompleted<Data, TResource, Transcode> setMax(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        fireTransitionCompleted<Data, TResource, Transcode> firetransitioncompleted;
        ensurePreDrawListener andSet = this.getMin.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new ensurePreDrawListener();
        }
        andSet.setMin = cls;
        andSet.getMin = cls2;
        andSet.getMax = cls3;
        synchronized (this.getMax) {
            firetransitioncompleted = this.getMax.get(andSet);
        }
        this.getMin.set(andSet);
        return firetransitioncompleted;
    }
}
