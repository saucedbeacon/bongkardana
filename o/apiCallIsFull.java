package o;

import android.text.TextUtils;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.GriverBottomPopupDialog;
import o.PackageDownloadRequest;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class apiCallIsFull extends setMinProgress implements GriverBottomPopupDialog.AnonymousClass1 {
    private final getExtraAttrByJoinList factory;
    private final PackageDownloadRequest.AnonymousClass1 generalPreferences;
    private final EventTrackStore mapper;

    @Inject
    public apiCallIsFull(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getExtraAttrByJoinList getextraattrbyjoinlist, EventTrackStore eventTrackStore, getAppLaunchParams getapplaunchparams, PackageDownloadRequest.AnonymousClass1 r7) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.factory = getextraattrbyjoinlist;
        this.mapper = eventTrackStore;
        this.generalPreferences = r7;
    }

    public TitleBarRightButtonView.AnonymousClass1<appxrpc> getReferralConsult() {
        TitleBarRightButtonView.AnonymousClass1<doInitialize> myReferralConsult = getMyReferralConsult();
        EventTrackStore eventTrackStore = this.mapper;
        Objects.requireNonNull(eventTrackStore);
        return myReferralConsult.map(new cost(eventTrackStore));
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getReferralCode() {
        return createLocalMyReferralEntityData().getReferralCode().onErrorResumeNext(defaultIfReferralCodeNull());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastSeenReferralCampaignId(String str) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new interceptLoad(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$saveLastSeenReferralCampaignId$0(String str) throws Exception {
        return this.generalPreferences.saveLatestSeenReferralCampaign(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<appxrpc> getLatestReferralCampaign() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getMyReferralConsult().flatMap(new addAttr(this));
        EventTrackStore eventTrackStore = this.mapper;
        Objects.requireNonNull(eventTrackStore);
        return flatMap.map(new cost(eventTrackStore));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getLatestReferralCampaign$1(doInitialize doinitialize) throws Exception {
        doinitialize.setCampaignUpdated(isCampaignUpdated(doinitialize.getReferrerCampaignInfo().getActivityId()));
        return TitleBarRightButtonView.AnonymousClass1.just(doinitialize);
    }

    private TitleBarRightButtonView.AnonymousClass1<doInitialize> getMyReferralConsult() {
        return authenticatedRequest(createMyReferralEntityData().getMyReferralConsult()).doOnNext(saveReferralCode());
    }

    private boolean isCampaignUpdated(String str) {
        return !TextUtils.isEmpty(str) && !str.equalsIgnoreCase(getLastSeenCampaignId());
    }

    private String getLastSeenCampaignId() {
        return this.generalPreferences.getLatestSeenReferralCampaignId();
    }

    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<String>> defaultIfReferralCodeNull() {
        return new stub(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$defaultIfReferralCodeNull$2(Throwable th) throws Exception {
        return referralCode();
    }

    private TitleBarRightButtonView.AnonymousClass1<String> referralCode() {
        TitleBarRightButtonView.AnonymousClass1<String> authenticatedRequest = authenticatedRequest(createMyReferralEntityData().getReferralCode());
        getTrackerIdWithIndex createLocalMyReferralEntityData = createLocalMyReferralEntityData();
        Objects.requireNonNull(createLocalMyReferralEntityData);
        return authenticatedRequest.doOnNext(new whiteScreen(createLocalMyReferralEntityData)).onErrorResumeNext(TitleBarRightButtonView.AnonymousClass1.just(""));
    }

    private getTrackerIdWithIndex createMyReferralEntityData() {
        return this.factory.createData("network");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$saveReferralCode$3(doInitialize doinitialize) throws Exception {
        createLocalMyReferralEntityData().saveReferralCode(doinitialize.getReferralCode());
    }

    private RedDotManager<doInitialize> saveReferralCode() {
        return new clearTrackIdIndexDict(this);
    }

    private getTrackerIdWithIndex createLocalMyReferralEntityData() {
        return this.factory.createData("local");
    }
}
