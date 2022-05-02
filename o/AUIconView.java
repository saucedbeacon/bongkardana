package o;

import android.view.View;
import id.dana.splitbill.view.PayerListView;

public final class AUIconView implements View.OnClickListener {
    private final PayerListView setMin;

    public AUIconView(PayerListView payerListView) {
        this.setMin = payerListView;
    }

    public final void onClick(View view) {
        this.setMin.setMin.length();
    }
}
