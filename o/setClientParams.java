package o;

import android.view.View;
import id.dana.dialog.CommonDialog;

public final class setClientParams implements View.OnClickListener {
    private final CommonDialog getMax;

    public setClientParams(CommonDialog commonDialog) {
        this.getMax = commonDialog;
    }

    public final void onClick(View view) {
        this.getMax.setMax();
    }
}
