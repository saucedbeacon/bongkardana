package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import o.RVOpenAuthHelper;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\rH'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0016H'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0019H'J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u001bH'J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u001dH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lid/dana/data/social/repository/source/network/SocialMediaFacade;", "", "addActivityComment", "Lid/dana/data/social/repository/source/network/response/AddActivityCommentResponse;", "request", "Lid/dana/data/social/repository/source/network/request/AddActivityCommentRequest;", "addActivityReaction", "Lid/dana/data/social/repository/source/network/response/AddActivityReactionResult;", "Lid/dana/data/social/repository/source/network/request/AddActivityReactionRequest;", "deleteActivityReaction", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "Lid/dana/data/social/repository/source/network/request/DeleteActivityReactionRequest;", "deleteComment", "Lid/dana/data/social/repository/source/network/request/DeleteCommentRequest;", "fetchFeed", "Lid/dana/data/social/model/FeedResult;", "Lid/dana/data/social/model/FetchFeedRequest;", "fetchFeedComments", "Lid/dana/data/social/repository/source/network/response/FetchActivityCommentsResponse;", "Lid/dana/data/social/repository/source/network/request/FetchCommentRequest;", "fetchFeedNotificationCount", "Lid/dana/data/social/repository/source/network/response/FetchFeedNotificationCountResponse;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "getMyFeeds", "Lid/dana/data/social/model/MyFeedResult;", "Lid/dana/data/social/model/GetMyFeedsRequest;", "markNotificationAsRead", "Lid/dana/data/social/repository/source/network/request/MarkAsReadNotificationRequest;", "reportFeedComment", "Lid/dana/data/social/model/ReportFeedCommentRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface AuthSkipRequestModel {
    @OperationType("id.dana.feedengine.socialmedia.addActivityComment")
    @NotNull
    setAppName addActivityComment(@NotNull AuthContentResultModel authContentResultModel);

    @OperationType("alipayplus.mobilewallet.socialmedia.addActivityReaction")
    @NotNull
    setAppLogoLink addActivityReaction(@NotNull AuthAgreementModel authAgreementModel);

    @OperationType("alipayplus.mobilewallet.socialmedia.deleteActivityReaction")
    @NotNull
    BaseRpcResult deleteActivityReaction(@NotNull setSuccess setsuccess);

    @OperationType("id.dana.feedengine.socialmedia.deleteActivityComment")
    @NotNull
    BaseRpcResult deleteComment(@NotNull setContent setcontent);

    @OperationType("id.dana.feedengine.socialmedia.fetchFeed")
    @NotNull
    @SignCheck
    getExtendScope fetchFeed(@NotNull AppPermissionInitExtension appPermissionInitExtension);

    @OperationType("id.dana.feedengine.socialmedia.fetchActivityComments")
    @NotNull
    setAgreements fetchFeedComments(@NotNull getSuccess getsuccess);

    @OperationType("id.dana.feedengine.socialmedia.fetchFeedNotificationCount")
    @NotNull
    setIsvAgent fetchFeedNotificationCount(@NotNull BaseRpcRequest baseRpcRequest);

    @OperationType("alipayplus.mobilewallet.user.notification.fetchInbox")
    @NotNull
    @SignCheck
    RVOpenAuthHelper getMyFeeds(@NotNull getExtendDescription getextenddescription);

    @OperationType("id.dana.feedengine.socialmedia.markNotificationAsRead")
    @NotNull
    BaseRpcResult markNotificationAsRead(@NotNull setErrorCode seterrorcode);

    @OperationType("id.dana.feedengine.socialmedia.reportActivityComment")
    @NotNull
    @SignCheck
    BaseRpcResult reportFeedComment(@NotNull RVOpenAuthHelper.AnonymousClass3 r1);
}
