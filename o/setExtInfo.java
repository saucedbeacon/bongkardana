package o;

import id.dana.domain.social.InitStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ScanDataProcessor;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J,\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0002J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0002J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J&\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lid/dana/data/social/repository/source/local/LocalSocialPreferencesData;", "Lid/dana/data/social/repository/SocialPreferencesData;", "socialPreferences", "Lid/dana/data/social/repository/source/local/SocialPreferences;", "(Lid/dana/data/social/repository/source/local/SocialPreferences;)V", "cacheTimeline", "Lio/reactivex/Observable;", "", "socialFeed", "Lid/dana/domain/social/model/SocialFeed;", "getCachedTimeline", "getFeedsSharingLastCheckedState", "getReportedCommentIdCache", "", "", "phoneNumber", "activityId", "getSocialFeedStatus", "Lid/dana/domain/social/model/FeedInit;", "mergeSocialFeed", "activities", "", "Lid/dana/domain/social/model/ActivityResponse;", "groupedActivities", "Lid/dana/domain/social/model/GroupedActivity;", "mergeSocialFeedActivities", "prevSocialFeed", "mergeSocialFeedGroupActivities", "saveFeedsSharingLastCheckedState", "checked", "saveReportedCommentId", "listOfCommentId", "saveSocialFeedStatus", "feedInit", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setExtInfo implements getFromSystem {
    private getCurrentLongitudeAndLatitude socialPreferences;

    public setExtInfo(@NotNull getCurrentLongitudeAndLatitude getcurrentlongitudeandlatitude) {
        Intrinsics.checkNotNullParameter(getcurrentlongitudeandlatitude, "socialPreferences");
        this.socialPreferences = getcurrentlongitudeandlatitude;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveSocialFeedStatus(@NotNull String str, @NotNull ScanDataProcessor.ScanData scanData) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(scanData, "feedInit");
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.socialPreferences.saveSocialWidgetInitStatus(str, scanData)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(socialPr…us(phoneNumber,feedInit))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<ScanDataProcessor.ScanData> getSocialFeedStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        if (!this.socialPreferences.getDeviceFeedFeatureSwitch()) {
            TitleBarRightButtonView.AnonymousClass1<ScanDataProcessor.ScanData> just = TitleBarRightButtonView.AnonymousClass1.just(new ScanDataProcessor.ScanData(0, InitStatus.NOT_ACTIVATED, 1, (DefaultConstructorMarker) null));
            Intrinsics.checkNotNullExpressionValue(just, "Observable.just(FeedInit…nitStatus.NOT_ACTIVATED))");
            return just;
        }
        TitleBarRightButtonView.AnonymousClass1<ScanDataProcessor.ScanData> just2 = TitleBarRightButtonView.AnonymousClass1.just(this.socialPreferences.getSocialWidgetInitStatus(str));
        Intrinsics.checkNotNullExpressionValue(just2, "Observable.just(socialPr…tInitStatus(phoneNumber))");
        return just2;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> cacheTimeline(@NotNull getScanCallbackIntent getscancallbackintent) {
        Intrinsics.checkNotNullParameter(getscancallbackintent, "socialFeed");
        if (getscancallbackintent.getGroupedActivities().size() < 3 || getscancallbackintent.getActivities().size() < 3) {
            getScanCallbackIntent cachedTimeline = this.socialPreferences.getCachedTimeline();
            TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.socialPreferences.cacheTimeline(mergeSocialFeed(getscancallbackintent, mergeSocialFeedActivities(getscancallbackintent, cachedTimeline), mergeSocialFeedGroupActivities(getscancallbackintent, cachedTimeline)))));
            Intrinsics.checkNotNullExpressionValue(just, "Observable.just(socialPr…meline(mergedSocialFeed))");
            return just;
        }
        TitleBarRightButtonView.AnonymousClass1<Boolean> just2 = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.socialPreferences.cacheTimeline(getscancallbackintent)));
        Intrinsics.checkNotNullExpressionValue(just2, "Observable.just(socialPr…acheTimeline(socialFeed))");
        return just2;
    }

    private final getScanCallbackIntent mergeSocialFeed(getScanCallbackIntent getscancallbackintent, List<RssiFilter> list, List<onCycleEnd> list2) {
        return new getScanCallbackIntent(getscancallbackintent.getHasMore(), getscancallbackintent.getMaxId(), list, getscancallbackintent.getFeedVersion(), list2, getscancallbackintent.getMinId(), getscancallbackintent.getFromCache());
    }

    private final List<onCycleEnd> mergeSocialFeedGroupActivities(getScanCallbackIntent getscancallbackintent, getScanCallbackIntent getscancallbackintent2) {
        List arrayList = new ArrayList();
        arrayList.addAll(getscancallbackintent.getGroupedActivities());
        arrayList.addAll(getscancallbackintent2.getGroupedActivities());
        return CollectionsKt.take(arrayList, 20);
    }

    private final List<RssiFilter> mergeSocialFeedActivities(getScanCallbackIntent getscancallbackintent, getScanCallbackIntent getscancallbackintent2) {
        List arrayList = new ArrayList();
        arrayList.addAll(getscancallbackintent.getActivities());
        arrayList.addAll(getscancallbackintent2.getActivities());
        return CollectionsKt.take(arrayList, 20);
    }

    @NotNull
    public final getScanCallbackIntent getCachedTimeline() {
        return this.socialPreferences.getCachedTimeline();
    }

    @NotNull
    public final Set<String> getReportedCommentIdCache(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        return this.socialPreferences.getReportedCommentId(str, str2);
    }

    public final boolean saveReportedCommentId(@NotNull String str, @NotNull String str2, @NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(set, "listOfCommentId");
        return this.socialPreferences.saveReportedCommentId(str, str2, set);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveFeedsSharingLastCheckedState(boolean z) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.socialPreferences.saveFeedsSharingLastCheckedState(z)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(socialPr…astCheckedState(checked))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getFeedsSharingLastCheckedState() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.socialPreferences.getFeedsSharingLastCheckedState()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(socialPr…haringLastCheckedState())");
        return just;
    }
}
