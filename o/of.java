package o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.concurrent.Callable;

public final class of implements Callable {
    private final FirebaseRemoteConfig setMax;

    public of(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.setMax = firebaseRemoteConfig;
    }

    public final Object call() {
        return this.setMax.lambda$reset$6();
    }
}
