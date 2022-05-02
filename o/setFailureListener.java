package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lid/dana/data/autoroute/repository/source/network/AutoRouteFacade;", "", "init", "Lid/dana/data/autoroute/model/AutoRouteInitResult;", "request", "Lid/dana/data/autoroute/model/UserAutorouteInitRequest;", "switch", "Lid/dana/data/autoroute/model/UserAutoRouteConfigSwitchResult;", "Lid/dana/data/autoroute/model/UserAutoRouteConfigStoreRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface setFailureListener {
    @OperationType("alipayplus.mobilewallet.user.config.autoroute.init")
    @NotNull
    @SignCheck
    setGravityStartCompat init(@NotNull enableMergePathsForKitKatAndAbove enablemergepathsforkitkatandabove);

    @OperationType("alipayplus.mobilewallet.user.config.autoroute.switch")
    @NotNull
    @SignCheck
    /* renamed from: switch  reason: not valid java name */
    setIgnoreDisabledSystemAnimations m1326switch(@NotNull isNotVisible isnotvisible);
}
