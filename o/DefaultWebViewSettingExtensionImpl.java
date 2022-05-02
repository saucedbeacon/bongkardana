package o;

import android.graphics.Bitmap;
import id.dana.home.view.ZoomDialog;

public final class DefaultWebViewSettingExtensionImpl implements RedDotManager {
    private final ZoomDialog setMin;

    public DefaultWebViewSettingExtensionImpl(ZoomDialog zoomDialog) {
        this.setMin = zoomDialog;
    }

    public final void accept(Object obj) {
        this.setMin.ivQrZoom.setImageBitmap((Bitmap) null);
    }
}
