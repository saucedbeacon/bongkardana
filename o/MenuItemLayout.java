package o;

import id.dana.richview.CurrencyEditText;
import id.dana.splitbill.adapter.PayerViewHolder;
import id.dana.splitbill.model.SplitBillPayerModel;

public final class MenuItemLayout implements CurrencyEditText.setMax {
    private final PayerViewHolder getMin;
    private final SplitBillPayerModel length;

    public MenuItemLayout(PayerViewHolder payerViewHolder, SplitBillPayerModel splitBillPayerModel) {
        this.getMin = payerViewHolder;
        this.length = splitBillPayerModel;
    }

    public final void getMax() {
        PayerViewHolder.getMin(this.getMin, this.length);
    }
}
