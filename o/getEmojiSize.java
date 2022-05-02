package o;

import id.dana.splitbill.view.PayerListView;
import id.dana.splitbill.view.SplitBillSummaryActivity;

public final class getEmojiSize implements PayerListView.getMin {
    private final SplitBillSummaryActivity getMin;

    public getEmojiSize(SplitBillSummaryActivity splitBillSummaryActivity) {
        this.getMin = splitBillSummaryActivity;
    }

    public final void length() {
        SplitBillSummaryActivity.setMin(this.getMin);
    }
}
