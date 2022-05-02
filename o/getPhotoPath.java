package o;

import id.dana.sendmoney.recipient.recent.viewholder.ContactViewHolder;
import java.util.List;

public final class getPhotoPath implements RedDotManager {
    private final increaseCount getMax;
    private final ContactViewHolder length;

    public getPhotoPath(ContactViewHolder contactViewHolder, increaseCount increasecount) {
        this.length = contactViewHolder;
        this.getMax = increasecount;
    }

    public final void accept(Object obj) {
        ContactViewHolder.getMax(this.length, this.getMax, (List) obj);
    }
}
