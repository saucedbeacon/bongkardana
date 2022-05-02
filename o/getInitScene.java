package o;

import id.dana.myprofile.MyProfileFragment;

public final class getInitScene implements Runnable {
    private final MyProfileFragment length;

    public getInitScene(MyProfileFragment myProfileFragment) {
        this.length = myProfileFragment;
    }

    public final void run() {
        this.length.myProfilePresenter.values();
    }
}
