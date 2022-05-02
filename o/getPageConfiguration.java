package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.globalnetwork.pay.CardGnPayFragment;
import o.getPageSize;
import o.isUserInputEnabled;
import o.onNext;

public final class getPageConfiguration implements getBindingAdapter<CardGnPayFragment> {
    @InjectedFieldSignature("id.dana.globalnetwork.pay.CardGnPayFragment.offlinePayPresenter")
    public static void length(CardGnPayFragment cardGnPayFragment, getPageSize.setMin setmin) {
        cardGnPayFragment.offlinePayPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.globalnetwork.pay.CardGnPayFragment.globalNetworkPresenter")
    public static void setMin(CardGnPayFragment cardGnPayFragment, onNext.setMin setmin) {
        cardGnPayFragment.globalNetworkPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.globalnetwork.pay.CardGnPayFragment.payQrPresenter")
    public static void setMax(CardGnPayFragment cardGnPayFragment, isUserInputEnabled.getMax getmax) {
        cardGnPayFragment.payQrPresenter = getmax;
    }
}
