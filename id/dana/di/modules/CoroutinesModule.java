package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.domain.nearbyme.DefaultDispatcher;
import id.dana.domain.nearbyme.IoDispatcher;
import id.dana.domain.nearbyme.MainDispatcher;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import o.APExpansion;
import o.DeviceTokenClient;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/di/modules/CoroutinesModule;", "", "()V", "providesDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "providesIoDispatcher", "providesMainDispatcher", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class CoroutinesModule {
    @NotNull
    public static final CoroutinesModule setMax = new CoroutinesModule();

    private CoroutinesModule() {
    }

    @DefaultDispatcher
    @JvmStatic
    @NotNull
    @Provides
    public static final APExpansion.AnonymousClass1 setMax() {
        return DeviceTokenClient.getMax();
    }

    @IoDispatcher
    @JvmStatic
    @NotNull
    @Provides
    public static final APExpansion.AnonymousClass1 setMin() {
        return DeviceTokenClient.setMax();
    }

    @JvmStatic
    @NotNull
    @MainDispatcher
    @Provides
    public static final APExpansion.AnonymousClass1 length() {
        return DeviceTokenClient.length();
    }
}
