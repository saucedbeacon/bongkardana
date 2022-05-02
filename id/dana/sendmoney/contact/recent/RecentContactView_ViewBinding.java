package id.dana.sendmoney.contact.recent;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class RecentContactView_ViewBinding implements Unbinder {
    private RecentContactView setMin;

    @UiThread
    public RecentContactView_ViewBinding(RecentContactView recentContactView, View view) {
        this.setMin = recentContactView;
        recentContactView.rvRecentContact = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59692131364554, "field 'rvRecentContact'", RecyclerView.class);
    }

    @CallSuper
    public final void setMax() {
        RecentContactView recentContactView = this.setMin;
        if (recentContactView != null) {
            this.setMin = null;
            recentContactView.rvRecentContact = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
