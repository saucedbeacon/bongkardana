package o;

import android.view.View;
import id.dana.sendmoney.contact.all.EmptySearchRecentBankViewHolder;
import o.Ignore;

public final class isLocalFile implements View.OnClickListener {
    private final EmptySearchRecentBankViewHolder length;
    private final Ignore.setMin setMin;

    public isLocalFile(EmptySearchRecentBankViewHolder emptySearchRecentBankViewHolder, Ignore.setMin setmin) {
        this.length = emptySearchRecentBankViewHolder;
        this.setMin = setmin;
    }

    public final void onClick(View view) {
        this.setMin.length(this.length.getAdapterPosition());
    }
}
