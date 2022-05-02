package id.dana.myprofile.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class ProfileMenuAppVersionViewHolder_ViewBinding implements Unbinder {
    private ProfileMenuAppVersionViewHolder getMax;

    @UiThread
    public ProfileMenuAppVersionViewHolder_ViewBinding(ProfileMenuAppVersionViewHolder profileMenuAppVersionViewHolder, View view) {
        this.getMax = profileMenuAppVersionViewHolder;
        profileMenuAppVersionViewHolder.title = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'title'", TextView.class);
        profileMenuAppVersionViewHolder.tvSubMenu = (TextView) drawDividersHorizontal.setMin(view, R.id.f69512131365578, "field 'tvSubMenu'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        ProfileMenuAppVersionViewHolder profileMenuAppVersionViewHolder = this.getMax;
        if (profileMenuAppVersionViewHolder != null) {
            this.getMax = null;
            profileMenuAppVersionViewHolder.title = null;
            profileMenuAppVersionViewHolder.tvSubMenu = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
