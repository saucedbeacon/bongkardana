package o;

import android.graphics.Bitmap;
import id.dana.data.util.download.DownloadUtil;
import java.io.InputStream;
import o.TitleBarRightButtonView;

public final class PrepareData implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1 {
    private final String getMin;
    private final InputStream setMax;
    private final Bitmap.CompressFormat setMin;

    public PrepareData(InputStream inputStream, String str, Bitmap.CompressFormat compressFormat) {
        this.setMax = inputStream;
        this.getMin = str;
        this.setMin = compressFormat;
    }

    public final void subscribe(TitleBarRightButtonView.AnonymousClass2 r4) {
        DownloadUtil.lambda$decodeResponse$3(this.setMax, this.getMin, this.setMin, r4);
    }
}
