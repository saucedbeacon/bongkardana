package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotosView;
import id.dana.nearbyme.merchantdetail.merchantreviewdetail.MerchantReviewDetailActivity;
import o.FeedbackMenu;
import o.ShareMenu;
import o.UniformOptionMenuPanelExtensionImpl;

public final class GRVAppFavoriteMenuItem implements getBindingAdapter<MerchantReviewDetailActivity> {

    public final class Status implements getBindingAdapter<MerchantPhotosView> {
        @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotosView.merchantPhotosPresenter")
        public static void setMin(MerchantPhotosView merchantPhotosView, FeedbackMenu.AnonymousClass1 r1) {
            merchantPhotosView.merchantPhotosPresenter = r1;
        }
    }

    @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.merchantreviewdetail.MerchantReviewDetailActivity.tracker")
    public static void setMax(MerchantReviewDetailActivity merchantReviewDetailActivity, ShareMenu.AnonymousClass1 r1) {
        merchantReviewDetailActivity.tracker = r1;
    }

    @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.merchantreviewdetail.MerchantReviewDetailActivity.reviewPresenter")
    public static void setMax(MerchantReviewDetailActivity merchantReviewDetailActivity, UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin setmin) {
        merchantReviewDetailActivity.reviewPresenter = setmin;
    }
}
