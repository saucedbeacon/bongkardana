package o;

import id.dana.richview.contactselector.ContactSelectorView;
import o.Ignore;

public final class notifyProcessFinished implements Ignore.setMin {
    private final ContactSelectorView length;

    public notifyProcessFinished(ContactSelectorView contactSelectorView) {
        this.length = contactSelectorView;
    }

    public final void length(int i) {
        ContactSelectorView.getMin(this.length, i);
    }
}
