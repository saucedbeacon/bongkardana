package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney_v2.landing.view.RecentTransactionView;
import o.IWorkManagerImplCallback;
import o.setMediaId;

public final class getThisMonth implements getBindingAdapter<RecentTransactionView> {
    @InjectedFieldSignature("id.dana.sendmoney_v2.landing.view.RecentTransactionView.presenter")
    public static void setMin(RecentTransactionView recentTransactionView, setMediaId.setMax setmax) {
        recentTransactionView.presenter = setmax;
    }

    @InjectedFieldSignature("id.dana.sendmoney_v2.landing.view.RecentTransactionView.billerX2BPresenter")
    public static void getMax(RecentTransactionView recentTransactionView, IWorkManagerImplCallback.Stub.Proxy.getMin getmin) {
        recentTransactionView.billerX2BPresenter = getmin;
    }
}
