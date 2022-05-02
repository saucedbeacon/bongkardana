package o;

import id.dana.splitbill.adapter.ClosePayerViewHolder;
import id.dana.splitbill.view.ClosePayerView;

public final class PopMenuItem implements ClosePayerViewHolder.length {
    private final ClosePayerView setMax;

    public PopMenuItem(ClosePayerView closePayerView) {
        this.setMax = closePayerView;
    }

    public final void setMax() {
        ClosePayerView.getMin(this.setMax);
    }
}
