package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.pay.CardPayFragment;
import o.beginFakeDrag;
import o.getPageSize;
import o.isUserInputEnabled;

public final class exceedSizeThreshold implements getBindingAdapter<CardPayFragment> {
    @InjectedFieldSignature("id.dana.pay.CardPayFragment.changePayMethodPresenter")
    public static void getMax(CardPayFragment cardPayFragment, beginFakeDrag.setMax setmax) {
        cardPayFragment.changePayMethodPresenter = setmax;
    }

    @InjectedFieldSignature("id.dana.pay.CardPayFragment.offlinePayPresenter")
    public static void setMax(CardPayFragment cardPayFragment, getPageSize.setMin setmin) {
        cardPayFragment.offlinePayPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.pay.CardPayFragment.payQrPresenter")
    public static void length(CardPayFragment cardPayFragment, isUserInputEnabled.getMax getmax) {
        cardPayFragment.payQrPresenter = getmax;
    }
}
