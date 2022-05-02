package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyrevamp.merchantdetail.MerchantDetailView;
import o.GriverBaseFragmentActivity;
import o.ShareMenu;
import o.UniformOptionMenuPanelExtensionImpl;
import o.onSettingChange;

public final class getLocalLanguage implements getBindingAdapter<MerchantDetailView> {
    @InjectedFieldSignature("id.dana.nearbyrevamp.merchantdetail.MerchantDetailView.merchantDetailConfigPresenter")
    public static void length(MerchantDetailView merchantDetailView, GriverBaseFragmentActivity.getMax getmax) {
        merchantDetailView.merchantDetailConfigPresenter = getmax;
    }

    @InjectedFieldSignature("id.dana.nearbyrevamp.merchantdetail.MerchantDetailView.ratingPresenter")
    public static void length(MerchantDetailView merchantDetailView, onSettingChange.length length) {
        merchantDetailView.ratingPresenter = length;
    }

    @InjectedFieldSignature("id.dana.nearbyrevamp.merchantdetail.MerchantDetailView.promoDealsPresenter")
    public static void getMin(MerchantDetailView merchantDetailView, UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getmin) {
        merchantDetailView.promoDealsPresenter = getmin;
    }

    @InjectedFieldSignature("id.dana.nearbyrevamp.merchantdetail.MerchantDetailView.reviewPresenter")
    public static void setMax(MerchantDetailView merchantDetailView, UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin setmin) {
        merchantDetailView.reviewPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.nearbyrevamp.merchantdetail.MerchantDetailView.tracker")
    public static void setMin(MerchantDetailView merchantDetailView, ShareMenu.AnonymousClass1 r1) {
        merchantDetailView.tracker = r1;
    }
}
