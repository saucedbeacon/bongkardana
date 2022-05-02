package id.dana.splitbill.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.CircleImageSelectionView;
import id.dana.richview.CurrencyEditText;
import o.drawDividersHorizontal;

public class PayerViewHolder_ViewBinding implements Unbinder {
    private PayerViewHolder getMin;

    @UiThread
    public PayerViewHolder_ViewBinding(PayerViewHolder payerViewHolder, View view) {
        this.getMin = payerViewHolder;
        payerViewHolder.cisvAvatar = (CircleImageSelectionView) drawDividersHorizontal.setMin(view, R.id.f38112131362289, "field 'cisvAvatar'", CircleImageSelectionView.class);
        payerViewHolder.tvPayerName = (TextView) drawDividersHorizontal.setMin(view, R.id.f68122131365439, "field 'tvPayerName'", TextView.class);
        payerViewHolder.tvPhoneNumber = (TextView) drawDividersHorizontal.setMin(view, R.id.f68152131365442, "field 'tvPhoneNumber'", TextView.class);
        payerViewHolder.etAmount = (CurrencyEditText) drawDividersHorizontal.setMin(view, R.id.f42942131362812, "field 'etAmount'", CurrencyEditText.class);
        payerViewHolder.tvRequesterExcludeAmount = (TextView) drawDividersHorizontal.setMin(view, R.id.f68902131365517, "field 'tvRequesterExcludeAmount'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        PayerViewHolder payerViewHolder = this.getMin;
        if (payerViewHolder != null) {
            this.getMin = null;
            payerViewHolder.cisvAvatar = null;
            payerViewHolder.tvPayerName = null;
            payerViewHolder.tvPhoneNumber = null;
            payerViewHolder.etAmount = null;
            payerViewHolder.tvRequesterExcludeAmount = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
