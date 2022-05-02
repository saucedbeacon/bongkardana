package id.dana.myprofile.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class ProfileMenuHeaderViewHolder_ViewBinding implements Unbinder {
    private ProfileMenuHeaderViewHolder getMax;

    @UiThread
    public ProfileMenuHeaderViewHolder_ViewBinding(ProfileMenuHeaderViewHolder profileMenuHeaderViewHolder, View view) {
        this.getMax = profileMenuHeaderViewHolder;
        profileMenuHeaderViewHolder.headerMenu = (TextView) drawDividersHorizontal.setMin(view, R.id.f66612131365288, "field 'headerMenu'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        ProfileMenuHeaderViewHolder profileMenuHeaderViewHolder = this.getMax;
        if (profileMenuHeaderViewHolder != null) {
            this.getMax = null;
            profileMenuHeaderViewHolder.headerMenu = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
