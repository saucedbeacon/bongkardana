package id.dana.richview.boundcard;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class DanaCardViewHolder_ViewBinding implements Unbinder {
    private DanaCardViewHolder setMin;

    @UiThread
    public DanaCardViewHolder_ViewBinding(DanaCardViewHolder danaCardViewHolder, View view) {
        this.setMin = danaCardViewHolder;
        danaCardViewHolder.clCardDana = (DanaBalanceCardView) drawDividersHorizontal.setMin(view, R.id.f37502131362205, "field 'clCardDana'", DanaBalanceCardView.class);
    }

    @CallSuper
    public final void setMax() {
        DanaCardViewHolder danaCardViewHolder = this.setMin;
        if (danaCardViewHolder != null) {
            this.setMin = null;
            danaCardViewHolder.clCardDana = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
