package o;

import android.view.View;
import id.dana.myprofile.viewholder.ProfileMenuUserServiceViewHolder;
import o.Ignore;

public final class setServiceEmail implements View.OnClickListener {
    private final ProfileMenuUserServiceViewHolder getMax;
    private final Ignore.setMin setMax;

    public setServiceEmail(ProfileMenuUserServiceViewHolder profileMenuUserServiceViewHolder, Ignore.setMin setmin) {
        this.getMax = profileMenuUserServiceViewHolder;
        this.setMax = setmin;
    }

    public final void onClick(View view) {
        this.setMax.length(this.getMax.getAdapterPosition());
    }
}
