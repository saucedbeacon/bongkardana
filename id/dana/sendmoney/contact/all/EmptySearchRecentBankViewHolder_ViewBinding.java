package id.dana.sendmoney.contact.all;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.EmptyState;
import o.drawDividersHorizontal;

public class EmptySearchRecentBankViewHolder_ViewBinding implements Unbinder {
    private EmptySearchRecentBankViewHolder setMin;

    @UiThread
    public EmptySearchRecentBankViewHolder_ViewBinding(EmptySearchRecentBankViewHolder emptySearchRecentBankViewHolder, View view) {
        this.setMin = emptySearchRecentBankViewHolder;
        emptySearchRecentBankViewHolder.esContact = (EmptyState) drawDividersHorizontal.setMin(view, R.id.f42872131362805, "field 'esContact'", EmptyState.class);
    }

    @CallSuper
    public final void setMax() {
        EmptySearchRecentBankViewHolder emptySearchRecentBankViewHolder = this.setMin;
        if (emptySearchRecentBankViewHolder != null) {
            this.setMin = null;
            emptySearchRecentBankViewHolder.esContact = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
