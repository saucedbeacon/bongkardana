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

public class DebitCardViewHolder_ViewBinding implements Unbinder {
    private DebitCardViewHolder getMax;
    private View length;

    @UiThread
    public DebitCardViewHolder_ViewBinding(final DebitCardViewHolder debitCardViewHolder, View view) {
        this.getMax = debitCardViewHolder;
        debitCardViewHolder.ivFilter = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48942131363449, "field 'ivFilter'", ImageView.class);
        debitCardViewHolder.ivLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49642131363519, "field 'ivLogo'", ImageView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f57472131364325, "field 'rbSelectedCard' and method 'radioButtonClick'");
        debitCardViewHolder.rbSelectedCard = (RadioButton) drawDividersHorizontal.getMin(max, R.id.f57472131364325, "field 'rbSelectedCard'", RadioButton.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                debitCardViewHolder.radioButtonClick();
            }
        });
        debitCardViewHolder.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvDescription'", TextView.class);
        debitCardViewHolder.tvDivider = (TextView) drawDividersHorizontal.setMin(view, R.id.f65892131365215, "field 'tvDivider'", TextView.class);
        debitCardViewHolder.tvPrefixDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f68232131365450, "field 'tvPrefixDescription'", TextView.class);
        debitCardViewHolder.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
        debitCardViewHolder.tvWarning = (TextView) drawDividersHorizontal.setMin(view, R.id.f70402131365670, "field 'tvWarning'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        DebitCardViewHolder debitCardViewHolder = this.getMax;
        if (debitCardViewHolder != null) {
            this.getMax = null;
            debitCardViewHolder.ivFilter = null;
            debitCardViewHolder.ivLogo = null;
            debitCardViewHolder.rbSelectedCard = null;
            debitCardViewHolder.tvDescription = null;
            debitCardViewHolder.tvDivider = null;
            debitCardViewHolder.tvPrefixDescription = null;
            debitCardViewHolder.tvTitle = null;
            debitCardViewHolder.tvWarning = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
