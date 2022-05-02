package o;

import javax.inject.Inject;
import o.GriverBottomPopupDialog;
import o.TitleBarRightButtonView;

public class executeGetAuthCode extends parseFailed<Boolean, getMin> {
    private GriverBottomPopupDialog.AnonymousClass1 myReferralConsultRepository;

    @Inject
    public executeGetAuthCode(appxLoadFailed appxloadfailed, getScheme getscheme, GriverBottomPopupDialog.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.myReferralConsultRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(getMin getmin) {
        return this.myReferralConsultRepository.saveLastSeenReferralCampaignId(getmin.referralCampaignId);
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public String referralCampaignId;

        private getMin(String str) {
            this.referralCampaignId = str;
        }

        public static getMin forReferralCampaignId(String str) {
            return new getMin(str);
        }
    }
}
