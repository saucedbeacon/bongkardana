package o;

import android.widget.CompoundButton;
import id.dana.splitbill.view.ClosePayerView;

public final class setDrawable implements CompoundButton.OnCheckedChangeListener {
    private final ClosePayerView setMax;

    public setDrawable(ClosePayerView closePayerView) {
        this.setMax = closePayerView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ClosePayerView.setMax(this.setMax, z);
    }
}
