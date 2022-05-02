package o;

import android.view.View;
import id.dana.dialog.LoginInfoDialog;

public final class setLastRefreshTimestamp implements View.OnClickListener {
    private final LoginInfoDialog getMax;
    private final View.OnClickListener setMin;

    public setLastRefreshTimestamp(LoginInfoDialog loginInfoDialog, View.OnClickListener onClickListener) {
        this.getMax = loginInfoDialog;
        this.setMin = onClickListener;
    }

    public final void onClick(View view) {
        LoginInfoDialog.getMax(this.getMax, this.setMin, view);
    }
}
