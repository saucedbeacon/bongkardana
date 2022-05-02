package o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.concurrent.Callable;

public final class getMargin1 implements Callable {
    private final FirebaseRemoteConfig getMax;
    private final FirebaseRemoteConfigSettings getMin;

    public getMargin1(FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.getMax = firebaseRemoteConfig;
        this.getMin = firebaseRemoteConfigSettings;
    }

    public final Object call() {
        return this.getMax.lambda$setConfigSettingsAsync$5(this.getMin);
    }
}
