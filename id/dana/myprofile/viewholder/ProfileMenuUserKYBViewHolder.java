package id.dana.myprofile.viewholder;

import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.richview.KybCardView;
import o.Ignore;
import o.setCreateDate;

public class ProfileMenuUserKYBViewHolder extends Ignore<SettingModel> {
    @BindView(2131362212)
    KybCardView kybCardView;

    public final /* synthetic */ void setMax(Object obj) {
        SettingModel settingModel = (SettingModel) obj;
        if (settingModel != null) {
            this.kybCardView.setCircleMarkVisibility(length(settingModel));
            this.kybCardView.setKybHeaderText(settingModel.getTitle());
            this.kybCardView.setKybBodyText(settingModel.getSubtitle());
            this.kybCardView.setKybSubtitleColor(settingModel.getSubtitleColor());
        }
    }

    public ProfileMenuUserKYBViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_profile_setting_user_kyb, viewGroup);
    }

    public final void setMin(Ignore.setMin setmin) {
        this.kybCardView.setOnClickListener(new setCreateDate(this, setmin));
    }

    private static boolean length(SettingModel settingModel) {
        return settingModel.isKycRevoked() || settingModel.isKybRevoked();
    }
}
