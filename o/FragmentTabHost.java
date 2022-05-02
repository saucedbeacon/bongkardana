package o;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.perf.config.RemoteConfigManager;

public final class FragmentTabHost implements Runnable {
    private final FirebaseInstallations length;
    private final boolean setMin;

    public final class SavedState implements OnSuccessListener {
        private final RemoteConfigManager getMax;

        public SavedState(RemoteConfigManager remoteConfigManager) {
            this.getMax = remoteConfigManager;
        }

        public final void onSuccess(Object obj) {
            this.getMax.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
        }
    }

    public FragmentTabHost(FirebaseInstallations firebaseInstallations, boolean z) {
        this.length = firebaseInstallations;
        this.setMin = z;
    }

    public final void run() {
        this.length.lambda$getToken$1(this.setMin);
    }
}
