package id.dana.home.banner;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class NewSimplePromotionView_ViewBinding implements Unbinder {
    private NewSimplePromotionView getMax;

    @UiThread
    public NewSimplePromotionView_ViewBinding(NewSimplePromotionView newSimplePromotionView, View view) {
        this.getMax = newSimplePromotionView;
        newSimplePromotionView.promotionImage = (ImageView) drawDividersHorizontal.setMin(view, R.id.f57142131364291, "field 'promotionImage'", ImageView.class);
        newSimplePromotionView.shimmerView = (ImageView) drawDividersHorizontal.setMin(view, R.id.f60672131364655, "field 'shimmerView'", ImageView.class);
    }

    @CallSuper
    public final void setMax() {
        NewSimplePromotionView newSimplePromotionView = this.getMax;
        if (newSimplePromotionView != null) {
            this.getMax = null;
            newSimplePromotionView.promotionImage = null;
            newSimplePromotionView.shimmerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
