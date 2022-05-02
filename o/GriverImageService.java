package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.requestmoney.RequestMoneyActivity;
import o.getSelectedIndex;
import o.publishImageAction;

public final class GriverImageService implements getBindingAdapter<RequestMoneyActivity> {
    @InjectedFieldSignature("id.dana.requestmoney.RequestMoneyActivity.userBankPresenter")
    public static void length(RequestMoneyActivity requestMoneyActivity, publishImageAction.setMin setmin) {
        requestMoneyActivity.userBankPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.requestmoney.RequestMoneyActivity.onBoardingPresenter")
    public static void getMax(RequestMoneyActivity requestMoneyActivity, getSelectedIndex.length length) {
        requestMoneyActivity.onBoardingPresenter = length;
    }
}
