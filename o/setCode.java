package o;

import android.view.View;
import id.dana.dialog.TwoButtonWithImageDialog;

public final class setCode implements View.OnClickListener {
    private final TwoButtonWithImageDialog length;
    private final View.OnClickListener setMax;

    public setCode(TwoButtonWithImageDialog twoButtonWithImageDialog, View.OnClickListener onClickListener) {
        this.length = twoButtonWithImageDialog;
        this.setMax = onClickListener;
    }

    public final void onClick(View view) {
        TwoButtonWithImageDialog.length(this.length, this.setMax, view);
    }
}
