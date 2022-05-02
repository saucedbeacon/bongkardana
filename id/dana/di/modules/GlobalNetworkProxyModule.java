package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverDecodeUrl;
import o.setPageConfiguration;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\r\u0010\t\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/di/modules/GlobalNetworkProxyModule;", "", "view", "Lid/dana/globalnetworkproxy/GlobalNetworkProxyContract$View;", "(Lid/dana/globalnetworkproxy/GlobalNetworkProxyContract$View;)V", "providePresenter", "Lid/dana/globalnetworkproxy/GlobalNetworkProxyContract$Presenter;", "presenter", "Lid/dana/globalnetworkproxy/GlobalNetworkProxyPresenter;", "provideView", "provideView$app_productionRelease", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class GlobalNetworkProxyModule {
    private final GriverDecodeUrl.getMin length;

    public GlobalNetworkProxyModule(@NotNull GriverDecodeUrl.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.length = getmin;
    }

    @Singleton
    @NotNull
    @Provides
    public final GriverDecodeUrl.getMin length() {
        return this.length;
    }

    @Singleton
    @NotNull
    @Provides
    public final GriverDecodeUrl.length length(@NotNull setPageConfiguration setpageconfiguration) {
        Intrinsics.checkNotNullParameter(setpageconfiguration, "presenter");
        return setpageconfiguration;
    }
}
