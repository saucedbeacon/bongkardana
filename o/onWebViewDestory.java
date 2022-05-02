package o;

import id.dana.domain.globalnetwork.model.Pay;
import java.util.List;
import java.util.Map;
import o.TitleBarRightButtonView;

public interface onWebViewDestory {
    TitleBarRightButtonView.AnonymousClass1<Boolean> clearAllPaymentCodes();

    TitleBarRightButtonView.AnonymousClass1<Boolean> clearGlobalNetwork();

    TitleBarRightButtonView.AnonymousClass1<String> decodeGnQr(String str, String str2, boolean z);

    ReceivedTitlePoint doGnConsult(Map<String, String> map, String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> getAlipayConnectServiceFirstTime();

    TitleBarRightButtonView.AnonymousClass1<String> getCountryCodeByLocation(String str);

    TitleBarRightButtonView.AnonymousClass1<String> getCurrentCountryCode();

    TitleBarRightButtonView.AnonymousClass1<initUC7zSo> getForexCache(String str, String str2);

    TitleBarRightButtonView.AnonymousClass1<initUC7zSo> getForexRate(String str, String str2);

    TitleBarRightButtonView.AnonymousClass1<RenderLoadingStatusChangePoint> getGlobalNetworkAuth();

    TitleBarRightButtonView.AnonymousClass1<List<String>> getGnCScanBBlacklistedCountry();

    TitleBarRightButtonView.AnonymousClass1<PageProcessPoint> getGnContent(String str);

    TitleBarRightButtonView.AnonymousClass1<List<String>> getGnCountriesWhitelist();

    TitleBarRightButtonView.AnonymousClass1<String> getGnCountryFlag(String str);

    TitleBarRightButtonView.AnonymousClass1<String> getGnCountryFlagSquare(String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> getGnFirstWelcoming();

    TitleBarRightButtonView.AnonymousClass1<Boolean> getGnPayQrTooltip();

    TitleBarRightButtonView.AnonymousClass1<String> getGnPaymentCode();

    TitleBarRightButtonView.AnonymousClass1<String> getOriginCountryCode();

    TitleBarRightButtonView.AnonymousClass1<Pay> getPayRequest();

    TitleBarRightButtonView.AnonymousClass1<List<initUC7zSo>> getRealtimeForexList(List<String> list, List<String> list2);

    TitleBarRightButtonView.AnonymousClass1<String> getSelectedCountryCode();

    TitleBarRightButtonView.AnonymousClass1<BaseGriverRpcResult> getUniPaymentResult(String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> isCScanBEnabled();

    TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkEnabled();

    TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkMode();

    TitleBarRightButtonView.AnonymousClass1<Boolean> openMerchantCashier();

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveAlipayConnectServiceFirstTime(Boolean bool);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveCurrentCountryCode(String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveForex(initUC7zSo inituc7zso);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveGnFirstWelcoming(Boolean bool);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveGnPayQrTooltip(Boolean bool);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveOriginCountryCode(String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> savePaymentCode(String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveSelectedCountryCode(String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> sendRiskEvent();

    TitleBarRightButtonView.AnonymousClass1<Boolean> sendRiskEvent(String str, String str2);
}
