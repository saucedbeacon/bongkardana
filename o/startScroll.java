package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney_v2.recipient.activity.SearchRecipientActivity;
import o.DiagnosticsReceiver;
import o.IWorkManagerImplCallback;

public final class startScroll implements getBindingAdapter<SearchRecipientActivity> {
    @InjectedFieldSignature("id.dana.sendmoney_v2.recipient.activity.SearchRecipientActivity.billerX2BPresenter")
    public static void setMax(SearchRecipientActivity searchRecipientActivity, IWorkManagerImplCallback.Stub.Proxy.getMin getmin) {
        searchRecipientActivity.billerX2BPresenter = getmin;
    }

    @InjectedFieldSignature("id.dana.sendmoney_v2.recipient.activity.SearchRecipientActivity.calculatorPresenter")
    public static void setMax(SearchRecipientActivity searchRecipientActivity, DiagnosticsReceiver.getMin getmin) {
        searchRecipientActivity.calculatorPresenter = getmin;
    }
}
