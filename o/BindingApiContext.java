package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.DialogRecyclerView;
import o.TitleBarRightButtonView;

@Singleton
public class BindingApiContext implements pushEnginePorxy {
    private final Context context;
    private final PluginInstallCallback serializer;

    @Inject
    public BindingApiContext(PluginInstallCallback pluginInstallCallback, Context context2) {
        this.serializer = pluginInstallCallback;
        this.context = context2;
    }

    public TitleBarRightButtonView.AnonymousClass1<generateUniqueId> getNearbyMeWithPagination(double d, double d2, int i, int i2, String str) {
        return TitleBarRightButtonView.AnonymousClass1.just((generateUniqueId) this.serializer.deserialize(getAppInfoQuery.jsonRawToString(this.context, DialogRecyclerView.length.length), generateUniqueId.class));
    }

    public TitleBarRightButtonView.AnonymousClass1<generateUniqueId> getNearbyMeWithRadius(double d, double d2, int i, int i2, int i3, String str, String str2) {
        return TitleBarRightButtonView.AnonymousClass1.just((generateUniqueId) this.serializer.deserialize(getAppInfoQuery.jsonRawToString(this.context, DialogRecyclerView.length.length), generateUniqueId.class));
    }

    public TitleBarRightButtonView.AnonymousClass1<H5FileUtil> saveNearbyShops(H5FileUtil h5FileUtil) {
        return TitleBarRightButtonView.AnonymousClass1.just(H5FileUtil.empty());
    }

    public TitleBarRightButtonView.AnonymousClass1<EngineInitCallback> getNearbyMerchantPromo(List<ApiContext> list) {
        throw new UnsupportedOperationException();
    }

    public TitleBarRightButtonView.AnonymousClass1<EngineSetupCallback> getOtherShopList(String str, double d, double d2, int i, int i2, String str2, String str3) {
        return TitleBarRightButtonView.AnonymousClass1.just(new EngineSetupCallback(new ArrayList(), true, false));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isNeedToShowOnboardingTooltip(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveShowOnboardingTooltip(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<clearTempPath> getDefaultNearbyConfig(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just((clearTempPath) this.serializer.deserialize(getAppInfoQuery.jsonRawToString(this.context, DialogRecyclerView.length.setMax), clearTempPath.class));
    }
}
