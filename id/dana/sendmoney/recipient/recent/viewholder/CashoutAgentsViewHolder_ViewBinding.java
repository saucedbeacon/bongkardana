package id.dana.sendmoney.recipient.recent.viewholder;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.sendmoney.RecentDetailView;
import o.drawDividersHorizontal;

public class CashoutAgentsViewHolder_ViewBinding implements Unbinder {
    private CashoutAgentsViewHolder setMin;

    @UiThread
    public CashoutAgentsViewHolder_ViewBinding(CashoutAgentsViewHolder cashoutAgentsViewHolder, View view) {
        this.setMin = cashoutAgentsViewHolder;
        cashoutAgentsViewHolder.recentDetailView = (RecentDetailView) drawDividersHorizontal.setMin(view, R.id.f73012131365936, "field 'recentDetailView'", RecentDetailView.class);
    }

    @CallSuper
    public final void setMax() {
        CashoutAgentsViewHolder cashoutAgentsViewHolder = this.setMin;
        if (cashoutAgentsViewHolder != null) {
            this.setMin = null;
            cashoutAgentsViewHolder.recentDetailView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
