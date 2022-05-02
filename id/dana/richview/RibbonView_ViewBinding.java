package id.dana.richview;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class RibbonView_ViewBinding implements Unbinder {
    private RibbonView length;

    @UiThread
    public RibbonView_ViewBinding(RibbonView ribbonView, View view) {
        this.length = ribbonView;
        ribbonView.ivRibbon = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f50592131363614, "field 'ivRibbon'", LinearLayout.class);
        ribbonView.tvRibbonLineTop = (TextView) drawDividersHorizontal.setMin(view, R.id.f68992131365526, "field 'tvRibbonLineTop'", TextView.class);
        ribbonView.tvRibbonLineBottom = (TextView) drawDividersHorizontal.setMin(view, R.id.f68982131365525, "field 'tvRibbonLineBottom'", TextView.class);
        ribbonView.llLineBottom = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53292131363885, "field 'llLineBottom'", LinearLayout.class);
        ribbonView.ivInfo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49432131363498, "field 'ivInfo'", ImageView.class);
    }

    @CallSuper
    public final void setMax() {
        RibbonView ribbonView = this.length;
        if (ribbonView != null) {
            this.length = null;
            ribbonView.ivRibbon = null;
            ribbonView.tvRibbonLineTop = null;
            ribbonView.tvRibbonLineBottom = null;
            ribbonView.llLineBottom = null;
            ribbonView.ivInfo = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
