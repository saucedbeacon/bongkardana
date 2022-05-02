package o;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.perf.config.RemoteConfigManager;

public final class applyState implements OnFailureListener {
    private final RemoteConfigManager length;

    public applyState(RemoteConfigManager remoteConfigManager) {
        this.length = remoteConfigManager;
    }

    public final void onFailure(Exception exc) {
        this.length.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }
}
