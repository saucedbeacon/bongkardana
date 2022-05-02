package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toFollowerItem", "Lid/dana/domain/social/model/RelationshipItem;", "Lid/dana/data/social/repository/source/network/response/RelationshipItemResponse;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class removeAllPermissionInfo {
    @NotNull
    public static final processScanResult toFollowerItem(@NotNull AuthExecuteResultModel authExecuteResultModel) {
        Intrinsics.checkNotNullParameter(authExecuteResultModel, "$this$toFollowerItem");
        String loginId = authExecuteResultModel.getLoginId();
        String nickName = authExecuteResultModel.getNickName();
        String status = authExecuteResultModel.getStatus();
        String userId = authExecuteResultModel.getUserId();
        String avatar = authExecuteResultModel.getAvatar();
        String username = authExecuteResultModel.getUsername();
        if (username == null) {
            username = "";
        }
        return new processScanResult(loginId, nickName, status, userId, avatar, username, false, 64, (DefaultConstructorMarker) null);
    }
}
