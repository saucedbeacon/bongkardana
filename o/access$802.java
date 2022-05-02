package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u0006"}, d2 = {"toSavingGoalView", "Lid/dana/domain/saving/model/SavingGoalView;", "Lid/dana/data/saving/model/SavingView;", "toSavingGoalViews", "", "toSortedSavingViews", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class access$802 {
    @NotNull
    public static final BeaconManager toSavingGoalView(@NotNull headers headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$toSavingGoalView");
        String savingId = headers.getSavingId();
        String title = headers.getTitle();
        String categoryCode = headers.getCategoryCode();
        getAppDir moneyView = isReady.toMoneyView(headers.getCurrentAmount());
        getAppDir moneyView2 = isReady.toMoneyView(headers.getTargetAmount());
        String orderStatus = headers.getOrderStatus();
        String orderSubStatus = headers.getOrderSubStatus();
        String createdTime = headers.getCreatedTime();
        String achievedTime = headers.getAchievedTime();
        String completedTime = headers.getCompletedTime();
        Map map = headers.extendInfo;
        Intrinsics.checkNotNullExpressionValue(map, "extendInfo");
        return new BeaconManager(savingId, title, categoryCode, moneyView, moneyView2, orderStatus, orderSubStatus, createdTime, achievedTime, completedTime, (setDebug) null, map);
    }

    @NotNull
    public static final List<BeaconManager> toSavingGoalViews(@NotNull List<headers> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toSavingGoalViews");
        Iterable<headers> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (headers savingGoalView : iterable) {
            arrayList.add(toSavingGoalView(savingGoalView));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final List<BeaconManager> toSortedSavingViews(@NotNull List<headers> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toSortedSavingViews");
        Iterable<headers> sortedWith = CollectionsKt.sortedWith(CollectionsKt.toMutableList(list), ComparisonsKt.compareBy((Function1<? super T, ? extends Comparable<?>>[]) new Function1[]{setMax.INSTANCE, getMax.INSTANCE}));
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
        for (headers savingGoalView : sortedWith) {
            arrayList.add(toSavingGoalView(savingGoalView));
        }
        return (List) arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/data/saving/model/SavingView;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<headers, Comparable<?>> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        @Nullable
        public final Comparable<?> invoke(@NotNull headers headers) {
            Intrinsics.checkNotNullParameter(headers, "it");
            return Boolean.valueOf(!Intrinsics.areEqual((Object) headers.getTargetAmount().getAmount(), (Object) headers.getCurrentAmount().getAmount()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/data/saving/model/SavingView;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<headers, Comparable<?>> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
            r3 = kotlin.text.StringsKt.toLongOrNull(r3);
         */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Comparable<?> invoke(@org.jetbrains.annotations.NotNull o.headers r3) {
            /*
                r2 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r3 = r3.getCreatedTime()
                if (r3 == 0) goto L_0x0016
                java.lang.Long r3 = kotlin.text.StringsKt.toLongOrNull(r3)
                if (r3 == 0) goto L_0x0016
                long r0 = r3.longValue()
                goto L_0x0018
            L_0x0016:
                r0 = 0
            L_0x0018:
                long r0 = -r0
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                java.lang.Comparable r3 = (java.lang.Comparable) r3
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.access$802.getMax.invoke(o.headers):java.lang.Comparable");
        }
    }
}
