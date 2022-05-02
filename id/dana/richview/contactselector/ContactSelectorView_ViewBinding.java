package id.dana.richview.contactselector;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.LogoProgressView;
import o.drawDividersHorizontal;

public class ContactSelectorView_ViewBinding implements Unbinder {
    private ContactSelectorView length;

    @UiThread
    public ContactSelectorView_ViewBinding(ContactSelectorView contactSelectorView, View view) {
        this.length = contactSelectorView;
        contactSelectorView.rvContactList = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59182131364503, "field 'rvContactList'", RecyclerView.class);
        contactSelectorView.llLoadingContact = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53312131363887, "field 'llLoadingContact'", LinearLayout.class);
        contactSelectorView.lpvContact = (LogoProgressView) drawDividersHorizontal.setMin(view, R.id.f54072131363964, "field 'lpvContact'", LogoProgressView.class);
    }

    @CallSuper
    public final void setMax() {
        ContactSelectorView contactSelectorView = this.length;
        if (contactSelectorView != null) {
            this.length = null;
            contactSelectorView.rvContactList = null;
            contactSelectorView.llLoadingContact = null;
            contactSelectorView.lpvContact = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
