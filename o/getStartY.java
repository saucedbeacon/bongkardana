package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity;
import o.IWorkManagerImplCallback;

public final class getStartY implements getBindingAdapter<BankRecipientActivity> {
    @InjectedFieldSignature("id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity.billerX2BPresenter")
    public static void getMin(BankRecipientActivity bankRecipientActivity, IWorkManagerImplCallback.Stub.Proxy.getMin getmin) {
        bankRecipientActivity.billerX2BPresenter = getmin;
    }
}
