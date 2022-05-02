package id.dana.myprofile.viewholder;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.profile.ProfileSettingUserServiceView;
import o.drawDividersHorizontal;

public class ProfileMenuDefferedViewHolder_ViewBinding implements Unbinder {
    private ProfileMenuDefferedViewHolder setMin;

    @UiThread
    public ProfileMenuDefferedViewHolder_ViewBinding(ProfileMenuDefferedViewHolder profileMenuDefferedViewHolder, View view) {
        this.setMin = profileMenuDefferedViewHolder;
        profileMenuDefferedViewHolder.viewProfileSetting = (ProfileSettingUserServiceView) drawDividersHorizontal.setMin(view, R.id.f72862131365921, "field 'viewProfileSetting'", ProfileSettingUserServiceView.class);
    }

    @CallSuper
    public final void setMax() {
        ProfileMenuDefferedViewHolder profileMenuDefferedViewHolder = this.setMin;
        if (profileMenuDefferedViewHolder != null) {
            this.setMin = null;
            profileMenuDefferedViewHolder.viewProfileSetting = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
