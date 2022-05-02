package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantLatestReviewView;
import o.getMsg;

public final class getEnsureBtn implements getBindingAdapter<MerchantLatestReviewView> {
    @InjectedFieldSignature("id.dana.nearbyme.merchantdetail.viewcomponent.MerchantLatestReviewView.presenter")
    public static void getMin(MerchantLatestReviewView merchantLatestReviewView, getMsg.length length) {
        merchantLatestReviewView.presenter = length;
    }
}
