package id.dana.nearbyme.summary;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import com.airbnb.lottie.LottieAnimationView;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class NearbyMeSummaryFragment_ViewBinding implements Unbinder {
    private View getMax;
    private NearbyMeSummaryFragment getMin;
    private View length;

    @UiThread
    public NearbyMeSummaryFragment_ViewBinding(final NearbyMeSummaryFragment nearbyMeSummaryFragment, View view) {
        this.getMin = nearbyMeSummaryFragment;
        View max = drawDividersHorizontal.getMax(view, R.id.f36922131362144, "field 'btnTopUp' and method 'onTopUpClicked'");
        nearbyMeSummaryFragment.btnTopUp = (Button) drawDividersHorizontal.getMin(max, R.id.f36922131362144, "field 'btnTopUp'", Button.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                nearbyMeSummaryFragment.onTopUpClicked();
            }
        });
        nearbyMeSummaryFragment.clNearbyMeEmpty = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39862131362466, "field 'clNearbyMeEmpty'", ConstraintLayout.class);
        nearbyMeSummaryFragment.clNearbyMeNormal = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39892131362469, "field 'clNearbyMeNormal'", ConstraintLayout.class);
        nearbyMeSummaryFragment.clRibbonContainer = (ViewGroup) drawDividersHorizontal.setMin(view, R.id.f40282131362508, "field 'clRibbonContainer'", ViewGroup.class);
        nearbyMeSummaryFragment.dividerPromoRibbon = drawDividersHorizontal.getMax(view, R.id.f42492131362759, "field 'dividerPromoRibbon'");
        nearbyMeSummaryFragment.ivEmptyImage = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48682131363422, "field 'ivEmptyImage'", ImageView.class);
        nearbyMeSummaryFragment.ivStoreImage = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50922131363647, "field 'ivStoreImage'", ImageView.class);
        nearbyMeSummaryFragment.ivViewNearbyMeSummaryInfoIcon = (ImageView) drawDividersHorizontal.setMin(view, R.id.f51122131363667, "field 'ivViewNearbyMeSummaryInfoIcon'", ImageView.class);
        nearbyMeSummaryFragment.lottieNearbyRibbon = (LottieAnimationView) drawDividersHorizontal.setMin(view, R.id.f54032131363960, "field 'lottieNearbyRibbon'", LottieAnimationView.class);
        nearbyMeSummaryFragment.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvDescription'", TextView.class);
        nearbyMeSummaryFragment.tvEmptyDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65962131365223, "field 'tvEmptyDescription'", TextView.class);
        nearbyMeSummaryFragment.tvEmptyTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f66072131365234, "field 'tvEmptyTitle'", TextView.class);
        nearbyMeSummaryFragment.tvMerchantSubCategory = (TextView) drawDividersHorizontal.setMin(view, R.id.f67272131365354, "field 'tvMerchantSubCategory'", TextView.class);
        nearbyMeSummaryFragment.tvRibbonLineBottom = (TextView) drawDividersHorizontal.setMin(view, R.id.f69002131365527, "field 'tvRibbonLineBottom'", TextView.class);
        nearbyMeSummaryFragment.tvRibbonLineTop = (TextView) drawDividersHorizontal.setMin(view, R.id.f69012131365528, "field 'tvRibbonLineTop'", TextView.class);
        nearbyMeSummaryFragment.tvStoreDistance = (TextView) drawDividersHorizontal.setMin(view, R.id.f69492131365576, "field 'tvStoreDistance'", TextView.class);
        nearbyMeSummaryFragment.tvStoreName = (TextView) drawDividersHorizontal.setMin(view, R.id.f69502131365577, "field 'tvStoreName'", TextView.class);
        View max2 = drawDividersHorizontal.getMax(view, R.id.f36252131362074, "method 'onDirectionClicked'");
        this.getMax = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                nearbyMeSummaryFragment.onDirectionClicked();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        NearbyMeSummaryFragment nearbyMeSummaryFragment = this.getMin;
        if (nearbyMeSummaryFragment != null) {
            this.getMin = null;
            nearbyMeSummaryFragment.btnTopUp = null;
            nearbyMeSummaryFragment.clNearbyMeEmpty = null;
            nearbyMeSummaryFragment.clNearbyMeNormal = null;
            nearbyMeSummaryFragment.clRibbonContainer = null;
            nearbyMeSummaryFragment.dividerPromoRibbon = null;
            nearbyMeSummaryFragment.ivEmptyImage = null;
            nearbyMeSummaryFragment.ivStoreImage = null;
            nearbyMeSummaryFragment.ivViewNearbyMeSummaryInfoIcon = null;
            nearbyMeSummaryFragment.lottieNearbyRibbon = null;
            nearbyMeSummaryFragment.tvDescription = null;
            nearbyMeSummaryFragment.tvEmptyDescription = null;
            nearbyMeSummaryFragment.tvEmptyTitle = null;
            nearbyMeSummaryFragment.tvMerchantSubCategory = null;
            nearbyMeSummaryFragment.tvRibbonLineBottom = null;
            nearbyMeSummaryFragment.tvRibbonLineTop = null;
            nearbyMeSummaryFragment.tvStoreDistance = null;
            nearbyMeSummaryFragment.tvStoreName = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
