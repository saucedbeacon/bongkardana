package id.dana.home;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SlidingBannerAdapter_ViewBinding implements Unbinder {
    private SlidingBannerAdapter getMin;

    @UiThread
    public SlidingBannerAdapter_ViewBinding(SlidingBannerAdapter slidingBannerAdapter, View view) {
        this.getMin = slidingBannerAdapter;
        slidingBannerAdapter.ivPromotion = (ImageView) drawDividersHorizontal.setMin(view, R.id.f46302131363175, "field 'ivPromotion'", ImageView.class);
        slidingBannerAdapter.lParent = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f51942131363750, "field 'lParent'", RelativeLayout.class);
    }

    @CallSuper
    public final void setMax() {
        SlidingBannerAdapter slidingBannerAdapter = this.getMin;
        if (slidingBannerAdapter != null) {
            this.getMin = null;
            slidingBannerAdapter.ivPromotion = null;
            slidingBannerAdapter.lParent = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
