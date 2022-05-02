package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H&J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0010\u001a\u00020\u0006H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H&J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H&JR\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fH&J&\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H&J*\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00032\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H&J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fH&J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Lid/dana/data/social/repository/SocialMediaData;", "", "addActivityComment", "Lio/reactivex/Observable;", "Lid/dana/data/social/repository/source/network/response/AddActivityCommentResponse;", "userId", "", "activityId", "content", "addActivityReaction", "Lid/dana/data/social/repository/source/network/response/AddActivityReactionResult;", "kind", "deleteActivityReaction", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "reactionId", "deleteComment", "id", "fetchFeedNotificationCount", "Lid/dana/data/social/repository/source/network/response/FetchFeedNotificationCountResponse;", "getFeedComment", "Lid/dana/data/social/repository/source/network/response/FetchActivityCommentsResponse;", "idLastComment", "getFeeds", "Lid/dana/data/social/model/FeedResult;", "pageSize", "", "maxId", "minId", "feedType", "feedVersion", "activityIds", "", "getGlobalNotification", "Lid/dana/data/social/model/MyFeedResult;", "getMyFeeds", "markAsReadNotification", "ids", "submitFeedCommentReport", "commentId", "reason", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface AuthProtocol {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<setAppName> addActivityComment(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<setAppLogoLink> addActivityReaction(@Nullable String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> deleteActivityReaction(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> deleteComment(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<setIsvAgent> fetchFeedNotificationCount();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<setAgreements> getFeedComment(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getExtendScope> getFeeds(@Nullable String str, int i, @Nullable String str2, @Nullable String str3, @NotNull String str4, int i2, @NotNull List<String> list);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<RVOpenAuthHelper> getGlobalNotification(int i, @NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<RVOpenAuthHelper> getMyFeeds(int i, @Nullable String str, @Nullable String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> markAsReadNotification(@NotNull List<String> list);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> submitFeedCommentReport(@NotNull String str, @NotNull String str2);
}
