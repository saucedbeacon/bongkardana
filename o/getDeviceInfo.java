package o;

import android.view.KeyEvent;
import android.widget.TextView;
import id.dana.onboarding.createprofile.CreateProfileFragment;

public final class getDeviceInfo implements TextView.OnEditorActionListener {
    private final CreateProfileFragment setMax;

    public getDeviceInfo(CreateProfileFragment createProfileFragment) {
        this.setMax = createProfileFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.setMax.setMin(i);
    }
}
