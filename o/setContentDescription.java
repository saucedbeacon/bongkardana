package o;

import android.graphics.Bitmap;
import id.dana.splitbill.view.SplitBillShareQrActivity;

public final class setContentDescription implements RedDotManager {
    private final SplitBillShareQrActivity length;

    public setContentDescription(SplitBillShareQrActivity splitBillShareQrActivity) {
        this.length = splitBillShareQrActivity;
    }

    public final void accept(Object obj) {
        this.length.qrView.getQrImageView().setImageBitmap((Bitmap) null);
    }
}
