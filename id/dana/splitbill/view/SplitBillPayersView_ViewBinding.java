package id.dana.splitbill.view;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SplitBillPayersView_ViewBinding implements Unbinder {
    private SplitBillPayersView getMax;

    @UiThread
    public SplitBillPayersView_ViewBinding(SplitBillPayersView splitBillPayersView, View view) {
        this.getMax = splitBillPayersView;
        splitBillPayersView.rvPayers = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59862131364571, "field 'rvPayers'", RecyclerView.class);
    }

    @CallSuper
    public final void setMax() {
        SplitBillPayersView splitBillPayersView = this.getMax;
        if (splitBillPayersView != null) {
            this.getMax = null;
            splitBillPayersView.rvPayers = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
