package o;

import android.view.View;
import id.dana.dialog.TwoButtonWithImageDialog;

public final class AppInfoConstants implements View.OnClickListener {
    private final View.OnClickListener length;
    private final TwoButtonWithImageDialog setMax;

    public AppInfoConstants(TwoButtonWithImageDialog twoButtonWithImageDialog, View.OnClickListener onClickListener) {
        this.setMax = twoButtonWithImageDialog;
        this.length = onClickListener;
    }

    public final void onClick(View view) {
        TwoButtonWithImageDialog.setMax(this.setMax, this.length, view);
    }
}
