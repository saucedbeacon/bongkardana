package id.dana.richview.servicescard;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class ServiceCardView_ViewBinding implements Unbinder {
    private ServiceCardView getMax;

    @UiThread
    public ServiceCardView_ViewBinding(ServiceCardView serviceCardView, View view) {
        this.getMax = serviceCardView;
        serviceCardView.rvService = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f54892131364051, "field 'rvService'", RecyclerView.class);
    }

    @CallSuper
    public final void setMax() {
        ServiceCardView serviceCardView = this.getMax;
        if (serviceCardView != null) {
            this.getMax = null;
            serviceCardView.rvService = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
