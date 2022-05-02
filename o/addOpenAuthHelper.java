package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007*\b\u0012\u0004\u0012\u00020\u00050\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\t¨\u0006\n"}, d2 = {"toMyFeed", "Lid/dana/domain/social/model/SocialFeed;", "Lid/dana/data/social/model/MyFeedResult;", "toNotificationResponse", "Lid/dana/domain/social/model/ActivityResponse;", "Lid/dana/data/social/model/ActivityResult;", "toNotificationsResponse", "", "toSocialFeed", "Lid/dana/data/social/model/FeedResult;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class addOpenAuthHelper {
    @NotNull
    public static final getScanCallbackIntent toMyFeed(@NotNull RVOpenAuthHelper rVOpenAuthHelper) {
        Intrinsics.checkNotNullParameter(rVOpenAuthHelper, "$this$toMyFeed");
        boolean hasMore = rVOpenAuthHelper.getHasMore();
        String maxId = rVOpenAuthHelper.getMaxId();
        String str = maxId == null ? "" : maxId;
        List<RssiFilter> notificationsResponse = toNotificationsResponse(rVOpenAuthHelper.getNotifications());
        List emptyList = CollectionsKt.emptyList();
        String minId = rVOpenAuthHelper.getMinId();
        if (minId == null) {
            minId = "";
        }
        return new getScanCallbackIntent(hasMore, str, notificationsResponse, 0, emptyList, minId, false, 64, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final List<RssiFilter> toNotificationsResponse(@NotNull List<onUserAuthClick> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toNotificationsResponse");
        Iterable<onUserAuthClick> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (onUserAuthClick notificationResponse : iterable) {
            arrayList.add(toNotificationResponse(notificationResponse));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final RssiFilter toNotificationResponse(@NotNull onUserAuthClick onuserauthclick) {
        List list;
        List list2;
        Intrinsics.checkNotNullParameter(onuserauthclick, "$this$toNotificationResponse");
        List<sendResult> reactionCounts = onuserauthclick.getReactionCounts();
        if (reactionCounts != null) {
            Iterable<sendResult> iterable = reactionCounts;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (sendResult reactionCount : iterable) {
                arrayList.add(reactionCount.toReactionCount());
            }
            list = (List) arrayList;
        } else {
            list = CollectionsKt.emptyList();
        }
        List sortedWith = CollectionsKt.sortedWith(list, new setMax());
        List<EventSendInterceptorExtension> ownReactions = onuserauthclick.getOwnReactions();
        if (ownReactions != null) {
            Iterable<EventSendInterceptorExtension> iterable2 = ownReactions;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            for (EventSendInterceptorExtension eventSendInterceptorExtension : iterable2) {
                arrayList2.add(new getRangedRegionState(eventSendInterceptorExtension.getId(), eventSendInterceptorExtension.getKind()));
            }
            list2 = (List) arrayList2;
        } else {
            list2 = CollectionsKt.emptyList();
        }
        List list3 = list2;
        Iterable iterable3 = sortedWith;
        Collection arrayList3 = new ArrayList();
        for (Object next : iterable3) {
            stopAndroidOBackgroundScan stopandroidobackgroundscan = (stopAndroidOBackgroundScan) next;
            Iterable<getRangedRegionState> iterable4 = list3;
            Collection arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable4, 10));
            for (getRangedRegionState kind : iterable4) {
                arrayList4.add(kind.getKind());
            }
            if (((List) arrayList4).contains(stopandroidobackgroundscan.getKind())) {
                arrayList3.add(next);
            }
        }
        Collection sortedWith2 = CollectionsKt.sortedWith((List) arrayList3, new setMin());
        Collection arrayList5 = new ArrayList();
        for (Object next2 : iterable3) {
            stopAndroidOBackgroundScan stopandroidobackgroundscan2 = (stopAndroidOBackgroundScan) next2;
            Iterable<getRangedRegionState> iterable5 = list3;
            Collection arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable5, 10));
            for (getRangedRegionState kind2 : iterable5) {
                arrayList6.add(kind2.getKind());
            }
            if (!((List) arrayList6).contains(stopandroidobackgroundscan2.getKind())) {
                arrayList5.add(next2);
            }
        }
        return new RssiFilter(onuserauthclick.getId(), onuserauthclick.getIconUrl(), onuserauthclick.getContent(), onuserauthclick.getRedirectType(), onuserauthclick.getRedirectValue(), onuserauthclick.getRead(), onuserauthclick.getCreatedTime(), onuserauthclick.getExtendInfo(), CollectionsKt.plus(sortedWith2, (List) arrayList5), list3, onuserauthclick.getContentType(), onuserauthclick.getActivityId(), onuserauthclick.getOwnActivity(), onuserauthclick.getCommentCounts());
    }

    @NotNull
    public static final getScanCallbackIntent toSocialFeed(@NotNull getExtendScope getextendscope) {
        String str;
        Intrinsics.checkNotNullParameter(getextendscope, "$this$toSocialFeed");
        Boolean hasMore = getextendscope.getHasMore();
        boolean booleanValue = hasMore != null ? hasMore.booleanValue() : false;
        String maxId = getextendscope.getMaxId();
        String str2 = maxId == null ? "" : maxId;
        List<onUserAuthClick> activities = getextendscope.getActivities();
        List list = null;
        List<RssiFilter> notificationsResponse = activities != null ? toNotificationsResponse(activities) : null;
        if (notificationsResponse == null) {
            notificationsResponse = CollectionsKt.emptyList();
        }
        int feedVersion = getextendscope.getFeedVersion();
        List<GetAuthCodeInterceptPoint> groupedActivities = getextendscope.getGroupedActivities();
        if (groupedActivities != null) {
            Iterable<GetAuthCodeInterceptPoint> iterable = groupedActivities;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (GetAuthCodeInterceptPoint groupedActivity : iterable) {
                arrayList.add(groupedActivity.toGroupedActivity());
            }
            list = (List) arrayList;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        String minId = getextendscope.getMinId();
        if (minId == null) {
            str = "";
        } else {
            str = minId;
        }
        return new getScanCallbackIntent(booleanValue, str2, notificationsResponse, feedVersion, list2, str, false, 64, (DefaultConstructorMarker) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
    public static final class setMin<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((stopAndroidOBackgroundScan) t).getCount()), Integer.valueOf(((stopAndroidOBackgroundScan) t2).getCount()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 4, 2})
    public static final class setMax<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((stopAndroidOBackgroundScan) t2).getCount()), Integer.valueOf(((stopAndroidOBackgroundScan) t).getCount()));
        }
    }
}
