package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.promocode.views.RedeemPromoCodeActivity;
import o.GriverUpdateProgressExtension;

public final class PageStartedExtension implements getBindingAdapter<RedeemPromoCodeActivity> {
    @InjectedFieldSignature("id.dana.promocode.views.RedeemPromoCodeActivity.redeemPromoCodePresenter")
    public static void length(RedeemPromoCodeActivity redeemPromoCodeActivity, GriverUpdateProgressExtension.getMax getmax) {
        redeemPromoCodeActivity.redeemPromoCodePresenter = getmax;
    }

    @InjectedFieldSignature("id.dana.promocode.views.RedeemPromoCodeActivity.dynamicUrlWrapper")
    public static void setMin(RedeemPromoCodeActivity redeemPromoCodeActivity, getShortName getshortname) {
        redeemPromoCodeActivity.dynamicUrlWrapper = getshortname;
    }
}
