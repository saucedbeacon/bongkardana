package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toFollowing", "Lid/dana/domain/social/model/Following;", "Lid/dana/data/social/repository/source/persistence/entity/FollowingEntity;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class interceptUrlForTiny {
    @NotNull
    public static final ScanHelper toFollowing(@NotNull setAuthExecuteResult setauthexecuteresult) {
        Intrinsics.checkNotNullParameter(setauthexecuteresult, "$this$toFollowing");
        return new ScanHelper(onNegative.toFollowingItemList(setauthexecuteresult.getFollowingList()), shouldInterceptJSApiCall.toPaginator(setauthexecuteresult.getPaginator()));
    }
}
