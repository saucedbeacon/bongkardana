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

public class AddCardViewHolder_ViewBinding implements Unbinder {
    private View getMin;
    private AddCardViewHolder length;

    @UiThread
    public AddCardViewHolder_ViewBinding(final AddCardViewHolder addCardViewHolder, View view) {
        this.length = addCardViewHolder;
        addCardViewHolder.ivLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49642131363519, "field 'ivLogo'", ImageView.class);
        addCardViewHolder.ivPrefixDescription = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50222131363577, "field 'ivPrefixDescription'", ImageView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f57472131364325, "field 'rbSelectedCard' and method 'radioButtonClick'");
        addCardViewHolder.rbSelectedCard = (RadioButton) drawDividersHorizontal.getMin(max, R.id.f57472131364325, "field 'rbSelectedCard'", RadioButton.class);
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                addCardViewHolder.radioButtonClick();
            }
        });
        addCardViewHolder.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        AddCardViewHolder addCardViewHolder = this.length;
        if (addCardViewHolder != null) {
            this.length = null;
            addCardViewHolder.ivLogo = null;
            addCardViewHolder.ivPrefixDescription = null;
            addCardViewHolder.rbSelectedCard = null;
            addCardViewHolder.tvTitle = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
