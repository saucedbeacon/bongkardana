package o;

import java.util.List;
import kotlin.Metadata;
import o.RunningAverageRssiFilter;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H&J^\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\nH&J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0006H&J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H&JR\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H&J&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H&J*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H&J@\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H&J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u0003H&J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H&J&\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, d2 = {"Lid/dana/domain/social/SocialMediaRepository;", "", "addActivityComment", "Lio/reactivex/Observable;", "Lid/dana/domain/social/model/AddActivityCommentInfo;", "userId", "", "activityId", "content", "deleteComment", "", "id", "fetchFeedNotificationCount", "", "getCachedFeeds", "Lid/dana/domain/social/model/SocialFeed;", "pageSize", "maxId", "minId", "feedVersion", "activityIds", "", "feedType", "fetchCache", "getFeedComments", "Lid/dana/domain/social/model/FeedCommentResult;", "idLastComment", "getFeedVersion", "getFeeds", "getGlobalNotification", "getMyFeeds", "getMyProfileFeed", "getReportReasonsConfig", "", "Lid/dana/domain/social/model/ReportReasons;", "getShareFeedsConfig", "markAsReadNotification", "ids", "submitFeedCommentReport", "commentId", "reason", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface DistanceConfigFetcher {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<RunningAverageRssiFilter.AnonymousClass1> addActivityComment(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> deleteComment(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Integer> fetchFeedNotificationCount();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> getCachedFeeds(@Nullable String str, int i, @Nullable String str2, @Nullable String str3, int i2, @NotNull List<String> list, @NotNull String str4, boolean z);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<RunningAverageRssiFilter.Measurement> getFeedComments(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Integer> getFeedVersion();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> getFeeds(@Nullable String str, int i, @Nullable String str2, @Nullable String str3, @NotNull String str4, int i2, @NotNull List<String> list);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> getGlobalNotification(int i, @NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> getMyFeeds(int i, @Nullable String str, @Nullable String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> getMyProfileFeed(int i, @Nullable String str, @Nullable String str2, int i2, @NotNull List<String> list);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<setSimulatedScanData>> getReportReasonsConfig();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> getShareFeedsConfig();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> markAsReadNotification(@NotNull List<String> list);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> submitFeedCommentReport(@NotNull String str, @NotNull String str2, @NotNull String str3);
}
