package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toFollower", "Lid/dana/domain/social/model/Follower;", "Lid/dana/data/social/repository/source/network/response/FollowerResponse;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class onPositive {
    @NotNull
    public static final getCycledScanner toFollower(@NotNull getIsvAgent getisvagent) {
        Intrinsics.checkNotNullParameter(getisvagent, "$this$toFollower");
        return new getCycledScanner(getAllPermissions.toFollowerItemList(getisvagent.getFollowerList()), EmbedWebViewJsApiPermissionProxy.toPaginator(getisvagent.getPaginator()));
    }
}
