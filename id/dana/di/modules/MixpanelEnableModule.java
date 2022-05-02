package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.getBatteryInfo;
import o.stopMonitorMemoryWarning;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/di/modules/MixpanelEnableModule;", "", "()V", "provideMixpanelPresenter", "Lid/dana/onboarding/mixpanel/MixpanelEnableContract$Presenter;", "presenter", "Lid/dana/onboarding/mixpanel/MixpanelEnablePresenter;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class MixpanelEnableModule {
    @NotNull
    @Provides
    public final stopMonitorMemoryWarning.getMin getMin(@NotNull getBatteryInfo getbatteryinfo) {
        Intrinsics.checkNotNullParameter(getbatteryinfo, "presenter");
        return getbatteryinfo;
    }
}
