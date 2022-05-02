package o;

import id.dana.domain.profilemenu.model.SettingModel;
import o.TitleBarRightButtonView;

public interface sendUcReceiver {
    String getSettingName();

    TitleBarRightButtonView.AnonymousClass1<SettingModel> performConfiguration(SettingModel settingModel);
}
