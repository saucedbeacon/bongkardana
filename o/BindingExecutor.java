package o;

import android.content.Context;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class BindingExecutor extends setRepeatCount<BindingCallback> implements pushEnginePorxy {
    @Inject
    public BindingExecutor(setIsUrgentResource setisurgentresource, @Named("nearbyExecutor") appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public Class<BindingCallback> getFacadeClass() {
        return BindingCallback.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<generateUniqueId> getNearbyMeWithPagination(double d, double d2, int i, int i2, String str) {
        isFromRemote isfromremote = new isFromRemote(d, d2, i, i2, str, "");
        isfromremote.envInfo = generateMobileEnvInfo();
        return wrapper(new floatDefault(isfromremote));
    }

    public TitleBarRightButtonView.AnonymousClass1<generateUniqueId> getNearbyMeWithRadius(double d, double d2, int i, int i2, int i3, String str, String str2) {
        stringDefault stringdefault = new stringDefault(d, d2, i, i2, i3, str, str2);
        stringdefault.envInfo = generateMobileEnvInfo();
        return wrapper(new doubleDefault(stringdefault));
    }

    public TitleBarRightButtonView.AnonymousClass1<H5FileUtil> saveNearbyShops(H5FileUtil h5FileUtil) {
        return TitleBarRightButtonView.AnonymousClass1.just(H5FileUtil.empty());
    }

    public TitleBarRightButtonView.AnonymousClass1<EngineInitCallback> getNearbyMerchantPromo(List<ApiContext> list) {
        longDefault longdefault = new longDefault();
        longdefault.envInfo = generateMobileEnvInfo();
        longdefault.shopInfos = list;
        return wrapper(new booleanDefault(longdefault));
    }

    public TitleBarRightButtonView.AnonymousClass1<EngineSetupCallback> getOtherShopList(String str, double d, double d2, int i, int i2, String str2, String str3) {
        BindingRequest bindingRequest = new BindingRequest(str, d, d2, i, i2, str2, str3);
        bindingRequest.envInfo = generateMobileEnvInfo();
        return wrapper(new intDefault(bindingRequest));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isNeedToShowOnboardingTooltip(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveShowOnboardingTooltip(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<clearTempPath> getDefaultNearbyConfig(String str) {
        throw new UnsupportedOperationException();
    }
}
