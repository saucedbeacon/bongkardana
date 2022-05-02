package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.pay.CardQrisPayFragment;
import o.beginFakeDrag;
import o.getPageSize;
import o.isUserInputEnabled;

public final class startChooseFileIntent implements getBindingAdapter<CardQrisPayFragment> {
    @InjectedFieldSignature("id.dana.pay.CardQrisPayFragment.changePayMethodPresenter")
    public static void getMax(CardQrisPayFragment cardQrisPayFragment, beginFakeDrag.setMax setmax) {
        cardQrisPayFragment.changePayMethodPresenter = setmax;
    }

    @InjectedFieldSignature("id.dana.pay.CardQrisPayFragment.offlinePayPresenter")
    public static void getMin(CardQrisPayFragment cardQrisPayFragment, getPageSize.setMin setmin) {
        cardQrisPayFragment.offlinePayPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.pay.CardQrisPayFragment.payQrPresenter")
    public static void getMax(CardQrisPayFragment cardQrisPayFragment, isUserInputEnabled.getMax getmax) {
        cardQrisPayFragment.payQrPresenter = getmax;
    }
}
