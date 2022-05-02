package o;

import android.view.View;
import id.dana.referral.view.ReferralPopupDialog;

public final class isBannedJSAPI implements View.OnClickListener {
    private final ReferralPopupDialog getMin;

    public isBannedJSAPI(ReferralPopupDialog referralPopupDialog) {
        this.getMin = referralPopupDialog;
    }

    public final void onClick(View view) {
        ReferralPopupDialog.length(this.getMin);
    }
}
