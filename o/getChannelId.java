package o;

import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.BigDataChannelManager;
import o.OpenAPIBridgeExtension;
import o.TitleBarRightButtonView;

@Singleton
public class getChannelId implements OpenAPIBridgeExtension.AnonymousClass1.C00041 {
    private final releaseBuffer referralConfigEntityDataFactory;
    private final setBizType referralConfigEntityMapper;

    @Inject
    public getChannelId(releaseBuffer releasebuffer, setBizType setbiztype) {
        this.referralConfigEntityDataFactory = releasebuffer;
        this.referralConfigEntityMapper = setbiztype;
    }

    public TitleBarRightButtonView.AnonymousClass1<ScanBridgeExtension> getReferralHomeConfig() {
        TitleBarRightButtonView.AnonymousClass1<getBufferSize> onErrorResumeNext = createReferralConfigEntityData().getReferralConfig("feature_referral_home").onErrorResumeNext(defaultReferralConfig("feature_referral_home"));
        setBizType setbiztype = this.referralConfigEntityMapper;
        Objects.requireNonNull(setbiztype);
        return onErrorResumeNext.map(new BigDataChannelManager.InstanceHolder(setbiztype));
    }

    public TitleBarRightButtonView.AnonymousClass1<ScanBridgeExtension> getReferralSendMoneyConfig() {
        TitleBarRightButtonView.AnonymousClass1<getBufferSize> onErrorResumeNext = createReferralConfigEntityData().getReferralConfig("feature_referral_p2p").onErrorResumeNext(defaultReferralConfig("feature_referral_p2p"));
        setBizType setbiztype = this.referralConfigEntityMapper;
        Objects.requireNonNull(setbiztype);
        return onErrorResumeNext.map(new BigDataChannelManager.InstanceHolder(setbiztype));
    }

    private TitleBarRightButtonView.AnonymousClass4<getBufferSize> defaultReferralConfig(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(622145266, oncanceled);
            onCancelLoad.getMin(622145266, oncanceled);
        }
        return createDefaultConfigEntityData().getReferralConfig(str);
    }

    private setBufferSize createReferralConfigEntityData() {
        return this.referralConfigEntityDataFactory.createData("network");
    }

    private setBufferSize createDefaultConfigEntityData() {
        return this.referralConfigEntityDataFactory.createData("local");
    }
}
