package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toNameCheckConfig", "Lid/dana/domain/requestmoney/model/NameCheckConfig;", "Lid/dana/data/requestmoney/repository/model/NameCheckConfigEntity;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setAppStartSessionToken {
    @NotNull
    public static final isMultiFrameBeacon toNameCheckConfig(@NotNull setToken settoken) {
        Intrinsics.checkNotNullParameter(settoken, "$this$toNameCheckConfig");
        return new isMultiFrameBeacon(settoken.getRetryLimit(), settoken.getFreezeTime());
    }
}
