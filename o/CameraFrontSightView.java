package o;

import id.dana.richview.splitbill.BillPayerView;

public final class CameraFrontSightView implements RedDotManager {
    private final BillPayerView getMin;

    public CameraFrontSightView(BillPayerView billPayerView) {
        this.getMin = billPayerView;
    }

    public final void accept(Object obj) {
        BillPayerView.setMax(this.getMin, (Boolean) obj);
    }
}
