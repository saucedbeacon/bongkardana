package id.dana.sendmoney.contact.all;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.EmptyState;
import o.drawDividersHorizontal;

public class NoRecentBankViewHolder_ViewBinding implements Unbinder {
    private NoRecentBankViewHolder setMin;

    @UiThread
    public NoRecentBankViewHolder_ViewBinding(NoRecentBankViewHolder noRecentBankViewHolder, View view) {
        this.setMin = noRecentBankViewHolder;
        noRecentBankViewHolder.esContact = (EmptyState) drawDividersHorizontal.setMin(view, R.id.f42872131362805, "field 'esContact'", EmptyState.class);
    }

    @CallSuper
    public final void setMax() {
        NoRecentBankViewHolder noRecentBankViewHolder = this.setMin;
        if (noRecentBankViewHolder != null) {
            this.setMin = null;
            noRecentBankViewHolder.esContact = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
