package o;

import id.dana.splitbill.view.ClosePayerDialogFragment;
import id.dana.splitbill.view.ClosePayerView;

public final class getResId implements ClosePayerView.setMin {
    private final ClosePayerDialogFragment length;

    public getResId(ClosePayerDialogFragment closePayerDialogFragment) {
        this.length = closePayerDialogFragment;
    }

    public final void length(boolean z) {
        this.length.btnSubmitClosePayer.setEnabled(!z);
    }
}
