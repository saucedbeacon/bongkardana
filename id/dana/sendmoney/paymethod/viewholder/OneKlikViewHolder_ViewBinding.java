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

public class OneKlikViewHolder_ViewBinding implements Unbinder {
    private View getMax;
    private OneKlikViewHolder getMin;

    @UiThread
    public OneKlikViewHolder_ViewBinding(final OneKlikViewHolder oneKlikViewHolder, View view) {
        this.getMin = oneKlikViewHolder;
        oneKlikViewHolder.ivFilter = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48942131363449, "field 'ivFilter'", ImageView.class);
        oneKlikViewHolder.ivLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49642131363519, "field 'ivLogo'", ImageView.class);
        oneKlikViewHolder.ivPrefixDescription = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50222131363577, "field 'ivPrefixDescription'", ImageView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f57472131364325, "field 'rbSelectedCard' and method 'radioButtonClick'");
        oneKlikViewHolder.rbSelectedCard = (RadioButton) drawDividersHorizontal.getMin(max, R.id.f57472131364325, "field 'rbSelectedCard'", RadioButton.class);
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                oneKlikViewHolder.radioButtonClick();
            }
        });
        oneKlikViewHolder.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvDescription'", TextView.class);
        oneKlikViewHolder.tvDivider = (TextView) drawDividersHorizontal.setMin(view, R.id.f65892131365215, "field 'tvDivider'", TextView.class);
        oneKlikViewHolder.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
        oneKlikViewHolder.tvWarning = (TextView) drawDividersHorizontal.setMin(view, R.id.f70402131365670, "field 'tvWarning'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        OneKlikViewHolder oneKlikViewHolder = this.getMin;
        if (oneKlikViewHolder != null) {
            this.getMin = null;
            oneKlikViewHolder.ivFilter = null;
            oneKlikViewHolder.ivLogo = null;
            oneKlikViewHolder.ivPrefixDescription = null;
            oneKlikViewHolder.rbSelectedCard = null;
            oneKlikViewHolder.tvDescription = null;
            oneKlikViewHolder.tvDivider = null;
            oneKlikViewHolder.tvTitle = null;
            oneKlikViewHolder.tvWarning = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
