package o;

import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.google.android.exoplayer2.util.EventDispatcher;

public final class initState implements EventDispatcher.Event {
    public static final initState length = new initState();

    public final void sendTo(Object obj) {
        ((DefaultDrmSessionEventListener) obj).onDrmKeysLoaded();
    }
}
