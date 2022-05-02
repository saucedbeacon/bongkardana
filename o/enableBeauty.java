package o;

import android.content.DialogInterface;
import id.dana.richview.profile.paymentauth.PaymentAuthenticationView;

public final class enableBeauty implements DialogInterface.OnClickListener {
    private final PaymentAuthenticationView setMax;

    public enableBeauty(PaymentAuthenticationView paymentAuthenticationView) {
        this.setMax = paymentAuthenticationView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PaymentAuthenticationView.setMax(this.setMax, dialogInterface, i);
    }
}
