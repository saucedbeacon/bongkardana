package o;

import android.graphics.Bitmap;
import id.dana.pay.view.BasePayView;

public final class downloadFile implements RedDotManager {
    private final BasePayView getMin;

    public downloadFile(BasePayView basePayView) {
        this.getMin = basePayView;
    }

    public final void accept(Object obj) {
        this.getMin.qrView.setImageBitmap((Bitmap) obj);
    }
}
