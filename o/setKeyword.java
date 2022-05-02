package o;

import android.view.View;
import id.dana.nearbyme.PromoListDialogFragment;

public final class setKeyword implements View.OnClickListener {
    private final PromoListDialogFragment setMax;

    public setKeyword(PromoListDialogFragment promoListDialogFragment) {
        this.setMax = promoListDialogFragment;
    }

    public final void onClick(View view) {
        this.setMax.dismiss();
    }
}
