package id.dana.richview;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import com.rd.PageIndicatorView;
import id.dana.R;
import o.drawDividersHorizontal;

public class BannerView_ViewBinding implements Unbinder {
    private BannerView setMin;

    @UiThread
    public BannerView_ViewBinding(BannerView bannerView, View view) {
        this.setMin = bannerView;
        bannerView.container = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40932131362579, "field 'container'", ConstraintLayout.class);
        bannerView.vpBanner = (CircularViewPager) drawDividersHorizontal.setMin(view, R.id.f34822131361926, "field 'vpBanner'", CircularViewPager.class);
        bannerView.indicator = (PageIndicatorView) drawDividersHorizontal.setMin(view, R.id.f46572131363203, "field 'indicator'", PageIndicatorView.class);
    }

    @CallSuper
    public final void setMax() {
        BannerView bannerView = this.setMin;
        if (bannerView != null) {
            this.setMin = null;
            bannerView.container = null;
            bannerView.vpBanner = null;
            bannerView.indicator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
