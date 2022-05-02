package o;

import android.content.Context;
import id.dana.social.model.FeedModel;
import id.dana.social.model.RelationshipItemModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ConfirmPopup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J<\u0010\u0011\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0013j\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f`\u00140\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012H\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\nH\u0002J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\nH\u0002J8\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\u0006\u0010\u001d\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00122\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0!J*\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\u0006\u0010\u001d\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00122\u0006\u0010#\u001a\u00020\fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lid/dana/social/model/mapper/GroupedFeedMapper;", "", "context", "Landroid/content/Context;", "feedModelMapper", "Lid/dana/social/model/mapper/FeedModelMapper;", "(Landroid/content/Context;Lid/dana/social/model/mapper/FeedModelMapper;)V", "checkIfFeedsIsPastYear", "", "date", "Ljava/util/Date;", "composeDateAndYear", "", "calculatedDate", "getDayDiff", "", "dateTime", "getOrderedNonDuplicateActors", "", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "mappedActivities", "Lid/dana/social/model/FeedModel;", "getSectionFeed", "diffDay", "", "getSectionText", "map", "Lid/dana/social/model/FeedViewHolderModel;", "dateNow", "oldItem", "Lid/dana/domain/social/model/GroupedActivity;", "takeUntilFunction", "Lkotlin/Function1;", "mapLatestGroupedFeedByMinId", "minId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$3500 {
    private final Context getMax;
    private final access$3800 length;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/GroupedActivity;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<onCycleEnd, Boolean> {
        public static final length INSTANCE = new length();

        length() {
            super(1);
        }

        public final boolean invoke(@NotNull onCycleEnd oncycleend) {
            Intrinsics.checkNotNullParameter(oncycleend, "it");
            return false;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((onCycleEnd) obj));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/GroupedActivity;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<onCycleEnd, Boolean> {
        final /* synthetic */ String $minId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(String str) {
            super(1);
            this.$minId = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((onCycleEnd) obj));
        }

        public final boolean invoke(@NotNull onCycleEnd oncycleend) {
            Intrinsics.checkNotNullParameter(oncycleend, "it");
            return Intrinsics.areEqual((Object) oncycleend.getId(), (Object) this.$minId);
        }
    }

    @Inject
    public access$3500(@Nullable Context context, @NotNull access$3800 access_3800) {
        Intrinsics.checkNotNullParameter(access_3800, "feedModelMapper");
        this.getMax = context;
        this.length = access_3800;
    }

    @NotNull
    public final List<setEmptyView> setMin(@NotNull Date date, @NotNull List<onCycleEnd> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(date, "dateNow");
        Intrinsics.checkNotNullParameter(list, "oldItem");
        Intrinsics.checkNotNullParameter(str, "minId");
        return length(date, list, new setMin(str));
    }

    /* access modifiers changed from: private */
    @NotNull
    public List<setEmptyView> length(@NotNull Date date, @NotNull List<onCycleEnd> list, @NotNull Function1<? super onCycleEnd, Boolean> function1) {
        setEmptyView setemptyview;
        Date date2 = date;
        Function1<? super onCycleEnd, Boolean> function12 = function1;
        Intrinsics.checkNotNullParameter(date2, "dateNow");
        Intrinsics.checkNotNullParameter(list, "oldItem");
        Intrinsics.checkNotNullParameter(function12, "takeUntilFunction");
        ArrayList arrayList = new ArrayList();
        long j = -1;
        for (onCycleEnd next : list) {
            if (function12.invoke(next).booleanValue()) {
                break;
            }
            long createdTime = next.getActivities().get(0).getCreatedTime();
            long min = ConfirmPopup.AnonymousClass1.setMin(new Date(), new Date(createdTime));
            if (min >= 0 && min != j) {
                arrayList.add(new setEmptyView(1, length((int) min, new Date(createdTime)), (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28));
                j = min;
            }
            Iterable<RssiFilter> activities = next.getActivities();
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(activities, 10));
            for (RssiFilter max : activities) {
                arrayList2.add(this.length.setMax(date2, max));
            }
            List list2 = (List) arrayList2;
            List<HashMap<String, String>> min2 = getMin(list2);
            if (next.getActivityCount() > 1) {
                setemptyview = new setEmptyView(11, (FeedModel) null, new setFocusableInTouchMode(next.getId(), next.getGroup(), next.getActivityCount(), next.getActorCount(), list2, new HashMap(MapsKt.toMap(min2.get(0))), min2), (List) null, (RelationshipItemModel) null, 24);
            } else {
                setemptyview = new setEmptyView(9, (FeedModel) list2.get(0), (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 24);
            }
            arrayList.add(setemptyview);
        }
        return arrayList;
    }

    private final FeedModel length(int i, Date date) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1589217454, oncanceled);
            onCancelLoad.getMin(-1589217454, oncanceled);
        }
        FeedModel.setMax setmax = FeedModel.Grayscale$Algorithm;
        return FeedModel.setMax.getMax(getMax(i, date));
    }

    private static List<HashMap<String, String>> getMin(List<FeedModel> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FeedModel feedModel : list) {
            HashMap<String, String> hashMap = feedModel.IsOverlapping;
            if (hashMap != null) {
                linkedHashMap.put(setBuildNumber.getUserId(hashMap), hashMap);
            }
        }
        Map map = linkedHashMap;
        Collection arrayList = new ArrayList(map.size());
        for (Map.Entry value : map.entrySet()) {
            arrayList.add((HashMap) value.getValue());
        }
        return (List) arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getMax(int r6, java.util.Date r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x002b
            if (r6 == r0) goto L_0x001f
            java.util.Locale r6 = java.util.Locale.getDefault()
            long r2 = r7.getTime()
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "dd MMMM"
            r2.<init>(r3, r6)
            java.lang.String r6 = r2.format(r4)
            goto L_0x0038
        L_0x001f:
            android.content.Context r6 = r5.getMax
            if (r6 == 0) goto L_0x0037
            r2 = 2131887078(0x7f1203e6, float:1.9408753E38)
            java.lang.String r6 = r6.getString(r2)
            goto L_0x0038
        L_0x002b:
            android.content.Context r6 = r5.getMax
            if (r6 == 0) goto L_0x0037
            r2 = 2131887077(0x7f1203e5, float:1.940875E38)
            java.lang.String r6 = r6.getString(r2)
            goto L_0x0038
        L_0x0037:
            r6 = r1
        L_0x0038:
            if (r6 == 0) goto L_0x0069
            boolean r1 = length(r7)
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r6 = 32
            r1.append(r6)
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            r6.setTime(r7)
            int r6 = r6.get(r0)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
        L_0x0068:
            return r6
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.access$3500.getMax(int, java.util.Date):java.lang.String");
    }

    private static boolean length(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return true;
        }
        return false;
    }
}
