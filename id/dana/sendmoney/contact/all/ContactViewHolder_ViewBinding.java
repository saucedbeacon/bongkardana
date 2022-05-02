package id.dana.sendmoney.contact.all;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.sendmoney.recipient.view.ContactRichView;
import o.drawDividersHorizontal;

public class ContactViewHolder_ViewBinding implements Unbinder {
    private ContactViewHolder setMin;

    @UiThread
    public ContactViewHolder_ViewBinding(ContactViewHolder contactViewHolder, View view) {
        this.setMin = contactViewHolder;
        contactViewHolder.contactRichView = (ContactRichView) drawDividersHorizontal.setMin(view, R.id.f41212131362607, "field 'contactRichView'", ContactRichView.class);
    }

    @CallSuper
    public final void setMax() {
        ContactViewHolder contactViewHolder = this.setMin;
        if (contactViewHolder != null) {
            this.setMin = null;
            contactViewHolder.contactRichView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
