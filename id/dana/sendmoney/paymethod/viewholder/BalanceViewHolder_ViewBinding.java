package id.dana.sendmoney.paymethod.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class BalanceViewHolder_ViewBinding implements Unbinder {
    private View length;
    private BalanceViewHolder setMin;

    @UiThread
    public BalanceViewHolder_ViewBinding(final BalanceViewHolder balanceViewHolder, View view) {
        this.setMin = balanceViewHolder;
        balanceViewHolder.ivLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49642131363519, "field 'ivLogo'", ImageView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f57472131364325, "field 'rbSelectedCard' and method 'radioButtonClick'");
        balanceViewHolder.rbSelectedCard = (RadioButton) drawDividersHorizontal.getMin(max, R.id.f57472131364325, "field 'rbSelectedCard'", RadioButton.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                balanceViewHolder.radioButtonClick();
            }
        });
        balanceViewHolder.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvDescription'", TextView.class);
        balanceViewHolder.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        BalanceViewHolder balanceViewHolder = this.setMin;
        if (balanceViewHolder != null) {
            this.setMin = null;
            balanceViewHolder.ivLogo = null;
            balanceViewHolder.rbSelectedCard = null;
            balanceViewHolder.tvDescription = null;
            balanceViewHolder.tvTitle = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
