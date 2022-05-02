package o;

import android.view.View;
import id.dana.sendmoney.contact.all.NoContactPermissionViewHolder;
import o.Ignore;

public final class urlEncode implements View.OnClickListener {
    private final Ignore.setMin getMax;
    private final NoContactPermissionViewHolder length;

    public urlEncode(NoContactPermissionViewHolder noContactPermissionViewHolder, Ignore.setMin setmin) {
        this.length = noContactPermissionViewHolder;
        this.getMax = setmin;
    }

    public final void onClick(View view) {
        this.getMax.length(this.length.getAdapterPosition());
    }
}
