package o;

import android.text.TextUtils;
import id.dana.data.Source;
import id.dana.data.userconfig.UserConfigBizTypeConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AccessController;
import o.Accessor;
import o.AppMsgReceiver;
import o.PackageDownloadRequest;
import o.PerfId;
import o.RVLogger;
import o.RemoteCallResult;
import o.RemoteDebugController;
import o.ScheduleExtensionInvoker;
import o.TitleBarRightButtonView;

@Singleton
public class isRemoteCallExtension implements GriverWhiteScreenStageMonitor {
    private final DialogLayout accountEntityDataFactory;
    private final PerfId.PerfValue bankCardConversionFactory;
    private final ValueStore bankCardConversionMapper;
    private final onCallBack configEntityDataFactory;
    private final setDefaultFontSize featureConfigRepository;
    private final PackageDownloadRequest.AnonymousClass1 generalPreferences;
    private final ResultResolver recentBankEntityDataFactory;
    private final hasNext recentBankEntityMapper;
    private final IRemoteCaller recentBankMapper;
    private final SecurityExtensionInvoker recentContactEntityDataFactory;
    private final RemoteDebugController.AnonymousClass1 recentPayerEntityDataFactory;
    private final getClassName recentRecipientContactEntityMapper;
    private final addExtraData recentRecipientEntityMapper;
    private final getMethodName recentRecipientMapper;
    private final getRemoteSignature recentRecipientPayerEntityMapper;
    private final onFirstScanTime<isRemoteExtension[]> recentRecipientQueryConfig = new onFirstScanTime<>(UserConfigBizTypeConstant.CONFIG_RECENT_TRANSACTION, isRemoteExtension[].class);
    private final onFirstScanTime<isRemoteExtension[]> recentSecureRecipientQueryConfig = new onFirstScanTime<>(UserConfigBizTypeConstant.CONFIG_SECURE_RECENT_TRANSACTION, isRemoteExtension[].class);
    private final access$2300 securityEntityDataFactory;
    private final RVLogger.Proxy sortingSendMoneyPreferenceEntityDataFactory;
    private final AppModel userConfigRepository;

    private boolean isStoredRecipientExceedMaxStored(int i, int i2) {
        return i2 > i;
    }

    @Inject
    public isRemoteCallExtension(onCallBack oncallback, RemoteDebugController.AnonymousClass1 r6, getRemoteSignature getremotesignature, getClassName getclassname, getMethodName getmethodname, ResultResolver resultResolver, addExtraData addextradata, SecurityExtensionInvoker securityExtensionInvoker, hasNext hasnext, getOrigin getorigin, PackageDownloadRequest.AnonymousClass1 r15, IRemoteCaller iRemoteCaller, PerfId.PerfValue perfValue, access$2300 access_2300, ValueStore valueStore, DialogLayout dialogLayout, setDefaultFontSize setdefaultfontsize, RVLogger.Proxy proxy) {
        this.configEntityDataFactory = oncallback;
        this.userConfigRepository = getorigin;
        this.recentPayerEntityDataFactory = r6;
        this.recentRecipientPayerEntityMapper = getremotesignature;
        this.recentRecipientMapper = getmethodname;
        this.recentRecipientEntityMapper = addextradata;
        this.recentRecipientContactEntityMapper = getclassname;
        this.recentBankEntityDataFactory = resultResolver;
        this.recentContactEntityDataFactory = securityExtensionInvoker;
        this.recentBankEntityMapper = hasnext;
        this.generalPreferences = r15;
        this.recentBankMapper = iRemoteCaller;
        this.bankCardConversionFactory = perfValue;
        this.securityEntityDataFactory = access_2300;
        this.bankCardConversionMapper = valueStore;
        this.accountEntityDataFactory = dialogLayout;
        this.featureConfigRepository = setdefaultfontsize;
        this.sortingSendMoneyPreferenceEntityDataFactory = proxy;
    }

    public TitleBarRightButtonView.AnonymousClass1<List<getMonitorToken>> getRecentRecipient(int i, int i2, int i3) {
        return TitleBarRightButtonView.AnonymousClass1.defer(new DefaultRemoteControlManagement(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getRecentRecipient$1() throws Exception {
        return getRecentRecipientFromUserConfig().map(permissions.getMax).flatMap(new DefaultAccessController(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getRecentRecipient$0(List list) throws Exception {
        TitleBarRightButtonView.AnonymousClass1<List<isRemoteExtension>> filterRecentRecipient = filterRecentRecipient(list);
        addExtraData addextradata = this.recentRecipientEntityMapper;
        Objects.requireNonNull(addextradata);
        return filterRecentRecipient.map(new check(addextradata));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<getMonitorToken>> getRecentRecipientAll() {
        return splitConfigEntityData().isFeatureOldRecentTransactionEnabled().onErrorResumeNext(amcsConfigEntityData().isFeatureOldRecentTransactionEnabled()).flatMap(new getRemoteCallerProxy(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getRecentRecipientAll$2(Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            return createRecentBankEntityData().getOldRecentBank().map(Guard.getMin);
        }
        TitleBarRightButtonView.AnonymousClass1<isRemoteExtension[]> recentRecipientFromUserConfig = getRecentRecipientFromUserConfig();
        addExtraData addextradata = this.recentRecipientEntityMapper;
        Objects.requireNonNull(addextradata);
        TitleBarRightButtonView.AnonymousClass1<R> map = recentRecipientFromUserConfig.map(new Permission(addextradata));
        addExtraData addextradata2 = this.recentRecipientEntityMapper;
        Objects.requireNonNull(addextradata2);
        return map.map(new check(addextradata2));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<getMonitorToken>> getSecureRecentRecipient(int i, int i2, int i3) {
        if (i2 == 2) {
            if (i3 != 0) {
                return getRecentSplitBillPayer(i);
            }
            TitleBarRightButtonView.AnonymousClass1<R> map = getSecureRecentRecipientFromUserConfig().map(new Schedulable(this));
            addExtraData addextradata = this.recentRecipientEntityMapper;
            Objects.requireNonNull(addextradata);
            return map.map(new check(addextradata));
        } else if (i2 != 1) {
            return TitleBarRightButtonView.AnonymousClass1.defer(new Callable(this) {
                private final isRemoteCallExtension setMin;

                {
                    this.setMin = r1;
                }

                public final Object call() {
                    return this.setMin.lambda$getSecureRecentRecipient$4();
                }
            });
        } else {
            if (i3 != 0) {
                return getRecentSplitBillPayer(i);
            }
            TitleBarRightButtonView.AnonymousClass1<R> map2 = getSecureRecentRecipientFromUserConfig().map(new Inquirer(this));
            addExtraData addextradata2 = this.recentRecipientEntityMapper;
            Objects.requireNonNull(addextradata2);
            return map2.map(new check(addextradata2));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSecureRecentRecipient$4() throws Exception {
        return getSecureRecentRecipientFromUserConfig().map(permissions.getMax).flatMap(new assignPermissions(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSecureRecentRecipient$3(List list) throws Exception {
        TitleBarRightButtonView.AnonymousClass1<List<isRemoteExtension>> filterRecentRecipient = filterRecentRecipient(list);
        addExtraData addextradata = this.recentRecipientEntityMapper;
        Objects.requireNonNull(addextradata);
        return filterRecentRecipient.map(new check(addextradata));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<getMonitorToken>> getRecentTransaction() {
        TitleBarRightButtonView.AnonymousClass1<R> zip = TitleBarRightButtonView.AnonymousClass1.zip(getMaxRecentRecipient(), getSecureRecentRecipientFromUserConfig(), setTrackId.length);
        addExtraData addextradata = this.recentRecipientEntityMapper;
        Objects.requireNonNull(addextradata);
        return zip.map(new check(addextradata));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveRecentBank(GriverFullLinkStageMonitor griverFullLinkStageMonitor) {
        return amcsConfigEntityData().isFeatureSecureRecentTransactionEnabled().map(new RedDotDrawable(this, griverFullLinkStageMonitor) {
            private final GriverFullLinkStageMonitor length;
            private final isRemoteCallExtension setMax;

            {
                this.setMax = r1;
                this.length = r2;
            }

            public final Object apply(Object obj) {
                return this.setMax.lambda$saveRecentBank$6(this.length, (Boolean) obj);
            }
        }).flatMap(new getTimestamp(this, griverFullLinkStageMonitor));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ GriverFullLinkStageMonitor lambda$saveRecentBank$6(GriverFullLinkStageMonitor griverFullLinkStageMonitor, Boolean bool) throws Exception {
        return bool.booleanValue() ? this.recentBankMapper.getMaskingData(griverFullLinkStageMonitor) : griverFullLinkStageMonitor;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveRecentBank$10(GriverFullLinkStageMonitor griverFullLinkStageMonitor, GriverFullLinkStageMonitor griverFullLinkStageMonitor2) throws Exception {
        return createRecentBankEntityData().saveRecentBank((RemoteNormalExtensionInvoker) this.recentBankMapper.apply(griverFullLinkStageMonitor)).flatMap(new DefaultPermission(this, griverFullLinkStageMonitor));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveRecentBank$9(GriverFullLinkStageMonitor griverFullLinkStageMonitor, Long l) throws Exception {
        return getSecureRecentRecipientFromUserConfig().flatMap(new DefaultGroup(this, griverFullLinkStageMonitor)).flatMap(new Interruptable(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveRecentBank$8(GriverFullLinkStageMonitor griverFullLinkStageMonitor, isRemoteExtension[] isremoteextensionArr) throws Exception {
        return getMaxSavedBank().map(new groupName(this, griverFullLinkStageMonitor, isremoteextensionArr));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$saveRecentBank$7(GriverFullLinkStageMonitor griverFullLinkStageMonitor, isRemoteExtension[] isremoteextensionArr, Integer num) throws Exception {
        return filterRecentRecipientThatWillBeSaved((isRemoteExtension) this.recentRecipientMapper.apply(griverFullLinkStageMonitor), griverFullLinkStageMonitor.getCardIndexNo(), num.intValue(), isremoteextensionArr, 1);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> removeRecentBankAndSyncToUserConfig(GriverFullLinkStageMonitor griverFullLinkStageMonitor) {
        return amcsConfigEntityData().isFeatureSecureRecentTransactionEnabled().map(new getTrackId(this, griverFullLinkStageMonitor)).flatMap(new getRemoteControlManagement(this, griverFullLinkStageMonitor));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ GriverFullLinkStageMonitor lambda$removeRecentBankAndSyncToUserConfig$11(GriverFullLinkStageMonitor griverFullLinkStageMonitor, Boolean bool) throws Exception {
        return bool.booleanValue() ? this.recentBankMapper.getMaskingData(griverFullLinkStageMonitor) : griverFullLinkStageMonitor;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$removeRecentBankAndSyncToUserConfig$15(GriverFullLinkStageMonitor griverFullLinkStageMonitor, GriverFullLinkStageMonitor griverFullLinkStageMonitor2) throws Exception {
        return createRecentBankEntityData().removeAndUpdateRecentBank("", splitConfigEntityData().getMaxRecentRecipient().blockingFirst().intValue(), (RemoteNormalExtensionInvoker) this.recentBankMapper.apply(griverFullLinkStageMonitor)).flatMap(new Accessor.InquiryCallback(this, griverFullLinkStageMonitor));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$removeRecentBankAndSyncToUserConfig$14(GriverFullLinkStageMonitor griverFullLinkStageMonitor, List list) throws Exception {
        return getSecureRecentRecipientFromUserConfig().flatMap(new hasSignature(this, griverFullLinkStageMonitor)).flatMap(new Interruptable(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$removeRecentBankAndSyncToUserConfig$13(GriverFullLinkStageMonitor griverFullLinkStageMonitor, isRemoteExtension[] isremoteextensionArr) throws Exception {
        return getMaxSavedBank().map(new isSuccess(this, griverFullLinkStageMonitor, isremoteextensionArr));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$removeRecentBankAndSyncToUserConfig$12(GriverFullLinkStageMonitor griverFullLinkStageMonitor, isRemoteExtension[] isremoteextensionArr, Integer num) throws Exception {
        return filterRecentRecipientThatWillBeRemoved((isRemoteExtension) this.recentRecipientMapper.apply(griverFullLinkStageMonitor), griverFullLinkStageMonitor.getCardIndexNo(), num.intValue(), isremoteextensionArr);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveRecentContact(unRegisterStageMonitor unregisterstagemonitor) {
        return TitleBarRightButtonView.AnonymousClass1.zip(amcsConfigEntityData().getMaxRecentContact(), getSecureRecentRecipientFromUserConfig(), new RemoteController(this, unregisterstagemonitor)).flatMap(new Interruptable(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$saveRecentContact$16(unRegisterStageMonitor unregisterstagemonitor, Integer num, isRemoteExtension[] isremoteextensionArr) throws Exception {
        return filterRecentRecipientThatWillBeSaved((isRemoteExtension) this.recentRecipientMapper.apply(unregisterstagemonitor), unregisterstagemonitor.getId(), num.intValue(), isremoteextensionArr, 0);
    }

    public TitleBarRightButtonView.AnonymousClass1<List<ErrorPageUtils>> getRecentBank(String str) {
        return isSendMoneyV2Enable().flatMap(new createRemoteControlManagement(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getRecentBank$17(String str, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return TitleBarRightButtonView.AnonymousClass1.zip(getRecents(str), getSortingSendMoney(), ApiPermissionCheckResult.setMin);
        }
        return getRecents(str);
    }

    public setFavoriteBtnVisibility migrateRoomToUserConfig() {
        return setFavoriteBtnVisibility.setMax(getSecureRecentRecipientFromUserConfig().flatMap(new setInterruptor(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$migrateRoomToUserConfig$19(isRemoteExtension[] isremoteextensionArr) throws Exception {
        if (this.generalPreferences.needMigrateRoomToUserConfig()) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
        }
        if (isremoteextensionArr.length > 0) {
            return createRecentBankEntityData().saveRecentBank(getBankOnly(isremoteextensionArr)).map(new Accessor(this));
        }
        return getRecentRecipientFromRoom();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$migrateRoomToUserConfig$18(Long[] lArr) throws Exception {
        return this.generalPreferences.saveMigrateRoomToUserConfig(true);
    }

    public TitleBarRightButtonView.AnonymousClass1<getMonitorToken> convertCardIndexNo(getMonitorToken getmonitortoken) {
        return amcsConfigEntityData().isEncryptCardEnabled().flatMap(new hasRemoteAnnotation(this, getmonitortoken));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$convertCardIndexNo$22(getMonitorToken getmonitortoken, Boolean bool) throws Exception {
        return getCardCredentialKey().flatMap(new permissionCheck(this, getmonitortoken, bool)).map(new AccessController(this, getmonitortoken));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$convertCardIndexNo$20(getMonitorToken getmonitortoken, Boolean bool, String str) throws Exception {
        return createBankCardConversionData().convertCardIndexNo(getmonitortoken, str, bool.booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ getMonitorToken lambda$convertCardIndexNo$21(getMonitorToken getmonitortoken, RemoteCallResult.AnonymousClass1 r3) throws Exception {
        return this.bankCardConversionMapper.transform(getmonitortoken, r3);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> storeSecureUserConfig(List<getMonitorToken> list) {
        return amcsConfigEntityData().isFeatureSecureRecentTransactionEnabled().flatMap(new DefaultRemoteController(this, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$storeSecureUserConfig$23(List list, Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        }
        return this.userConfigRepository.saveUserSpecificConfig(new getPlugins(RemoteCallArgs.INSTANCE.toRecentRecipientEntityArray(list)));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> storeUserConfig(List<getMonitorToken> list) {
        return this.userConfigRepository.saveUserSpecificConfig(new setPlugins((isRemoteExtension[]) list.toArray(new isRemoteExtension[0])));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> storeLocalSecureUserConfig(List<getMonitorToken> list) {
        return createRecentBankEntityData().saveRecentBank(this.recentBankMapper.apply(list)).map(setExecutorFactory.getMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getMaxRecentRecipient() {
        return splitConfigEntityData().getMaxRecentRecipient();
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getMaxSavedBank() {
        return splitConfigEntityData().getMaxSavedBank().onErrorResumeNext(amcsConfigEntityData().getMaxSavedBank());
    }

    private TitleBarRightButtonView.AnonymousClass1<List<ErrorPageUtils>> getRecents(String str) {
        return getMaxSavedBank().flatMap(new interrupt(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getRecents$25(String str, Integer num) throws Exception {
        TitleBarRightButtonView.AnonymousClass1<List<RemoteNormalExtensionInvoker>> recentBank = createRecentBankEntityData().getRecentBank(str, num.intValue());
        hasNext hasnext = this.recentBankEntityMapper;
        Objects.requireNonNull(hasnext);
        return recentBank.map(new asyncPermissionCheck(hasnext));
    }

    private access$2400 createSecurityData() {
        return this.securityEntityDataFactory.createData("network");
    }

    private TitleBarRightButtonView.AnonymousClass1<String> getCardCredentialKey() {
        return createAccountData().getCardCredentialPublicKey().onErrorReturnItem("").flatMap(new Interruptor(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getCardCredentialKey$27(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return createSecurityData().cardCredentialKey().flatMap(new AccessController.ApplyCallback(this));
        }
        return TitleBarRightButtonView.AnonymousClass1.just(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getCardCredentialKey$26(String str) throws Exception {
        return createAccountData().setCardCredentialPublicKey(str);
    }

    private setDrawDivider createAccountData() {
        return this.accountEntityDataFactory.createData("local");
    }

    private TitleBarRightButtonView.AnonymousClass1<Boolean> getRecentRecipientFromRoom() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = TitleBarRightButtonView.AnonymousClass1.zip(createRecentBankEntityData().getRecentBank().onErrorReturnItem(new ArrayList()), createRecentContactEntityData().getRecentContact().onErrorReturnItem(new ArrayList()), new DefaultInterruptor(this)).flatMap(new Interruptable(this));
        PackageDownloadRequest.AnonymousClass1 r1 = this.generalPreferences;
        Objects.requireNonNull(r1);
        return flatMap.map(new AccessControlException(r1));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$getRecentRecipientFromRoom$28(List list, List list2) throws Exception {
        return sortRecentRecipient(this.recentRecipientMapper.apply(list, list2));
    }

    private List<isRemoteExtension> sortRecentRecipient(List<isRemoteExtension> list) {
        Collections.sort(list, new isRemoteExtension());
        return list;
    }

    private List<isRemoteExtension> filterRecentRecipientThatWillBeRemoved(isRemoteExtension isremoteextension, String str, int i, isRemoteExtension[] isremoteextensionArr) {
        ArrayList arrayList = new ArrayList();
        if (isremoteextensionArr != null && isremoteextensionArr.length > 0) {
            int i2 = 0;
            for (isRemoteExtension isremoteextension2 : isremoteextensionArr) {
                if (!isStoredRecipientExceedMaxStored(i, i2) && !isRecentRecipientDuplicate(1, str, isremoteextension2)) {
                    arrayList.add(isremoteextension2);
                    arrayList.remove(isremoteextension);
                }
                i2++;
            }
        }
        return arrayList;
    }

    private List<isRemoteExtension> filterRecentRecipientThatWillBeSaved(isRemoteExtension isremoteextension, String str, int i, isRemoteExtension[] isremoteextensionArr, int i2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1929373910, oncanceled);
            onCancelLoad.getMin(-1929373910, oncanceled);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(isremoteextension);
        if (isremoteextensionArr != null && isremoteextensionArr.length > 0) {
            int i3 = 0;
            for (isRemoteExtension isremoteextension2 : isremoteextensionArr) {
                if (i2 == isremoteextension2.getType()) {
                    if (!isStoredRecipientExceedMaxStored(i, i3) && !isRecentRecipientDuplicate(i2, str, isremoteextension2)) {
                        arrayList.add(isremoteextension2);
                    }
                    i3++;
                } else {
                    arrayList.add(isremoteextension2);
                }
            }
        }
        return arrayList;
    }

    private boolean isRecentRecipientDuplicate(int i, String str, isRemoteExtension isremoteextension) {
        if (1 == i) {
            return isRecentBankRecipientDuplicate(str, isremoteextension);
        }
        return isRecentContactRecipientDuplicate(str, isremoteextension);
    }

    private boolean isRecentContactRecipientDuplicate(String str, isRemoteExtension isremoteextension) {
        return str.equalsIgnoreCase(isremoteextension.getId());
    }

    private boolean isRecentBankRecipientDuplicate(String str, isRemoteExtension isremoteextension) {
        return str.equalsIgnoreCase(isremoteextension.getCardIndexNo());
    }

    private TitleBarRightButtonView.AnonymousClass1<List<getMonitorToken>> getRecentSplitBillPayer(int i) {
        TitleBarRightButtonView.AnonymousClass1<List<RemoteDebugUtils>> recentPayers = createRecentPayerEntityData().getRecentPayers(i);
        getRemoteSignature getremotesignature = this.recentRecipientPayerEntityMapper;
        Objects.requireNonNull(getremotesignature);
        TitleBarRightButtonView.AnonymousClass1<R> map = recentPayers.map(new AccessControlManagement(getremotesignature));
        getClassName getclassname = this.recentRecipientContactEntityMapper;
        Objects.requireNonNull(getclassname);
        return map.map(new setInterrupted(getclassname));
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveRecentRecipient(List<isRemoteExtension> list) {
        return amcsConfigEntityData().isFeatureSecureRecentTransactionEnabled().flatMap(new bizPermissionCheck(this, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveRecentRecipient$29(List list, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return this.userConfigRepository.saveUserSpecificConfig(new getPlugins((isRemoteExtension[]) list.toArray(new isRemoteExtension[0])));
        }
        return this.userConfigRepository.saveUserSpecificConfig(new setPlugins((isRemoteExtension[]) list.toArray(new isRemoteExtension[0])));
    }

    private TitleBarRightButtonView.AnonymousClass1<List<isRemoteExtension>> filterRecentRecipient(List<isRemoteExtension> list) {
        return TitleBarRightButtonView.AnonymousClass1.zip(getMaxRecentBank(), getMaxRecentContact(), new isInterrupted(this, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$filterRecentRecipient$30(List list, Integer num, Integer num2) throws Exception {
        return filterRecipientWithDifferentMaxValue(list, num2.intValue(), num.intValue());
    }

    private TitleBarRightButtonView.AnonymousClass1<Integer> getMaxRecentBank() {
        return splitConfigEntityData().getMaxRecentBank().onErrorResumeNext(amcsConfigEntityData().getMaxRecentBank());
    }

    private TitleBarRightButtonView.AnonymousClass1<Integer> getMaxRecentContact() {
        return splitConfigEntityData().getMaxRecentContact().onErrorResumeNext(amcsConfigEntityData().getMaxRecentContact());
    }

    private List<RemoteNormalExtensionInvoker> getBankOnly(isRemoteExtension[] isremoteextensionArr) {
        ArrayList arrayList = new ArrayList();
        for (isRemoteExtension isremoteextension : isremoteextensionArr) {
            if (1 == isremoteextension.getType()) {
                arrayList.add(this.recentBankMapper.apply(isremoteextension));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public List<isRemoteExtension> getContactOnly(isRemoteExtension[] isremoteextensionArr) {
        ArrayList arrayList = new ArrayList();
        for (isRemoteExtension isremoteextension : isremoteextensionArr) {
            if (isremoteextension.getType() == 0) {
                arrayList.add(isremoteextension);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public List<isRemoteExtension> filterRecentBankOnly(isRemoteExtension[] isremoteextensionArr) {
        ArrayList arrayList = new ArrayList();
        for (isRemoteExtension isremoteextension : isremoteextensionArr) {
            if (1 == isremoteextension.getType()) {
                arrayList.add(isremoteextension);
            }
        }
        return arrayList;
    }

    private List<isRemoteExtension> filterRecipientWithDifferentMaxValue(List<isRemoteExtension> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        for (isRemoteExtension next : list) {
            if (i3 == i2 && i4 == i) {
                break;
            } else if (next.getType() == 1 && i3 < i2) {
                arrayList.add(next);
                i3++;
            } else if (next.getType() == 0 && i4 < i) {
                arrayList.add(next);
                i4++;
            }
        }
        return arrayList;
    }

    private TitleBarRightButtonView.AnonymousClass1<isRemoteExtension[]> getSecureRecentRecipientFromUserConfig() {
        return this.userConfigRepository.getUserSpecificConfig(this.recentSecureRecipientQueryConfig).onErrorResumeNext(getRecentRecipientFromUserConfig());
    }

    private TitleBarRightButtonView.AnonymousClass1<isRemoteExtension[]> getRecentRecipientFromUserConfig() {
        return this.userConfigRepository.getUserSpecificConfig(this.recentRecipientQueryConfig).onErrorReturnItem(new isRemoteExtension[0]);
    }

    private AppMsgReceiver.AnonymousClass2 amcsConfigEntityData() {
        return this.configEntityDataFactory.createData("amcs");
    }

    private AppMsgReceiver.AnonymousClass2 splitConfigEntityData() {
        return this.configEntityDataFactory.createData(Source.SPLIT);
    }

    private onConnectClosed createRecentPayerEntityData() {
        return this.recentPayerEntityDataFactory.createData("local");
    }

    private ExtensionInvoker createRecentBankEntityData() {
        return this.recentBankEntityDataFactory.createData("local");
    }

    private ScheduleExtensionInvoker.AnonymousClass3 createRecentContactEntityData() {
        return this.recentContactEntityDataFactory.createData("local");
    }

    private getAttrData createBankCardConversionData() {
        return this.bankCardConversionFactory.createData("network");
    }

    private TitleBarRightButtonView.AnonymousClass1<Boolean> isSendMoneyV2Enable() {
        return this.featureConfigRepository.isSendMoneyV2Enable();
    }

    private TitleBarRightButtonView.AnonymousClass1<String> getSortingSendMoney() {
        return createPreferenceSortingSendMoneyEntityData().getSortingSendMoney();
    }

    private mergeUrl createPreferenceSortingSendMoneyEntityData() {
        return this.sortingSendMoneyPreferenceEntityDataFactory.createData("local");
    }
}
