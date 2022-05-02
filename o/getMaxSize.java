package o;

import id.dana.pay.PayActivity;
import id.dana.pay.PayScannerFragment;

public final class getMaxSize implements PayScannerFragment.setMax {
    private final PayActivity getMin;

    public getMaxSize(PayActivity payActivity) {
        this.getMin = payActivity;
    }

    public final void getMax() {
        this.getMin.setCurrentPosition(1);
    }
}
