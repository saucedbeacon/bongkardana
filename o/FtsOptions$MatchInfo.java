package o;

import android.view.View;

final class FtsOptions$MatchInfo implements Runnable {
    private final View getMax;
    private final order getMin;

    public FtsOptions$MatchInfo(order order, View view) {
        this.getMin = order;
        this.getMax = view;
    }

    public final void run() {
        order.setMin(this.getMin, this.getMax);
    }
}
