package id.dana.richview.homereferral;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class HomeReferralView_ViewBinding implements Unbinder {
    private HomeReferralView getMin;
    private View length;

    @UiThread
    public HomeReferralView_ViewBinding(final HomeReferralView homeReferralView, View view) {
        this.getMin = homeReferralView;
        View max = drawDividersHorizontal.getMax(view, R.id.f49212131363476, "field 'ivReferralBanner' and method 'onBannerClicked'");
        homeReferralView.ivReferralBanner = (ImageView) drawDividersHorizontal.getMin(max, R.id.f49212131363476, "field 'ivReferralBanner'", ImageView.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                homeReferralView.onBannerClicked();
            }
        });
        homeReferralView.clReferralContainer = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39632131362443, "field 'clReferralContainer'", ConstraintLayout.class);
    }

    @CallSuper
    public final void setMax() {
        HomeReferralView homeReferralView = this.getMin;
        if (homeReferralView != null) {
            this.getMin = null;
            homeReferralView.ivReferralBanner = null;
            homeReferralView.clReferralContainer = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
