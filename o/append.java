package o;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

public final class append implements SuccessContinuation {
    private final FirebaseRemoteConfig setMin;

    public append(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.setMin = firebaseRemoteConfig;
    }

    public final Task then(Object obj) {
        return this.setMin.lambda$fetchAndActivate$1((Void) obj);
    }
}
