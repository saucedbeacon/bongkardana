package o;

import id.dana.splitbill.view.SplitBillPayersView;
import o.Ignore;

public final class setIconTextMinHeight implements Ignore.setMin {
    private final SplitBillPayersView setMax;

    public setIconTextMinHeight(SplitBillPayersView splitBillPayersView) {
        this.setMax = splitBillPayersView;
    }

    public final void length(int i) {
        SplitBillPayersView.getMin(this.setMax, i);
    }
}
