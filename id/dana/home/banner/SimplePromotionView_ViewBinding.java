package id.dana.home.banner;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SimplePromotionView_ViewBinding implements Unbinder {
    private SimplePromotionView getMin;

    @UiThread
    public SimplePromotionView_ViewBinding(SimplePromotionView simplePromotionView, View view) {
        this.getMin = simplePromotionView;
        simplePromotionView.promotionImage = (ImageView) drawDividersHorizontal.setMin(view, R.id.f57142131364291, "field 'promotionImage'", ImageView.class);
        simplePromotionView.shimmerView = (ImageView) drawDividersHorizontal.setMin(view, R.id.f60672131364655, "field 'shimmerView'", ImageView.class);
    }

    @CallSuper
    public final void setMax() {
        SimplePromotionView simplePromotionView = this.getMin;
        if (simplePromotionView != null) {
            this.getMin = null;
            simplePromotionView.promotionImage = null;
            simplePromotionView.shimmerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
