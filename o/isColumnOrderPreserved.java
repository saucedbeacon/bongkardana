package o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.concurrent.Callable;

public final class isColumnOrderPreserved implements Callable {
    private final FirebaseRemoteConfig setMax;

    public isColumnOrderPreserved(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.setMax = firebaseRemoteConfig;
    }

    public final Object call() {
        return this.setMax.getInfo();
    }
}
