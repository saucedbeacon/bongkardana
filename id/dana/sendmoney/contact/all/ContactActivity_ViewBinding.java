package id.dana.sendmoney.contact.all;

import android.view.View;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.sendmoney.BaseRecipientActivity_ViewBinding;
import id.dana.sendmoney.view.RecipientView;
import o.drawDividersHorizontal;

public class ContactActivity_ViewBinding extends BaseRecipientActivity_ViewBinding {
    private ContactActivity getMin;

    @UiThread
    public ContactActivity_ViewBinding(ContactActivity contactActivity, View view) {
        super(contactActivity, view);
        this.getMin = contactActivity;
        contactActivity.recipientList = (RecipientView) drawDividersHorizontal.setMin(view, R.id.f73032131365938, "field 'recipientList'", RecipientView.class);
    }

    public final void setMax() {
        ContactActivity contactActivity = this.getMin;
        if (contactActivity != null) {
            this.getMin = null;
            contactActivity.recipientList = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
