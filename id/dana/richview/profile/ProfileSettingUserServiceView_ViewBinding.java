package id.dana.richview.profile;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class ProfileSettingUserServiceView_ViewBinding implements Unbinder {
    private ProfileSettingUserServiceView getMax;

    @UiThread
    public ProfileSettingUserServiceView_ViewBinding(ProfileSettingUserServiceView profileSettingUserServiceView, View view) {
        this.getMax = profileSettingUserServiceView;
        profileSettingUserServiceView.ivProfileUserService = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50302131363585, "field 'ivProfileUserService'", ImageView.class);
        profileSettingUserServiceView.tvProfileUserService = (TextView) drawDividersHorizontal.setMin(view, R.id.f68322131365459, "field 'tvProfileUserService'", TextView.class);
        profileSettingUserServiceView.tvDetailProfileUserService = (TextView) drawDividersHorizontal.setMin(view, R.id.f65742131365200, "field 'tvDetailProfileUserService'", TextView.class);
        profileSettingUserServiceView.tvDetailProfileUserServiceNonDynamic = (TextView) drawDividersHorizontal.setMin(view, R.id.f65752131365201, "field 'tvDetailProfileUserServiceNonDynamic'", TextView.class);
        profileSettingUserServiceView.ivArrow = (ImageView) drawDividersHorizontal.setMin(view, R.id.f47972131363350, "field 'ivArrow'", ImageView.class);
        profileSettingUserServiceView.ivViewProfileUserServiceRedDot = (ImageView) drawDividersHorizontal.setMin(view, R.id.f51132131363668, "field 'ivViewProfileUserServiceRedDot'", ImageView.class);
    }

    @CallSuper
    public final void setMax() {
        ProfileSettingUserServiceView profileSettingUserServiceView = this.getMax;
        if (profileSettingUserServiceView != null) {
            this.getMax = null;
            profileSettingUserServiceView.ivProfileUserService = null;
            profileSettingUserServiceView.tvProfileUserService = null;
            profileSettingUserServiceView.tvDetailProfileUserService = null;
            profileSettingUserServiceView.tvDetailProfileUserServiceNonDynamic = null;
            profileSettingUserServiceView.ivArrow = null;
            profileSettingUserServiceView.ivViewProfileUserServiceRedDot = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
