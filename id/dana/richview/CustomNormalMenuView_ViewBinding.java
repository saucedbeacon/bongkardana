package id.dana.richview;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class CustomNormalMenuView_ViewBinding implements Unbinder {
    private CustomNormalMenuView getMin;

    @UiThread
    public CustomNormalMenuView_ViewBinding(CustomNormalMenuView customNormalMenuView, View view) {
        this.getMin = customNormalMenuView;
        customNormalMenuView.rlIcon = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f58332131364415, "field 'rlIcon'", RelativeLayout.class);
        customNormalMenuView.ivIcon = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49242131363479, "field 'ivIcon'", ImageView.class);
        customNormalMenuView.tvMenuName = (TextView) drawDividersHorizontal.setMin(view, R.id.f67192131365346, "field 'tvMenuName'", TextView.class);
        customNormalMenuView.tvNotif = (TextView) drawDividersHorizontal.setMin(view, R.id.f67712131365398, "field 'tvNotif'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        CustomNormalMenuView customNormalMenuView = this.getMin;
        if (customNormalMenuView != null) {
            this.getMin = null;
            customNormalMenuView.rlIcon = null;
            customNormalMenuView.ivIcon = null;
            customNormalMenuView.tvMenuName = null;
            customNormalMenuView.tvNotif = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
