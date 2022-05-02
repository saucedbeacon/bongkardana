package id.dana.myprofile.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class ProfileMenuDefaultViewHolder_ViewBinding implements Unbinder {
    private ProfileMenuDefaultViewHolder getMin;

    @UiThread
    public ProfileMenuDefaultViewHolder_ViewBinding(ProfileMenuDefaultViewHolder profileMenuDefaultViewHolder, View view) {
        this.getMin = profileMenuDefaultViewHolder;
        profileMenuDefaultViewHolder.title = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'title'", TextView.class);
        profileMenuDefaultViewHolder.clNormalMenu = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39942131362474, "field 'clNormalMenu'", ConstraintLayout.class);
    }

    @CallSuper
    public final void setMax() {
        ProfileMenuDefaultViewHolder profileMenuDefaultViewHolder = this.getMin;
        if (profileMenuDefaultViewHolder != null) {
            this.getMin = null;
            profileMenuDefaultViewHolder.title = null;
            profileMenuDefaultViewHolder.clNormalMenu = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
