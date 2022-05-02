package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.pay.BalancePayFragment;
import o.beginFakeDrag;
import o.getPageSize;
import o.isUserInputEnabled;
import o.setAutoDismissEnabled$core;

public final class sendUserCancelCallback implements getBindingAdapter<BalancePayFragment> {
    @InjectedFieldSignature("id.dana.pay.BalancePayFragment.changePayMethodPresenter")
    public static void setMax(BalancePayFragment balancePayFragment, beginFakeDrag.setMax setmax) {
        balancePayFragment.changePayMethodPresenter = setmax;
    }

    @InjectedFieldSignature("id.dana.pay.BalancePayFragment.getUserInfoPresenter")
    public static void setMin(BalancePayFragment balancePayFragment, setAutoDismissEnabled$core.setMin setmin) {
        balancePayFragment.getUserInfoPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.pay.BalancePayFragment.dynamicUrlWrapper")
    public static void length(BalancePayFragment balancePayFragment, getShortName getshortname) {
        balancePayFragment.dynamicUrlWrapper = getshortname;
    }

    @InjectedFieldSignature("id.dana.pay.BalancePayFragment.offlinePayPresenter")
    public static void length(BalancePayFragment balancePayFragment, getPageSize.setMin setmin) {
        balancePayFragment.offlinePayPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.pay.BalancePayFragment.payQrPresenter")
    public static void getMax(BalancePayFragment balancePayFragment, isUserInputEnabled.getMax getmax) {
        balancePayFragment.payQrPresenter = getmax;
    }

    @InjectedFieldSignature("id.dana.pay.BalancePayFragment.sessionExpiredManager")
    public static void setMin(BalancePayFragment balancePayFragment, CustomPopMenuExtension customPopMenuExtension) {
        balancePayFragment.sessionExpiredManager = customPopMenuExtension;
    }
}
