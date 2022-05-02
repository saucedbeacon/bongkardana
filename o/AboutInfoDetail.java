package o;

import android.view.View;
import id.dana.myprofile.viewholder.ProfileMenuDefferedViewHolder;
import o.Ignore;

public final class AboutInfoDetail implements View.OnClickListener {
    private final Ignore.setMin setMax;
    private final ProfileMenuDefferedViewHolder setMin;

    public AboutInfoDetail(ProfileMenuDefferedViewHolder profileMenuDefferedViewHolder, Ignore.setMin setmin) {
        this.setMin = profileMenuDefferedViewHolder;
        this.setMax = setmin;
    }

    public final void onClick(View view) {
        this.setMax.length(this.setMin.getAdapterPosition());
    }
}
