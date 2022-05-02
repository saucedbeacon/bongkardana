package id.dana.myprofile.viewholder;

import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.myprofile.ProfileUserServiceType;
import id.dana.richview.profile.ProfileSettingUserServiceView;
import o.Ignore;
import o.setServiceEmail;

public class ProfileMenuUserServiceViewHolder extends Ignore<SettingModel> {
    @BindView(2131365921)
    ProfileSettingUserServiceView viewProfileSetting;

    public final /* synthetic */ void setMax(Object obj) {
        SettingModel settingModel = (SettingModel) obj;
        int i = 0;
        this.itemView.setVisibility(0);
        if (settingModel != null) {
            this.itemView.setVisibility(settingModel.isEnable() ? 0 : 8);
            ProfileSettingUserServiceView profileSettingUserServiceView = this.viewProfileSetting;
            if (!settingModel.isEnable()) {
                i = 8;
            }
            profileSettingUserServiceView.setParentViewVisibility(i);
            if (settingModel.getName().equals(ProfileUserServiceType.PROMO_CODE)) {
                this.viewProfileSetting.setContentDescription(this.length.getString(R.string.btn_promo_code));
            }
            this.viewProfileSetting.setView(settingModel.getTitle(), settingModel.getSubtitle(), settingModel.getName(), settingModel.getIconUrl(), settingModel.getSubtitleIsBelow(), settingModel.getSubtitleColor());
        }
    }

    public ProfileMenuUserServiceViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_profile_setting_user_service, viewGroup);
    }

    public final void setMin(Ignore.setMin setmin) {
        this.viewProfileSetting.setOnClickListener(new setServiceEmail(this, setmin));
    }
}
