package id.dana.globalnetwork.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class OnboardingGlobalNetworkSheetActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View getMin;
    private OnboardingGlobalNetworkSheetActivity setMin;

    @UiThread
    public OnboardingGlobalNetworkSheetActivity_ViewBinding(final OnboardingGlobalNetworkSheetActivity onboardingGlobalNetworkSheetActivity, View view) {
        super(onboardingGlobalNetworkSheetActivity, view);
        this.setMin = onboardingGlobalNetworkSheetActivity;
        onboardingGlobalNetworkSheetActivity.textTnc = (TextView) drawDividersHorizontal.setMin(view, R.id.f70042131365634, "field 'textTnc'", TextView.class);
        onboardingGlobalNetworkSheetActivity.tvWelcoming = (TextView) drawDividersHorizontal.setMin(view, R.id.f70422131365673, "field 'tvWelcoming'", TextView.class);
        onboardingGlobalNetworkSheetActivity.tvWelcomingInfo = (TextView) drawDividersHorizontal.setMin(view, R.id.f70432131365674, "field 'tvWelcomingInfo'", TextView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f36872131362139, "field 'btnStart' and method 'onClickDismissDialog'");
        onboardingGlobalNetworkSheetActivity.btnStart = (DanaButtonPrimaryView) drawDividersHorizontal.getMin(max, R.id.f36872131362139, "field 'btnStart'", DanaButtonPrimaryView.class);
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                onboardingGlobalNetworkSheetActivity.onClickDismissDialog();
            }
        });
        onboardingGlobalNetworkSheetActivity.ivOnboardingImage = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49962131363551, "field 'ivOnboardingImage'", ImageView.class);
    }

    public final void setMax() {
        OnboardingGlobalNetworkSheetActivity onboardingGlobalNetworkSheetActivity = this.setMin;
        if (onboardingGlobalNetworkSheetActivity != null) {
            this.setMin = null;
            onboardingGlobalNetworkSheetActivity.textTnc = null;
            onboardingGlobalNetworkSheetActivity.tvWelcoming = null;
            onboardingGlobalNetworkSheetActivity.tvWelcomingInfo = null;
            onboardingGlobalNetworkSheetActivity.btnStart = null;
            onboardingGlobalNetworkSheetActivity.ivOnboardingImage = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
