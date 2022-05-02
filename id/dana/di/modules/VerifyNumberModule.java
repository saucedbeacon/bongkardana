package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.CompassSensorService;
import o.sendSensorResult;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u0003H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/di/modules/VerifyNumberModule;", "", "view", "Lid/dana/onboarding/verify/VerifyNumberContract$View;", "isVerifyingToResetPin", "", "(Lid/dana/onboarding/verify/VerifyNumberContract$View;Z)V", "providesIsVerifyingToResetPin", "providesPresenter", "Lid/dana/onboarding/verify/VerifyNumberContract$Presenter;", "verifyPresenter", "Lid/dana/onboarding/verify/VerifyPresenter;", "providesView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class VerifyNumberModule {
    private final boolean getMin;
    private final CompassSensorService.getMin length;

    public VerifyNumberModule(@NotNull CompassSensorService.getMin getmin, boolean z) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.length = getmin;
        this.getMin = z;
    }

    @PerActivity
    @Provides
    public final boolean setMax() {
        return this.getMin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final CompassSensorService.getMin length() {
        return this.length;
    }

    @NotNull
    @PerActivity
    @Provides
    public final CompassSensorService.length setMin(@NotNull sendSensorResult sendsensorresult) {
        Intrinsics.checkNotNullParameter(sendsensorresult, "verifyPresenter");
        return sendsensorresult;
    }
}
