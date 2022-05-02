package id.dana.sendmoney.model;

import id.dana.sendmoney.contact.provider.ContactModel;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class RecentContactModel extends ContactModel {
    public int toIntRange;

    public final void length(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(449240089, oncanceled);
            onCancelLoad.getMin(449240089, oncanceled);
        }
        this.toIntRange = i;
    }
}
