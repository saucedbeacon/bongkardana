package o;

import id.dana.referral.MyReferralDetailActivity;
import id.dana.referral.ReferralCodeSectionView;

public final class setSharedData implements ReferralCodeSectionView.getMin {
    private final MyReferralDetailActivity getMax;

    public setSharedData(MyReferralDetailActivity myReferralDetailActivity) {
        this.getMax = myReferralDetailActivity;
    }

    public final void length(String str) {
        MyReferralDetailActivity.setMax(this.getMax, str);
    }
}
