package o;

import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.google.android.exoplayer2.util.EventDispatcher;

public final class onPrimaryNavigationFragmentChanged implements EventDispatcher.Event {
    public static final onPrimaryNavigationFragmentChanged setMax = new onPrimaryNavigationFragmentChanged();

    public final void sendTo(Object obj) {
        ((DefaultDrmSessionEventListener) obj).onDrmKeysRestored();
    }
}
