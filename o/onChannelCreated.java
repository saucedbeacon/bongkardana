package o;

import id.dana.data.Source;
import id.dana.data.referraltracker.ReferredUserFalseException;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AltBeacon;
import o.AppMsgReceiver;
import o.ImmutableCollection;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class onChannelCreated extends setMinProgress implements AltBeacon.Builder {
    private final onCallBack configEntityDataFactory;
    private final RVByteBufferManager mapper;
    private final mutable referralTrackerEntityDataFactory;

    @Inject
    public onChannelCreated(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, mutable mutable, RVByteBufferManager rVByteBufferManager, onCallBack oncallback, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.referralTrackerEntityDataFactory = mutable;
        this.mapper = rVByteBufferManager;
        this.configEntityDataFactory = oncallback;
    }

    public TitleBarRightButtonView.AnonymousClass1<AltBeacon.AnonymousClass1> getReferralTracker(int i, int i2) {
        return isReferredUserEnable().flatMap(new onChannelReleased(this, i, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getReferralTracker$0(int i, int i2, Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new ReferredUserFalseException());
        }
        TitleBarRightButtonView.AnonymousClass1<ImmutableCollection.AnonymousClass1> authenticatedRequest = authenticatedRequest(createReferralTrackerData().getReferralTracker(i, i2));
        RVByteBufferManager rVByteBufferManager = this.mapper;
        Objects.requireNonNull(rVByteBufferManager);
        return authenticatedRequest.map(new IBigDataConsumerReadyCallback(rVByteBufferManager));
    }

    private TitleBarRightButtonView.AnonymousClass1<Boolean> isReferredUserEnable() {
        return createSplitConfigEntityData().isReferredUserEnabled().onErrorResumeNext(createAMCSConfigEntityData().isReferredUserEnabled());
    }

    private onConsumerReady createReferralTrackerData() {
        return this.referralTrackerEntityDataFactory.createData("network");
    }

    private AppMsgReceiver.AnonymousClass2 createAMCSConfigEntityData() {
        return this.configEntityDataFactory.createData("network");
    }

    private AppMsgReceiver.AnonymousClass2 createSplitConfigEntityData() {
        return this.configEntityDataFactory.createData(Source.SPLIT);
    }
}
