package id.dana.sendmoney.recipient.recent.viewholder;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.sendmoney.RecentDetailView;
import o.drawDividersHorizontal;

public class BankViewHolder_ViewBinding implements Unbinder {
    private BankViewHolder length;

    @UiThread
    public BankViewHolder_ViewBinding(BankViewHolder bankViewHolder, View view) {
        this.length = bankViewHolder;
        bankViewHolder.recentDetailView = (RecentDetailView) drawDividersHorizontal.setMin(view, R.id.f73012131365936, "field 'recentDetailView'", RecentDetailView.class);
    }

    @CallSuper
    public final void setMax() {
        BankViewHolder bankViewHolder = this.length;
        if (bankViewHolder != null) {
            this.length = null;
            bankViewHolder.recentDetailView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
