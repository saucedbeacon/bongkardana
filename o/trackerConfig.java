package o;

import android.graphics.Bitmap;
import id.dana.myprofile.MyProfileFragment;

public final class trackerConfig implements RedDotManager {
    private final MyProfileFragment getMin;

    public trackerConfig(MyProfileFragment myProfileFragment) {
        this.getMin = myProfileFragment;
    }

    public final void accept(Object obj) {
        MyProfileFragment.getMax(this.getMin, (Bitmap) obj);
    }
}
