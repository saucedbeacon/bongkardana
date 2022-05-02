package o;

import id.dana.myprofile.MyProfileFragment;

public final class TrackerConfigBridgeExtension implements RedDotManager {
    private final MyProfileFragment getMax;

    public TrackerConfigBridgeExtension(MyProfileFragment myProfileFragment) {
        this.getMax = myProfileFragment;
    }

    public final void accept(Object obj) {
        MyProfileFragment.values(this.getMax);
    }
}
