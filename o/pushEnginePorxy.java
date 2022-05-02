package o;

import java.util.List;
import o.TitleBarRightButtonView;

public interface pushEnginePorxy {
    TitleBarRightButtonView.AnonymousClass1<clearTempPath> getDefaultNearbyConfig(String str);

    TitleBarRightButtonView.AnonymousClass1<generateUniqueId> getNearbyMeWithPagination(double d, double d2, int i, int i2, String str);

    TitleBarRightButtonView.AnonymousClass1<generateUniqueId> getNearbyMeWithRadius(double d, double d2, int i, int i2, int i3, String str, String str2);

    TitleBarRightButtonView.AnonymousClass1<EngineInitCallback> getNearbyMerchantPromo(List<ApiContext> list);

    TitleBarRightButtonView.AnonymousClass1<EngineSetupCallback> getOtherShopList(String str, double d, double d2, int i, int i2, String str2, String str3);

    TitleBarRightButtonView.AnonymousClass1<Boolean> isNeedToShowOnboardingTooltip(String str);

    TitleBarRightButtonView.AnonymousClass1<H5FileUtil> saveNearbyShops(H5FileUtil h5FileUtil);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveShowOnboardingTooltip(String str);
}
