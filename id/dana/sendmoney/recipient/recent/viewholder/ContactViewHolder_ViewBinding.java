package id.dana.sendmoney.recipient.recent.viewholder;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.sendmoney.RecentDetailView;
import o.drawDividersHorizontal;

public class ContactViewHolder_ViewBinding implements Unbinder {
    private ContactViewHolder getMax;

    @UiThread
    public ContactViewHolder_ViewBinding(ContactViewHolder contactViewHolder, View view) {
        this.getMax = contactViewHolder;
        contactViewHolder.recentDetailView = (RecentDetailView) drawDividersHorizontal.setMin(view, R.id.f73012131365936, "field 'recentDetailView'", RecentDetailView.class);
    }

    @CallSuper
    public final void setMax() {
        ContactViewHolder contactViewHolder = this.getMax;
        if (contactViewHolder != null) {
            this.getMax = null;
            contactViewHolder.recentDetailView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
