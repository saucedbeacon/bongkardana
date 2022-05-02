package id.dana.myprofile.viewholder;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.profile.ProfileSettingUserServiceView;
import o.drawDividersHorizontal;

public class ProfileMenuUserServiceViewHolder_ViewBinding implements Unbinder {
    private ProfileMenuUserServiceViewHolder getMin;

    @UiThread
    public ProfileMenuUserServiceViewHolder_ViewBinding(ProfileMenuUserServiceViewHolder profileMenuUserServiceViewHolder, View view) {
        this.getMin = profileMenuUserServiceViewHolder;
        profileMenuUserServiceViewHolder.viewProfileSetting = (ProfileSettingUserServiceView) drawDividersHorizontal.setMin(view, R.id.f72862131365921, "field 'viewProfileSetting'", ProfileSettingUserServiceView.class);
    }

    @CallSuper
    public final void setMax() {
        ProfileMenuUserServiceViewHolder profileMenuUserServiceViewHolder = this.getMin;
        if (profileMenuUserServiceViewHolder != null) {
            this.getMin = null;
            profileMenuUserServiceViewHolder.viewProfileSetting = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
