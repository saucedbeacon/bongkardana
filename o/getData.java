package o;

import android.text.TextUtils;
import android.util.Pair;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;
import o.DefaultAuthenticationProxyImpl;
import o.RemoteDebugController;
import o.TitleBarRightButtonView;
import o.VisitNode;
import o.b;

@Singleton
public class getData extends setMinProgress implements setMediaPlaybackRequiresUserGesture {
    private final onCallBack configEntityDataFactory;
    private final getBindedExtensionManager deepLinkEntityMapper;
    private final setPageLoaded generateLinkEntityDataFactory;
    private final getExtraAttrByJoinList myReferralConsultEntityDataFactory;
    private final clearAllMethodInvokeOptimizer qrBarcodeEntityDataFactory;
    private final RemoteDebugController.AnonymousClass1 recentPayerEntityDataFactory;
    private final setH5AuthParams recentPayerEntityMapper;
    private final DefaultAuthenticationProxyImpl.AnonymousClass2 splitBillEncodeEntityMapper;
    private final onConnectError splitBillEntityDataFactory;
    private String splitBillId;
    private final setPositiveListener splitBillPayerEntityMapper;
    private final setNegativeListener splitBillToSplitBillEntityMapper;

    /* access modifiers changed from: private */
    public static /* synthetic */ APWebSettings lambda$generateSplitBillQrDeepLink$5(APWebSettings aPWebSettings, Long l) throws Exception {
        return aPWebSettings;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ APWebSettings lambda$generateSplitBillQrDeepLink$7(APWebSettings aPWebSettings, List list) throws Exception {
        return aPWebSettings;
    }

    @Inject
    public getData(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, onCallBack oncallback, setPageLoaded setpageloaded, getExtraAttrByJoinList getextraattrbyjoinlist, getBindedExtensionManager getbindedextensionmanager, getAppLaunchParams getapplaunchparams, clearAllMethodInvokeOptimizer clearallmethodinvokeoptimizer, onConnectError onconnecterror, RemoteDebugController.AnonymousClass1 r11, setH5AuthParams seth5authparams, setPositiveListener setpositivelistener, setNegativeListener setnegativelistener, DefaultAuthenticationProxyImpl.AnonymousClass2 r15) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.configEntityDataFactory = oncallback;
        this.generateLinkEntityDataFactory = setpageloaded;
        this.myReferralConsultEntityDataFactory = getextraattrbyjoinlist;
        this.deepLinkEntityMapper = getbindedextensionmanager;
        this.qrBarcodeEntityDataFactory = clearallmethodinvokeoptimizer;
        this.splitBillEntityDataFactory = onconnecterror;
        this.recentPayerEntityDataFactory = r11;
        this.recentPayerEntityMapper = seth5authparams;
        this.splitBillPayerEntityMapper = setpositivelistener;
        this.splitBillToSplitBillEntityMapper = setnegativelistener;
        this.splitBillEncodeEntityMapper = r15;
    }

    public TitleBarRightButtonView.AnonymousClass1<APWebSettings> generateReferralDeepLink(String str) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createConfigData().isBranchDeepLinkEnable().flatMap(new getGroup(this, str));
        getBindedExtensionManager getbindedextensionmanager = this.deepLinkEntityMapper;
        Objects.requireNonNull(getbindedextensionmanager);
        return flatMap.map(new getStringValue(getbindedextensionmanager));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$generateReferralDeepLink$0(String str, Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            return TitleBarRightButtonView.AnonymousClass1.just(new VisitNode.AnonymousClass1("https://danareferral.onelink.me/MofA/8f49532e"));
        }
        return createBranchData().generateReferralDeepLink(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<APWebSettings> generateTransferQrDeepLink(String str, String str2, String str3) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createConfigData().isBranchDeepLinkEnable().flatMap(new putJsonValue(this, str, str2, str3));
        getBindedExtensionManager getbindedextensionmanager = this.deepLinkEntityMapper;
        Objects.requireNonNull(getbindedextensionmanager);
        return flatMap.map(new getStringValue(getbindedextensionmanager));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$generateTransferQrDeepLink$1(String str, String str2, String str3, Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            return TitleBarRightButtonView.AnonymousClass1.just(new VisitNode.AnonymousClass1(str));
        }
        return bindWithReferral(str).flatMap(getTransferQrDeepLink(str2, str3));
    }

    public TitleBarRightButtonView.AnonymousClass1<APWebSettings> generateProfileQrDeepLink(String str, String str2, String str3, boolean z) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createConfigData().isBranchDeepLinkEnable().flatMap(new initRender(this, str, str2, str3, z));
        getBindedExtensionManager getbindedextensionmanager = this.deepLinkEntityMapper;
        Objects.requireNonNull(getbindedextensionmanager);
        return flatMap.map(new getStringValue(getbindedextensionmanager));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$generateProfileQrDeepLink$3(String str, String str2, String str3, boolean z, Boolean bool) throws Exception {
        if (bool.booleanValue() || TextUtils.isEmpty(str)) {
            return bindWithReferral(str).flatMap(generateLinkEntityData(str, str2, str3, z)).doOnNext(new getPageURI(this, str, z));
        }
        return TitleBarRightButtonView.AnonymousClass1.just(new VisitNode.AnonymousClass1(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$generateProfileQrDeepLink$2(String str, boolean z, VisitNode.AnonymousClass1 r3) throws Exception {
        if (isSaveToLocal(str, r3, z)) {
            saveDeepLinkProfileQr(r3);
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<save> generateSplitBillQrDeepLink(getExtraBeaconDataTracker getextrabeacondatatracker, String str, String str2) {
        return getSplitBillQrCode(getextrabeacondatatracker).flatMap(new getRender(this)).flatMap(new getOriginalURI(this, str, str2)).flatMap(new getPageType(this, getextrabeacondatatracker)).flatMap(new onEnter(this, getextrabeacondatatracker)).map(getSplitBillDeeplink());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$generateSplitBillQrDeepLink$4(String str, String str2, BridgeDSL bridgeDSL) throws Exception {
        return generateSplitBillDeepLink(bridgeDSL.splitBillId, bridgeDSL.qrCode, str, str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$generateSplitBillQrDeepLink$6(getExtraBeaconDataTracker getextrabeacondatatracker, APWebSettings aPWebSettings) throws Exception {
        return saveSplitBillHistory(aPWebSettings, getextrabeacondatatracker).map(new PageNode(aPWebSettings));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$generateSplitBillQrDeepLink$8(getExtraBeaconDataTracker getextrabeacondatatracker, APWebSettings aPWebSettings) throws Exception {
        return saveRecentPayer(aPWebSettings, getextrabeacondatatracker.getPayers()).map(new putJsonArrayValue(aPWebSettings));
    }

    private RedDotDrawable<APWebSettings, save> getSplitBillDeeplink() {
        return new onHide(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ save lambda$getSplitBillDeeplink$9(APWebSettings aPWebSettings) throws Exception {
        this.splitBillEncodeEntityMapper.setSplitBillId(this.splitBillId);
        return (save) this.splitBillEncodeEntityMapper.apply(aPWebSettings.getLink());
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<BridgeDSL> setSplitBillId(BridgeDSL bridgeDSL) {
        this.splitBillId = bridgeDSL.splitBillId;
        return TitleBarRightButtonView.AnonymousClass1.just(bridgeDSL);
    }

    private boolean isSaveToLocal(String str, VisitNode.AnonymousClass1 r2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(r2.getLink())) {
            return false;
        }
        return !z || !r2.isReferralCodeEmpty();
    }

    private TitleBarRightButtonView.AnonymousClass1<BridgeDSL> getSplitBillQrCode(getExtraBeaconDataTracker getextrabeacondatatracker) {
        return authenticatedRequest(createNetworkQrBarcodeData().requestSplitBillCode((List) this.splitBillPayerEntityMapper.apply(getextrabeacondatatracker.getPayers()), getextrabeacondatatracker.getComment()));
    }

    private TitleBarRightButtonView.AnonymousClass1<APWebSettings> generateSplitBillDeepLink(String str, String str2, String str3, String str4) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createConfigData().isBranchDeepLinkEnable().flatMap(new enter(this, str2, str, str3, str4));
        getBindedExtensionManager getbindedextensionmanager = this.deepLinkEntityMapper;
        Objects.requireNonNull(getbindedextensionmanager);
        return flatMap.map(new getStringValue(getbindedextensionmanager));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$generateSplitBillDeepLink$10(String str, String str2, String str3, String str4, Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            return TitleBarRightButtonView.AnonymousClass1.just(new VisitNode.AnonymousClass1(str));
        }
        return bindWithReferral(str).flatMap(getSplitBillQrDeepLink(str2, str3, str4));
    }

    private RedDotDrawable<Pair<String, String>, TitleBarRightButtonView.AnonymousClass4<VisitNode.AnonymousClass1>> getSplitBillQrDeepLink(String str, String str2, String str3) {
        return new containsKey(this, str, str2, str3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSplitBillQrDeepLink$12(String str, String str2, String str3, Pair pair) throws Exception {
        return createAccountData().getUserId().flatMap(new getJsonArrayValue(this, str, pair, str2, str3));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSplitBillQrDeepLink$11(String str, Pair pair, String str2, String str3, String str4) throws Exception {
        return createBranchData().generateSplitBillQrDeepLink(str4, str, (String) pair.first, (String) pair.second, str2, str3);
    }

    private TitleBarRightButtonView.AnonymousClass1<Long> saveSplitBillHistory(APWebSettings aPWebSettings, getExtraBeaconDataTracker getextrabeacondatatracker) {
        if (aPWebSettings == null || TextUtils.isEmpty(aPWebSettings.getLink())) {
            return TitleBarRightButtonView.AnonymousClass1.error(new Throwable());
        }
        this.splitBillToSplitBillEntityMapper.setDeeplinkUrl(aPWebSettings.getLink());
        this.splitBillToSplitBillEntityMapper.setSplitBillId(this.splitBillId);
        return createLocalSplitBillData().saveSplitBillHistory((sendNetworkResponse) this.splitBillToSplitBillEntityMapper.apply(getextrabeacondatatracker));
    }

    private TitleBarRightButtonView.AnonymousClass1<List<Long>> saveRecentPayer(APWebSettings aPWebSettings, List<setExtraBeaconDataTracker> list) {
        if (aPWebSettings == null || TextUtils.isEmpty(aPWebSettings.getLink())) {
            return TitleBarRightButtonView.AnonymousClass1.error(new Throwable());
        }
        return createLocalRecentPayerData().saveRecentPayers((List) this.recentPayerEntityMapper.apply(list));
    }

    private RedDotDrawable<Pair<String, String>, TitleBarRightButtonView.AnonymousClass4<VisitNode.AnonymousClass1>> generateLinkEntityData(String str, String str2, String str3, boolean z) {
        return new getBooleanValue(this, str, str2, str3, z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$generateLinkEntityData$14(String str, String str2, String str3, boolean z, Pair pair) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.defer(new setRender(this, str)).flatMap(getProfileQrDeepLink(pair, str2, str3, z));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$generateLinkEntityData$13(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return TitleBarRightButtonView.AnonymousClass1.just(createLocalData());
        }
        return TitleBarRightButtonView.AnonymousClass1.just(createBranchData());
    }

    private RedDotDrawable<setPageId, TitleBarRightButtonView.AnonymousClass4<VisitNode.AnonymousClass1>> getProfileQrDeepLink(Pair<String, String> pair, String str, String str2, boolean z) {
        return new putBooleanValue(this, pair, str, str2, z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getProfileQrDeepLink$16(Pair pair, String str, String str2, boolean z, setPageId setpageid) throws Exception {
        return createAccountData().getUserId().flatMap(new putLongValue(setpageid, pair, str, str2, z));
    }

    private RedDotDrawable<Pair<String, String>, TitleBarRightButtonView.AnonymousClass4<VisitNode.AnonymousClass1>> getTransferQrDeepLink(String str, String str2) {
        return new putStringValue(this, str, str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getTransferQrDeepLink$18(String str, String str2, Pair pair) throws Exception {
        return createAccountData().getUserId().flatMap(new getJsonValue(this, pair, str, str2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getTransferQrDeepLink$17(Pair pair, String str, String str2, String str3) throws Exception {
        return createBranchData().generateTransferQrDeepLink(str3, (String) pair.first, (String) pair.second, str, str2);
    }

    private AppMsgReceiver.AnonymousClass2 createConfigData() {
        return this.configEntityDataFactory.createData("network");
    }

    private setPageId createBranchData() {
        return this.generateLinkEntityDataFactory.createData("network");
    }

    private setPageId createLocalData() {
        return this.generateLinkEntityDataFactory.createData("local");
    }

    private setupMethodInvokeOptimizerForBridge createNetworkQrBarcodeData() {
        return this.qrBarcodeEntityDataFactory.createData("network");
    }

    private onRemoteDebugExitClick createLocalSplitBillData() {
        return this.splitBillEntityDataFactory.createData("local");
    }

    private onConnectClosed createLocalRecentPayerData() {
        return this.recentPayerEntityDataFactory.createData("local");
    }

    private void saveDeepLinkProfileQr(VisitNode.AnonymousClass1 r3) {
        StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.DEEPLINK_PROFILE_QR);
        sb.append(getClass().getName());
        sb.append("Save Link to local");
        sb.append(r3.getLink());
        updateActionSheetContent.d(DanaLogConstants.TAG.QRCODE_TAG, sb.toString());
        createLocalData().saveProfileQrDeepLink(r3.getLink(), !r3.isReferralCodeEmpty());
    }

    private TitleBarRightButtonView.AnonymousClass1<Pair<String, String>> bindWithReferral(String str) {
        return createReferralEntityData("local").getReferralCode().onErrorResumeNext(retryReferralWithNetwork()).flatMap(new getLongValue(str));
    }

    private getTrackerIdWithIndex createReferralEntityData(String str) {
        return this.myReferralConsultEntityDataFactory.createData(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$retryReferralWithNetwork$20(Throwable th) throws Exception {
        return authenticatedRequest(createReferralEntityData("network").getMyReferralConsult()).map(getIntValue.setMax).onErrorResumeNext(TitleBarRightButtonView.AnonymousClass1.just(""));
    }

    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends String>> retryReferralWithNetwork() {
        return new putIntValue(this);
    }
}
