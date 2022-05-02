package o;

import android.graphics.Bitmap;
import id.dana.data.util.download.DownloadUtil;

public final class setupAppInfo implements RedDotDrawable {
    private final Bitmap.CompressFormat setMax;
    private final String setMin;

    public setupAppInfo(String str, Bitmap.CompressFormat compressFormat) {
        this.setMin = str;
        this.setMax = compressFormat;
    }

    public final Object apply(Object obj) {
        return DownloadUtil.decodeResponse(((NotSendableException) ((getAppenderManager) obj).setMin).getMax().setMin(), this.setMin, this.setMax);
    }
}
