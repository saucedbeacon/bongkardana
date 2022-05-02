package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import id.dana.data.Source;
import id.dana.data.config.source.amcs.result.OTCAcceptExpiryTimeConfigResult;
import id.dana.data.content.SpaceCode;
import id.dana.data.content.mapper.ContentMapper;
import id.dana.data.content.mapper.ContentsMapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;
import o.GriverProgressBar;
import o.GriverSwipeRefreshLayout;
import o.RVConfigService;
import o.RVLogger;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

@Singleton
public class isNIOEnabled extends setMinProgress implements fromInt {
    private final ProcessUtils addPayMethodConfigFactory;
    private final handleMessage amcsConfigEntityData;
    private final isMainProcess billerX2BEntityDataFactory;
    private final getConfigJSONArray bizOTCTransferInitMapper;
    private getConfigWithProcessCache bizTransferInitMapper;
    private final onCallBack configEntityDataFactory;
    private getFontBar contentDeliveryEntityDataFactory;
    private ContentsMapper contentsMapper;
    private final getPerformanceTracker deviceInformationProvider;
    private final setAppContext digitalMoneyDataFactory;
    private APWebViewPerformance geocodeRepository;
    private ContentMapper mapper;
    private final exitNode promoEntityDataFactory;
    private final access$2300 securityEntityDataFactory;
    private final getClientVersion sendMoneyDataFactory;
    private final isTinyProcess sendMoneyHomeMenuConfigEntityDataFactory;
    private getScheduledExecutor sendMoneyHomeMenuMapper;
    private ExecutorType sendMoneyMapper;
    private final RVLogger sendMoneyPreferenceEntityDataFactory;
    private final RVLogger.Proxy sortingSendMoneyPreferenceEntityDataFactory;
    private AppUtils splitConfigEntityData;
    private KVStorageProxy transferInitParamRequestMapper;
    private final putString transferOTCSubmitRequestMapper;
    private RVScheduleType transferPrePayMapper;
    private getByteArray transferSubmitParamMapper;
    private px2dip withdrawInitMapper;
    private px2sp withdrawNameCheckMapper;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isNIOEnabled(DialogLayout dialogLayout, b.AnonymousClass3 r7, BackKeyDownPoint backKeyDownPoint, getClientVersion getclientversion, getPerformanceTracker getperformancetracker, ProcessUtils processUtils, putString putstring, onCallBack oncallback, getConfigJSONArray getconfigjsonarray, px2dip px2dip, getAppLaunchParams getapplaunchparams, isTinyProcess istinyprocess, exitNode exitnode, setAppContext setappcontext, access$2300 access_2300, RVLogger rVLogger, RVLogger.Proxy proxy, handleMessage handlemessage, AppUtils appUtils, isMainProcess ismainprocess, APWebViewPerformance aPWebViewPerformance) {
        super(dialogLayout, r7, backKeyDownPoint, getapplaunchparams);
        DialogLayout dialogLayout2 = dialogLayout;
        b.AnonymousClass3 r2 = r7;
        BackKeyDownPoint backKeyDownPoint2 = backKeyDownPoint;
        this.sendMoneyDataFactory = getclientversion;
        this.deviceInformationProvider = getperformancetracker;
        this.addPayMethodConfigFactory = processUtils;
        this.transferOTCSubmitRequestMapper = putstring;
        this.configEntityDataFactory = oncallback;
        this.bizOTCTransferInitMapper = getconfigjsonarray;
        this.withdrawInitMapper = px2dip;
        this.sendMoneyHomeMenuConfigEntityDataFactory = istinyprocess;
        this.promoEntityDataFactory = exitnode;
        this.digitalMoneyDataFactory = setappcontext;
        this.securityEntityDataFactory = access_2300;
        this.sendMoneyPreferenceEntityDataFactory = rVLogger;
        this.amcsConfigEntityData = handlemessage;
        this.sortingSendMoneyPreferenceEntityDataFactory = proxy;
        this.splitConfigEntityData = appUtils;
        this.billerX2BEntityDataFactory = ismainprocess;
        this.geocodeRepository = aPWebViewPerformance;
    }

    /* access modifiers changed from: package-private */
    @Inject
    public void injectMapperDependencies(ExecutorType executorType, getConfigWithProcessCache getconfigwithprocesscache, px2sp px2sp, getByteArray getbytearray, RVScheduleType rVScheduleType, ContentsMapper contentsMapper2, KVStorageProxy kVStorageProxy, getScheduledExecutor getscheduledexecutor) {
        this.sendMoneyMapper = executorType;
        this.bizTransferInitMapper = getconfigwithprocesscache;
        this.withdrawNameCheckMapper = px2sp;
        this.transferSubmitParamMapper = getbytearray;
        this.transferInitParamRequestMapper = kVStorageProxy;
        this.transferPrePayMapper = rVScheduleType;
        this.contentsMapper = contentsMapper2;
        this.sendMoneyHomeMenuMapper = getscheduledexecutor;
    }

    /* access modifiers changed from: package-private */
    @Inject
    public void injectCdpDependencies(getFontBar getfontbar, ContentMapper contentMapper) {
        this.contentDeliveryEntityDataFactory = getfontbar;
        this.mapper = contentMapper;
    }

    public TitleBarRightButtonView.AnonymousClass1<getPowerCorrection> getSendMoneyOption() {
        TitleBarRightButtonView.AnonymousClass1<IpcMessageConstants> authenticatedRequest = authenticatedRequest(createSendMoneyData().init());
        TitleBarRightButtonView.AnonymousClass1<List<addExtraDataParser>> addPayMethodConfig = getAddPayMethodConfig();
        ExecutorType executorType = this.sendMoneyMapper;
        Objects.requireNonNull(executorType);
        return authenticatedRequest.zipWith((TitleBarRightButtonView.AnonymousClass4<? extends U>) addPayMethodConfig, (removeNode<? super IpcMessageConstants, ? super U, ? extends R>) new copy(executorType));
    }

    public TitleBarRightButtonView.AnonymousClass1<getPowerCorrection> sendMoneyInit(String str, String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-41447612, oncanceled);
            onCancelLoad.getMin(-41447612, oncanceled);
        }
        TitleBarRightButtonView.AnonymousClass1<IpcMessageConstants> authenticatedRequest = authenticatedRequest(createSendMoneyData().init(str, str2));
        ExecutorType executorType = this.sendMoneyMapper;
        Objects.requireNonNull(executorType);
        return authenticatedRequest.map(new closeQuietly(executorType));
    }

    public TitleBarRightButtonView.AnonymousClass1<byteArrayToString> initPrePay(String str, String str2) {
        TitleBarRightButtonView.AnonymousClass1<R> authenticatedRequest = authenticatedRequest(this.geocodeRepository.getLatestSubdivisions().switchMap(new base64Deal(this, str, str2)));
        RVScheduleType rVScheduleType = this.transferPrePayMapper;
        Objects.requireNonNull(rVScheduleType);
        return authenticatedRequest.map(new marshallJSONArray(rVScheduleType));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$initPrePay$0(String str, String str2, GriverPerformanceStages griverPerformanceStages) throws Exception {
        return createSendMoneyData().initPrePay(new registerClientChannel(str, str2), griverPerformanceStages.getIndoSubdivisions().getCityName());
    }

    public TitleBarRightButtonView.AnonymousClass1<getServiceUuidEndOffset> sendMoney(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createAccountData().getAccount().flatMap(new unmarshallJSONArray(this, str, str2, str3, str4, str5, str6, str7, z, str8));
        ExecutorType executorType = this.sendMoneyMapper;
        Objects.requireNonNull(executorType);
        return flatMap.map(new unmarshallJSONObject(executorType));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$sendMoney$1(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, attach attach) throws Exception {
        return authenticatedRequest(createSendMoneyData().confirm(this.deviceInformationProvider.getDeviceUUID(), str, str2, attach.getAvatarUrl(), attach.getNickname(), str3, str4, str5, str6, str7, z, str8));
    }

    public TitleBarRightButtonView.AnonymousClass1<getDataFieldCount> getTransferOption(String str) {
        IpcClientKernelUtils ipcClientKernelUtils = new IpcClientKernelUtils();
        ipcClientKernelUtils.setNeedTransferMethod(true);
        ipcClientKernelUtils.setNeedPayMethod(true);
        ipcClientKernelUtils.setNeedWithdrawMethod(true);
        TitleBarRightButtonView.AnonymousClass1<marshall> bizInit = bizInit(ipcClientKernelUtils);
        getConfigWithProcessCache getconfigwithprocesscache = this.bizTransferInitMapper;
        Objects.requireNonNull(getconfigwithprocesscache);
        return authenticatedRequest(bizInit.map(new getColorLong(getconfigwithprocesscache)));
    }

    public TitleBarRightButtonView.AnonymousClass1<getDataFieldCount> getPayMethod(String str) {
        IpcClientKernelUtils ipcClientKernelUtils = new IpcClientKernelUtils();
        ipcClientKernelUtils.setNeedTransferMethod(true);
        ipcClientKernelUtils.setNeedPayMethod(true);
        if ("OTC".equals(str)) {
            ipcClientKernelUtils.setNeedWithdrawMethod(true);
        }
        ipcClientKernelUtils.setTransferMethod(str);
        return authenticatedRequest(bizInit(ipcClientKernelUtils).zipWith(getAddPayMethodConfig(), new matchRegex(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ getDataFieldCount lambda$getPayMethod$2(marshall marshall, List list) throws Exception {
        this.bizTransferInitMapper.setPayChannelFromAmcs(list);
        return (getDataFieldCount) this.bizTransferInitMapper.apply(marshall);
    }

    public TitleBarRightButtonView.AnonymousClass1<getDataFieldCount> transferInit(getIdentifierCount getidentifiercount) {
        TitleBarRightButtonView.AnonymousClass1<marshall> authenticatedRequest = authenticatedRequest(bizInit(this.transferInitParamRequestMapper.map(getidentifiercount)));
        getConfigWithProcessCache getconfigwithprocesscache = this.bizTransferInitMapper;
        Objects.requireNonNull(getconfigwithprocesscache);
        return authenticatedRequest.map(new getColorLong(getconfigwithprocesscache));
    }

    public TitleBarRightButtonView.AnonymousClass1<getBeaconAdvertisementData> transferOTCInit(String str, String str2) {
        onServerReady onserverready = new onServerReady();
        onserverready.setNeedTransferMethod(true);
        onserverready.setAmount(str);
        onserverready.setFundType(str2);
        return authenticatedRequest(TitleBarRightButtonView.AnonymousClass1.zip(bizInitOtc(onserverready), getAddPayMethodConfig(), createConfigData().getOTCExpiryConfig(), new LangResourceUtil(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ getBeaconAdvertisementData lambda$transferOTCInit$3(marshall marshall, List list, OTCAcceptExpiryTimeConfigResult oTCAcceptExpiryTimeConfigResult) throws Exception {
        this.bizOTCTransferInitMapper.setPayChannelFromAmcs(list);
        this.bizOTCTransferInitMapper.setAcceptExpiryTimeValue(oTCAcceptExpiryTimeConfigResult.getValue());
        this.bizOTCTransferInitMapper.setAcceptExpiryTimeUnit(oTCAcceptExpiryTimeConfigResult.getUnit());
        return (getBeaconAdvertisementData) this.bizOTCTransferInitMapper.apply(marshall);
    }

    public TitleBarRightButtonView.AnonymousClass1<ensureMaxSize> withdrawInit(Boolean bool, String str) {
        TitleBarRightButtonView.AnonymousClass1<IpcMessageHandler> withdrawInit = withdrawInit(new getClientChannel(bool, str));
        px2dip px2dip = this.withdrawInitMapper;
        Objects.requireNonNull(px2dip);
        return authenticatedRequest(withdrawInit.map(new parcelAndUnParcel(px2dip)));
    }

    public TitleBarRightButtonView.AnonymousClass1<parseHex> nameCheck(setAllowPduOverflow setallowpduoverflow) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.amcsConfigEntityData.isEncryptCardEnabled().flatMap(new freeMappedBuffer(this, setallowpduoverflow));
        px2sp px2sp = this.withdrawNameCheckMapper;
        Objects.requireNonNull(px2sp);
        return authenticatedRequest(flatMap.map(new scaleBitmap(px2sp)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$nameCheck$5(setAllowPduOverflow setallowpduoverflow, Boolean bool) throws Exception {
        return getCardCredentialKey().flatMap(new marshallJSONObject(this, setallowpduoverflow, bool));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$nameCheck$4(setAllowPduOverflow setallowpduoverflow, Boolean bool, String str) throws Exception {
        return createSendMoneyData().nameCheck(setallowpduoverflow, str, bool);
    }

    public TitleBarRightButtonView.AnonymousClass1<getServiceUuidEndOffset> confirmSendMoney(getLayout getlayout) {
        if (getlayout == null) {
            return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NoSuchElementException());
        }
        getMimeTypeFromContentType getmimetypefromcontenttype = (getMimeTypeFromContentType) this.transferSubmitParamMapper.apply(getlayout);
        getmimetypefromcontenttype.setRequestId(this.deviceInformationProvider.getDeviceUUID());
        TitleBarRightButtonView.AnonymousClass1<ShadowNodePool> transferSubmit = createSendMoneyData().transferSubmit(getmimetypefromcontenttype);
        ExecutorType executorType = this.sendMoneyMapper;
        Objects.requireNonNull(executorType);
        return authenticatedRequest(transferSubmit.map(new unmarshallJSONObject(executorType)));
    }

    public TitleBarRightButtonView.AnonymousClass1<getServiceUuidEndOffset> confirmSendMoneyOTC(getMatchingBeaconTypeCodeEndOffset getmatchingbeacontypecodeendoffset) {
        if (getmatchingbeacontypecodeendoffset == null) {
            return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NoSuchElementException());
        }
        TitleBarRightButtonView.AnonymousClass1<ShadowNodePool> transferOTCSubmit = createSendMoneyData().transferOTCSubmit(this.transferOTCSubmitRequestMapper.apply(getmatchingbeacontypecodeendoffset, this.deviceInformationProvider.getDeviceUUID()));
        ExecutorType executorType = this.sendMoneyMapper;
        Objects.requireNonNull(executorType);
        return authenticatedRequest(transferOTCSubmit.map(new unmarshallJSONObject(executorType)));
    }

    public TitleBarRightButtonView.AnonymousClass1<getDefaultProxy> getSendMoneyBanner() {
        TitleBarRightButtonView.AnonymousClass1<setNodeId> authenticatedRequest = authenticatedRequest(createContentDelivery().get(SpaceCode.SEND_MONEY_BANNER));
        ContentMapper contentMapper = this.mapper;
        Objects.requireNonNull(contentMapper);
        return authenticatedRequest.map(new byteToDrawable(contentMapper));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<getDefaultProxy>> getSendMoneyVendorLogo() {
        TitleBarRightButtonView.AnonymousClass1<setNodeId> authenticatedRequest = authenticatedRequest(createContentDelivery().get(SpaceCode.SEND_MONEY_VENDOR_LOGO));
        ContentsMapper contentsMapper2 = this.contentsMapper;
        Objects.requireNonNull(contentsMapper2);
        return authenticatedRequest.map(new readAsset(contentsMapper2));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<calculateLayoutSize>> getSendMoneyHomeMenu() {
        TitleBarRightButtonView.AnonymousClass1<R> onErrorResumeNext = isSync.getConfigFallback(new RVLogger.AnonymousClass1[]{createSplitSendMoneyHomeMenuCategories(), createAmcsSendMoneyHomeMenuCategories()}, getImageTempDir.setMax).onErrorResumeNext(emptySendMoneyHomeMenu()).flatMap(getSendMoneyHomeMenuDefault()).onErrorResumeNext(emptySendMoneyHomeMenu());
        getScheduledExecutor getscheduledexecutor = this.sendMoneyHomeMenuMapper;
        Objects.requireNonNull(getscheduledexecutor);
        return onErrorResumeNext.map(new ImageUtil(getscheduledexecutor));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<getMatchingBeaconTypeCode>> getEWalletsBankAccountPrefix() {
        return isSync.getConfigFallback(new RVConfigService.OnConfigChangeListener[]{createSplitDigitalMoneyData(), createAmcsDigitalMoneyData(), createLocalDigitalMoneyData()}, base64ToBitmap.getMax).map(bitmapToString.getMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<setMatchingBeaconTypeCode> getEWalletInnovConfig() {
        return isSync.getConfigFallback(new RVConfigService.OnConfigChangeListener[]{createSplitDigitalMoneyData(), createAmcsDigitalMoneyData(), createLocalDigitalMoneyData()}, isBase64Url.getMax).map(base64ToInputStream.getMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isNeedToShowExternalOnboardingDialog() {
        return createPreferenceSendMoneyEntityData().isNeedToShowExternalOnboardingDialog();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveIsNeedToShowExternalOnboardingDialog(Boolean bool) {
        return createPreferenceSendMoneyEntityData().saveIsNeedToShowExternalOnboardingDialog(bool.booleanValue());
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getSortingSendMoney() {
        return createPreferenceSortingSendMoneyEntityData().getSortingSendMoney();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveSortingSendMoney(String str) {
        return createPreferenceSortingSendMoneyEntityData().saveSortingSendMoney(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getShowSendMoneyBannerSwitch() {
        return this.configEntityDataFactory.createData(Source.SPLIT).getSendMoneyBannerConfig();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveStateSendMoneyShareFeed(String str) {
        return createPreferenceSendMoneyEntityData().saveStateSendMoneyShareFeed(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getStateSendMoneyShareFeed() {
        return createPreferenceSendMoneyEntityData().getStateSendMoneyShareFeed();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<getExtraDataParsers>> getAllBillerX2B() {
        return isSync.getConfigFallback(new clearProcessCache[]{createSplitBillerX2BEntityData(), createDefaultBillerX2BEntityData()}, toBundle.setMax).map(parseArray.setMax);
    }

    private access$2400 createSecurityData() {
        return this.securityEntityDataFactory.createData("network");
    }

    private TitleBarRightButtonView.AnonymousClass1<String> getCardCredentialKey() {
        return createAccountData().getCardCredentialPublicKey().onErrorReturnItem("").flatMap(new JSONUtils(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getCardCredentialKey$7(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return createSecurityData().cardCredentialKey().flatMap(new getColorInt(this));
        }
        return TitleBarRightButtonView.AnonymousClass1.just(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getCardCredentialKey$6(String str) throws Exception {
        return createAccountData().setCardCredentialPublicKey(str);
    }

    private RVConfigService.OnConfigChangeListener createAmcsDigitalMoneyData() {
        return this.digitalMoneyDataFactory.createData("amcs");
    }

    private RVConfigService.OnConfigChangeListener createSplitDigitalMoneyData() {
        return this.digitalMoneyDataFactory.createData(Source.SPLIT);
    }

    private RVConfigService.OnConfigChangeListener createLocalDigitalMoneyData() {
        return this.digitalMoneyDataFactory.createData("local");
    }

    private TitleBarRightButtonView.AnonymousClass1<marshall> bizInit(IpcClientKernelUtils ipcClientKernelUtils) {
        return createSendMoneyData().bizInit(ipcClientKernelUtils).flatMap(saveBankFreeTransferCount());
    }

    private TitleBarRightButtonView.AnonymousClass1<marshall> bizInitOtc(onServerReady onserverready) {
        return createSendMoneyData().bizOTCInit(onserverready).flatMap(saveBankFreeTransferCount());
    }

    private TitleBarRightButtonView.AnonymousClass1<IpcMessageHandler> withdrawInit(getClientChannel getclientchannel) {
        return createSendMoneyData().withdrawInit(getclientchannel);
    }

    @NonNull
    private RedDotDrawable<marshall, TitleBarRightButtonView.AnonymousClass1<marshall>> saveBankFreeTransferCount() {
        return new toStringArray(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$saveBankFreeTransferCount$8(marshall marshall) throws Exception {
        setFavoriteBtnVisibility freeTransferCount = getLocalPromoDataEntity().setFreeTransferCount("BANK_TRANSFER", marshall.getFreeBankTransferCount("BANK_TRANSFER"));
        TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just(marshall);
        setRefreshAnimation.getMax(just, "next is null");
        GriverSwipeRefreshLayout.AnonymousClass6 r1 = new TitleBarRightButtonView.AnonymousClass1<R>(freeTransferCount, just) {
            final TitleBarRightButtonView.AnonymousClass4<? extends R> getMin;
            final dismissBadgeView setMin;

            public final void subscribeActual(
/*
Method generation error in method: o.GriverSwipeRefreshLayout.6.subscribeActual(o.GriverProgressBar):void, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverSwipeRefreshLayout.6.subscribeActual(o.GriverProgressBar):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            /* renamed from: o.GriverSwipeRefreshLayout$6$setMax */
            static final class setMax<R> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<R>, switchFavoriteIconFont, GriverProgressBar.UpdateRunnable {
                private static final long serialVersionUID;
                final GriverProgressBar<? super R> downstream;
                TitleBarRightButtonView.AnonymousClass4<? extends R> other;

                setMax(
/*
Method generation error in method: o.GriverSwipeRefreshLayout.6.setMax.<init>(o.GriverProgressBar, o.TitleBarRightButtonView$4):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverSwipeRefreshLayout.6.setMax.<init>(o.GriverProgressBar, o.TitleBarRightButtonView$4):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final void onNext(
/*
Method generation error in method: o.GriverSwipeRefreshLayout.6.setMax.onNext(java.lang.Object):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverSwipeRefreshLayout.6.setMax.onNext(java.lang.Object):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final void onError(
/*
Method generation error in method: o.GriverSwipeRefreshLayout.6.setMax.onError(java.lang.Throwable):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverSwipeRefreshLayout.6.setMax.onError(java.lang.Throwable):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final void onComplete(
/*
Method generation error in method: o.GriverSwipeRefreshLayout.6.setMax.onComplete():void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverSwipeRefreshLayout.6.setMax.onComplete():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final void dispose(
/*
Method generation error in method: o.GriverSwipeRefreshLayout.6.setMax.dispose():void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverSwipeRefreshLayout.6.setMax.dispose():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final boolean isDisposed(
/*
Method generation error in method: o.GriverSwipeRefreshLayout.6.setMax.isDisposed():boolean, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverSwipeRefreshLayout.6.setMax.isDisposed():boolean, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final void onSubscribe(
/*
Method generation error in method: o.GriverSwipeRefreshLayout.6.setMax.onSubscribe(o.GriverProgressBar$UpdateRunnable):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverSwipeRefreshLayout.6.setMax.onSubscribe(o.GriverProgressBar$UpdateRunnable):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }
        };
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, r1) : r1;
    }

    private getExtensionByName getLocalPromoDataEntity() {
        return this.promoEntityDataFactory.createData("local");
    }

    @NotNull
    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<List<getExtension>>> emptySendMoneyHomeMenu() {
        return parseObject.getMax;
    }

    @NotNull
    private RedDotDrawable<List<getExtension>, TitleBarRightButtonView.AnonymousClass4<List<getExtension>>> getSendMoneyHomeMenuDefault() {
        return new getJSONObject(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSendMoneyHomeMenuDefault$10(List list) throws Exception {
        if (list.isEmpty()) {
            return createDefaultSendMoneyHomeCategories().getSendMoneyHomeMenus();
        }
        return TitleBarRightButtonView.AnonymousClass1.just(list);
    }

    private RVLogger.AnonymousClass1 createAmcsSendMoneyHomeMenuCategories() {
        return this.sendMoneyHomeMenuConfigEntityDataFactory.createData("amcs");
    }

    private RVLogger.AnonymousClass1 createSplitSendMoneyHomeMenuCategories() {
        return this.sendMoneyHomeMenuConfigEntityDataFactory.createData(Source.SPLIT);
    }

    private RVLogger.AnonymousClass1 createDefaultSendMoneyHomeCategories() {
        return this.sendMoneyHomeMenuConfigEntityDataFactory.createData("local");
    }

    private TitleBarRightButtonView.AnonymousClass1<List<addExtraDataParser>> getAddPayMethodConfig() {
        return authenticatedRequest(createAddPayMethodData(Source.SPLIT).getAddPayMethodConfig()).onErrorResumeNext(new deepCopy(this)).map(getJSONArray.setMax).map(jsonToMap.length);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List lambda$getAddPayMethodConfig$11(Set set) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((addExtraDataParser) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    private AppMsgReceiver.AnonymousClass2 createConfigData() {
        return this.configEntityDataFactory.createData("network");
    }

    private RVAccountService createAddPayMethodData(String str) {
        return this.addPayMethodConfigFactory.createData(str);
    }

    private getConfigBoolean createSendMoneyData() {
        return this.sendMoneyDataFactory.createData("network");
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass4<? extends Map<String, addExtraDataParser>> apply(Throwable th) {
        return createAddPayMethodData("local").getAddPayMethodConfig();
    }

    private isTaskRoot createContentDelivery() {
        return this.contentDeliveryEntityDataFactory.createData("network");
    }

    private parseAriverCodeUrl createPreferenceSendMoneyEntityData() {
        return this.sendMoneyPreferenceEntityDataFactory.createData("local");
    }

    private mergeUrl createPreferenceSortingSendMoneyEntityData() {
        return this.sortingSendMoneyPreferenceEntityDataFactory.createData("local");
    }

    private clearProcessCache createSplitBillerX2BEntityData() {
        return this.billerX2BEntityDataFactory.createData(Source.SPLIT);
    }

    private clearProcessCache createDefaultBillerX2BEntityData() {
        return this.billerX2BEntityDataFactory.createData("local");
    }
}
