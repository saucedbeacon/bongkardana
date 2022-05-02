package o;

import id.dana.richview.splitbill.BillPayerView;

public final class startDraw implements RedDotManager {
    private final BillPayerView length;

    public startDraw(BillPayerView billPayerView) {
        this.length = billPayerView;
    }

    public final void accept(Object obj) {
        this.length.contactSelectorView.observeContactPagedList((String) obj);
    }
}
