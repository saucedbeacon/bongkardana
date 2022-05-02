package o;

import android.view.View;
import id.dana.dialog.TwoButtonWithImageDialog;

public final class selectAppInfoWithHighestVersion implements View.OnClickListener {
    private final View.OnClickListener getMin;
    private final TwoButtonWithImageDialog setMax;

    public selectAppInfoWithHighestVersion(TwoButtonWithImageDialog twoButtonWithImageDialog, View.OnClickListener onClickListener) {
        this.setMax = twoButtonWithImageDialog;
        this.getMin = onClickListener;
    }

    public final void onClick(View view) {
        TwoButtonWithImageDialog.getMax(this.setMax, this.getMin, view);
    }
}
