package o;

import android.view.View;
import id.dana.dialog.LoginInfoDialog;

public final class deleteAppInfo implements View.OnClickListener {
    private final LoginInfoDialog getMin;
    private final View.OnClickListener length;

    public deleteAppInfo(LoginInfoDialog loginInfoDialog, View.OnClickListener onClickListener) {
        this.getMin = loginInfoDialog;
        this.length = onClickListener;
    }

    public final void onClick(View view) {
        LoginInfoDialog.setMin(this.getMin, this.length, view);
    }
}
