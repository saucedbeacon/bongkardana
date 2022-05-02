package id.dana.richview.exploredana;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class ExploreDanaView_ViewBinding implements Unbinder {
    private ExploreDanaView setMin;

    @UiThread
    public ExploreDanaView_ViewBinding(ExploreDanaView exploreDanaView, View view) {
        this.setMin = exploreDanaView;
        exploreDanaView.exploreDana = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f43452131362864, "field 'exploreDana'", RecyclerView.class);
        exploreDanaView.exploreDanaContainer = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f43462131362865, "field 'exploreDanaContainer'", ConstraintLayout.class);
    }

    @CallSuper
    public final void setMax() {
        ExploreDanaView exploreDanaView = this.setMin;
        if (exploreDanaView != null) {
            this.setMin = null;
            exploreDanaView.exploreDana = null;
            exploreDanaView.exploreDanaContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
