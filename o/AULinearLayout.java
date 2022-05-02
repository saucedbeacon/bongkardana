package o;

import android.view.View;
import id.dana.splitbill.adapter.PayerViewHolder;
import id.dana.splitbill.model.SplitBillPayerModel;

public final class AULinearLayout implements View.OnFocusChangeListener {
    private final SplitBillPayerModel getMin;
    private final PayerViewHolder setMin;

    public AULinearLayout(PayerViewHolder payerViewHolder, SplitBillPayerModel splitBillPayerModel) {
        this.setMin = payerViewHolder;
        this.getMin = splitBillPayerModel;
    }

    public final void onFocusChange(View view, boolean z) {
        PayerViewHolder.length(this.setMin, this.getMin, z);
    }
}
