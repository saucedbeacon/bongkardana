package id.dana.richview.boundcard;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class BoundCardView_ViewBinding implements Unbinder {
    private BoundCardView length;

    @UiThread
    public BoundCardView_ViewBinding(BoundCardView boundCardView, View view) {
        this.length = boundCardView;
        boundCardView.rvStackView = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59872131364572, "field 'rvStackView'", RecyclerView.class);
    }

    @CallSuper
    public final void setMax() {
        BoundCardView boundCardView = this.length;
        if (boundCardView != null) {
            this.length = null;
            boundCardView.rvStackView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
