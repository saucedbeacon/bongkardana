package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyrevamp.view.MerchantActionListView;
import o.ShareMenu;

public final class AddPhoneContactTrigger implements getBindingAdapter<MerchantActionListView> {
    @InjectedFieldSignature("id.dana.nearbyrevamp.view.MerchantActionListView.merchantDetailAnalyticTracker")
    public static void setMax(MerchantActionListView merchantActionListView, ShareMenu.AnonymousClass1 r1) {
        merchantActionListView.merchantDetailAnalyticTracker = r1;
    }

    @InjectedFieldSignature("id.dana.nearbyrevamp.view.MerchantActionListView.nearbyAnalyticTracker")
    public static void getMin(MerchantActionListView merchantActionListView, t tVar) {
        merchantActionListView.nearbyAnalyticTracker = tVar;
    }
}
