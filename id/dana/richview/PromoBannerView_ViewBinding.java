package id.dana.richview;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.promocenter.views.PromoCenterSeePromosView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class PromoBannerView_ViewBinding implements Unbinder {
    private View getMin;
    private PromoBannerView length;

    @UiThread
    public PromoBannerView_ViewBinding(final PromoBannerView promoBannerView, View view) {
        this.length = promoBannerView;
        promoBannerView.bannerView = (BannerView) drawDividersHorizontal.setMin(view, R.id.f37362131362188, "field 'bannerView'", BannerView.class);
        promoBannerView.clPromoBanner = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40112131362491, "field 'clPromoBanner'", ConstraintLayout.class);
        promoBannerView.clPromoCenter = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40132131362493, "field 'clPromoCenter'", ConstraintLayout.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f72882131365923, "field 'promoCenterSeePromosView' and method 'onViewAllClicked'");
        promoBannerView.promoCenterSeePromosView = (PromoCenterSeePromosView) drawDividersHorizontal.getMin(max, R.id.f72882131365923, "field 'promoCenterSeePromosView'", PromoCenterSeePromosView.class);
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                promoBannerView.onViewAllClicked();
            }
        });
        promoBannerView.tvPromoCenterDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f68372131365464, "field 'tvPromoCenterDescription'", TextView.class);
        promoBannerView.tvPromoCenterTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f68382131365465, "field 'tvPromoCenterTitle'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        PromoBannerView promoBannerView = this.length;
        if (promoBannerView != null) {
            this.length = null;
            promoBannerView.bannerView = null;
            promoBannerView.clPromoBanner = null;
            promoBannerView.clPromoCenter = null;
            promoBannerView.promoCenterSeePromosView = null;
            promoBannerView.tvPromoCenterDescription = null;
            promoBannerView.tvPromoCenterTitle = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
