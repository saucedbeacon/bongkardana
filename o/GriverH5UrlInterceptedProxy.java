package o;

import id.dana.di.modules.UploadSnapReceiptModule;
import id.dana.ocr.UploadSnapReceiptContract;

public final class GriverH5UrlInterceptedProxy implements getAdapterPosition<UploadSnapReceiptContract.View> {
    private final UploadSnapReceiptModule getMin;

    private GriverH5UrlInterceptedProxy(UploadSnapReceiptModule uploadSnapReceiptModule) {
        this.getMin = uploadSnapReceiptModule;
    }

    public static GriverH5UrlInterceptedProxy getMin(UploadSnapReceiptModule uploadSnapReceiptModule) {
        return new GriverH5UrlInterceptedProxy(uploadSnapReceiptModule);
    }

    public final /* synthetic */ Object get() {
        UploadSnapReceiptContract.View max = this.getMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
