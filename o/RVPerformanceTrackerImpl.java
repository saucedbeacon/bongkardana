package o;

import id.dana.myprofile.MyProfileFragment;

public final class RVPerformanceTrackerImpl implements Runnable {
    private final MyProfileFragment length;

    public RVPerformanceTrackerImpl(MyProfileFragment myProfileFragment) {
        this.length = myProfileFragment;
    }

    public final void run() {
        MyProfileFragment.toIntRange(this.length);
    }
}
