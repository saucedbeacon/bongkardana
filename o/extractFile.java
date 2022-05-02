package o;

import id.dana.sendmoney.contact.all.ContactViewHolder;
import java.util.List;

public final class extractFile implements RedDotManager {
    private final ContactViewHolder setMin;

    public extractFile(ContactViewHolder contactViewHolder) {
        this.setMin = contactViewHolder;
    }

    public final void accept(Object obj) {
        ContactViewHolder.setMin(this.setMin, (List) obj);
    }
}
