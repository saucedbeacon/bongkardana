package id.dana.richview.promoclaim;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class PromoClaimView_ViewBinding implements Unbinder {
    private View getMin;
    private PromoClaimView length;

    @UiThread
    public PromoClaimView_ViewBinding(final PromoClaimView promoClaimView, View view) {
        this.length = promoClaimView;
        View max = drawDividersHorizontal.getMax(view, R.id.f39242131362403, "field 'clContainer' and method 'onClick'");
        promoClaimView.clContainer = (ConstraintLayout) drawDividersHorizontal.getMin(max, R.id.f39242131362403, "field 'clContainer'", ConstraintLayout.class);
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                promoClaimView.onClick();
            }
        });
        promoClaimView.imageView = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49482131363503, "field 'imageView'", ImageView.class);
    }

    @CallSuper
    public final void setMax() {
        PromoClaimView promoClaimView = this.length;
        if (promoClaimView != null) {
            this.length = null;
            promoClaimView.clContainer = null;
            promoClaimView.imageView = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
