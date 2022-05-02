package id.dana.nearbyme.merchantdetail.viewcomponent;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public final class MerchantAverageRatingView_ViewBinding implements Unbinder {
    private View getMin;
    private MerchantAverageRatingView length;

    @UiThread
    public MerchantAverageRatingView_ViewBinding(final MerchantAverageRatingView merchantAverageRatingView, View view) {
        this.length = merchantAverageRatingView;
        View max = drawDividersHorizontal.getMax(view, R.id.f69162131365543, "method 'onClick'");
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                merchantAverageRatingView.onClick();
            }
        });
    }

    public final void setMax() {
        if (this.length != null) {
            this.length = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
