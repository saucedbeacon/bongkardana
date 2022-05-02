package id.dana.richview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class ToggleBalanceView_ViewBinding implements Unbinder {
    private ToggleBalanceView getMax;
    private View length;

    @UiThread
    public ToggleBalanceView_ViewBinding(final ToggleBalanceView toggleBalanceView, View view) {
        this.getMax = toggleBalanceView;
        toggleBalanceView.tvCurrency = (TextView) drawDividersHorizontal.setMin(view, R.id.f65382131365163, "field 'tvCurrency'", TextView.class);
        toggleBalanceView.tvShownBalance = (TextView) drawDividersHorizontal.setMin(view, R.id.f69372131365564, "field 'tvShownBalance'", TextView.class);
        toggleBalanceView.tvHiddenBalance = (TextView) drawDividersHorizontal.setMin(view, R.id.f66632131365290, "field 'tvHiddenBalance'", TextView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f49172131363472, "field 'ivHideBalance' and method 'onHideBalanceClick'");
        toggleBalanceView.ivHideBalance = (ImageView) drawDividersHorizontal.getMin(max, R.id.f49172131363472, "field 'ivHideBalance'", ImageView.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                toggleBalanceView.onHideBalanceClick();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        ToggleBalanceView toggleBalanceView = this.getMax;
        if (toggleBalanceView != null) {
            this.getMax = null;
            toggleBalanceView.tvCurrency = null;
            toggleBalanceView.tvShownBalance = null;
            toggleBalanceView.tvHiddenBalance = null;
            toggleBalanceView.ivHideBalance = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
