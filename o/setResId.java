package o;

import android.view.View;
import id.dana.splitbill.view.ClosePayerDialogFragment;

public final class setResId implements View.OnClickListener {
    private final ClosePayerDialogFragment setMin;

    public setResId(ClosePayerDialogFragment closePayerDialogFragment) {
        this.setMin = closePayerDialogFragment;
    }

    public final void onClick(View view) {
        this.setMin.toFloatRange.getMin(this.setMin.cvpClosePayer.getClosedPayers());
    }
}
