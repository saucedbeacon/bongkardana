package id.dana.oauth;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class ScopeViewHolder_ViewBinding implements Unbinder {
    private ScopeViewHolder getMin;

    @UiThread
    public ScopeViewHolder_ViewBinding(ScopeViewHolder scopeViewHolder, View view) {
        this.getMin = scopeViewHolder;
        scopeViewHolder.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvDescription'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        ScopeViewHolder scopeViewHolder = this.getMin;
        if (scopeViewHolder != null) {
            this.getMin = null;
            scopeViewHolder.tvDescription = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
