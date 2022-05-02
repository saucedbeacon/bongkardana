package o;

import id.dana.referral.MyReferralDetailActivity;

public final class removeSharedData implements RedDotManager {
    private final MyReferralDetailActivity getMax;

    public removeSharedData(MyReferralDetailActivity myReferralDetailActivity) {
        this.getMax = myReferralDetailActivity;
    }

    public final void accept(Object obj) {
        MyReferralDetailActivity.length(this.getMax, (String) obj);
    }
}
