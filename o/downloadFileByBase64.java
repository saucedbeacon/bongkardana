package o;

import android.view.View;
import id.dana.pay.view.BasePayView;

public final class downloadFileByBase64 implements View.OnClickListener {
    private final BasePayView getMin;

    public downloadFileByBase64(BasePayView basePayView) {
        this.getMin = basePayView;
    }

    public final void onClick(View view) {
        BasePayView.getMax(this.getMin);
    }
}
