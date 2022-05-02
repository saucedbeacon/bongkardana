package o;

import com.alipay.iap.android.wallet.acl.payment.PaymentAmount;
import com.alipay.iap.android.wallet.acl.payment.PaymentRequest;
import com.alipay.iap.android.wallet.acl.payment.PaymentResult;
import com.alipay.iap.android.wallet.acl.payment.PaymentType;
import id.dana.data.globalnetwork.model.GnAuthResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.TitleBarRightButtonView;

public final class setLight implements getStateColor {
    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPayRequest$0(PaymentResult paymentResult) {
    }

    public final TitleBarRightButtonView.AnonymousClass1<ErrorView> getForexRate(String str, String str2) {
        ErrorView errorView = new ErrorView();
        errorView.setId("1");
        errorView.setCurrencyPair("IDR/JPY");
        errorView.setPrice("0.008");
        return TitleBarRightButtonView.AnonymousClass1.just(errorView);
    }

    public final TitleBarRightButtonView.AnonymousClass1<List<ErrorView>> getListRealTimeForexRate(List<String> list, List<String> list2) {
        return TitleBarRightButtonView.AnonymousClass1.just(new ArrayList());
    }

    public final TitleBarRightButtonView.AnonymousClass1<initUC7zSo> getForexCache(String str, String str2) {
        return TitleBarRightButtonView.AnonymousClass1.just(new initUC7zSo());
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveForex(initUC7zSo inituc7zso) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public final TitleBarRightButtonView.AnonymousClass1<String> getGnPaymentCode(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just("281012026134677478611545");
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveGnPaymentCode(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public final TitleBarRightButtonView.AnonymousClass1<GnAuthResult> getGlobalNetworkAuth() {
        return TitleBarRightButtonView.AnonymousClass1.just(new GnAuthResult("3435353535353"));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> clearGlobalNetwork() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    public final TitleBarRightButtonView.AnonymousClass1<String> decodeGnQr(String str, String str2, boolean z) {
        return TitleBarRightButtonView.AnonymousClass1.just("uenfkefnekjfneskjfns");
    }

    public final TitleBarRightButtonView.AnonymousClass1<showErrorView> getPayRequest() {
        return TitleBarRightButtonView.AnonymousClass1.just(new showErrorView(false, new PaymentRequest(PaymentType.CASHIER_URL, "yenyenyen", new PaymentAmount(), new HashMap()), setDefault.getMin));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> openMerchantCashier() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }
}
