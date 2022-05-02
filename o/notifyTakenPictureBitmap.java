package o;

import id.dana.richview.contactselector.ContactSelectorView;

public final class notifyTakenPictureBitmap implements RedDotManager {
    private final ContactSelectorView getMin;

    public notifyTakenPictureBitmap(ContactSelectorView contactSelectorView) {
        this.getMin = contactSelectorView;
    }

    public final void accept(Object obj) {
        this.getMin.getMin.setMin((setExclusiveItemChecked) obj);
    }
}
