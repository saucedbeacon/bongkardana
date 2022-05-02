package o;

import android.widget.CompoundButton;
import id.dana.referral.view.ReferralPopupDialog;

public final class getJSApiPermissionConfig implements CompoundButton.OnCheckedChangeListener {
    private final ReferralPopupDialog.length setMax;

    public getJSApiPermissionConfig(ReferralPopupDialog.length length) {
        this.setMax = length;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ReferralPopupDialog.setMax(this.setMax, z);
    }
}
