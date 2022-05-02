package id.dana.richview.splitbill.adapter.viewholder;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.sendmoney.RecentDetailView;
import o.drawDividersHorizontal;

public class RecentContactPayerViewHolder_ViewBinding implements Unbinder {
    private RecentContactPayerViewHolder getMax;

    @UiThread
    public RecentContactPayerViewHolder_ViewBinding(RecentContactPayerViewHolder recentContactPayerViewHolder, View view) {
        this.getMax = recentContactPayerViewHolder;
        recentContactPayerViewHolder.recentDetailView = (RecentDetailView) drawDividersHorizontal.setMin(view, R.id.f73012131365936, "field 'recentDetailView'", RecentDetailView.class);
    }

    @CallSuper
    public final void setMax() {
        RecentContactPayerViewHolder recentContactPayerViewHolder = this.getMax;
        if (recentContactPayerViewHolder != null) {
            this.getMax = null;
            recentContactPayerViewHolder.recentDetailView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
