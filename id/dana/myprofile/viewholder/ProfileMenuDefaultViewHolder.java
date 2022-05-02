package id.dana.myprofile.viewholder;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import id.dana.domain.profilemenu.model.SettingModel;
import o.Ignore;
import o.getAppIntro;

public class ProfileMenuDefaultViewHolder extends Ignore<SettingModel> {
    @BindView(2131362474)
    ConstraintLayout clNormalMenu;
    @BindView(2131365600)
    TextView title;

    public final /* synthetic */ void setMax(Object obj) {
        SettingModel settingModel = (SettingModel) obj;
        if (settingModel != null) {
            this.title.setText(settingModel.getTitle());
        }
    }

    public final void setMin(Ignore.setMin setmin) {
        this.clNormalMenu.setOnClickListener(new getAppIntro(this, setmin));
    }
}
