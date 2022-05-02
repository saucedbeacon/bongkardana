package o;

import android.graphics.Bitmap;
import id.dana.home.view.ZoomDialog;

public final class GriverActivityRestoreExtensionImpl implements RedDotManager {
    private final ZoomDialog setMin;

    public GriverActivityRestoreExtensionImpl(ZoomDialog zoomDialog) {
        this.setMin = zoomDialog;
    }

    public final void accept(Object obj) {
        this.setMin.ivQrZoom.setImageBitmap((Bitmap) obj);
    }
}
