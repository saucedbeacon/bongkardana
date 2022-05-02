package o;

import androidx.annotation.NonNull;
import id.dana.data.Source;
import id.dana.data.network.exception.MockGpsDetectedException;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;
import o.CreatePromptParam;
import o.OpenAPIBridgeExtension;
import o.RVProxy;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class Event$1 extends setMinProgress implements GriverSwtich {
    private onCallBack configEntityDataFactory;
    private CreatePromptParam.PositiveListener geocodeEntityRepository;
    private final Event$Stub mapper;
    private incrementRef referralEntityDataFactory;

    @Inject
    public Event$1(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, Event$Stub event$Stub, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.mapper = event$Stub;
    }

    @Inject
    public void injectDataFactory(CreatePromptParam.PositiveListener positiveListener, incrementRef incrementref, onCallBack oncallback) {
        this.geocodeEntityRepository = positiveListener;
        this.referralEntityDataFactory = incrementref;
        this.configEntityDataFactory = oncallback;
    }

    private RVProxy.LazyGetter createNetworkReferralData() {
        return this.referralEntityDataFactory.createData("network");
    }

    private RVProxy.LazyGetter createLocalReferralData() {
        return this.referralEntityDataFactory.createData("local");
    }

    public TitleBarRightButtonView.AnonymousClass1<ifNullConvertToEmpty> consult() {
        TitleBarRightButtonView.AnonymousClass1<pickNext> authenticatedRequest = authenticatedRequest(createNetworkReferralData().consult());
        Event$Stub event$Stub = this.mapper;
        Objects.requireNonNull(event$Stub);
        return authenticatedRequest.map(new Event$Behavior(event$Stub));
    }

    public TitleBarRightButtonView.AnonymousClass1<OpenAPIBridgeExtension.AnonymousClass2> verify(@NonNull String str) {
        TitleBarRightButtonView.AnonymousClass1<R> switchMap = this.geocodeEntityRepository.getLatestSubdivisions().switchMap(new Event$Error(this, str));
        Event$Stub event$Stub = this.mapper;
        Objects.requireNonNull(event$Stub);
        return authenticatedRequest(switchMap.map(new Event$Cost(event$Stub)));
    }

    /* access modifiers changed from: private */
    /* renamed from: handleIfLocationIsMock */
    public TitleBarRightButtonView.AnonymousClass1<setViewId> lambda$verify$0(String str, GriverPerformanceStages griverPerformanceStages) throws MockGpsDetectedException {
        onUpdateResult indoSubdivisions = griverPerformanceStages.getIndoSubdivisions();
        if (!indoSubdivisions.isMockLocation()) {
            return createNetworkReferralData().verify(str, indoSubdivisions.getCityName());
        }
        throw new MockGpsDetectedException();
    }

    public TitleBarRightButtonView.AnonymousClass1<result> statusConsult() {
        TitleBarRightButtonView.AnonymousClass1<setChannelId> authenticatedRequest = authenticatedRequest(createNetworkReferralData().statusConsult());
        Event$Stub event$Stub = this.mapper;
        Objects.requireNonNull(event$Stub);
        return authenticatedRequest.map(new getFailCode(event$Stub));
    }

    public TitleBarRightButtonView.AnonymousClass1<OpenAPIBridgeExtension.AnonymousClass1> getReferralEngagementDialogConfig() {
        return createSplitConfigData().getFeatureReferralEngagementDialogConfig().map(Event$Fatal.setMin);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveDialogCache(List<OpenAPIBridgeExtension.AnonymousClass3> list) {
        return createLocalReferralData().saveReferralEngagementDialogCache(this.mapper.toDialogCacheEntities(list));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<OpenAPIBridgeExtension.AnonymousClass3>> getDialogCaches() {
        TitleBarRightButtonView.AnonymousClass1<List<createChannelWithBuffer>> dialogCaches = createLocalReferralData().getDialogCaches();
        Event$Stub event$Stub = this.mapper;
        Objects.requireNonNull(event$Stub);
        return dialogCaches.map(new setFailCode(event$Stub));
    }

    private AppMsgReceiver.AnonymousClass2 createSplitConfigData() {
        return this.configEntityDataFactory.createData(Source.SPLIT);
    }
}
