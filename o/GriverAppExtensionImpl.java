package o;

import android.graphics.Bitmap;
import id.dana.home.view.ZoomDialog;

public final class GriverAppExtensionImpl implements RedDotManager {
    private final ZoomDialog getMin;

    public GriverAppExtensionImpl(ZoomDialog zoomDialog) {
        this.getMin = zoomDialog;
    }

    public final void accept(Object obj) {
        this.getMin.ivBarcodeZoom.setImageBitmap((Bitmap) null);
    }
}
