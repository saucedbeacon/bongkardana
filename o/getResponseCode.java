package o;

import java.util.List;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0012H&J\b\u0010\u0019\u001a\u00020\u0014H&J\b\u0010\u001a\u001a\u00020\u0014H&J\b\u0010\u001b\u001a\u00020\u0017H&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H&J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0014H&J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0014H&J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0014H&J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0014H&J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u0003H&J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H&J \u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\u0012H&J \u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\u0012H&J\b\u0010*\u001a\u00020\u0012H&J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H&J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H&J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H&J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H&J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H&J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H&J\b\u00103\u001a\u000204H&J\b\u00105\u001a\u000204H&J\b\u00106\u001a\u000204H&J\b\u00107\u001a\u000204H&J\u0010\u00108\u001a\u0002042\u0006\u00109\u001a\u00020\u0012H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, d2 = {"Lid/dana/domain/social/SocialGeneralRepository;", "", "addActivityReaction", "Lio/reactivex/Observable;", "Lid/dana/domain/social/model/ReactionResult;", "userId", "", "activityId", "kind", "deleteActivityReaction", "Lid/dana/domain/social/model/DeleteReactionResult;", "reactionId", "getActiveFollower", "Lid/dana/domain/social/model/Follower;", "getActiveFollowing", "Lid/dana/domain/social/model/Following;", "getBlockedFollower", "getFollowerFullSyncFinished", "", "getFollowerFullSyncLastPage", "", "getFollowerPartialSyncLastPage", "getFollowerPartialSyncModifiedTime", "", "getFollowingFullSyncFinished", "getFollowingFullSyncLastPage", "getFollowingPartialSyncLastPage", "getFollowingPartialSyncModifiedTime", "getMutedFollowing", "getNextFollowerFullSync", "page", "getNextFollowerPartialSync", "getNextFollowingFullSync", "getNextFollowingPartialSync", "getReactions", "", "Lid/dana/domain/social/model/Reaction;", "getReciprocalFriend", "getSelectedFollowerItem", "Lid/dana/domain/social/model/RelationshipItem;", "maskUntilUsername", "getSelectedFollowingItem", "getShareFeedConsent", "modifyFollowerRelationship", "targetUserId", "operationType", "modifyFollowerRelationshipWithPublishResult", "modifyFollowingRelationship", "modifyFollowingRelationshipWithPublishResult", "observeFollowerFullSyncStatus", "observeFollowingFullSyncStatus", "saveFollowerFullSyncFinished", "", "saveFollowerPartialSyncModifiedTime", "saveFollowingFullSyncFinished", "saveFollowingPartialSyncModifiedTime", "saveShareFeedConsent", "enable", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface getResponseCode {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<createCycledLeScanner> addActivityReaction(@Nullable String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<RunningAverageRssiFilter> deleteActivityReaction(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getCycledScanner> getActiveFollower();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<ScanHelper> getActiveFollowing();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getCycledScanner> getBlockedFollower();

    boolean getFollowerFullSyncFinished();

    int getFollowerFullSyncLastPage();

    int getFollowerPartialSyncLastPage();

    long getFollowerPartialSyncModifiedTime();

    boolean getFollowingFullSyncFinished();

    int getFollowingFullSyncLastPage();

    int getFollowingPartialSyncLastPage();

    long getFollowingPartialSyncModifiedTime();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<ScanHelper> getMutedFollowing();

    @NotNull
    getCycledScanner getNextFollowerFullSync(int i);

    @NotNull
    getCycledScanner getNextFollowerPartialSync(int i);

    @NotNull
    ScanHelper getNextFollowingFullSync(int i);

    @NotNull
    ScanHelper getNextFollowingPartialSync(int i);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<startAndroidOBackgroundScan>> getReactions();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<ScanHelper> getReciprocalFriend();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<processScanResult> getSelectedFollowerItem(@NotNull String str, boolean z);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<processScanResult> getSelectedFollowingItem(@NotNull String str, boolean z);

    boolean getShareFeedConsent();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> modifyFollowerRelationship(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> modifyFollowerRelationshipWithPublishResult(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> modifyFollowingRelationship(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> modifyFollowingRelationshipWithPublishResult(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getCycledScanner> observeFollowerFullSyncStatus();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<ScanHelper> observeFollowingFullSyncStatus();

    void saveFollowerFullSyncFinished();

    void saveFollowerPartialSyncModifiedTime();

    void saveFollowingFullSyncFinished();

    void saveFollowingPartialSyncModifiedTime();

    void saveShareFeedConsent(boolean z);
}
