package id.dana.myprofile.viewholder;

import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.richview.profile.ProfileSettingUserServiceView;
import o.AboutInfoDetail;
import o.Ignore;

public class ProfileMenuDefferedViewHolder extends Ignore<SettingModel> {
    @BindView(2131365921)
    ProfileSettingUserServiceView viewProfileSetting;

    public final /* synthetic */ void setMax(Object obj) {
        SettingModel settingModel = (SettingModel) obj;
        int i = 0;
        this.itemView.setVisibility((!settingModel.isNeedToShow() || !settingModel.isEnable()) ? 8 : 0);
        ProfileSettingUserServiceView profileSettingUserServiceView = this.viewProfileSetting;
        if (!settingModel.isNeedToShow() || !settingModel.isEnable()) {
            i = 8;
        }
        profileSettingUserServiceView.setParentViewVisibility(i);
        this.viewProfileSetting.setView(settingModel.getTitle(), settingModel.getSubtitle(), settingModel.getName(), settingModel.getIconUrl(), settingModel.getSubtitleIsBelow(), settingModel.getSubtitleColor());
    }

    public ProfileMenuDefferedViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_profile_setting_user_service, viewGroup);
    }

    public final void setMin(Ignore.setMin setmin) {
        this.viewProfileSetting.setOnClickListener(new AboutInfoDetail(this, setmin));
    }
}
