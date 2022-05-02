package o;

import id.dana.base.BaseActivity;
import id.dana.richview.splitbill.BillPayerView;

public final class mapScreenDegree implements Runnable {
    private final BaseActivity getMax;
    private final BillPayerView setMin;

    public mapScreenDegree(BillPayerView billPayerView, BaseActivity baseActivity) {
        this.setMin = billPayerView;
        this.getMax = baseActivity;
    }

    public final void run() {
        BillPayerView.length(this.setMin, this.getMax);
    }
}
