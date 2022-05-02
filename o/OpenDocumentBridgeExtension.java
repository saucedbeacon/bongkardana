package o;

import android.graphics.Bitmap;
import id.dana.pay.view.QrBarcodePayView;

public final class OpenDocumentBridgeExtension implements RedDotManager {
    private final QrBarcodePayView getMin;

    public OpenDocumentBridgeExtension(QrBarcodePayView qrBarcodePayView) {
        this.getMin = qrBarcodePayView;
    }

    public final void accept(Object obj) {
        this.getMin.barcodeView.setImageBitmap((Bitmap) obj);
    }
}
