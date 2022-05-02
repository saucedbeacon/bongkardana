package id.dana.sendmoney_v2.landing;

import id.dana.sendmoney_v2.landing.view.RecentTransactionView;
import kotlin.Metadata;
import o.isPowerOfTwo;
import o.resetInternal;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/sendmoney_v2/landing/SendMoneyActivity$showOnBoardingQuickActionBottomSheet$1", "Lid/dana/sendmoney_v2/landing/view/OnboardingManageQuickActionBottomSheet$OnClickListener;", "onTryNowButtonClicked", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SendMoneyActivity$Mean$Arithmetic implements isPowerOfTwo.getMin {
    final /* synthetic */ SendMoneyActivity getMin;

    SendMoneyActivity$Mean$Arithmetic(SendMoneyActivity sendMoneyActivity) {
        this.getMin = sendMoneyActivity;
    }

    public final void setMin() {
        ((RecentTransactionView) this.getMin._$_findCachedViewById(resetInternal.setMax.hasIcon)).showTooltip();
        SendMoneyActivity.access$getOnBoardingManageQuickActionBottomSheet$p(this.getMin).dismiss();
    }
}
