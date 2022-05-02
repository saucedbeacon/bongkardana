package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.richview.CurrencyTextView;
import id.dana.social.model.FeedModel;
import id.dana.social.model.OwnReactionModel;
import id.dana.social.model.ReactionCountModel;
import id.dana.social.model.RelationshipItemModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ConfirmPopup;
import o.WheelView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u00016B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J&\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J&\u0010\u0019\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u0018J\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010\"2\u0006\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\tH\u0002J\u0010\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0002J\u0018\u0010*\u001a\u00020+2\u0006\u0010'\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002J2\u0010,\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\"0.H\u0002J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J:\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e01H\u0002J\"\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u00103\u001a\u00020\"J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0006\u00105\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u00067"}, d2 = {"Lid/dana/social/model/mapper/FeedMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lid/dana/domain/social/model/ActivityResponse;", "Lid/dana/social/model/FeedViewHolderModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "<set-?>", "", "lastDiffDay", "getLastDiffDay", "()J", "setLastDiffDay", "(J)V", "activityResponseToFriendModel", "Lid/dana/social/model/FriendModel;", "activities", "addFeed", "", "feedViewModels", "", "activityResponse", "feedType", "", "addFeedWithoutDateSection", "apply", "oldItem", "applyWithoutDateSection", "checkIfFeedsIsPastYear", "", "date", "Ljava/util/Date;", "composeDateAndYear", "", "calculatedDate", "generateFormattedReactionCounts", "Lid/dana/social/model/ReactionCountModel;", "getContentDate", "diffDay", "dateTime", "getDayDiff", "getSectionFeed", "Lid/dana/social/model/FeedModel;", "getSectionText", "composeDIfferentYear", "Lkotlin/Function2;", "map", "takeUntilFunction", "Lkotlin/Function1;", "mapLatestFeedByMinId", "minId", "mapWithoutDateSection", "resetLastDiffDay", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$3600 extends setSpeed<List<? extends RssiFilter>, List<? extends setEmptyView>> {
    @NotNull
    public static final getMin getMin = new getMin((byte) 0);
    public long getMax = -1;
    private final Context setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "<anonymous parameter 1>", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function2<String, Date, String> {
        public static final length INSTANCE = new length();

        length() {
            super(2);
        }

        @NotNull
        public final String invoke(@NotNull String str, @NotNull Date date) {
            Intrinsics.checkNotNullParameter(str, "it");
            Intrinsics.checkNotNullParameter(date, "<anonymous parameter 1>");
            return str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/ActivityResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<RssiFilter, Boolean> {
        final /* synthetic */ String $minId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(String str) {
            super(1);
            this.$minId = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((RssiFilter) obj));
        }

        public final boolean invoke(@NotNull RssiFilter rssiFilter) {
            Intrinsics.checkNotNullParameter(rssiFilter, "it");
            return Intrinsics.areEqual((Object) rssiFilter.getId(), (Object) this.$minId);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/ActivityResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<RssiFilter, Boolean> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        public final boolean invoke(@NotNull RssiFilter rssiFilter) {
            Intrinsics.checkNotNullParameter(rssiFilter, "it");
            return false;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((RssiFilter) obj));
        }
    }

    public final /* synthetic */ Object map(Object obj) {
        List list = (List) obj;
        Intrinsics.checkNotNullParameter(list, "oldItem");
        return getMax((List<RssiFilter>) list, 9, (Function1<? super RssiFilter, Boolean>) setMin.INSTANCE);
    }

    @Inject
    public access$3600(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = context;
    }

    @NotNull
    public final List<setEmptyView> setMin(@NotNull List<RssiFilter> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "oldItem");
        Intrinsics.checkNotNullParameter(str, "minId");
        return getMax(list, 9, (Function1<? super RssiFilter, Boolean>) new setMax(str));
    }

    /* access modifiers changed from: private */
    public final List<setEmptyView> getMax(List<RssiFilter> list, int i, Function1<? super RssiFilter, Boolean> function1) {
        List<setEmptyView> arrayList = new ArrayList<>();
        for (RssiFilter next : list) {
            if (function1.invoke(next).booleanValue()) {
                break;
            }
            getMax(arrayList, next, i);
        }
        return arrayList;
    }

    private final void getMax(List<setEmptyView> list, RssiFilter rssiFilter, int i) {
        String str;
        String str2;
        String str3;
        Object obj;
        List<setEmptyView> list2 = list;
        long min = ConfirmPopup.AnonymousClass1.setMin(new Date(), new Date(rssiFilter.getCreatedTime()));
        if (min >= 0 && min != this.getMax) {
            Date date = new Date(rssiFilter.getCreatedTime());
            FeedModel.setMax setmax = FeedModel.Grayscale$Algorithm;
            list2.add(new setEmptyView(1, FeedModel.setMax.getMax(getMax((int) min, date, (Function2<? super String, ? super Date, String>) new getMax(this))), (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28));
            this.getMax = min;
        }
        Iterable<stopAndroidOBackgroundScan> reactionCounts = rssiFilter.getReactionCounts();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(reactionCounts, 10));
        for (stopAndroidOBackgroundScan stopandroidobackgroundscan : reactionCounts) {
            String kind = stopandroidobackgroundscan.getKind();
            int count = stopandroidobackgroundscan.getCount();
            Iterable<getRangedRegionState> ownReactions = rssiFilter.getOwnReactions();
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(ownReactions, 10));
            for (getRangedRegionState kind2 : ownReactions) {
                arrayList2.add(kind2.getKind());
            }
            boolean contains = ((List) arrayList2).contains(stopandroidobackgroundscan.getKind());
            Iterator it = rssiFilter.getOwnReactions().iterator();
            while (true) {
                str3 = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((getRangedRegionState) obj).getKind(), (Object) stopandroidobackgroundscan.getKind())) {
                    break;
                }
            }
            getRangedRegionState getrangedregionstate = (getRangedRegionState) obj;
            if (getrangedregionstate != null) {
                str3 = getrangedregionstate.getId();
            }
            arrayList.add(new ReactionCountModel(kind, count, contains, str3));
        }
        List mutableList = CollectionsKt.toMutableList((List) arrayList);
        String id2 = rssiFilter.getId();
        String str4 = id2 == null ? "" : id2;
        String content = rssiFilter.getContent();
        Long valueOf = Long.valueOf(rssiFilter.getCreatedTime());
        String min2 = getMin((int) min, rssiFilter.getCreatedTime());
        String iconUrl = rssiFilter.getIconUrl();
        boolean read = rssiFilter.getRead();
        HashMap<String, String> extendInfo = rssiFilter.getExtendInfo();
        String contentType = rssiFilter.getContentType();
        String activityId = rssiFilter.getActivityId();
        boolean ownActivity = rssiFilter.getOwnActivity();
        int commentCounts = rssiFilter.getCommentCounts();
        Iterable<getRangedRegionState> ownReactions2 = rssiFilter.getOwnReactions();
        Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(ownReactions2, 10));
        for (getRangedRegionState getrangedregionstate2 : ownReactions2) {
            arrayList3.add(new OwnReactionModel(getrangedregionstate2.getId(), getrangedregionstate2.getKind()));
        }
        List mutableList2 = CollectionsKt.toMutableList((List) arrayList3);
        String redirectType = rssiFilter.getRedirectType();
        if (redirectType == null) {
            str = "";
        } else {
            str = redirectType;
        }
        String redirectValue = rssiFilter.getRedirectValue();
        if (redirectValue == null) {
            str2 = "";
        } else {
            str2 = redirectValue;
        }
        list2.add(new setEmptyView(i, new FeedModel(str4, (String) null, content, valueOf, min2, iconUrl, read, extendInfo, contentType, activityId, ownActivity, commentCounts, mutableList, mutableList2, str, str2), (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28));
    }

    private final void setMin(List<setEmptyView> list, RssiFilter rssiFilter) {
        String str;
        String str2;
        String str3;
        Object obj;
        long min = ConfirmPopup.AnonymousClass1.setMin(new Date(), new Date(rssiFilter.getCreatedTime()));
        if (min >= 0 && min != this.getMax) {
            this.getMax = min;
        }
        Iterable<stopAndroidOBackgroundScan> reactionCounts = rssiFilter.getReactionCounts();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(reactionCounts, 10));
        for (stopAndroidOBackgroundScan stopandroidobackgroundscan : reactionCounts) {
            String kind = stopandroidobackgroundscan.getKind();
            int count = stopandroidobackgroundscan.getCount();
            Iterable<getRangedRegionState> ownReactions = rssiFilter.getOwnReactions();
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(ownReactions, 10));
            for (getRangedRegionState kind2 : ownReactions) {
                arrayList2.add(kind2.getKind());
            }
            boolean contains = ((List) arrayList2).contains(stopandroidobackgroundscan.getKind());
            Iterator it = rssiFilter.getOwnReactions().iterator();
            while (true) {
                str3 = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((getRangedRegionState) obj).getKind(), (Object) stopandroidobackgroundscan.getKind())) {
                    break;
                }
            }
            getRangedRegionState getrangedregionstate = (getRangedRegionState) obj;
            if (getrangedregionstate != null) {
                str3 = getrangedregionstate.getId();
            }
            arrayList.add(new ReactionCountModel(kind, count, contains, str3));
        }
        List mutableList = CollectionsKt.toMutableList((List) arrayList);
        String id2 = rssiFilter.getId();
        String str4 = id2 == null ? "" : id2;
        String content = rssiFilter.getContent();
        Long valueOf = Long.valueOf(rssiFilter.getCreatedTime());
        String min2 = getMin((int) min, rssiFilter.getCreatedTime());
        String iconUrl = rssiFilter.getIconUrl();
        boolean read = rssiFilter.getRead();
        HashMap<String, String> extendInfo = rssiFilter.getExtendInfo();
        String contentType = rssiFilter.getContentType();
        String activityId = rssiFilter.getActivityId();
        boolean ownActivity = rssiFilter.getOwnActivity();
        int commentCounts = rssiFilter.getCommentCounts();
        Iterable<getRangedRegionState> ownReactions2 = rssiFilter.getOwnReactions();
        Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(ownReactions2, 10));
        for (getRangedRegionState getrangedregionstate2 : ownReactions2) {
            arrayList3.add(new OwnReactionModel(getrangedregionstate2.getId(), getrangedregionstate2.getKind()));
        }
        List mutableList2 = CollectionsKt.toMutableList((List) arrayList3);
        String redirectType = rssiFilter.getRedirectType();
        if (redirectType == null) {
            str = "";
        } else {
            str = redirectType;
        }
        String redirectValue = rssiFilter.getRedirectValue();
        if (redirectValue == null) {
            str2 = "";
        } else {
            str2 = redirectValue;
        }
        list.add(new setEmptyView(9, new FeedModel(str4, (String) null, content, valueOf, min2, iconUrl, read, extendInfo, contentType, activityId, ownActivity, commentCounts, mutableList, mutableList2, str, str2), (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "p1", "p2", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMax extends FunctionReferenceImpl implements Function2<String, Date, String> {
        getMax(access$3600 access_3600) {
            super(2, access_3600, access$3600.class, "composeDateAndYear", "composeDateAndYear(Ljava/lang/String;Ljava/util/Date;)Ljava/lang/String;", 0);
        }

        @NotNull
        public final String invoke(@NotNull String str, @NotNull Date date) {
            Intrinsics.checkNotNullParameter(str, "p1");
            Intrinsics.checkNotNullParameter(date, "p2");
            return access$3600.setMax(str, date);
        }
    }

    private final String getMin(int i, long j) {
        String max = getMax(i, new Date(j), (Function2<? super String, ? super Date, String>) length.INSTANCE);
        StringBuilder sb = new StringBuilder();
        sb.append(max);
        sb.append(", ");
        Date date = new Date(j);
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        Locale locale = WheelView.OnWheelViewListener.getMax;
        sb.append(new SimpleDateFormat("HH:mm", locale).format(new Date(date.getTime())));
        return sb.toString();
    }

    @NotNull
    public static List<performItemClick> getMax(@NotNull List<RssiFilter> list) {
        Intrinsics.checkNotNullParameter(list, "activities");
        Iterable<RssiFilter> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (RssiFilter rssiFilter : iterable) {
            Intrinsics.checkNotNullParameter(rssiFilter, "$this$toFriend");
            HashMap<String, String> extendInfo = rssiFilter.getExtendInfo();
            String str = null;
            String nickName = extendInfo != null ? setBuildNumber.getNickName(extendInfo) : null;
            String str2 = "";
            if (nickName == null) {
                nickName = str2;
            }
            HashMap<String, String> extendInfo2 = rssiFilter.getExtendInfo();
            String profileAvatar = extendInfo2 != null ? setBuildNumber.getProfileAvatar(extendInfo2) : null;
            if (profileAvatar == null) {
                profileAvatar = str2;
            }
            HashMap<String, String> extendInfo3 = rssiFilter.getExtendInfo();
            if (extendInfo3 != null) {
                str = setBuildNumber.getUserId(extendInfo3);
            }
            if (str != null) {
                str2 = str;
            }
            arrayList.add(new performItemClick(nickName, profileAvatar, str2));
        }
        return (List) arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/social/model/mapper/FeedMapper$Companion;", "", "()V", "DIFF_TODAY", "", "DIFF_YESTERDAY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    @NotNull
    public final List<setEmptyView> getMin(@NotNull List<RssiFilter> list) {
        Intrinsics.checkNotNullParameter(list, "oldItem");
        List<setEmptyView> arrayList = new ArrayList<>();
        for (RssiFilter min : list) {
            setMin(arrayList, min);
        }
        return arrayList;
    }

    private final String getMax(int i, Date date, Function2<? super String, ? super Date, String> function2) {
        String str;
        if (i == 0) {
            str = this.setMax.getString(R.string.feed_section_today);
        } else if (i != 1) {
            str = new SimpleDateFormat("dd MMMM", Locale.getDefault()).format(new Date(date.getTime()));
        } else {
            str = this.setMax.getString(R.string.feed_section_yesterday);
        }
        if (length(date)) {
            Intrinsics.checkNotNullExpressionValue(str, "it");
            str = function2.invoke(str, date);
        }
        return str == null ? "" : str;
    }

    private static boolean length(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return true;
        }
        return false;
    }

    public static final /* synthetic */ String setMax(String str, Date date) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        sb.append(String.valueOf(instance.get(1)));
        return sb.toString();
    }
}
