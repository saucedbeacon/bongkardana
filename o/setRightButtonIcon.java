package o;

import id.dana.social.model.FeedModel;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUHorizontalListView;
import o.VerboseAndroidLogger;
import o.getLastMonitoringStatusUpdateTime;
import o.setLeftButtonEnabled;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0016H\u0016J\b\u0010!\u001a\u00020\u0016H\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u0016H\u0016R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lid/dana/social/contract/notification/FeedNotificationPresenter;", "Lid/dana/social/contract/notification/FeedNotificationContract$Presenter;", "view", "Lid/dana/social/contract/notification/FeedNotificationContract$View;", "getFeedNotification", "Lid/dana/domain/social/interactor/GetFeedNotification;", "markAsReadNotification", "Lid/dana/domain/social/interactor/MarkAsReadNotification;", "feedMapper", "Lid/dana/social/model/mapper/FeedMapper;", "groupedFeedNotificationMapper", "Lid/dana/social/model/mapper/GroupedFeedNotificationMapper;", "(Lid/dana/social/contract/notification/FeedNotificationContract$View;Lid/dana/domain/social/interactor/GetFeedNotification;Lid/dana/domain/social/interactor/MarkAsReadNotification;Lid/dana/social/model/mapper/FeedMapper;Lid/dana/social/model/mapper/GroupedFeedNotificationMapper;)V", "feedIds", "Ljava/util/LinkedHashSet;", "", "Lkotlin/collections/LinkedHashSet;", "hasMore", "", "maxId", "minId", "extractFeedNotificationIds", "", "feedViewModels", "", "Lid/dana/social/model/FeedViewHolderModel;", "getFeedNotifications", "handleUnsuccessResponse", "mapFeedModelsBasedOnFeedVersion", "", "socialFeed", "Lid/dana/domain/social/model/SocialFeed;", "onDestroy", "readAllVisibleNotification", "readFeedNotification", "activityId", "refreshFeedNotifications", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setRightButtonIcon implements setLeftButtonEnabled.setMin {
    @NotNull
    public static final getMin getMax = new getMin((byte) 0);
    private final AUHorizontalListView.ArrowScrollFocusResult IsOverlapping;
    private final VerboseAndroidLogger equals;
    /* access modifiers changed from: private */
    public boolean getMin = true;
    private final getLastMonitoringStatusUpdateTime isInside;
    /* access modifiers changed from: private */
    public final LinkedHashSet<String> length = new LinkedHashSet<>();
    /* access modifiers changed from: private */
    public String setMax;
    private String setMin;
    private final access$3600 toFloatRange;
    /* access modifiers changed from: private */
    public final setLeftButtonEnabled.length toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Boolean, Unit> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ setRightButtonIcon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(setRightButtonIcon setrightbuttonicon) {
            super(1);
            this.this$0 = setrightbuttonicon;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            setRightButtonIcon.getMin(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Throwable, Unit> {
        public static final isInside INSTANCE = new isInside();

        isInside() {
            super(1);
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ setRightButtonIcon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(setRightButtonIcon setrightbuttonicon) {
            super(1);
            this.this$0 = setrightbuttonicon;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            setRightButtonIcon.getMin(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/SocialFeed;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<getScanCallbackIntent, Unit> {
        final /* synthetic */ setRightButtonIcon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(setRightButtonIcon setrightbuttonicon) {
            super(1);
            this.this$0 = setrightbuttonicon;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getScanCallbackIntent) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getScanCallbackIntent getscancallbackintent) {
            Intrinsics.checkNotNullParameter(getscancallbackintent, "it");
            this.this$0.setMax = getscancallbackintent.getMaxId();
            this.this$0.getMin = getscancallbackintent.getHasMore();
            this.this$0.toIntRange.dismissProgress();
            List max = setRightButtonIcon.setMax(this.this$0, getscancallbackintent);
            this.this$0.toIntRange.getMax(max, getscancallbackintent.getHasMore());
            setRightButtonIcon.setMin(this.this$0, max);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/SocialFeed;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<getScanCallbackIntent, Unit> {
        final /* synthetic */ setRightButtonIcon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(setRightButtonIcon setrightbuttonicon) {
            super(1);
            this.this$0 = setrightbuttonicon;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getScanCallbackIntent) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getScanCallbackIntent getscancallbackintent) {
            Intrinsics.checkNotNullParameter(getscancallbackintent, "it");
            this.this$0.setMax = getscancallbackintent.getMaxId();
            this.this$0.getMin = getscancallbackintent.getHasMore();
            this.this$0.toIntRange.dismissProgress();
            List max = setRightButtonIcon.setMax(this.this$0, getscancallbackintent);
            this.this$0.toIntRange.setMin(max, getscancallbackintent.getHasMore());
            setRightButtonIcon.setMin(this.this$0, max);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ setRightButtonIcon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(setRightButtonIcon setrightbuttonicon) {
            super(1);
            this.this$0 = setrightbuttonicon;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.toIntRange.setMin();
            this.this$0.length.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ setRightButtonIcon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(setRightButtonIcon setrightbuttonicon) {
            super(1);
            this.this$0 = setrightbuttonicon;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.toIntRange.getMin();
        }
    }

    @Inject
    public setRightButtonIcon(@NotNull setLeftButtonEnabled.length length2, @NotNull VerboseAndroidLogger verboseAndroidLogger, @NotNull getLastMonitoringStatusUpdateTime getlastmonitoringstatusupdatetime, @NotNull access$3600 access_3600, @NotNull AUHorizontalListView.ArrowScrollFocusResult arrowScrollFocusResult) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(verboseAndroidLogger, "getFeedNotification");
        Intrinsics.checkNotNullParameter(getlastmonitoringstatusupdatetime, "markAsReadNotification");
        Intrinsics.checkNotNullParameter(access_3600, "feedMapper");
        Intrinsics.checkNotNullParameter(arrowScrollFocusResult, "groupedFeedNotificationMapper");
        this.toIntRange = length2;
        this.equals = verboseAndroidLogger;
        this.isInside = getlastmonitoringstatusupdatetime;
        this.toFloatRange = access_3600;
        this.IsOverlapping = arrowScrollFocusResult;
    }

    public final void length() {
        this.toIntRange.showProgress();
        this.equals.execute(new VerboseAndroidLogger.getMax(20, this.setMax, this.setMin), new setMax(this), new length(this));
    }

    public final void getMin() {
        this.setMax = null;
        this.setMin = null;
        this.toIntRange.showProgress();
        this.equals.execute(new VerboseAndroidLogger.getMax(20, this.setMax, this.setMin), new toFloatRange(this), new equals(this));
    }

    public final void setMin() {
        if (!this.length.isEmpty()) {
            this.isInside.execute(new getLastMonitoringStatusUpdateTime.setMin(CollectionsKt.emptyList()), new getMax(this), new setMin(this));
        }
    }

    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        this.isInside.execute(new getLastMonitoringStatusUpdateTime.setMin(CollectionsKt.listOf(str)), IsOverlapping.INSTANCE, isInside.INSTANCE);
    }

    public final void setMax() {
        this.equals.dispose();
        this.isInside.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/social/contract/notification/FeedNotificationPresenter$Companion;", "", "()V", "ITEM_LIMIT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void getMin(setRightButtonIcon setrightbuttonicon) {
        setrightbuttonicon.toIntRange.dismissProgress();
        setrightbuttonicon.toIntRange.getMax(CollectionsKt.emptyList(), false);
    }

    public static final /* synthetic */ List setMax(setRightButtonIcon setrightbuttonicon, getScanCallbackIntent getscancallbackintent) {
        List<setEmptyView> list;
        if (getscancallbackintent.isFeedNotVersionTwo()) {
            list = setrightbuttonicon.IsOverlapping.getMax(new Date(), getscancallbackintent.getGroupedActivities());
        } else {
            list = (List) setrightbuttonicon.toFloatRange.apply(getscancallbackintent.getActivities());
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
        }
        return CollectionsKt.toMutableList(list);
    }

    public static final /* synthetic */ void setMin(setRightButtonIcon setrightbuttonicon, List list) {
        String str;
        List<FeedModel> list2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            setEmptyView setemptyview = (setEmptyView) it.next();
            String str2 = "";
            if (setemptyview.setMax == null) {
                setFocusableInTouchMode setfocusableintouchmode = setemptyview.getMax;
                if (setfocusableintouchmode != null) {
                    list2 = setfocusableintouchmode.setMin;
                } else {
                    list2 = null;
                }
                if (list2 == null) {
                    list2 = CollectionsKt.emptyList();
                }
                for (FeedModel feedModel : list2) {
                    LinkedHashSet<String> linkedHashSet = setrightbuttonicon.length;
                    String str3 = feedModel.toFloatRange;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    linkedHashSet.add(str3);
                }
            } else {
                LinkedHashSet<String> linkedHashSet2 = setrightbuttonicon.length;
                FeedModel feedModel2 = setemptyview.setMax;
                if (!(feedModel2 == null || (str = feedModel2.toFloatRange) == null)) {
                    str2 = str;
                }
                linkedHashSet2.add(str2);
            }
        }
    }
}
