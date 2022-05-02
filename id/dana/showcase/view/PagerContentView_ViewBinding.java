package id.dana.showcase.view;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.popup.LockableViewPager;
import o.drawDividersHorizontal;

public class PagerContentView_ViewBinding implements Unbinder {
    private PagerContentView length;

    @UiThread
    public PagerContentView_ViewBinding(PagerContentView pagerContentView, View view) {
        this.length = pagerContentView;
        pagerContentView.ivClose = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48372131363391, "field 'ivClose'", ImageView.class);
        pagerContentView.viewPager = (LockableViewPager) drawDividersHorizontal.setMin(view, R.id.f72802131365915, "field 'viewPager'", LockableViewPager.class);
        pagerContentView.btnLeft = (Button) drawDividersHorizontal.setMin(view, R.id.f36412131362091, "field 'btnLeft'", Button.class);
        pagerContentView.btnRight = (Button) drawDividersHorizontal.setMin(view, R.id.f36732131362125, "field 'btnRight'", Button.class);
    }

    @CallSuper
    public final void setMax() {
        PagerContentView pagerContentView = this.length;
        if (pagerContentView != null) {
            this.length = null;
            pagerContentView.ivClose = null;
            pagerContentView.viewPager = null;
            pagerContentView.btnLeft = null;
            pagerContentView.btnRight = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
