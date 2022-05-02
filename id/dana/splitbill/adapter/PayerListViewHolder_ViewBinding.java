package id.dana.splitbill.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.richview.CurrencyTextView;
import o.drawDividersHorizontal;

public class PayerListViewHolder_ViewBinding implements Unbinder {
    private PayerListViewHolder setMin;

    @UiThread
    public PayerListViewHolder_ViewBinding(PayerListViewHolder payerListViewHolder, View view) {
        this.setMin = payerListViewHolder;
        payerListViewHolder.clPayerContainer = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40042131362484, "field 'clPayerContainer'", ConstraintLayout.class);
        payerListViewHolder.civPayerAvatar = (CircleImageView) drawDividersHorizontal.setMin(view, R.id.f38242131362302, "field 'civPayerAvatar'", CircleImageView.class);
        payerListViewHolder.tvName = (TextView) drawDividersHorizontal.setMin(view, R.id.f67452131365372, "field 'tvName'", TextView.class);
        payerListViewHolder.tvPhoneNumber = (TextView) drawDividersHorizontal.setMin(view, R.id.f68152131365442, "field 'tvPhoneNumber'", TextView.class);
        payerListViewHolder.ctvFundAmount = (CurrencyTextView) drawDividersHorizontal.setMin(view, R.id.f41272131362613, "field 'ctvFundAmount'", CurrencyTextView.class);
        payerListViewHolder.ivStatus = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50912131363646, "field 'ivStatus'", ImageView.class);
    }

    @CallSuper
    public final void setMax() {
        PayerListViewHolder payerListViewHolder = this.setMin;
        if (payerListViewHolder != null) {
            this.setMin = null;
            payerListViewHolder.clPayerContainer = null;
            payerListViewHolder.civPayerAvatar = null;
            payerListViewHolder.tvName = null;
            payerListViewHolder.tvPhoneNumber = null;
            payerListViewHolder.ctvFundAmount = null;
            payerListViewHolder.ivStatus = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
