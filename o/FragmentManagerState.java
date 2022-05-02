package o;

import com.google.firebase.installations.FirebaseInstallations;

public final class FragmentManagerState implements Runnable {
    private final FirebaseInstallations getMin;

    public FragmentManagerState(FirebaseInstallations firebaseInstallations) {
        this.getMin = firebaseInstallations;
    }

    public final void run() {
        this.getMin.lambda$getId$0();
    }
}
