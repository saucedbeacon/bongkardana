package id.dana.nearbyme;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.nearbyme.summary.MerchantListView;
import id.dana.richview.PinMapLottieAnimationView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class NearbyMeActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View FastBitmap$CoordinateSystem;
    private View IsOverlapping;
    private View equals;
    private View getMax;
    private View getMin;
    private View hashCode;
    private View isInside;
    private View length;
    private NearbyMeActivity setMin;
    private View toFloatRange;
    private View toIntRange;

    @UiThread
    @SuppressLint({"ClickableViewAccessibility"})
    public NearbyMeActivity_ViewBinding(final NearbyMeActivity nearbyMeActivity, View view) {
        super(nearbyMeActivity, view);
        this.setMin = nearbyMeActivity;
        nearbyMeActivity.appBarLayout = (AppBarLayout) drawDividersHorizontal.setMin(view, R.id.f34642131361903, "field 'appBarLayout'", AppBarLayout.class);
        nearbyMeActivity.clLayoutMerchant = (CoordinatorLayout) drawDividersHorizontal.setMin(view, R.id.f39772131362457, "field 'clLayoutMerchant'", CoordinatorLayout.class);
        nearbyMeActivity.clLocationContainer = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f38882131362367, "field 'clLocationContainer'", ConstraintLayout.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f41612131362648, "field 'cvGoToMyLocation' and method 'onGoToMyLocationClicked'");
        nearbyMeActivity.cvGoToMyLocation = (CardView) drawDividersHorizontal.getMin(max, R.id.f41612131362648, "field 'cvGoToMyLocation'", CardView.class);
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                nearbyMeActivity.onGoToMyLocationClicked();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f41632131362650, "field 'cvInfoLegendary' and method 'onInfoLegendaryClicked'");
        nearbyMeActivity.cvInfoLegendary = (CardView) drawDividersHorizontal.getMin(max2, R.id.f41632131362650, "field 'cvInfoLegendary'", CardView.class);
        this.length = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                nearbyMeActivity.onInfoLegendaryClicked();
            }
        });
        nearbyMeActivity.cvMerchant = (CardView) drawDividersHorizontal.setMin(view, R.id.f37552131362210, "field 'cvMerchant'", CardView.class);
        View max3 = drawDividersHorizontal.getMax(view, R.id.f43092131362827, "field 'etNearbySearch' and method 'onTextSearchTouched'");
        nearbyMeActivity.etNearbySearch = (EditText) drawDividersHorizontal.getMin(max3, R.id.f43092131362827, "field 'etNearbySearch'", EditText.class);
        this.getMax = max3;
        max3.setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return nearbyMeActivity.onTextSearchTouched(view, motionEvent);
            }
        });
        View max4 = drawDividersHorizontal.getMax(view, R.id.f48312131363385, "field 'ivClear' and method 'onIvClearClicked'");
        nearbyMeActivity.ivClear = (ImageView) drawDividersHorizontal.getMin(max4, R.id.f48312131363385, "field 'ivClear'", ImageView.class);
        this.equals = max4;
        max4.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                nearbyMeActivity.onIvClearClicked();
            }
        });
        nearbyMeActivity.ivClose = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48372131363391, "field 'ivClose'", ImageView.class);
        nearbyMeActivity.ivInfo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49432131363498, "field 'ivInfo'", ImageView.class);
        nearbyMeActivity.ivLoader = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49622131363517, "field 'ivLoader'", ImageView.class);
        nearbyMeActivity.lavMapCenterPinPoint = (PinMapLottieAnimationView) drawDividersHorizontal.setMin(view, R.id.f51652131363721, "field 'lavMapCenterPinPoint'", PinMapLottieAnimationView.class);
        nearbyMeActivity.merchantListView = (MerchantListView) drawDividersHorizontal.setMin(view, R.id.f72622131365897, "field 'merchantListView'", MerchantListView.class);
        nearbyMeActivity.nearbyMerchantLocationSearchView = (NearbyMerchantLocationSearchView) drawDividersHorizontal.setMin(view, R.id.f72702131365905, "field 'nearbyMerchantLocationSearchView'", NearbyMerchantLocationSearchView.class);
        View max5 = drawDividersHorizontal.getMax(view, R.id.f65142131365139, "field 'tvChangeLocation' and method 'onLocationSearchClicked'");
        nearbyMeActivity.tvChangeLocation = (TextView) drawDividersHorizontal.getMin(max5, R.id.f65142131365139, "field 'tvChangeLocation'", TextView.class);
        this.IsOverlapping = max5;
        max5.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                nearbyMeActivity.onLocationSearchClicked();
            }
        });
        nearbyMeActivity.tvDistrictLocation = (TextView) drawDividersHorizontal.setMin(view, R.id.f65882131365214, "field 'tvDistrictLocation'", TextView.class);
        View max6 = drawDividersHorizontal.getMax(view, R.id.f67002131365327, "field 'tvLocation' and method 'onLocationSearchClicked'");
        nearbyMeActivity.tvLocation = (TextView) drawDividersHorizontal.getMin(max6, R.id.f67002131365327, "field 'tvLocation'", TextView.class);
        this.toIntRange = max6;
        max6.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                nearbyMeActivity.onLocationSearchClicked();
            }
        });
        nearbyMeActivity.tvRefreshing = (TextView) drawDividersHorizontal.setMin(view, R.id.f68832131365510, "field 'tvRefreshing'", TextView.class);
        View max7 = drawDividersHorizontal.getMax(view, R.id.f69092131365536, "field 'tvSearchHere' and method 'onRefreshMerchantClicked'");
        nearbyMeActivity.tvSearchHere = (TextView) drawDividersHorizontal.getMin(max7, R.id.f69092131365536, "field 'tvSearchHere'", TextView.class);
        this.isInside = max7;
        max7.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                nearbyMeActivity.onRefreshMerchantClicked();
            }
        });
        nearbyMeActivity.viewTooltipSpotlightContainer = drawDividersHorizontal.getMax(view, R.id.f73422131365977, "field 'viewTooltipSpotlightContainer'");
        nearbyMeActivity.viewTooltipSpotlightPointer = drawDividersHorizontal.getMax(view, R.id.f73412131365976, "field 'viewTooltipSpotlightPointer'");
        View max8 = drawDividersHorizontal.getMax(view, R.id.f37272131362179, "method 'onButtonBackClicked'");
        this.toFloatRange = max8;
        max8.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                nearbyMeActivity.onButtonBackClicked();
            }
        });
        View max9 = drawDividersHorizontal.getMax(view, R.id.f65132131365138, "method 'onTvChangeClicked' and method 'onLocationSearchClicked'");
        this.FastBitmap$CoordinateSystem = max9;
        max9.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                nearbyMeActivity.onTvChangeClicked();
                nearbyMeActivity.onLocationSearchClicked();
            }
        });
        View max10 = drawDividersHorizontal.getMax(view, R.id.f69892131365619, "method 'onTextSwipeUpClicked'");
        this.hashCode = max10;
        max10.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                nearbyMeActivity.onTextSwipeUpClicked();
            }
        });
    }

    public final void setMax() {
        NearbyMeActivity nearbyMeActivity = this.setMin;
        if (nearbyMeActivity != null) {
            this.setMin = null;
            nearbyMeActivity.appBarLayout = null;
            nearbyMeActivity.clLayoutMerchant = null;
            nearbyMeActivity.clLocationContainer = null;
            nearbyMeActivity.cvGoToMyLocation = null;
            nearbyMeActivity.cvInfoLegendary = null;
            nearbyMeActivity.cvMerchant = null;
            nearbyMeActivity.etNearbySearch = null;
            nearbyMeActivity.ivClear = null;
            nearbyMeActivity.ivClose = null;
            nearbyMeActivity.ivInfo = null;
            nearbyMeActivity.ivLoader = null;
            nearbyMeActivity.lavMapCenterPinPoint = null;
            nearbyMeActivity.merchantListView = null;
            nearbyMeActivity.nearbyMerchantLocationSearchView = null;
            nearbyMeActivity.tvChangeLocation = null;
            nearbyMeActivity.tvDistrictLocation = null;
            nearbyMeActivity.tvLocation = null;
            nearbyMeActivity.tvRefreshing = null;
            nearbyMeActivity.tvSearchHere = null;
            nearbyMeActivity.viewTooltipSpotlightContainer = null;
            nearbyMeActivity.viewTooltipSpotlightPointer = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            this.getMax.setOnTouchListener((View.OnTouchListener) null);
            this.getMax = null;
            this.equals.setOnClickListener((View.OnClickListener) null);
            this.equals = null;
            this.IsOverlapping.setOnClickListener((View.OnClickListener) null);
            this.IsOverlapping = null;
            this.toIntRange.setOnClickListener((View.OnClickListener) null);
            this.toIntRange = null;
            this.isInside.setOnClickListener((View.OnClickListener) null);
            this.isInside = null;
            this.toFloatRange.setOnClickListener((View.OnClickListener) null);
            this.toFloatRange = null;
            this.FastBitmap$CoordinateSystem.setOnClickListener((View.OnClickListener) null);
            this.FastBitmap$CoordinateSystem = null;
            this.hashCode.setOnClickListener((View.OnClickListener) null);
            this.hashCode = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
