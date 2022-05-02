package o;

import id.dana.referral.MyReferralDetailActivity;
import id.dana.sendmoney.model.RecipientModel;

public final class getSharedData implements setPhotoIndex {
    private final MyReferralDetailActivity getMin;

    public getSharedData(MyReferralDetailActivity myReferralDetailActivity) {
        this.getMin = myReferralDetailActivity;
    }

    public final void onRecipientSelected(RecipientModel recipientModel) {
        MyReferralDetailActivity.getMax(this.getMin, recipientModel);
    }
}
