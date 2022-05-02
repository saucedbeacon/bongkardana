package id.dana.splitbill.view;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SplitBillHistoryView_ViewBinding implements Unbinder {
    private SplitBillHistoryView length;

    @UiThread
    public SplitBillHistoryView_ViewBinding(SplitBillHistoryView splitBillHistoryView, View view) {
        this.length = splitBillHistoryView;
        splitBillHistoryView.llSplitBillHistoryContainer = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f53812131363937, "field 'llSplitBillHistoryContainer'", ConstraintLayout.class);
        splitBillHistoryView.rvSplitBillHistory = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59852131364570, "field 'rvSplitBillHistory'", RecyclerView.class);
        splitBillHistoryView.llBillHistoryEmptyState = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53172131363873, "field 'llBillHistoryEmptyState'", LinearLayout.class);
    }

    @CallSuper
    public final void setMax() {
        SplitBillHistoryView splitBillHistoryView = this.length;
        if (splitBillHistoryView != null) {
            this.length = null;
            splitBillHistoryView.llSplitBillHistoryContainer = null;
            splitBillHistoryView.rvSplitBillHistory = null;
            splitBillHistoryView.llBillHistoryEmptyState = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
