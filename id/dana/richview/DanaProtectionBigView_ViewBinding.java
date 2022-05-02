package id.dana.richview;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class DanaProtectionBigView_ViewBinding implements Unbinder {
    private DanaProtectionBigView length;
    private View setMin;

    @UiThread
    public DanaProtectionBigView_ViewBinding(final DanaProtectionBigView danaProtectionBigView, View view) {
        this.length = danaProtectionBigView;
        View max = drawDividersHorizontal.getMax(view, R.id.f39732131362453, "method 'onMainParentClicked'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                danaProtectionBigView.onMainParentClicked();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        if (this.length != null) {
            this.length = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
