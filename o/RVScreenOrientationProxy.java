package o;

import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.BaseTabBar;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/data/ipg/mapper/IpgRegistrationUrlMapper;", "", "()V", "transform", "Lid/dana/domain/ipg/IpgRegistrationUrl;", "ipgRegistrationUrlResult", "Lid/dana/data/ipg/repository/source/network/response/IpgRegistrationUrlResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVScreenOrientationProxy {
    @NotNull
    public final setWorkSpaceId transform(@NotNull BaseTabBar.TabBarManageExtension tabBarManageExtension) {
        Intrinsics.checkNotNullParameter(tabBarManageExtension, "ipgRegistrationUrlResult");
        return new setWorkSpaceId(tabBarManageExtension.getRedirectUrl(), tabBarManageExtension.getNeedUserConsent(), tabBarManageExtension.getUserConsentConfigKey(), tabBarManageExtension.getUserConsentSyncKey());
    }
}
