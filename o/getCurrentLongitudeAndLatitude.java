package o;

import android.content.Context;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.domain.social.InitStatus;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.RVResourceUtils;
import o.ScanDataProcessor;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001MB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\bJ\u0006\u0010!\u001a\u00020\bJ\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020\bJ\u0006\u0010(\u001a\u00020#J\u0006\u0010)\u001a\u00020#J\u0006\u0010*\u001a\u00020&J\u0010\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0019H\u0002J\u0010\u0010-\u001a\u00020#2\u0006\u0010,\u001a\u00020\u0019H\u0002J\u0014\u0010.\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fJ\u0010\u0010/\u001a\u00020#2\u0006\u0010,\u001a\u00020\u0019H\u0002J\u0010\u00100\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0019H\u0002J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u0019022\u0006\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u0019J\u000e\u00105\u001a\u0002062\u0006\u00103\u001a\u00020\u0019J\u000e\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\bJ$\u00109\u001a\u00020\b2\u0006\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u00192\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001902J\u0016\u0010;\u001a\u00020\b2\u0006\u00103\u001a\u00020\u00192\u0006\u0010<\u001a\u000206J\u000e\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\bJ\u000e\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020#J\u000e\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020#J\u000e\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020&J\u000e\u0010E\u001a\u00020\b2\u0006\u0010>\u001a\u00020\bJ\u000e\u0010F\u001a\u00020\b2\u0006\u0010@\u001a\u00020#J\u000e\u0010G\u001a\u00020\b2\u0006\u0010B\u001a\u00020#J\u000e\u0010H\u001a\u00020\b2\u0006\u0010D\u001a\u00020&J\u0018\u0010I\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0019H\u0002J\u0018\u0010J\u001a\u00020\b2\u0006\u0010@\u001a\u00020#2\u0006\u0010,\u001a\u00020\u0019H\u0002J\u0018\u0010K\u001a\u00020\b2\u0006\u0010B\u001a\u00020#2\u0006\u0010,\u001a\u00020\u0019H\u0002J\u0018\u0010L\u001a\u00020\b2\u0006\u0010D\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0019H\u0002R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR)\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lid/dana/data/social/repository/source/local/SocialPreferences;", "", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "value", "", "deviceFeedFeatureSwitch", "getDeviceFeedFeatureSwitch", "()Z", "setDeviceFeedFeatureSwitch", "(Z)V", "initFeedObservable", "Lio/reactivex/subjects/BehaviorSubject;", "Lid/dana/domain/social/model/InitFeed;", "kotlin.jvm.PlatformType", "getInitFeedObservable", "()Lio/reactivex/subjects/BehaviorSubject;", "initFeedObservable$delegate", "Lkotlin/Lazy;", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "socialWidgetPreferences", "", "cacheTimeline", "socialFeed", "Lid/dana/domain/social/model/SocialFeed;", "clearAll", "", "getCachedTimeline", "getFeedsSharingLastCheckedState", "getFollowerFullSyncFinished", "getFollowerFullSyncLastPage", "", "getFollowerPartialSyncLastPage", "getFollowerPartialSyncModifiedTime", "", "getFollowingFullSyncFinished", "getFollowingFullSyncLastPage", "getFollowingPartialSyncLastPage", "getFollowingPartialSyncModifiedTime", "getFullSyncFinished", "key", "getFullSyncLastPage", "getInitFeedEntity", "getPartialSyncLastPage", "getPartialSyncModifiedTime", "getReportedCommentId", "", "phoneNumber", "activityId", "getSocialWidgetInitStatus", "Lid/dana/domain/social/model/FeedInit;", "saveFeedsSharingLastCheckedState", "checked", "saveReportedCommentId", "listOfCommentId", "saveSocialWidgetInitStatus", "feedInit", "setFollowerFullSyncFinished", "lastFriendReached", "setFollowerFullSyncLastPage", "lastPageNum", "setFollowerPartialSyncLastPage", "lastPage", "setFollowerPartialSyncModifiedTime", "lastModifiedTime", "setFollowingFullSyncFinished", "setFollowingFullSyncLastPage", "setFollowingPartialSyncLastPage", "setFollowingPartialSyncModifiedTime", "setFullSyncFinished", "setFullSyncLastPage", "setPartialSyncLastPage", "setPartialSyncModifiedTime", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getCurrentLongitudeAndLatitude {
    private static final String CACHED_TIMELINE_KEY = "cached_timeline_key";
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
    private static final String DEVICE_FEED_FEATURE_SWITCH = "device_Feed_feature_switch";
    private static final String FEEDS_SHARING_LAST_CHECKED_KEY = "feeds_sharing_last_checked";
    private static final String FEED_REPORTED_COMMENT_ID = "feed_reported_comment_id";
    private static final String FOLLOWER_FULL_SYNC_FINISHED_KEY = "follower_full_sync_finished";
    private static final String FOLLOWER_FULL_SYNC_LAST_PAGE_KEY = "follower_full_sync_last_page";
    private static final String FOLLOWER_PARTIAL_SYNC_LAST_PAGE_KEY = "follower_partial_sync_last_page";
    private static final String FOLLOWER_PARTIAL_SYNC_MODIFIED_TIME_KEY = "follower_partial_sync_modified_time";
    private static final String FOLLOWING_FULL_SYNC_FINISHED_KEY = "following_full_sync_finished";
    private static final String FOLLOWING_FULL_SYNC_LAST_PAGE_KEY = "following_full_sync_last_page";
    private static final String FOLLOWING_PARTIAL_SYNC_LAST_PAGE_KEY = "following_partial_sync_last_page";
    private static final String FOLLOWING_PARTIAL_SYNC_MODIFIED_TIME_KEY = "following_partial_sync_modified_time";
    private static final String SOCIAL_WIDGET_INIT_STATUS_KEY = "social_widget_init_status";
    private final Lazy initFeedObservable$delegate = LazyKt.lazy(length.INSTANCE);
    private final onSingleFailed preferenceFacade;
    private final String socialWidgetPreferences;

    private final removeString<setBeaconParsers> getInitFeedObservable() {
        return (removeString) this.initFeedObservable$delegate.getValue();
    }

    @Inject
    public getCurrentLongitudeAndLatitude(@NotNull Context context, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        StringBuilder sb = new StringBuilder();
        sb.append(Reflection.getOrCreateKotlinClass(getCurrentLongitudeAndLatitude.class).getSimpleName());
        sb.append(" production");
        this.socialWidgetPreferences = sb.toString();
        RVResourceUtils.getMax preferenceGroup = new RVResourceUtils.getMax(context).setPreferenceGroup(this.socialWidgetPreferences);
        UserInfoManager instance = UserInfoManager.instance();
        Intrinsics.checkNotNullExpressionValue(instance, "UserInfoManager.instance()");
        onSingleFailed createData = new RVResourceUtils(preferenceGroup.setPassword(instance.getUserId()).setSerializerFacade(pluginInstallCallback)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(it).createData(Source.LOCAL)");
        this.preferenceFacade = createData;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/subjects/BehaviorSubject;", "Lid/dana/domain/social/model/InitFeed;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<removeString<setBeaconParsers>> {
        public static final length INSTANCE = new length();

        length() {
            super(0);
        }

        @NotNull
        public final removeString<setBeaconParsers> invoke() {
            removeString<setBeaconParsers> max = removeString.getMax();
            max.onNext(new setBeaconParsers(InitStatus.NOT_ACTIVATED, 0, (Exception) null, false, 12, (DefaultConstructorMarker) null));
            return max;
        }
    }

    public final boolean getDeviceFeedFeatureSwitch() {
        Boolean bool = this.preferenceFacade.getBoolean(DEVICE_FEED_FEATURE_SWITCH, true);
        Intrinsics.checkNotNullExpressionValue(bool, "preferenceFacade.getBool…EED_FEATURE_SWITCH, true)");
        return bool.booleanValue();
    }

    public final void setDeviceFeedFeatureSwitch(boolean z) {
        this.preferenceFacade.saveData(DEVICE_FEED_FEATURE_SWITCH, Boolean.valueOf(z));
    }

    @NotNull
    public final removeString<setBeaconParsers> getInitFeedEntity() {
        removeString<setBeaconParsers> initFeedObservable = getInitFeedObservable();
        Intrinsics.checkNotNullExpressionValue(initFeedObservable, "initFeedObservable");
        return initFeedObservable;
    }

    public final int getFollowingFullSyncLastPage() {
        return getFullSyncLastPage(FOLLOWING_FULL_SYNC_LAST_PAGE_KEY);
    }

    public final boolean setFollowingFullSyncLastPage(int i) {
        setFullSyncLastPage(i, FOLLOWING_FULL_SYNC_LAST_PAGE_KEY);
        return true;
    }

    public final boolean getFollowingFullSyncFinished() {
        return getFullSyncFinished(FOLLOWING_FULL_SYNC_FINISHED_KEY);
    }

    public final boolean setFollowingFullSyncFinished(boolean z) {
        setFullSyncFinished(z, FOLLOWING_FULL_SYNC_FINISHED_KEY);
        return true;
    }

    public final long getFollowingPartialSyncModifiedTime() {
        return getPartialSyncModifiedTime(FOLLOWING_PARTIAL_SYNC_MODIFIED_TIME_KEY);
    }

    public final boolean setFollowingPartialSyncModifiedTime(long j) {
        setPartialSyncModifiedTime(j, FOLLOWING_PARTIAL_SYNC_MODIFIED_TIME_KEY);
        return true;
    }

    public final int getFollowingPartialSyncLastPage() {
        StringBuilder sb = new StringBuilder(FOLLOWING_PARTIAL_SYNC_LAST_PAGE_KEY);
        sb.append(getFollowingPartialSyncModifiedTime());
        return getPartialSyncLastPage(sb.toString());
    }

    public final boolean setFollowingPartialSyncLastPage(int i) {
        StringBuilder sb = new StringBuilder(FOLLOWING_PARTIAL_SYNC_LAST_PAGE_KEY);
        sb.append(getFollowingPartialSyncModifiedTime());
        setPartialSyncLastPage(i, sb.toString());
        return true;
    }

    public final int getFollowerFullSyncLastPage() {
        return getFullSyncLastPage(FOLLOWER_FULL_SYNC_LAST_PAGE_KEY);
    }

    public final boolean setFollowerFullSyncLastPage(int i) {
        setFullSyncLastPage(i, FOLLOWER_FULL_SYNC_LAST_PAGE_KEY);
        return true;
    }

    public final boolean getFollowerFullSyncFinished() {
        return getFullSyncFinished(FOLLOWER_FULL_SYNC_FINISHED_KEY);
    }

    public final boolean setFollowerFullSyncFinished(boolean z) {
        setFullSyncFinished(z, FOLLOWER_FULL_SYNC_FINISHED_KEY);
        return true;
    }

    public final long getFollowerPartialSyncModifiedTime() {
        return getPartialSyncModifiedTime(FOLLOWER_PARTIAL_SYNC_MODIFIED_TIME_KEY);
    }

    public final boolean setFollowerPartialSyncModifiedTime(long j) {
        setPartialSyncModifiedTime(j, FOLLOWER_PARTIAL_SYNC_MODIFIED_TIME_KEY);
        return true;
    }

    public final int getFollowerPartialSyncLastPage() {
        StringBuilder sb = new StringBuilder(FOLLOWER_PARTIAL_SYNC_LAST_PAGE_KEY);
        sb.append(getFollowerPartialSyncModifiedTime());
        return getPartialSyncLastPage(sb.toString());
    }

    public final boolean setFollowerPartialSyncLastPage(int i) {
        StringBuilder sb = new StringBuilder(FOLLOWER_PARTIAL_SYNC_LAST_PAGE_KEY);
        sb.append(getFollowerPartialSyncModifiedTime());
        setPartialSyncLastPage(i, sb.toString());
        return true;
    }

    private final int getFullSyncLastPage(String str) {
        Integer integer = this.preferenceFacade.getInteger(str);
        if (integer != null) {
            return integer.intValue();
        }
        return 0;
    }

    private final boolean setFullSyncLastPage(int i, String str) {
        this.preferenceFacade.saveData(str, Integer.valueOf(i));
        return true;
    }

    private final boolean getFullSyncFinished(String str) {
        Boolean bool = this.preferenceFacade.getBoolean(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean setFullSyncFinished(boolean z, String str) {
        this.preferenceFacade.saveData(str, Boolean.valueOf(z));
        return true;
    }

    private final long getPartialSyncModifiedTime(String str) {
        Long l = this.preferenceFacade.getLong(str);
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    private final boolean setPartialSyncModifiedTime(long j, String str) {
        this.preferenceFacade.saveData(str, Long.valueOf(j));
        return true;
    }

    private final int getPartialSyncLastPage(String str) {
        Integer integer = this.preferenceFacade.getInteger(str);
        if (integer != null) {
            return integer.intValue();
        }
        return 0;
    }

    private final boolean setPartialSyncLastPage(int i, String str) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(70854846, oncanceled);
            onCancelLoad.getMin(70854846, oncanceled);
        }
        this.preferenceFacade.saveData(str, Integer.valueOf(i));
        return true;
    }

    @NotNull
    public final ScanDataProcessor.ScanData getSocialWidgetInitStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(SOCIAL_WIDGET_INIT_STATUS_KEY);
        ScanDataProcessor.ScanData scanData = (ScanDataProcessor.ScanData) onsinglefailed.getObject(sb.toString(), ScanDataProcessor.ScanData.class);
        return scanData == null ? new ScanDataProcessor.ScanData(0, InitStatus.NOT_ACTIVATED, 1, (DefaultConstructorMarker) null) : scanData;
    }

    public final boolean saveSocialWidgetInitStatus(@NotNull String str, @NotNull ScanDataProcessor.ScanData scanData) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(scanData, "feedInit");
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(SOCIAL_WIDGET_INIT_STATUS_KEY);
        onsinglefailed.saveData(sb.toString(), scanData);
        return true;
    }

    public final void clearAll() {
        getInitFeedObservable().onNext(new setBeaconParsers(InitStatus.NOT_ACTIVATED, 0, (Exception) null, false, 14, (DefaultConstructorMarker) null));
        this.preferenceFacade.clearData(FOLLOWER_FULL_SYNC_LAST_PAGE_KEY);
        this.preferenceFacade.clearData(FOLLOWER_FULL_SYNC_FINISHED_KEY);
        this.preferenceFacade.clearData(FOLLOWER_PARTIAL_SYNC_MODIFIED_TIME_KEY);
        this.preferenceFacade.clearData(FOLLOWER_PARTIAL_SYNC_LAST_PAGE_KEY);
        this.preferenceFacade.clearData(FOLLOWING_FULL_SYNC_LAST_PAGE_KEY);
        this.preferenceFacade.clearData(FOLLOWING_FULL_SYNC_FINISHED_KEY);
        this.preferenceFacade.clearData(FOLLOWING_PARTIAL_SYNC_MODIFIED_TIME_KEY);
        this.preferenceFacade.clearData(FOLLOWING_PARTIAL_SYNC_LAST_PAGE_KEY);
        this.preferenceFacade.clearData(CACHED_TIMELINE_KEY);
    }

    public final boolean cacheTimeline(@NotNull getScanCallbackIntent getscancallbackintent) {
        Intrinsics.checkNotNullParameter(getscancallbackintent, "socialFeed");
        this.preferenceFacade.saveData(CACHED_TIMELINE_KEY, getscancallbackintent);
        return true;
    }

    @NotNull
    public final getScanCallbackIntent getCachedTimeline() {
        getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) this.preferenceFacade.getObject(CACHED_TIMELINE_KEY, getScanCallbackIntent.class);
        if (getscancallbackintent == null) {
            getscancallbackintent = new getScanCallbackIntent(false, (String) null, (List) null, 0, (List) null, (String) null, false, 127, (DefaultConstructorMarker) null);
        }
        getscancallbackintent.setFromCache(true);
        return getscancallbackintent;
    }

    public final boolean saveFeedsSharingLastCheckedState(boolean z) {
        this.preferenceFacade.saveData(FEEDS_SHARING_LAST_CHECKED_KEY, Boolean.valueOf(z));
        return true;
    }

    public final boolean getFeedsSharingLastCheckedState() {
        Boolean bool = this.preferenceFacade.getBoolean(FEEDS_SHARING_LAST_CHECKED_KEY, true);
        Intrinsics.checkNotNullExpressionValue(bool, "preferenceFacade.getBool…G_LAST_CHECKED_KEY, true)");
        return bool.booleanValue();
    }

    public final boolean saveReportedCommentId(@NotNull String str, @NotNull String str2, @NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(set, "listOfCommentId");
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(FEED_REPORTED_COMMENT_ID);
        onsinglefailed.saveData(sb.toString(), set);
        return true;
    }

    @NotNull
    public final Set<String> getReportedCommentId(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(FEED_REPORTED_COMMENT_ID);
        Set<String> set = (Set) onsinglefailed.getObject(sb.toString(), Set.class);
        return set == null ? SetsKt.emptySet() : set;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/data/social/repository/source/local/SocialPreferences$Companion;", "", "()V", "CACHED_TIMELINE_KEY", "", "DEVICE_FEED_FEATURE_SWITCH", "FEEDS_SHARING_LAST_CHECKED_KEY", "FEED_REPORTED_COMMENT_ID", "FOLLOWER_FULL_SYNC_FINISHED_KEY", "FOLLOWER_FULL_SYNC_LAST_PAGE_KEY", "FOLLOWER_PARTIAL_SYNC_LAST_PAGE_KEY", "FOLLOWER_PARTIAL_SYNC_MODIFIED_TIME_KEY", "FOLLOWING_FULL_SYNC_FINISHED_KEY", "FOLLOWING_FULL_SYNC_LAST_PAGE_KEY", "FOLLOWING_PARTIAL_SYNC_LAST_PAGE_KEY", "FOLLOWING_PARTIAL_SYNC_MODIFIED_TIME_KEY", "SOCIAL_WIDGET_INIT_STATUS_KEY", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
