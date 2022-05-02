package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class GriverBottomPopupDialog extends parseFailed<appxrpc, Void> {
    private AnonymousClass1 myReferralConsultRepository;

    /* renamed from: o.GriverBottomPopupDialog$1  reason: invalid class name */
    public interface AnonymousClass1 {
        TitleBarRightButtonView.AnonymousClass1<appxrpc> getLatestReferralCampaign();

        TitleBarRightButtonView.AnonymousClass1<String> getReferralCode();

        TitleBarRightButtonView.AnonymousClass1<appxrpc> getReferralConsult();

        TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastSeenReferralCampaignId(String str);
    }

    @Inject
    public GriverBottomPopupDialog(appxLoadFailed appxloadfailed, getScheme getscheme, AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.myReferralConsultRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<appxrpc> buildUseCaseObservable(Void voidR) {
        return this.myReferralConsultRepository.getLatestReferralCampaign();
    }
}
