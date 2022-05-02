package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.bank.BankSelectorActivity;
import o.ForeignKey;
import o.IWorkManagerImplCallback;

public final class indices implements getBindingAdapter<BankSelectorActivity> {
    @InjectedFieldSignature("id.dana.bank.BankSelectorActivity.presenter")
    public static void getMax(BankSelectorActivity bankSelectorActivity, ForeignKey.getMin getmin) {
        bankSelectorActivity.presenter = getmin;
    }

    @InjectedFieldSignature("id.dana.bank.BankSelectorActivity.billerX2BPresenter")
    public static void setMax(BankSelectorActivity bankSelectorActivity, IWorkManagerImplCallback.Stub.Proxy.getMin getmin) {
        bankSelectorActivity.billerX2BPresenter = getmin;
    }
}
