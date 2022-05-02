package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.CaptureParam;
import o.MediaInfo;
import o.getPictureSize;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eJ\r\u0010\u000f\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/di/modules/SwitchAutoRouteModule;", "", "view", "Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteContract$View;", "(Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteContract$View;)V", "provideAnalyticsTracker", "Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteContract$AnalyticsTracker;", "analyticsTracker", "Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteAnalyticsTracker;", "provideAnalyticsTracker$app_productionRelease", "providePresenter", "Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteContract$Presenter;", "presenter", "Lid/dana/richview/profile/switchautoroute/SwitchAutoRoutePresenter;", "providePresenter$app_productionRelease", "provideView", "provideView$app_productionRelease", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class SwitchAutoRouteModule {
    private final MediaInfo.getMin setMin;

    public SwitchAutoRouteModule(@NotNull MediaInfo.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.setMin = getmin;
    }

    @NotNull
    @Provides
    public final MediaInfo.getMin getMin() {
        return this.setMin;
    }

    @NotNull
    @Provides
    public final MediaInfo.setMax setMin(@NotNull CaptureParam captureParam) {
        Intrinsics.checkNotNullParameter(captureParam, "presenter");
        return captureParam;
    }

    @NotNull
    @Provides
    public final MediaInfo.length setMax(@NotNull getPictureSize getpicturesize) {
        Intrinsics.checkNotNullParameter(getpicturesize, "analyticsTracker");
        return getpicturesize;
    }
}
