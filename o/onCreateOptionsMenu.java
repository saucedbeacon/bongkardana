package o;

import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.google.android.exoplayer2.util.EventDispatcher;

public final class onCreateOptionsMenu implements EventDispatcher.Event {
    private final Exception length;

    public onCreateOptionsMenu(Exception exc) {
        this.length = exc;
    }

    public final void sendTo(Object obj) {
        ((DefaultDrmSessionEventListener) obj).onDrmSessionManagerError(this.length);
    }
}
