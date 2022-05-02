package id.dana.richview.boundcard;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class DebitCardViewHolder_ViewBinding implements Unbinder {
    private DebitCardViewHolder getMax;

    @UiThread
    public DebitCardViewHolder_ViewBinding(DebitCardViewHolder debitCardViewHolder, View view) {
        this.getMax = debitCardViewHolder;
        debitCardViewHolder.debitCard = (DebitCardView) drawDividersHorizontal.setMin(view, R.id.f42062131362697, "field 'debitCard'", DebitCardView.class);
    }

    @CallSuper
    public final void setMax() {
        DebitCardViewHolder debitCardViewHolder = this.getMax;
        if (debitCardViewHolder != null) {
            this.getMax = null;
            debitCardViewHolder.debitCard = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
