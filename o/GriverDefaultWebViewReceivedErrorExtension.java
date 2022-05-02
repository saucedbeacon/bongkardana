package o;

import id.dana.nearbyme.di.module.MerchantPhotoViewerModule;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import o.positiveString;

public final class GriverDefaultWebViewReceivedErrorExtension implements getAdapterPosition<positiveString.setMin<MerchantImageModel>> {
    private final MerchantPhotoViewerModule setMax;

    private GriverDefaultWebViewReceivedErrorExtension(MerchantPhotoViewerModule merchantPhotoViewerModule) {
        this.setMax = merchantPhotoViewerModule;
    }

    public static GriverDefaultWebViewReceivedErrorExtension getMax(MerchantPhotoViewerModule merchantPhotoViewerModule) {
        return new GriverDefaultWebViewReceivedErrorExtension(merchantPhotoViewerModule);
    }

    public final /* synthetic */ Object get() {
        positiveString.setMin<MerchantImageModel> length = this.setMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
