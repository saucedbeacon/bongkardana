package id.dana.sendmoney.bank.all;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class CollapsibleSavedBankViewHolder_ViewBinding implements Unbinder {
    private CollapsibleSavedBankViewHolder getMin;

    @UiThread
    public CollapsibleSavedBankViewHolder_ViewBinding(CollapsibleSavedBankViewHolder collapsibleSavedBankViewHolder, View view) {
        this.getMin = collapsibleSavedBankViewHolder;
        collapsibleSavedBankViewHolder.tvCollapsibleBank = (TextView) drawDividersHorizontal.setMin(view, R.id.f65252131365150, "field 'tvCollapsibleBank'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        CollapsibleSavedBankViewHolder collapsibleSavedBankViewHolder = this.getMin;
        if (collapsibleSavedBankViewHolder != null) {
            this.getMin = null;
            collapsibleSavedBankViewHolder.tvCollapsibleBank = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
