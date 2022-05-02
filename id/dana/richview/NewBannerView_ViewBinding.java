package id.dana.richview;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import com.rd.PageIndicatorView;
import id.dana.R;
import o.drawDividersHorizontal;

public class NewBannerView_ViewBinding implements Unbinder {
    private NewBannerView length;

    @UiThread
    public NewBannerView_ViewBinding(NewBannerView newBannerView, View view) {
        this.length = newBannerView;
        newBannerView.container = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40932131362579, "field 'container'", ConstraintLayout.class);
        newBannerView.indicator = (PageIndicatorView) drawDividersHorizontal.setMin(view, R.id.f46572131363203, "field 'indicator'", PageIndicatorView.class);
        newBannerView.vpBanner = (CircularViewPager) drawDividersHorizontal.setMin(view, R.id.f34822131361926, "field 'vpBanner'", CircularViewPager.class);
    }

    @CallSuper
    public final void setMax() {
        NewBannerView newBannerView = this.length;
        if (newBannerView != null) {
            this.length = null;
            newBannerView.container = null;
            newBannerView.indicator = null;
            newBannerView.vpBanner = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
