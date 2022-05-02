package o;

import id.dana.nearbyme.di.module.MerchantPhotoViewerModule;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerDialog;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import o.APExpansion;
import o.AboutMenu;
import o.GRVAppFavoriteMenuItem;
import o.PrepareException;
import o.b;
import o.positiveString;

public final class GriverEmbedWebViewJsApiPermissionProxyImpl implements onDown {
    private b.C0007b<isRAndAbove> getMax;
    private b.C0007b<APExpansion.AnonymousClass1> getMin;
    private b.C0007b<GRVAppFavoriteMenuItem.AnonymousClass1> length;
    private b.C0007b<positiveString.setMin<MerchantImageModel>> setMax;
    private b.C0007b<setStorageProxy> setMin;
    private b.C0007b<positiveString.length<MerchantImageModel>> toFloatRange;

    public /* synthetic */ GriverEmbedWebViewJsApiPermissionProxyImpl(MerchantPhotoViewerModule merchantPhotoViewerModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(merchantPhotoViewerModule, r2);
    }

    private GriverEmbedWebViewJsApiPermissionProxyImpl(MerchantPhotoViewerModule merchantPhotoViewerModule, PrepareException.AnonymousClass1 r3) {
        this.setMin = new getMin(r3);
        setMax setmax = new setMax(r3);
        this.getMin = setmax;
        this.getMax = AppInfoUtils.create(this.setMin, setmax);
        b.C0007b<positiveString.setMin<MerchantImageModel>> min = isScrap.getMin(GriverDefaultWebViewReceivedErrorExtension.getMax(merchantPhotoViewerModule));
        this.setMax = min;
        GRVNotificationBoxMenuItem min2 = GRVNotificationBoxMenuItem.setMin(this.getMax, min);
        this.length = min2;
        this.toFloatRange = isScrap.getMin(GriverBridgeInjectExtension.setMax(merchantPhotoViewerModule, min2));
    }

    public static final class getMax {
        public MerchantPhotoViewerModule length;
        public PrepareException.AnonymousClass1 setMax;

        public /* synthetic */ getMax(byte b) {
            this();
        }

        private getMax() {
        }
    }

    static class getMin implements b.C0007b<setStorageProxy> {
        private final PrepareException.AnonymousClass1 getMin;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            setStorageProxy areNotificationsEnabled = this.getMin.areNotificationsEnabled();
            if (areNotificationsEnabled != null) {
                return areNotificationsEnabled;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<APExpansion.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMax;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            APExpansion.AnonymousClass1 intRange = this.setMax.toIntRange();
            if (intRange != null) {
                return intRange;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMax(MerchantPhotoViewerDialog merchantPhotoViewerDialog) {
        AboutMenu.AnonymousClass1.setMax(merchantPhotoViewerDialog, this.toFloatRange.get());
    }
}
