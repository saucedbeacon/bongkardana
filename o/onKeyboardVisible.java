package o;

import id.dana.data.Source;
import id.dana.data.globalnetwork.source.GnPaymentDataFactory;
import id.dana.domain.globalnetwork.model.Pay;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.NetworkUtil;
import o.TabBarInfoQueryPoint;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class onKeyboardVisible extends setMinProgress implements onWebViewDestory {
    private static final int PAYMENT_RESULT_DELAY_IN_SECONDS = 3;
    private final FontSizeSetting forexResultMapper;
    private final preload globalNetworkDataFactory;
    private final createErrorView gnConfigDataFactory;
    private final registerFontSizeChangeListener gnConsultMapper;
    private final unRegiseterFontSizeChangeListener gnContentMapper;
    private final GnPaymentDataFactory gnPaymentDataFactory;
    private final specToLayoutParam preferenceGnPaymentEntityData;
    private final NetworkUtil.AnonymousClass1 sendRiskEventEntityDataFactory;
    private final setTransparentColor uniPaymentDataFactory;
    private final ColorSchemeModelTemplate userLocation;

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$sendRiskEvent$12(Throwable th, Integer num) throws Exception {
        return num;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$sendRiskEvent$7(Throwable th, Integer num) throws Exception {
        return num;
    }

    @Inject
    public onKeyboardVisible(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, preload preload, FontSizeSetting fontSizeSetting, registerFontSizeChangeListener registerfontsizechangelistener, unRegiseterFontSizeChangeListener unregiseterfontsizechangelistener, GnPaymentDataFactory gnPaymentDataFactory2, setTransparentColor settransparentcolor, specToLayoutParam spectolayoutparam, ColorSchemeModelTemplate colorSchemeModelTemplate, NetworkUtil.AnonymousClass1 r13, createErrorView createerrorview) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.globalNetworkDataFactory = preload;
        this.forexResultMapper = fontSizeSetting;
        this.gnConsultMapper = registerfontsizechangelistener;
        this.gnContentMapper = unregiseterfontsizechangelistener;
        this.gnPaymentDataFactory = gnPaymentDataFactory2;
        this.uniPaymentDataFactory = settransparentcolor;
        this.preferenceGnPaymentEntityData = spectolayoutparam;
        this.userLocation = colorSchemeModelTemplate;
        this.sendRiskEventEntityDataFactory = r13;
        this.gnConfigDataFactory = createerrorview;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkEnabled() {
        return createLocationData().isGlobalNetworkEnabled();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkMode() {
        return isGlobalNetworkEnabled().flatMap(new onStarted(this));
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getGnCountryFlag(String str) {
        return createConfigData().getGnCountryFlag(str).onErrorResumeNext(createConfigAmcsData().getGnCountryFlag(str));
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getGnCountryFlagSquare(String str) {
        return createConfigData().getGnCountryFlagSquare(str).onErrorResumeNext(createConfigAmcsData().getGnCountryFlagSquare(str));
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getCountryCodeByLocation(String str) {
        return createLocationData().getCountryCodeByLocation(str).onErrorResumeNext(createLocationData().getCountryCodeByCloudLocation(str));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getGnCountriesWhitelist() {
        return createConfigData().getGnCountriesWhitelist().onErrorResumeNext(createConfigAmcsData().getGnCountriesWhitelist());
    }

    public TitleBarRightButtonView.AnonymousClass1<PageProcessPoint> getGnContent(String str) {
        TitleBarRightButtonView.AnonymousClass1<attachPage> onErrorResumeNext = createConfigData().getGnContent(str).onErrorResumeNext(createConfigAmcsData().getGnContent(str));
        unRegiseterFontSizeChangeListener unregiseterfontsizechangelistener = this.gnContentMapper;
        Objects.requireNonNull(unregiseterfontsizechangelistener);
        return onErrorResumeNext.map(new queryTabBarInfo(unregiseterfontsizechangelistener));
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getSelectedCountryCode() {
        return createSessionData().getSelectedCountryCode();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveSelectedCountryCode(String str) {
        return createSessionData().saveSelectedCountryCode(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getOriginCountryCode() {
        return createSessionData().getOriginCountryCode();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveOriginCountryCode(String str) {
        return createSessionData().saveOriginCountryCode(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getCurrentCountryCode() {
        return createSessionData().getCurrentCountryCode();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveCurrentCountryCode(String str) {
        return createSessionData().saveCurrentCountryCode(str).doOnNext(new TitleBarShowClosePoint(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$saveCurrentCountryCode$0(String str, Boolean bool) throws Exception {
        this.userLocation.setCurrentCountryCode(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<initUC7zSo> getForexRate(String str, String str2) {
        TitleBarRightButtonView.AnonymousClass1<ErrorView> forexRate = createPaymentData().getForexRate(str, str2);
        FontSizeSetting fontSizeSetting = this.forexResultMapper;
        Objects.requireNonNull(fontSizeSetting);
        return forexRate.map(new onTrasparentTitle(fontSizeSetting)).doOnError(new ToastPoint(this, str2, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getForexRate$1(String str, String str2, Throwable th) throws Exception {
        getForexCache(str, str2);
    }

    public TitleBarRightButtonView.AnonymousClass1<List<initUC7zSo>> getRealtimeForexList(List<String> list, List<String> list2) {
        TitleBarRightButtonView.AnonymousClass1<List<ErrorView>> listRealTimeForexRate = createPaymentData().getListRealTimeForexRate(list, list2);
        FontSizeSetting fontSizeSetting = this.forexResultMapper;
        Objects.requireNonNull(fontSizeSetting);
        return listRealTimeForexRate.map(new showToast(fontSizeSetting));
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getGnPaymentCode() {
        return createSessionData().getSelectedCountryCode().flatMap(new onSubTitleClick(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getGnPaymentCode$2(String str) throws Exception {
        return createPaymentData().getGnPaymentCode(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<initUC7zSo> getForexCache(String str, String str2) {
        return createLocalPaymentData().getForexCache(str, str2);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveForex(initUC7zSo inituc7zso) {
        return createLocalPaymentData().saveForex(inituc7zso);
    }

    public TitleBarRightButtonView.AnonymousClass1<RenderLoadingStatusChangePoint> getGlobalNetworkAuth() {
        return createPaymentData().getGlobalNetworkAuth().map(TitleBarTransparentPoint.length);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> clearGlobalNetwork() {
        return createPaymentData().clearGlobalNetwork();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getGnFirstWelcoming() {
        return createSessionData().getGnWelcomingFirstTime();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveGnFirstWelcoming(Boolean bool) {
        return createSessionData().saveGnWelcomingFirstTime(bool.booleanValue());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getGnPayQrTooltip() {
        return createSessionData().getGnPayQrTooltip();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveGnPayQrTooltip(Boolean bool) {
        return createSessionData().saveGnPayQrTooltip(bool.booleanValue());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> savePaymentCode(String str) {
        return createCachePaymentData().saveGnPaymentCode(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> clearAllPaymentCodes() {
        return this.preferenceGnPaymentEntityData.clearAllPaymentCodes().repeatWhen(hideToast.getMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<BaseGriverRpcResult> getUniPaymentResult(String str) {
        return this.preferenceGnPaymentEntityData.getAllPaymentCodes().flatMap(new isInner(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getUniPaymentResult$6(String str, List list) throws Exception {
        if (list.isEmpty()) {
            return TitleBarRightButtonView.AnonymousClass1.just(new BaseGriverRpcResult());
        }
        TitleBarRightButtonView.AnonymousClass1<R> map = createAccountData().getUserId().flatMap(new showClose(this, list, str)).map(onTitleClick.setMin).map(showFavorites.length);
        specToLayoutParam spectolayoutparam = this.preferenceGnPaymentEntityData;
        Objects.requireNonNull(spectolayoutparam);
        return map.doOnNext(new TitleBarTitleClickPoint(spectolayoutparam));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getAlipayConnectServiceFirstTime() {
        return createSessionData().getAlipayConnectServiceFirstTime();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveAlipayConnectServiceFirstTime(Boolean bool) {
        return createSessionData().saveAlipayConnectServiceFirstTime(bool.booleanValue());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> sendRiskEvent() {
        return authenticatedRequest(TitleBarRightButtonView.AnonymousClass1.zip(getCurrentCountryCode(), getOriginCountryCode(), KeyBoardVisiblePoint.getMax).flatMap(new TabBarInfoQueryPoint(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$sendRiskEvent$11(setNegativeButton setnegativebutton) throws Exception {
        return createNetworkRiskEventData().sendRiskEvent((String) setnegativebutton.setMax, (String) setnegativebutton.getMin).retryWhen(onOptionClick.length).map(TitleBarSegCheckPoint.length);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> sendRiskEvent(String str, String str2) {
        return authenticatedRequest(createNetworkRiskEventData().sendRiskEvent(str2, str).retryWhen(onCloseClick.setMin).map(TitleBarDisclaimerClickPoint.length));
    }

    public TitleBarRightButtonView.AnonymousClass1<String> decodeGnQr(String str, String str2, boolean z) {
        return createPaymentData().decodeGnQr(str, str2, z);
    }

    public TitleBarRightButtonView.AnonymousClass1<Pay> getPayRequest() {
        return createPaymentData().getPayRequest().map(onDisclaimerClick.length);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> openMerchantCashier() {
        return createPaymentData().openMerchantCashier();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isCScanBEnabled() {
        return createLocationData().isCScanBEnabled();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getGnCScanBBlacklistedCountry() {
        return createConfigData().getGnCScanBBlacklistedCountry();
    }

    public ReceivedTitlePoint doGnConsult(Map<String, String> map, String str) {
        return this.gnConsultMapper.transform(createLocationData().doGnConsult(map, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: getUniPaymentResult */
    public TitleBarRightButtonView.AnonymousClass1<createTitleBar> lambda$getUniPaymentResult$4(List<String> list, String str, String str2) {
        return createNetworkUniPayment().getUniPaymentResult(list, str, str2);
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> checkGlobalNetworkMode(boolean z) {
        return createSessionData().isGlobalNetworkMode().map(new TabBarInfoQueryPoint.OnTabBarInfoQueryListener(z));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$checkGlobalNetworkMode$16(boolean z, Boolean bool) throws Exception {
        return Boolean.valueOf(bool.booleanValue() && z);
    }

    private PageShowPoint createSessionData() {
        return this.globalNetworkDataFactory.createData("local");
    }

    private PageShowPoint createLocationData() {
        return this.globalNetworkDataFactory.createData("network");
    }

    private getStateListDrawable createConfigData() {
        return this.gnConfigDataFactory.createData(Source.SPLIT);
    }

    private getStateListDrawable createConfigAmcsData() {
        return this.gnConfigDataFactory.createData("amcs");
    }

    private getStateColor createPaymentData() {
        return this.gnPaymentDataFactory.createData("network");
    }

    private getStateColor createCachePaymentData() {
        return this.gnPaymentDataFactory.createData("local");
    }

    private getStateColor createLocalPaymentData() {
        return this.gnPaymentDataFactory.createData("local");
    }

    private getStatusBarHeight createNetworkUniPayment() {
        return this.uniPaymentDataFactory.createData("local");
    }

    private RVTransportService createNetworkRiskEventData() {
        return this.sendRiskEventEntityDataFactory.createData("network");
    }
}
