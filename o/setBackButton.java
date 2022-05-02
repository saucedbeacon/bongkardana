package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.referral.model.MyReferralConsult;
import id.dana.referral.model.ReferralCampaignInfo;
import javax.inject.Inject;
import o.PhotoContext;

public final class setBackButton {
    private final PhotoContext.AnonymousClass2 length;

    @Inject
    public setBackButton(PhotoContext.AnonymousClass2 r1) {
        this.length = r1;
    }

    public final MyReferralConsult setMin(appxrpc appxrpc) {
        if (appxrpc == null) {
            return null;
        }
        MyReferralConsult myReferralConsult = new MyReferralConsult();
        myReferralConsult.getMin = appxrpc.getHowToUrl();
        myReferralConsult.length = appxrpc.getReferralCode();
        myReferralConsult.setMin = setMin(appxrpc.getReferrerCampaignInfo());
        myReferralConsult.setMax = setMin(appxrpc.getReferredCampaignInfo());
        return myReferralConsult;
    }

    private ReferralCampaignInfo setMin(getUserInfo getuserinfo) {
        if (getuserinfo == null) {
            return null;
        }
        ReferralCampaignInfo referralCampaignInfo = new ReferralCampaignInfo();
        referralCampaignInfo.getMax = getuserinfo.getPrizeName();
        referralCampaignInfo.getMin = (CurrencyAmountModel) this.length.apply(getuserinfo.getPrizeAmount());
        referralCampaignInfo.length = getuserinfo.getCampaignId();
        referralCampaignInfo.setMax = getuserinfo.isCampaignEnabled();
        return referralCampaignInfo;
    }
}
