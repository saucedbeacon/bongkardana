package o;

import android.view.View;
import id.dana.richview.splitbill.SelectedPayerView;

public final class setCameraParams implements View.OnClickListener {
    private final SelectedPayerView getMin;

    public setCameraParams(SelectedPayerView selectedPayerView) {
        this.getMin = selectedPayerView;
    }

    public final void onClick(View view) {
        SelectedPayerView.getMin(this.getMin);
    }
}
