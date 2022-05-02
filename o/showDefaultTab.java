package o;

import id.dana.data.h5event.sendmoney.CheckoutFinishEntity;
import o.TitleBarRightButtonView;

final class showDefaultTab implements isTabPage {
    private final TitleBarRightButtonView.AnonymousClass2 getMin;

    public showDefaultTab(TitleBarRightButtonView.AnonymousClass2 r1) {
        this.getMin = r1;
    }

    public final void onCheckoutFinished(CheckoutFinishEntity checkoutFinishEntity) {
        getPageCount.lambda$getCheckoutH5Event$0(this.getMin, checkoutFinishEntity);
    }
}
