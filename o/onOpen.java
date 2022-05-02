package o;

import android.view.View;
import id.dana.challenge.pin.PinChallengeFragment;

public final class onOpen implements View.OnFocusChangeListener {
    public static final onOpen getMax = new onOpen();

    public final void onFocusChange(View view, boolean z) {
        PinChallengeFragment.getMax(z);
    }
}
