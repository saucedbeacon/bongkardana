package o;

import id.dana.data.globalnetwork.model.GnAuthResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class specToLayoutParam implements getStateColor {
    private final getWidthSpec globalNetworkPreference;

    @Inject
    public specToLayoutParam(getWidthSpec getwidthspec) {
        this.globalNetworkPreference = getwidthspec;
    }

    public TitleBarRightButtonView.AnonymousClass1<ErrorView> getForexRate(String str, String str2) {
        return TitleBarRightButtonView.AnonymousClass1.just(new ErrorView());
    }

    public TitleBarRightButtonView.AnonymousClass1<List<ErrorView>> getListRealTimeForexRate(List<String> list, List<String> list2) {
        return TitleBarRightButtonView.AnonymousClass1.just(new ArrayList());
    }

    public TitleBarRightButtonView.AnonymousClass1<initUC7zSo> getForexCache(String str, String str2) {
        initUC7zSo forexCache = this.globalNetworkPreference.getForexCache(str2);
        return forexCache == null ? TitleBarRightButtonView.AnonymousClass1.error(new Throwable()) : TitleBarRightButtonView.AnonymousClass1.just(forexCache);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveForex(initUC7zSo inituc7zso) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.globalNetworkPreference.saveForex(inituc7zso)));
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getGnPaymentCode(String str) {
        return filterPaymentCode(this.globalNetworkPreference.getPaymentCodes()).flatMap(ViewUtils.getMin);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveGnPaymentCode(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.globalNetworkPreference.savePaymentCode(str)));
    }

    public TitleBarRightButtonView.AnonymousClass1<GnAuthResult> getGlobalNetworkAuth() {
        return TitleBarRightButtonView.AnonymousClass1.just(new GnAuthResult(""));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> clearGlobalNetwork() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<String> decodeGnQr(String str, String str2, boolean z) {
        return TitleBarRightButtonView.AnonymousClass1.just("");
    }

    public TitleBarRightButtonView.AnonymousClass1<showErrorView> getPayRequest() {
        return TitleBarRightButtonView.AnonymousClass1.just(null, null);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> openMerchantCashier() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> invalidatePaymentCode(BaseGriverRpcResult baseGriverRpcResult) {
        if (!(baseGriverRpcResult == null || baseGriverRpcResult.getOrderInfo() == null || baseGriverRpcResult.getOrderInfo().getPaymentCode() == null)) {
            Set<addRenderView> paymentCodeSet = this.globalNetworkPreference.getPaymentCodeSet();
            paymentCodeSet.remove(new addRenderView(baseGriverRpcResult.getOrderInfo().getPaymentCode(), new Date(), false));
            this.globalNetworkPreference.savePaymentCodes(paymentCodeSet);
        }
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getAllPaymentCodes() {
        return filterPaymentCode(this.globalNetworkPreference.getPaymentCodes());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> clearAllPaymentCodes() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.globalNetworkPreference.savePaymentCodes(new HashSet())));
    }

    private TitleBarRightButtonView.AnonymousClass1<List<String>> filterPaymentCode(List<addRenderView> list) {
        ArrayList arrayList = new ArrayList();
        for (addRenderView code : list) {
            arrayList.add(code.getCode());
        }
        return TitleBarRightButtonView.AnonymousClass1.just(arrayList);
    }
}
