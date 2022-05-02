package id.dana.social.view.activity;

import android.view.View;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public final class SocialProfileActivity_ViewBinding extends BaseActivity_ViewBinding {
    private SocialProfileActivity getMin;
    private View setMin;

    @UiThread
    public SocialProfileActivity_ViewBinding(final SocialProfileActivity socialProfileActivity, View view) {
        super(socialProfileActivity, view);
        this.getMin = socialProfileActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f41522131362639, "method 'backToTop'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                socialProfileActivity.backToTop();
            }
        });
    }

    public final void setMax() {
        if (this.getMin != null) {
            this.getMin = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
