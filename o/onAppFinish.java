package o;

import id.dana.data.Source;
import id.dana.data.userconfig.UserConfigBizTypeConstant;
import javax.inject.Inject;
import o.AppMsgReceiver;
import o.AppNode;
import o.TitleBarRightButtonView;
import o.b;

public class onAppFinish extends setMinProgress implements CycledLeScannerForLollipop {
    private final onCallBack configEntityDataFactory;
    private final onFirstScanTime queryConfig = new onFirstScanTime(UserConfigBizTypeConstant.DIALOG_TNC, onVisit.class);
    private final AppModel userConfigRepository;

    @Inject
    public onAppFinish(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, onCallBack oncallback, getOrigin getorigin) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.configEntityDataFactory = oncallback;
        this.userConfigRepository = getorigin;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getTncSummaryConfig() {
        return authenticatedRequest(getTermsConditionsConfig().flatMap(new onPageExit(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getTncSummaryConfig$0(AppNode.AnonymousClass7 r3) throws Exception {
        if (r3 == null || !r3.isEnable()) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        }
        return TitleBarRightButtonView.AnonymousClass1.zip(TitleBarRightButtonView.AnonymousClass1.just(r3), this.userConfigRepository.getUserSpecificConfig(this.queryConfig), compareTncSummaryVersion());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveDialogTncConfig() {
        return authenticatedRequest(getTermsConditionsConfig().flatMap(new LifecycleCallback(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveDialogTncConfig$1(AppNode.AnonymousClass7 r4) throws Exception {
        if (r4.isEnable()) {
            return this.userConfigRepository.saveUserSpecificConfig(new onPageShow(new onVisit(r4.getLatestValidVersion())));
        }
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getFeatureTncSummary() {
        return authenticatedRequest(getTermsConditionsConfig().map(onAppStart.length));
    }

    private removeNode<AppNode.AnonymousClass7, onVisit, Boolean> compareTncSummaryVersion() {
        return onPageEnter.getMin;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$compareTncSummaryVersion$2(AppNode.AnonymousClass7 r1, onVisit onvisit) throws Exception {
        if (!r1.isEnable()) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(r1.getLatestValidVersion() > onvisit.latestAgreedVersion);
    }

    private AppMsgReceiver.AnonymousClass2 createSplitConfigEntityData() {
        return this.configEntityDataFactory.createData(Source.SPLIT);
    }

    private AppMsgReceiver.AnonymousClass2 createAMCSConfigEntityData() {
        return this.configEntityDataFactory.createData("amcs");
    }

    private TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass7> getTermsConditionsConfig() {
        return createSplitConfigEntityData().getTermsConditionsConfig().onErrorResumeNext(createAMCSConfigEntityData().getTermsConditionsConfig());
    }
}
