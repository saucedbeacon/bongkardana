package id.dana.home.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class GridMenuView_ViewBinding implements Unbinder {
    private GridMenuView getMin;

    @UiThread
    public GridMenuView_ViewBinding(GridMenuView gridMenuView, View view) {
        this.getMin = gridMenuView;
        gridMenuView.titleView = (TextView) drawDividersHorizontal.setMin(view, R.id.f62242131364837, "field 'titleView'", TextView.class);
        gridMenuView.imageView = (ImageView) drawDividersHorizontal.setMin(view, R.id.f46282131363173, "field 'imageView'", ImageView.class);
    }

    @CallSuper
    public final void setMax() {
        GridMenuView gridMenuView = this.getMin;
        if (gridMenuView != null) {
            this.getMin = null;
            gridMenuView.titleView = null;
            gridMenuView.imageView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
