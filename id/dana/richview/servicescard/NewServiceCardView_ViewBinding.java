package id.dana.richview.servicescard;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class NewServiceCardView_ViewBinding implements Unbinder {
    private NewServiceCardView getMax;

    @UiThread
    public NewServiceCardView_ViewBinding(NewServiceCardView newServiceCardView, View view) {
        this.getMax = newServiceCardView;
        newServiceCardView.rvService = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f54892131364051, "field 'rvService'", RecyclerView.class);
        newServiceCardView.skeletonView = (FrameLayout) drawDividersHorizontal.setMin(view, R.id.f60812131364670, "field 'skeletonView'", FrameLayout.class);
    }

    @CallSuper
    public final void setMax() {
        NewServiceCardView newServiceCardView = this.getMax;
        if (newServiceCardView != null) {
            this.getMax = null;
            newServiceCardView.rvService = null;
            newServiceCardView.skeletonView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
