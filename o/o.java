package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyme.summary.MerchantListView;
import o.GetAboutInfoResult;

public final class o implements getBindingAdapter<MerchantListView> {
    @InjectedFieldSignature("id.dana.nearbyme.summary.MerchantListView.presenter")
    public static void setMax(MerchantListView merchantListView, GetAboutInfoResult.getMax getmax) {
        merchantListView.presenter = getmax;
    }
}
