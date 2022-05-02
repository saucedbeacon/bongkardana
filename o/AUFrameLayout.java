package o;

import id.dana.richview.CircleImageSelectionView;
import id.dana.splitbill.adapter.PayerViewHolder;
import id.dana.splitbill.model.SplitBillPayerModel;

public final class AUFrameLayout implements CircleImageSelectionView.length {
    private final SplitBillPayerModel getMax;
    private final PayerViewHolder getMin;

    public AUFrameLayout(PayerViewHolder payerViewHolder, SplitBillPayerModel splitBillPayerModel) {
        this.getMin = payerViewHolder;
        this.getMax = splitBillPayerModel;
    }

    public final void length() {
        PayerViewHolder.setMax(this.getMin, this.getMax);
    }
}
