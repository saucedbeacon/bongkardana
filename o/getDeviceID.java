package o;

import id.dana.onboarding.createprofile.CreateProfileFragment;

public final class getDeviceID implements MultiInstanceInvalidationClient$1 {
    private final CreateProfileFragment setMax;

    public getDeviceID(CreateProfileFragment createProfileFragment) {
        this.setMax = createProfileFragment;
    }

    public final void getMax() {
        this.setMax.equals();
    }
}
