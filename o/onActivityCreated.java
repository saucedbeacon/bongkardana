package o;

import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.google.android.exoplayer2.util.EventDispatcher;

public final class onActivityCreated implements EventDispatcher.Event {
    public static final onActivityCreated getMin = new onActivityCreated();

    public final void sendTo(Object obj) {
        ((DefaultDrmSessionEventListener) obj).onDrmSessionAcquired();
    }
}
