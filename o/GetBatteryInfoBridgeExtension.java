package o;

import id.dana.onboarding.createprofile.CreateProfileFragment;

public final class GetBatteryInfoBridgeExtension implements MultiInstanceInvalidationClient$1 {
    private final CreateProfileFragment setMin;

    public GetBatteryInfoBridgeExtension(CreateProfileFragment createProfileFragment) {
        this.setMin = createProfileFragment;
    }

    public final void getMax() {
        this.setMin.values();
    }
}
