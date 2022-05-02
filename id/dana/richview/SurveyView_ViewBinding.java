package id.dana.richview;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class SurveyView_ViewBinding implements Unbinder {
    private SurveyView getMin;
    private View length;

    @UiThread
    public SurveyView_ViewBinding(final SurveyView surveyView, View view) {
        this.getMin = surveyView;
        View max = drawDividersHorizontal.getMax(view, R.id.f44292131362954, "field 'flhomeSurvey' and method 'onClickSurvey'");
        surveyView.flhomeSurvey = (FrameLayout) drawDividersHorizontal.getMin(max, R.id.f44292131362954, "field 'flhomeSurvey'", FrameLayout.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                surveyView.onClickSurvey();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        SurveyView surveyView = this.getMin;
        if (surveyView != null) {
            this.getMin = null;
            surveyView.flhomeSurvey = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
