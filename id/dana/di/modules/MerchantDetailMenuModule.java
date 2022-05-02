package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.createPayloadsIfNeeded;
import o.getShortName;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/di/modules/MerchantDetailMenuModule;", "", "()V", "provideH5Launcher", "Lid/dana/H5Launcher;", "dynamicUrlWrapper", "Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class MerchantDetailMenuModule {
    @NotNull
    @PerActivity
    @Provides
    public final createPayloadsIfNeeded length(@NotNull getShortName getshortname) {
        Intrinsics.checkNotNullParameter(getshortname, "dynamicUrlWrapper");
        return new createPayloadsIfNeeded(getshortname);
    }
}
