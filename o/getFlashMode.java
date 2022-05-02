package o;

import android.widget.CompoundButton;
import id.dana.richview.profile.paymentauth.PaymentAuthenticationView;

public final class getFlashMode implements CompoundButton.OnCheckedChangeListener {
    private final PaymentAuthenticationView getMax;

    public getFlashMode(PaymentAuthenticationView paymentAuthenticationView) {
        this.getMax = paymentAuthenticationView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        PaymentAuthenticationView.getMin(this.getMax, compoundButton, z);
    }
}
