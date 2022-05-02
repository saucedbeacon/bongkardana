package o;

import androidx.annotation.NonNull;
import id.dana.data.Source;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.domain.verifytoken.TokenBizScene;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
public class isReceivedRemoteReady implements H5Utils {
    private final DialogLayout accountEntityDataFactory;
    private final SinglePageAppContext paymentAuthenticationDataFactory;
    private final onError settingsEntityDataFactory;
    private final setStartParams settingsMapper;
    private final getBluetoothState verifyTokenRepository;

    @Inject
    public isReceivedRemoteReady(onError onerror, SinglePageAppContext singlePageAppContext, DialogLayout dialogLayout, getBluetoothState getbluetoothstate, setStartParams setstartparams) {
        this.settingsEntityDataFactory = onerror;
        this.paymentAuthenticationDataFactory = singlePageAppContext;
        this.accountEntityDataFactory = dialogLayout;
        this.verifyTokenRepository = getbluetoothstate;
        this.settingsMapper = setstartparams;
    }

    private TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, SettingModel>>> getUnfilteredSettings(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(314528558, oncanceled);
            onCancelLoad.getMin(314528558, oncanceled);
        }
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getSettingCollection(str).map(getSettingCategories()).flatMap(getSettingsByKey());
        setStartParams setstartparams = this.settingsMapper;
        Objects.requireNonNull(setstartparams);
        return flatMap.map(new ServerSideRemoteExtensionCaller(setstartparams));
    }

    @NotNull
    private RedDotDrawable<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>, TitleBarRightButtonView.AnonymousClass4<? extends LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>>> getSettingsByKey() {
        return new remoteCall(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSettingsByKey$0(LinkedHashMap linkedHashMap) throws Exception {
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            for (Map.Entry entry2 : ((LinkedHashMap) entry.getValue()).entrySet()) {
                SettingModel blockingFirst = getSettingByKey((String) entry2.getKey()).blockingFirst();
                if (!blockingFirst.isNullObject()) {
                    ((LinkedHashMap) entry.getValue()).put((String) entry2.getKey(), getActivityClz.from(blockingFirst));
                } else {
                    ((LinkedHashMap) entry.getValue()).remove(entry2.getKey());
                }
            }
        }
        return TitleBarRightButtonView.AnonymousClass1.just(linkedHashMap);
    }

    @NotNull
    private RedDotDrawable<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>, LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSettingCategories() {
        return new DefaultExtensionServiceImpl(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ LinkedHashMap lambda$getSettingCategories$1(LinkedHashMap linkedHashMap) throws Exception {
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            LinkedHashMap blockingFirst = getSettingKeyByCategoryKey((String) entry.getKey()).blockingFirst();
            if (blockingFirst.isEmpty()) {
                ((LinkedHashMap) entry.getValue()).remove(entry.getKey());
            } else {
                entry.setValue(blockingFirst);
            }
        }
        return linkedHashMap;
    }

    public TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSettingCollection(String str) {
        return isSettingSplitNeedtoMigrate().flatMap(new DefaultAppFactoryImpl(this, str)).onErrorResumeNext(defaultSettingOrderIsEmpty(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSettingCollection$2(String str, Boolean bool) throws Exception {
        if (Boolean.TRUE.equals(bool)) {
            return createSplitSettings().getSettingCollection(str).onErrorResumeNext(createAmcsSettings().getSettingCollection(str));
        }
        return createAmcsSettings().getSettingCollection(str);
    }

    private TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, getActivityClz>> getSettingKeyByCategoryKey(String str) {
        return isSettingSplitNeedtoMigrate().flatMap(new DefaultLoggerProxyImpl(this, str)).onErrorResumeNext(createDefaultServices().getSettingKeyByCategoryKey(str)).onErrorReturnItem(new LinkedHashMap());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSettingKeyByCategoryKey$3(String str, Boolean bool) throws Exception {
        if (Boolean.TRUE.equals(bool)) {
            return createSplitSettings().getSettingKeyByCategoryKey(str).onErrorResumeNext(createAmcsSettings().getSettingKeyByCategoryKey(str));
        }
        return createAmcsSettings().getSettingKeyByCategoryKey(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<getSharedPreference> getPaymentSecurityInit() {
        TitleBarRightButtonView.AnonymousClass1<createScheduleExtensionInvoker> paymentSecurityInitResult = createPaymentAuthenticationEntityData().getPaymentSecurityInitResult();
        setStartParams setstartparams = this.settingsMapper;
        Objects.requireNonNull(setstartparams);
        return paymentSecurityInitResult.map(new DefaultJsApiHandlerProxyImpl(setstartparams));
    }

    public TitleBarRightButtonView.AnonymousClass1<getUid> getPaymentSecuritySwitch(boolean z, String str, String str2, String str3, String str4) {
        return getPinWithVerifiedToken(z, str, str3).flatMap(getSecuritySwitchResult(z, str, str2, str4));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<SettingModel>> getSettings(List<sendUcReceiver> list, String str, notNeedInitUc notneedinituc) {
        return getUnfilteredSettings(str).flatMap(filterSettingByRunningConfiguration(list, notneedinituc));
    }

    public TitleBarRightButtonView.AnonymousClass1<SettingModel> getSettingByKey(String str) {
        return isSettingSplitNeedtoMigrate().flatMap(getSettingEntityByKey(str)).onErrorResumeNext(defaultSettingIsEmpty(str)).map(new DefaultBridgeInterceptProxyImpl(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SettingModel lambda$getSettingByKey$4(String str, getActivityClz getactivityclz) throws Exception {
        return this.settingsMapper.transform(str, getactivityclz);
    }

    @NotNull
    private RedDotDrawable<Boolean, TitleBarRightButtonView.AnonymousClass4<getActivityClz>> getSettingEntityByKey(String str) {
        return new w(this, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSettingEntityByKey$5(String str, Boolean bool) throws Exception {
        if (Boolean.TRUE.equals(bool)) {
            return createSplitSettings().getSettingByKey(str).onErrorResumeNext(createAmcsSettings().getSettingByKey(str));
        }
        return createAmcsSettings().getSettingByKey(str);
    }

    private RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<getUid>> getSecuritySwitchResult(boolean z, String str, String str2, String str3) {
        return new DefaultSinglePageAppProxyImpl(this, z, str, str2, str3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSecuritySwitchResult$6(boolean z, String str, String str2, String str3, String str4) throws Exception {
        TitleBarRightButtonView.AnonymousClass1<IpcCallClientHelper> securitySwitchResult = createPaymentAuthenticationEntityData().getSecuritySwitchResult(z, str, str2, str4, str3);
        setStartParams setstartparams = this.settingsMapper;
        Objects.requireNonNull(setstartparams);
        return securitySwitchResult.map(new CommonAppExitExtension(setstartparams));
    }

    private TitleBarRightButtonView.AnonymousClass1<String> getPinWithVerifiedToken(boolean z, String str, String str2) {
        if (isAuthenticationTypePassword(z, str)) {
            return createAccountEntityData().getPhoneNumber().flatMap(getVerifyToken(str2));
        }
        return TitleBarRightButtonView.AnonymousClass1.just(str2);
    }

    private boolean isAuthenticationTypePassword(boolean z, String str) {
        return !z && "PASSWORD".equals(str);
    }

    private RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<String>> getVerifyToken(String str) {
        return new DefaultScreenOrientationProxyImpl(this, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getVerifyToken$7(String str, String str2) throws Exception {
        return this.verifyTokenRepository.getPinWithVerifiedToken(str, str2, TokenBizScene.RISK_CHALLENGE);
    }

    private setDrawDivider createAccountEntityData() {
        return this.accountEntityDataFactory.createData("local");
    }

    @NonNull
    private RedDotDrawable<LinkedHashMap<String, LinkedHashMap<String, SettingModel>>, TitleBarRightButtonView.AnonymousClass4<List<SettingModel>>> filterSettingByRunningConfiguration(List<sendUcReceiver> list, notNeedInitUc notneedinituc) {
        return new g(notneedinituc, list);
    }

    private getDeclaredMinAppxVersion createAmcsSettings() {
        return this.settingsEntityDataFactory.createData("amcs");
    }

    private getDeclaredMinAppxVersion createSplitSettings() {
        return this.settingsEntityDataFactory.createData(Source.SPLIT);
    }

    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>>> defaultSettingOrderIsEmpty(String str) {
        return new RVClientStarter(this, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$defaultSettingOrderIsEmpty$9(String str, Throwable th) throws Exception {
        return createDefaultServices().getSettingCollection(str);
    }

    private TitleBarRightButtonView.AnonymousClass1<Boolean> isSettingSplitNeedtoMigrate() {
        return createSplitSettings().isSettingSplitNeedtoMigrate().onErrorResumeNext(createDefaultServices().isSettingSplitNeedtoMigrate());
    }

    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass1<getActivityClz>> defaultSettingIsEmpty(String str) {
        return new startClient(this, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$defaultSettingIsEmpty$10(String str, Throwable th) throws Exception {
        return createDefaultServices().getSettingByKey(str);
    }

    private getDeclaredMinAppxVersion createDefaultServices() {
        return this.settingsEntityDataFactory.createData("local");
    }

    private before createPaymentAuthenticationEntityData() {
        return this.paymentAuthenticationDataFactory.createData("network");
    }
}
