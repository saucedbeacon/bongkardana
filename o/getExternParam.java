package o;

import id.dana.richview.splitbill.AmountDisplayView;
import id.dana.splitbill.view.SplitBillActivity;

public final class getExternParam implements AmountDisplayView.getMin {
    private final SplitBillActivity setMin;

    public getExternParam(SplitBillActivity splitBillActivity) {
        this.setMin = splitBillActivity;
    }

    public final void length() {
        SplitBillActivity.setMax(this.setMin);
    }
}
