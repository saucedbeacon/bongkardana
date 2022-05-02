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

public class DirectDebitViewHolder_ViewBinding implements Unbinder {
    private View getMax;
    private DirectDebitViewHolder setMin;

    @UiThread
    public DirectDebitViewHolder_ViewBinding(final DirectDebitViewHolder directDebitViewHolder, View view) {
        this.setMin = directDebitViewHolder;
        directDebitViewHolder.ivFilter = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48942131363449, "field 'ivFilter'", ImageView.class);
        directDebitViewHolder.ivLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49642131363519, "field 'ivLogo'", ImageView.class);
        directDebitViewHolder.ivPrefixDescription = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50222131363577, "field 'ivPrefixDescription'", ImageView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f57472131364325, "field 'rbSelectedCard' and method 'radioButtonClick'");
        directDebitViewHolder.rbSelectedCard = (RadioButton) drawDividersHorizontal.getMin(max, R.id.f57472131364325, "field 'rbSelectedCard'", RadioButton.class);
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                directDebitViewHolder.radioButtonClick();
            }
        });
        directDebitViewHolder.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvDescription'", TextView.class);
        directDebitViewHolder.tvDivider = (TextView) drawDividersHorizontal.setMin(view, R.id.f65892131365215, "field 'tvDivider'", TextView.class);
        directDebitViewHolder.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
        directDebitViewHolder.tvWarning = (TextView) drawDividersHorizontal.setMin(view, R.id.f70402131365670, "field 'tvWarning'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        DirectDebitViewHolder directDebitViewHolder = this.setMin;
        if (directDebitViewHolder != null) {
            this.setMin = null;
            directDebitViewHolder.ivFilter = null;
            directDebitViewHolder.ivLogo = null;
            directDebitViewHolder.ivPrefixDescription = null;
            directDebitViewHolder.rbSelectedCard = null;
            directDebitViewHolder.tvDescription = null;
            directDebitViewHolder.tvDivider = null;
            directDebitViewHolder.tvTitle = null;
            directDebitViewHolder.tvWarning = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
