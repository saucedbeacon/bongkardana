package id.dana.myprofile.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import o.Ignore;

public class ProfileMenuAppVersionViewHolder extends Ignore<SettingModel> {
    @BindView(2131365600)
    TextView title;
    @BindView(2131365578)
    TextView tvSubMenu;

    public final void setMin(Ignore.setMin setmin) {
    }

    public final /* synthetic */ void setMax(Object obj) {
        SettingModel settingModel = (SettingModel) obj;
        if (settingModel != null) {
            this.title.setText(settingModel.getTitle());
            this.tvSubMenu.setText(settingModel.getSubtitle());
        }
    }

    public ProfileMenuAppVersionViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_menu_app_version, viewGroup);
    }
}
