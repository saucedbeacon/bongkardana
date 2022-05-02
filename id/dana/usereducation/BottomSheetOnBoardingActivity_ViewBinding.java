package id.dana.usereducation;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class BottomSheetOnBoardingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View getMax;
    private BottomSheetOnBoardingActivity getMin;
    private View length;

    @UiThread
    public BottomSheetOnBoardingActivity_ViewBinding(final BottomSheetOnBoardingActivity bottomSheetOnBoardingActivity, View view) {
        super(bottomSheetOnBoardingActivity, view);
        this.getMin = bottomSheetOnBoardingActivity;
        bottomSheetOnBoardingActivity.tvTitleOnBoarding = (TextView) drawDividersHorizontal.setMin(view, R.id.f69902131365620, "field 'tvTitleOnBoarding'", TextView.class);
        bottomSheetOnBoardingActivity.viewPager = (ViewPager) drawDividersHorizontal.setMin(view, R.id.f72802131365915, "field 'viewPager'", ViewPager.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f36512131362101, "field 'btnNext' and method 'onButtonNextClicked'");
        bottomSheetOnBoardingActivity.btnNext = (DanaButtonPrimaryView) drawDividersHorizontal.getMin(max, R.id.f36512131362101, "field 'btnNext'", DanaButtonPrimaryView.class);
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                bottomSheetOnBoardingActivity.onButtonNextClicked();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f36622131362114, "field 'btnPrevious' and method 'onButtonPreviousClicked'");
        bottomSheetOnBoardingActivity.btnPrevious = (DanaButtonSecondaryView) drawDividersHorizontal.getMin(max2, R.id.f36622131362114, "field 'btnPrevious'", DanaButtonSecondaryView.class);
        this.length = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                bottomSheetOnBoardingActivity.onButtonPreviousClicked();
            }
        });
    }

    public final void setMax() {
        BottomSheetOnBoardingActivity bottomSheetOnBoardingActivity = this.getMin;
        if (bottomSheetOnBoardingActivity != null) {
            this.getMin = null;
            bottomSheetOnBoardingActivity.tvTitleOnBoarding = null;
            bottomSheetOnBoardingActivity.viewPager = null;
            bottomSheetOnBoardingActivity.btnNext = null;
            bottomSheetOnBoardingActivity.btnPrevious = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
