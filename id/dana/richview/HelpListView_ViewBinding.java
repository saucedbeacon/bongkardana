package id.dana.richview;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class HelpListView_ViewBinding implements Unbinder {
    private HelpListView length;

    @UiThread
    public HelpListView_ViewBinding(HelpListView helpListView, View view) {
        this.length = helpListView;
        helpListView.rvHelpList = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59292131364514, "field 'rvHelpList'", RecyclerView.class);
    }

    @CallSuper
    public final void setMax() {
        HelpListView helpListView = this.length;
        if (helpListView != null) {
            this.length = null;
            helpListView.rvHelpList = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
