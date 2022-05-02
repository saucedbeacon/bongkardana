package o;

import android.view.View;
import id.dana.referral.view.ReferralPopupDialog;

public final class inWhitelist implements View.OnClickListener {
    private final ReferralPopupDialog.length setMax;

    public inWhitelist(ReferralPopupDialog.length length) {
        this.setMax = length;
    }

    public final void onClick(View view) {
        ReferralPopupDialog.setMax(this.setMax);
    }
}
