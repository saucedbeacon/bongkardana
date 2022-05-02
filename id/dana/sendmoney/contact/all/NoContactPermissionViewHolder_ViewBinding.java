package id.dana.sendmoney.contact.all;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.EmptyState;
import o.drawDividersHorizontal;

public class NoContactPermissionViewHolder_ViewBinding implements Unbinder {
    private NoContactPermissionViewHolder getMax;

    @UiThread
    public NoContactPermissionViewHolder_ViewBinding(NoContactPermissionViewHolder noContactPermissionViewHolder, View view) {
        this.getMax = noContactPermissionViewHolder;
        noContactPermissionViewHolder.esContact = (EmptyState) drawDividersHorizontal.setMin(view, R.id.f42872131362805, "field 'esContact'", EmptyState.class);
    }

    @CallSuper
    public final void setMax() {
        NoContactPermissionViewHolder noContactPermissionViewHolder = this.getMax;
        if (noContactPermissionViewHolder != null) {
            this.getMax = null;
            noContactPermissionViewHolder.esContact = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
