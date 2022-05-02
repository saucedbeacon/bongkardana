package id.dana.sendmoney.recipient.recent.viewholder;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class EmptyViewHolder_ViewBinding implements Unbinder {
    private EmptyViewHolder getMax;

    @UiThread
    public EmptyViewHolder_ViewBinding(EmptyViewHolder emptyViewHolder, View view) {
        this.getMax = emptyViewHolder;
        emptyViewHolder.clRecent = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40222131362502, "field 'clRecent'", ConstraintLayout.class);
    }

    @CallSuper
    public final void setMax() {
        EmptyViewHolder emptyViewHolder = this.getMax;
        if (emptyViewHolder != null) {
            this.getMax = null;
            emptyViewHolder.clRecent = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
