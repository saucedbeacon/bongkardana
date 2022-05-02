package o;

import android.view.KeyEvent;
import android.widget.TextView;
import id.dana.splitbill.adapter.PayerViewHolder;

public final class AUScrollLayout implements TextView.OnEditorActionListener {
    private final PayerViewHolder getMin;

    public AUScrollLayout(PayerViewHolder payerViewHolder) {
        this.getMin = payerViewHolder;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.getMin.getMax(i);
    }
}
