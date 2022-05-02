package o;

import id.dana.richview.contactselector.ContactSelectorView;
import id.dana.sendmoney.model.RecipientModel;

public final class saveCommonTakePicture implements setPhotoIndex {
    private final ContactSelectorView getMax;

    public saveCommonTakePicture(ContactSelectorView contactSelectorView) {
        this.getMax = contactSelectorView;
    }

    public final void onRecipientSelected(RecipientModel recipientModel) {
        ContactSelectorView.getMin(this.getMax, recipientModel);
    }
}
