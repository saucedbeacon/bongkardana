package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.bank.all.BankActivity;
import o.IWorkManagerImplCallback;
import o.enqueueWorkRequests;

public final class BaseOptions implements getBindingAdapter<BankActivity> {
    @InjectedFieldSignature("id.dana.sendmoney.bank.all.BankActivity.recipientPresenter")
    public static void getMin(BankActivity bankActivity, enqueueWorkRequests.length length) {
        bankActivity.recipientPresenter = length;
    }

    @InjectedFieldSignature("id.dana.sendmoney.bank.all.BankActivity.billerX2BPresenter")
    public static void getMin(BankActivity bankActivity, IWorkManagerImplCallback.Stub.Proxy.getMin getmin) {
        bankActivity.billerX2BPresenter = getmin;
    }
}
