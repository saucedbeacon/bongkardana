package id.dana.savings.activity;

import android.view.View;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class SavingCreateActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View getMax;
    private SavingCreateActivity getMin;

    @UiThread
    public SavingCreateActivity_ViewBinding(final SavingCreateActivity savingCreateActivity, View view) {
        super(savingCreateActivity, view);
        this.getMin = savingCreateActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f51072131363662, "method 'onTotalSavingLimitAboutClick'");
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                savingCreateActivity.onTotalSavingLimitAboutClick();
            }
        });
    }

    public final void setMax() {
        if (this.getMin != null) {
            this.getMin = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
