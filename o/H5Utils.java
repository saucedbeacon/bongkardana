package o;

import id.dana.domain.profilemenu.model.SettingModel;
import java.util.List;
import o.TitleBarRightButtonView;

public interface H5Utils {
    TitleBarRightButtonView.AnonymousClass1<getSharedPreference> getPaymentSecurityInit();

    TitleBarRightButtonView.AnonymousClass1<getUid> getPaymentSecuritySwitch(boolean z, String str, String str2, String str3, String str4);

    TitleBarRightButtonView.AnonymousClass1<SettingModel> getSettingByKey(String str);

    TitleBarRightButtonView.AnonymousClass1<List<SettingModel>> getSettings(List<sendUcReceiver> list, String str, notNeedInitUc notneedinituc);
}
