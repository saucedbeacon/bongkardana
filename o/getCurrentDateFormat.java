package o;

import id.dana.sendmoney.contact.all.ContactActivity;
import id.dana.sendmoney.view.RecipientView;

public final class getCurrentDateFormat implements RecipientView.getMax {
    private final ContactActivity getMax;

    public getCurrentDateFormat(ContactActivity contactActivity) {
        this.getMax = contactActivity;
    }

    public final void getMin() {
        ContactActivity.length(this.getMax);
    }
}
