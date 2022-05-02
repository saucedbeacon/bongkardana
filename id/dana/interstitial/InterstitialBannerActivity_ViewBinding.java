package id.dana.interstitial;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.richview.LogoProgressView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class InterstitialBannerActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View getMax;
    private View getMin;
    private View length;
    private InterstitialBannerActivity setMin;

    @UiThread
    public InterstitialBannerActivity_ViewBinding(final InterstitialBannerActivity interstitialBannerActivity, View view) {
        super(interstitialBannerActivity, view);
        this.setMin = interstitialBannerActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f34842131361928, "field 'bannerImage' and method 'openRedirectUrl'");
        interstitialBannerActivity.bannerImage = (ImageView) drawDividersHorizontal.getMin(max, R.id.f34842131361928, "field 'bannerImage'", ImageView.class);
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                interstitialBannerActivity.openRedirectUrl();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f40572131362539, "field 'close' and method 'onClose'");
        interstitialBannerActivity.close = (ImageView) drawDividersHorizontal.getMin(max2, R.id.f40572131362539, "field 'close'", ImageView.class);
        this.length = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                interstitialBannerActivity.onClose();
            }
        });
        interstitialBannerActivity.logoProgressView = (LogoProgressView) drawDividersHorizontal.setMin(view, R.id.f57112131364288, "field 'logoProgressView'", LogoProgressView.class);
        interstitialBannerActivity.tvLoadingBanner = (TextView) drawDividersHorizontal.setMin(view, R.id.f66982131365325, "field 'tvLoadingBanner'", TextView.class);
        View max3 = drawDividersHorizontal.getMax(view, R.id.f54302131363988, "method 'dissmissInterstitialBanner'");
        this.getMax = max3;
        max3.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                interstitialBannerActivity.dissmissInterstitialBanner();
            }
        });
    }

    public final void setMax() {
        InterstitialBannerActivity interstitialBannerActivity = this.setMin;
        if (interstitialBannerActivity != null) {
            this.setMin = null;
            interstitialBannerActivity.bannerImage = null;
            interstitialBannerActivity.close = null;
            interstitialBannerActivity.logoProgressView = null;
            interstitialBannerActivity.tvLoadingBanner = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
