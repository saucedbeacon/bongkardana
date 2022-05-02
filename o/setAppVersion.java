package o;

import id.dana.data.Source;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;
import o.CycledLeScannerForJellyBeanMr2;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class setAppVersion extends setMinProgress implements setDistinctPacketsDetectedPerScan {
    private final onCallBack configEntityDataFactory;
    private final getOnlineResourceFetcher contactEntityMapper;
    private final getSnapshotTitleBarParams contactMapper;
    private final getSnapshotIndex contactSyncConfigMapper;
    private final ResolveExtensionInvoker recentContactEntityRepository;
    private final registerRule syncContactDataFactory;

    @Inject
    public setAppVersion(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, onCallBack oncallback, registerRule registerrule, ResolveExtensionInvoker resolveExtensionInvoker, getSnapshotTitleBarParams getsnapshottitlebarparams, getOnlineResourceFetcher getonlineresourcefetcher, getSnapshotIndex getsnapshotindex, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.configEntityDataFactory = oncallback;
        this.syncContactDataFactory = registerrule;
        this.recentContactEntityRepository = resolveExtensionInvoker;
        this.contactMapper = getsnapshottitlebarparams;
        this.contactEntityMapper = getonlineresourcefetcher;
        this.contactSyncConfigMapper = getsnapshotindex;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> syncContact(List<String> list, CycledLeScannerForJellyBeanMr2.AnonymousClass2 r3) {
        if (!createAccountData().hasAccount().blockingSingle().booleanValue()) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        }
        return authenticatedRequest(createSyncContactData().syncContact(list)).map(addPackage.getMin).flatMap(new getRawResource(this)).flatMap(new setApp(this, r3));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$syncContact$1(List list) throws Exception {
        return saveRegisteredNumbers(list, false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$syncContact$2(CycledLeScannerForJellyBeanMr2.AnonymousClass2 r1, Boolean bool) throws Exception {
        return saveLastSyncedContact(r1);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> syncOneContact(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return authenticatedRequest(createSyncContactData().syncContact(arrayList)).map(setMainPackage.getMax).flatMap(new getMainPackageInfo(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$syncOneContact$4(List list) throws Exception {
        return saveRegisteredNumbers(list, true);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isSyncProcessCompleted() {
        return createSyncContactPreferences().isSyncProcessCompleted();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveSyncProcessStatusComplete() {
        return createSyncContactPreferences().saveSyncProcessStatusComplete();
    }

    public TitleBarRightButtonView.AnonymousClass1<CycledLeScannerForJellyBeanMr2.AnonymousClass2> getLastSyncedContact() {
        TitleBarRightButtonView.AnonymousClass1<setSnapshotTitleBarParams> lastSyncedContact = createSyncContactPreferences().getLastSyncedContact();
        getOnlineResourceFetcher getonlineresourcefetcher = this.contactEntityMapper;
        Objects.requireNonNull(getonlineresourcefetcher);
        return lastSyncedContact.map(new updatePackageBrief(getonlineresourcefetcher));
    }

    public TitleBarRightButtonView.AnonymousClass1<CycledLeScannerForJellyBeanMr2.AnonymousClass3> getContactSyncConfig() {
        if (!createAccountData().hasAccount().blockingSingle().booleanValue()) {
            CycledLeScannerForJellyBeanMr2.AnonymousClass3 r0 = new Object() {
                private int maxContactSyncBatchSize;
                private boolean synchronizeContactEnable;

                public boolean isSynchronizeContactEnable() {
                    return this.synchronizeContactEnable;
                }

                public void setSynchronizeContactEnable(boolean z) {
                    this.synchronizeContactEnable = z;
                }

                public int getMaxContactSyncBatchSize() {
                    return this.maxContactSyncBatchSize;
                }

                public void setMaxContactSyncBatchSize(int i) {
                    this.maxContactSyncBatchSize = i;
                }
            };
            r0.setSynchronizeContactEnable(false);
            return TitleBarRightButtonView.AnonymousClass1.just(r0);
        }
        TitleBarRightButtonView.AnonymousClass1<getStartUrl> onErrorResumeNext = createSplitConfigEntityData().getContactSyncConfig().onErrorResumeNext(createAmcsConfigEntityData().getContactSyncConfig());
        getSnapshotIndex getsnapshotindex = this.contactSyncConfigMapper;
        Objects.requireNonNull(getsnapshotindex);
        return onErrorResumeNext.map(new setMainPackageInfo(getsnapshotindex));
    }

    private TitleBarRightButtonView.AnonymousClass4<Boolean> saveLastSyncedContact(CycledLeScannerForJellyBeanMr2.AnonymousClass2 r3) {
        if (r3 != null) {
            createSyncContactPreferences().saveLastSyncedContact((setSnapshotTitleBarParams) this.contactMapper.apply(r3));
        }
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    private TitleBarRightButtonView.AnonymousClass4<Boolean> saveRegisteredNumbers(List<String> list, boolean z) {
        if (list.isEmpty() && !z) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
        }
        if (list.isEmpty() && z) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        }
        TitleBarRightButtonView.AnonymousClass1<T> fromIterable = TitleBarRightButtonView.AnonymousClass1.fromIterable(list);
        ResolveExtensionInvoker resolveExtensionInvoker = this.recentContactEntityRepository;
        Objects.requireNonNull(resolveExtensionInvoker);
        return fromIterable.flatMap(new attachResourcePackage(resolveExtensionInvoker));
    }

    private releaseResourcePackages createSyncContactData() {
        return this.syncContactDataFactory.createData("network");
    }

    private releaseResourcePackages createSyncContactPreferences() {
        return this.syncContactDataFactory.createData("local");
    }

    private AppMsgReceiver.AnonymousClass2 createAmcsConfigEntityData() {
        return this.configEntityDataFactory.createData("amcs");
    }

    private AppMsgReceiver.AnonymousClass2 createSplitConfigEntityData() {
        return this.configEntityDataFactory.createData(Source.SPLIT);
    }
}
