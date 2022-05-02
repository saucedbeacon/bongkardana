package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.requestmoney.balance.RequestMoneyBalanceQrCardFragment;
import o.OnTouch;

public final class parseImageInfo implements getBindingAdapter<RequestMoneyBalanceQrCardFragment> {
    @InjectedFieldSignature("id.dana.requestmoney.balance.RequestMoneyBalanceQrCardFragment.staticQrPresenter")
    public static void getMin(RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment, OnTouch.setMin setmin) {
        requestMoneyBalanceQrCardFragment.staticQrPresenter = setmin;
    }
}
