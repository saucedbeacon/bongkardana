package o;

import android.view.View;
import id.dana.sendmoney.contact.all.ContactViewHolder;

public final class isHttp implements View.OnClickListener {
    private final ContactViewHolder length;

    public isHttp(ContactViewHolder contactViewHolder) {
        this.length = contactViewHolder;
    }

    public final void onClick(View view) {
        this.length.getMax.onRecipientSelected(this.length.contactRichView.getSelectedRecipient());
    }
}
