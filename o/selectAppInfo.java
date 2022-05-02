package o;

import android.view.View;
import id.dana.dialog.TwoButtonWithImageDialog;

public final class selectAppInfo implements View.OnClickListener {
    private final TwoButtonWithImageDialog getMax;
    private final View.OnClickListener getMin;

    public selectAppInfo(TwoButtonWithImageDialog twoButtonWithImageDialog, View.OnClickListener onClickListener) {
        this.getMax = twoButtonWithImageDialog;
        this.getMin = onClickListener;
    }

    public final void onClick(View view) {
        TwoButtonWithImageDialog.setMin(this.getMax, this.getMin, view);
    }
}
