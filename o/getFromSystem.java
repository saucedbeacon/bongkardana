package o;

import java.util.Set;
import kotlin.Metadata;
import o.ScanDataProcessor;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\f\u001a\u00020\u000bH&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u0004H&J&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000fH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lid/dana/data/social/repository/SocialPreferencesData;", "", "cacheTimeline", "Lio/reactivex/Observable;", "", "socialFeed", "Lid/dana/domain/social/model/SocialFeed;", "getCachedTimeline", "getFeedsSharingLastCheckedState", "getReportedCommentIdCache", "", "", "phoneNumber", "activityId", "getSocialFeedStatus", "Lid/dana/domain/social/model/FeedInit;", "saveFeedsSharingLastCheckedState", "checked", "saveReportedCommentId", "listOfCommentId", "saveSocialFeedStatus", "feedInit", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface getFromSystem {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> cacheTimeline(@NotNull getScanCallbackIntent getscancallbackintent);

    @NotNull
    getScanCallbackIntent getCachedTimeline();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> getFeedsSharingLastCheckedState();

    @NotNull
    Set<String> getReportedCommentIdCache(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<ScanDataProcessor.ScanData> getSocialFeedStatus(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveFeedsSharingLastCheckedState(boolean z);

    boolean saveReportedCommentId(@NotNull String str, @NotNull String str2, @NotNull Set<String> set);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveSocialFeedStatus(@NotNull String str, @NotNull ScanDataProcessor.ScanData scanData);
}
