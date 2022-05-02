package o;

import android.widget.CompoundButton;
import id.dana.tncagreement.TermsAndConditionsActivity;

public final class checkVivoConcave implements CompoundButton.OnCheckedChangeListener {
    private final TermsAndConditionsActivity length;

    public checkVivoConcave(TermsAndConditionsActivity termsAndConditionsActivity) {
        this.length = termsAndConditionsActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        TermsAndConditionsActivity.getMax(this.length, z);
    }
}
