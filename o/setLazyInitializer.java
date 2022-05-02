package o;

import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class setLazyInitializer implements getTrackerIdWithIndex {
    private final isKeyJsApi referralPreferences;

    @Inject
    public setLazyInitializer(isKeyJsApi iskeyjsapi) {
        this.referralPreferences = iskeyjsapi;
    }

    public TitleBarRightButtonView.AnonymousClass1<doInitialize> getMyReferralConsult() {
        throw new UnsupportedOperationException();
    }

    public void saveReferralCode(String str) {
        this.referralPreferences.saveReferralCode(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getReferralCode() {
        isKeyJsApi iskeyjsapi = this.referralPreferences;
        Objects.requireNonNull(iskeyjsapi);
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new TrackId(iskeyjsapi));
    }
}
