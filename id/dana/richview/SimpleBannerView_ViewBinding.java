package id.dana.richview;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SimpleBannerView_ViewBinding implements Unbinder {
    private SimpleBannerView getMin;

    @UiThread
    public SimpleBannerView_ViewBinding(SimpleBannerView simpleBannerView, View view) {
        this.getMin = simpleBannerView;
        simpleBannerView.imagePromotion = (ImageView) drawDividersHorizontal.setMin(view, R.id.f46302131363175, "field 'imagePromotion'", ImageView.class);
    }

    @CallSuper
    public final void setMax() {
        SimpleBannerView simpleBannerView = this.getMin;
        if (simpleBannerView != null) {
            this.getMin = null;
            simpleBannerView.imagePromotion = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
