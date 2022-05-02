package id.dana.richview;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class MaintenanceBroadcastView_ViewBinding implements Unbinder {
    private MaintenanceBroadcastView getMin;

    @UiThread
    public MaintenanceBroadcastView_ViewBinding(MaintenanceBroadcastView maintenanceBroadcastView, View view) {
        this.getMin = maintenanceBroadcastView;
        maintenanceBroadcastView.container = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40932131362579, "field 'container'", ConstraintLayout.class);
        maintenanceBroadcastView.tvMaintenanceBroadcast = (TextView) drawDividersHorizontal.setMin(view, R.id.f67092131365336, "field 'tvMaintenanceBroadcast'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        MaintenanceBroadcastView maintenanceBroadcastView = this.getMin;
        if (maintenanceBroadcastView != null) {
            this.getMin = null;
            maintenanceBroadcastView.container = null;
            maintenanceBroadcastView.tvMaintenanceBroadcast = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
