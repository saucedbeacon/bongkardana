package o;

import android.view.View;
import id.dana.myprofile.viewholder.ProfileMenuDefaultViewHolder;
import o.Ignore;

public final class getAppIntro implements View.OnClickListener {
    private final ProfileMenuDefaultViewHolder getMax;
    private final Ignore.setMin setMin;

    public getAppIntro(ProfileMenuDefaultViewHolder profileMenuDefaultViewHolder, Ignore.setMin setmin) {
        this.getMax = profileMenuDefaultViewHolder;
        this.setMin = setmin;
    }

    public final void onClick(View view) {
        this.setMin.length(this.getMax.getAdapterPosition());
    }
}
