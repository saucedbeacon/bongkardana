package o;

import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.util.EventDispatcher;

public final class onLowMemory implements EventDispatcher.Event {
    private final DefaultDrmSessionManager.MissingSchemeDataException setMax;

    public onLowMemory(DefaultDrmSessionManager.MissingSchemeDataException missingSchemeDataException) {
        this.setMax = missingSchemeDataException;
    }

    public final void sendTo(Object obj) {
        ((DefaultDrmSessionEventListener) obj).onDrmSessionManagerError(this.setMax);
    }
}
