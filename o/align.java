package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyme.merchantdetail.mediaviewer.MerchantPhotoGalleryActivity;
import o.negativeListener;

public final class align implements getBindingAdapter<MerchantPhotoGalleryActivity> {
    @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.mediaviewer.MerchantPhotoGalleryActivity.presenter")
    public static void setMax(MerchantPhotoGalleryActivity merchantPhotoGalleryActivity, negativeListener.getMax getmax) {
        merchantPhotoGalleryActivity.presenter = getmax;
    }
}
