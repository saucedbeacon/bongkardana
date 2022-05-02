package o;

import android.view.View;
import id.dana.dialog.LoginInfoDialog;

public final class insertOrUpdateInfo implements View.OnClickListener {
    private final LoginInfoDialog getMin;

    public insertOrUpdateInfo(LoginInfoDialog loginInfoDialog) {
        this.getMin = loginInfoDialog;
    }

    public final void onClick(View view) {
        this.getMin.setMax();
    }
}
