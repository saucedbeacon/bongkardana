package o;

import android.view.View;
import id.dana.myprofile.viewholder.ProfileMenuUserKYBViewHolder;
import o.Ignore;

public final class setCreateDate implements View.OnClickListener {
    private final Ignore.setMin getMin;
    private final ProfileMenuUserKYBViewHolder setMin;

    public setCreateDate(ProfileMenuUserKYBViewHolder profileMenuUserKYBViewHolder, Ignore.setMin setmin) {
        this.setMin = profileMenuUserKYBViewHolder;
        this.getMin = setmin;
    }

    public final void onClick(View view) {
        this.getMin.length(this.setMin.getAdapterPosition());
    }
}
