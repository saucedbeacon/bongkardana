package id.dana.richview;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class DanaProtectionView_ViewBinding implements Unbinder {
    private DanaProtectionView getMax;
    private View getMin;

    @UiThread
    public DanaProtectionView_ViewBinding(final DanaProtectionView danaProtectionView, View view) {
        this.getMax = danaProtectionView;
        danaProtectionView.ivSecureBadge = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50762131363631, "field 'ivSecureBadge'", ImageView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f39732131362453, "method 'onMainParentClicked'");
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                danaProtectionView.onMainParentClicked();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        DanaProtectionView danaProtectionView = this.getMax;
        if (danaProtectionView != null) {
            this.getMax = null;
            danaProtectionView.ivSecureBadge = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
