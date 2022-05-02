package o;

import android.view.View;
import id.dana.tncagreement.TermsAndConditionsActivity;

public final class checkSamsungConcave implements View.OnClickListener {
    private final TermsAndConditionsActivity setMin;

    public checkSamsungConcave(TermsAndConditionsActivity termsAndConditionsActivity) {
        this.setMin = termsAndConditionsActivity;
    }

    public final void onClick(View view) {
        TermsAndConditionsActivity.setMax(this.setMin);
    }
}
