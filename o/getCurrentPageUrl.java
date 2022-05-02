package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J%\u0010\u0002\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H&J%\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lid/dana/data/social/repository/source/RemoteRelationshipEntityData;", "", "getFollowerItemList", "Lio/reactivex/Observable;", "Lid/dana/data/social/repository/source/network/response/FollowerResponse;", "pageNum", "", "userId", "", "(Ljava/lang/Integer;Ljava/lang/String;)Lid/dana/data/social/repository/source/network/response/FollowerResponse;", "getFollowerItemListByModifiedTime", "modifiedTime", "", "getFollowingItemList", "Lid/dana/data/social/repository/source/network/response/FollowingResponse;", "(Ljava/lang/Integer;Ljava/lang/String;)Lid/dana/data/social/repository/source/network/response/FollowingResponse;", "getFollowingItemListByModifiedTime", "modifyRelationship", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "targetUserId", "operationType", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface getCurrentPageUrl {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getIsvAgent> getFollowerItemList(int i);

    @NotNull
    getIsvAgent getFollowerItemList(@Nullable Integer num, @Nullable String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getIsvAgent> getFollowerItemListByModifiedTime(long j, int i);

    @NotNull
    getIsvAgentDesc getFollowingItemList(@Nullable Integer num, @Nullable String str);

    @NotNull
    getIsvAgentDesc getFollowingItemListByModifiedTime(long j, int i);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> modifyRelationship(@NotNull String str, @NotNull String str2);
}
