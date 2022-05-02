package o;

import id.dana.nearbyme.di.module.MerchantPhotoViewerModule;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import o.GRVAppFavoriteMenuItem;
import o.b;
import o.positiveString;

public final class GriverBridgeInjectExtension implements getAdapterPosition<positiveString.length<MerchantImageModel>> {
    private final MerchantPhotoViewerModule getMin;
    private final b.C0007b<GRVAppFavoriteMenuItem.AnonymousClass1> setMax;

    private GriverBridgeInjectExtension(MerchantPhotoViewerModule merchantPhotoViewerModule, b.C0007b<GRVAppFavoriteMenuItem.AnonymousClass1> bVar) {
        this.getMin = merchantPhotoViewerModule;
        this.setMax = bVar;
    }

    public static GriverBridgeInjectExtension setMax(MerchantPhotoViewerModule merchantPhotoViewerModule, b.C0007b<GRVAppFavoriteMenuItem.AnonymousClass1> bVar) {
        return new GriverBridgeInjectExtension(merchantPhotoViewerModule, bVar);
    }

    public final /* synthetic */ Object get() {
        positiveString.length<MerchantImageModel> max = this.getMin.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
