package o;

import id.dana.data.qrbarcode.repository.source.network.QrBarcodeException;
import id.dana.data.qrbarcode.repository.source.network.QrBarcodeExpiredException;
import o.TitleBarRightButtonView;

public final class invalidateExtensionCache extends removeAllAnimatorListeners<toJSONString> {
    public final TitleBarRightButtonView.AnonymousClass1<toJSONString> apply(toJSONString tojsonstring) throws Exception {
        if (tojsonstring.success) {
            return super.apply(tojsonstring);
        }
        trackNetworkError(tojsonstring);
        return TitleBarRightButtonView.AnonymousClass1.error((Throwable) getBarcodeException(tojsonstring));
    }

    private QrBarcodeException getBarcodeException(toJSONString tojsonstring) {
        if ("AE15115999000308".equals(tojsonstring.errorCode)) {
            return new QrBarcodeExpiredException(tojsonstring);
        }
        return new QrBarcodeException(tojsonstring);
    }
}
