package o;

import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.Callable;

public final class setup implements Callable {
    private final FirebaseInstallations length;

    public setup(FirebaseInstallations firebaseInstallations) {
        this.length = firebaseInstallations;
    }

    public final Object call() {
        return this.length.deleteFirebaseInstallationId();
    }
}
