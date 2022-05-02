package o;

import android.graphics.Bitmap;
import id.dana.globalnetwork.pay.GnBarcodePayView;

public final class canDecodeUrl implements RedDotManager {
    private final GnBarcodePayView length;

    public canDecodeUrl(GnBarcodePayView gnBarcodePayView) {
        this.length = gnBarcodePayView;
    }

    public final void accept(Object obj) {
        this.length.barcodeView.setImageBitmap((Bitmap) obj);
    }
}
