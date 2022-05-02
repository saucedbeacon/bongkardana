package id.dana.lazada;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class LazadaGuideActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View getMax;
    private LazadaGuideActivity length;
    private View setMin;

    @UiThread
    public LazadaGuideActivity_ViewBinding(final LazadaGuideActivity lazadaGuideActivity, View view) {
        super(lazadaGuideActivity, view);
        this.length = lazadaGuideActivity;
        lazadaGuideActivity.rootLayout = drawDividersHorizontal.getMax(view, R.id.f58672131364449, "field 'rootLayout'");
        lazadaGuideActivity.tvTermsAndConditions = (TextView) drawDividersHorizontal.setMin(view, R.id.f70012131365631, "field 'tvTermsAndConditions'", TextView.class);
        lazadaGuideActivity.tvLazadaTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f66872131365314, "field 'tvLazadaTitle'", TextView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f36702131362122, "method 'refuseRegisterLazada'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                lazadaGuideActivity.refuseRegisterLazada();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f36032131362049, "method 'agreeRegisterLazada'");
        this.getMax = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                lazadaGuideActivity.agreeRegisterLazada();
            }
        });
    }

    public final void setMax() {
        LazadaGuideActivity lazadaGuideActivity = this.length;
        if (lazadaGuideActivity != null) {
            this.length = null;
            lazadaGuideActivity.rootLayout = null;
            lazadaGuideActivity.tvTermsAndConditions = null;
            lazadaGuideActivity.tvLazadaTitle = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
