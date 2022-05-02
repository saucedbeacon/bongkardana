package o;

import com.google.firebase.installations.FirebaseInstallations;

public final class setOnTabChangedListener implements Runnable {
    private final boolean getMax;
    private final FirebaseInstallations length;

    public setOnTabChangedListener(FirebaseInstallations firebaseInstallations, boolean z) {
        this.length = firebaseInstallations;
        this.getMax = z;
    }

    public final void run() {
        this.length.lambda$doRegistrationOrRefresh$2(this.getMax);
    }
}
