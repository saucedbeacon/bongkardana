package id.dana.myprofile.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import o.Ignore;

public class ProfileMenuHeaderViewHolder extends Ignore<SettingModel> {
    @BindView(2131365288)
    TextView headerMenu;

    public final void setMin(Ignore.setMin setmin) {
    }

    public final /* synthetic */ void setMax(Object obj) {
        this.headerMenu.setText(((SettingModel) obj).getTitle());
    }

    public ProfileMenuHeaderViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.view_header, viewGroup);
    }
}
