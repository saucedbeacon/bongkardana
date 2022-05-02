package id.dana.di.modules;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import dagger.Module;
import dagger.Provides;
import id.dana.data.toggle.traffictype.TrafficType;
import id.dana.toggle.userloginlogout.LoginLogoutObserver;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.a;
import o.getFrameMarginVertical$core;
import o.getPerformanceTracker;
import o.getQueryScene;
import o.getRequestMainPackage;
import o.getScreenWidth_Height;
import o.isForce;
import o.sendLocation;
import o.setForce;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0007J/\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0011J?\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lid/dana/di/modules/SplitModule;", "", "()V", "provideToggleClientQuickConfig", "Lid/dana/lib/toggle/ToggleClientConfig$Builder;", "provideToggleClientQuickConfig$app_productionRelease", "provideToggleClientSteadyConfig", "provideToggleClientSteadyConfig$app_productionRelease", "provideTrafficTypeDevice", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "context", "Landroid/content/Context;", "toggleClientConfigBuilder", "deviceInformation", "Lid/dana/data/config/DeviceInformationProvider;", "mixpanelEntityRepository", "Lid/dana/data/tracker/MixpanelEntityRepository;", "provideTrafficTypeDevice$app_productionRelease", "provideTrafficTypeUserProxy", "Lid/dana/data/toggle/traffictype/LazyTrafficTypeFactory;", "loginLogoutObserver", "Lid/dana/toggle/userloginlogout/LoginLogoutObserver;", "loginLogoutSubject", "Lid/dana/data/login/LoginLogoutSubject;", "preferenceAccountEntityData", "Lid/dana/data/account/repository/source/preference/PreferenceAccountEntityData;", "provideTrafficTypeUserProxy$app_productionRelease", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class SplitModule {
    @NotNull
    @Provides
    @Named("SteadyConfig")
    public final sendLocation.setMin length() {
        sendLocation.setMin setmin = new sendLocation.setMin();
        setmin.getMin = 15000;
        setmin.length = false;
        setmin.getMax = false;
        setmin.setMax = 15000;
        Intrinsics.checkNotNullExpressionValue(setmin, "ToggleClientConfig.Build…        .setReady(15_000)");
        return setmin;
    }

    @NotNull
    @Provides
    @Named("QuickConfig")
    public final sendLocation.setMin setMin() {
        sendLocation.setMin setmin = new sendLocation.setMin();
        setmin.getMin = 15000;
        setmin.length = false;
        setmin.getMax = false;
        setmin.setMax = -1;
        Intrinsics.checkNotNullExpressionValue(setmin, "ToggleClientConfig.Build…            .setReady(-1)");
        return setmin;
    }

    @NotNull
    @TrafficType("Device")
    @Provides
    public final getRequestMainPackage setMax(@NotNull Context context, @NotNull @Named("QuickConfig") sendLocation.setMin setmin, @NotNull getPerformanceTracker getperformancetracker, @NotNull getQueryScene getqueryscene) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setmin, "toggleClientConfigBuilder");
        Intrinsics.checkNotNullParameter(getperformancetracker, "deviceInformation");
        Intrinsics.checkNotNullParameter(getqueryscene, "mixpanelEntityRepository");
        isForce isforce = new isForce(context, setmin, "8jbd3qchur8ehofuhfgqubveas9f6bmsghm0", getqueryscene);
        String deviceUtdId = getperformancetracker.getDeviceUtdId();
        Intrinsics.checkNotNullExpressionValue(deviceUtdId, "deviceInformation.deviceUtdId");
        isforce.setMax(deviceUtdId);
        return isforce;
    }

    @NotNull
    @TrafficType("User")
    @Provides
    public final setForce setMax(@NotNull Context context, @NotNull @Named("SteadyConfig") sendLocation.setMin setmin, @NotNull LoginLogoutObserver loginLogoutObserver, @NotNull getQueryScene getqueryscene, @NotNull a.AnonymousClass7 r14, @NotNull getFrameMarginVertical$core getframemarginvertical_core) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setmin, "toggleClientConfigBuilder");
        Intrinsics.checkNotNullParameter(loginLogoutObserver, "loginLogoutObserver");
        Intrinsics.checkNotNullParameter(getqueryscene, "mixpanelEntityRepository");
        Intrinsics.checkNotNullParameter(r14, "loginLogoutSubject");
        Intrinsics.checkNotNullParameter(getframemarginvertical_core, "preferenceAccountEntityData");
        return new getScreenWidth_Height(context, setmin, "mrclscm2mg1nlni41s5tp9cuq3fh4epmpi68", loginLogoutObserver, getqueryscene, r14, getframemarginvertical_core);
    }
}
